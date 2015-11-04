/*
 * generated by Xtext
 */
package org.xtext.simplesonora.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import org.jfugue.player.Player
import org.xtext.simplesonora.simpleSonora.Header
import org.jfugue.pattern.Pattern
import org.jfugue.midi.MidiFileManager
import java.io.File
import org.xtext.simplesonora.simpleSonora.Sequence
import org.xtext.simplesonora.simpleSonora.Note
import org.xtext.simplesonora.simpleSonora.Instrument
import org.xtext.simplesonora.simpleSonora.Chord
import org.xtext.simplesonora.simpleSonora.Harmony
import org.xtext.simplesonora.simpleSonora.Key
import org.xtext.simplesonora.simpleSonora.Tuplet

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
 
class SimpleSonoraGenerator implements IGenerator {
	
	String songName = new String("")			// song name to create 'MIDI' file
	String key = new String("")					// key signature
	boolean feedback = true						// will play when file is saved
	Integer curVoice = 0						// MIDI track/channel/voice
	Integer curOctave = 4 						// default octave 
	String curDuration = new String("h")		// default note duration 
	boolean keepTie = false						// control the use of tie
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
				
		//JFugue Player and Pattern
		val player = new Player()	
		val pattern = new Pattern()
				
		// Header information to define the basics of the music
		for(Header h :resource.allContents.toIterable.filter(Header)){
			feedback = true
			songName = h.songName				// get the song name
			if(h.tempo != null)					// define the tempo
				if(h.tempo.value > 0)
					pattern.tempo = h.tempo.value	// using bpm
				else
					pattern.tempo = h.tempo.id		// constant name
			if(h.key != null)
				pattern.add(h.key.keyToPattern)	// define key signature
			if(h.nofeedback)
				feedback = false
		}
		
		curVoice = 0 // first MIDI track/channel/voice
		
		for (Instrument instrument : resource.allContents.toIterable.filter(Instrument)) {
			
			if(instrument.sequences.length > 0) {
				curDuration = 'h' // reset to default each time
				curOctave = 4		
			
				pattern.add('V' + curVoice)
				pattern.add('I[' + instrument.instrumentName + ']')
			
				// Sequence of Notes and/or Chords of the Instrument
				for (Sequence s : instrument.sequences) {
					// note
					if (s.note != null)
						pattern.add(s.note.noteToPattern)	
					// chord
					if (s.chord != null) 
						pattern.add(s.chord.chordToPattern)
					// harmony
					if (s.harmony != null)
						pattern.add(s.harmony.harmonyToPattern)
					// tuplet
					if (s.tuplet != null)
						pattern.add(s.tuplet.tuppletToPattern)
				}
				curVoice++	
			}
		}
		
		// Outputs
		if(feedback)
			player.play(pattern) // Play the pattern
		
		System.out.println(pattern.toString) // Print the pattern on Console
		// Write the .mid file on Eclipse root folder
		MidiFileManager.savePatternToMidi(pattern, new File(songName+".mid"))
	}
	
	/**
	 * Converts the Simple-Sonora key signature pattern to the JFugue pattern.
	 * 
	 * @param k	Key containing the key for the song.
	 * @return String with JFugue Pattern notation for key signature.
	 */
	def String keyToPattern(Key k){
		key = "KEY:"	// starts with 'KEY:'
		key = key.concat(k.note.toUpperCase)  // note must be upper case
		// convert the accident 
		if(k.accidental != null){
			switch(k.accidental){
				case('+'):
					key = key.concat('#')
				case('-'):
					key = key.concat('b')
			}
		}
		// concatenate 'maj' or 'min' to the string
		key = key.concat(k.interval.substring(0, 3))
		
		return key
	}	
	
	/**
	 * Changes the current octave accordingly to the octave operator used.
	 * 
	 * @param o String containing the octave information.
	 */
	def void setOctave(String o){
		// go one octave higher
		if(o.compareTo('>') == 0){
			curOctave++
		}
		// go one octave lower
		else if(o.compareTo('<') == 0){
			curOctave--
		}
		// go to N octave
		else {
			curOctave = Integer.parseInt(o.charAt(1).toString)
		}
	}
	
	/**
	 * Converts from Simple-Sonora note pattern to the JFugue one.
	 * 
	 * @param note Note containing note id, accidental and duration.
	 * @return String with JFugue pattern notation for notes.
	 */
	def String noteToPattern(Note note){
		// if there is change of Octave
		if (note.octave != null) note.octave.setOctave
					
		var auxNote =  note.note.toUpperCase	// note must be upper case
		
		// If there is an Accidental - gets the accidental value for JFugue
		if(note.accidental != null){	
			auxNote = auxNote.concat(note.accidental.accidentalToPattern)	
		}
		
		// If there is a duration - gets the duration value for JFugue
		if(note.duration != null){
			curDuration = note.duration.durationToPattern
		}
		
		// Verify the use of point
		var point = ""
		if(note.point)
			point = "."
		
		// Verify the use of tie
		var tie = ""
		var tied = ""
		if(note.tie){		// there is a tie
			tie = "-"		// make the tie
			if(keepTie)		// tie from last note
				tied = "-"	// tie with last note
			keepTie = true
		}
		else if (keepTie){	// if no current tie but tie from last note
			tied = "-"		// keep the tie with last note
			keepTie = false	// no more tie
		}
			
		// concatenate current octave and current duration to the note
		if(note.note.equalsIgnoreCase('r'))	// if Rest, hide the octave
			auxNote = auxNote.concat(tied + curDuration + point + tie)
		else
			auxNote = auxNote.concat(curOctave.toString + tied + curDuration + point + tie)
		
		return auxNote	
	}
	
	/**
	 * Converts from Simple-Sonora chord pattern to the JFugue one.
	 * 
	 * @param chord Chord containing sequence of notes or base note and chord name.
	 * @return String with JFugue pattern notation for chords.
	 */
	def String chordToPattern(Chord chord){
		var auxChord = ""
		
		for (n : chord.chordNotes.toList)
			// for each note get the pattern and add a '+' 		
			auxChord = auxChord.concat(n.noteToPattern + "+")
		auxChord = auxChord.substring(0, auxChord.length - 1)
		
		if(chord.chordName != null){
			// using the chord name
			var inversion = ""
			if(chord.inversion != null) // verify if there is any inversion
				inversion = chord.inversion
			
			// chord is: 'note_id' 'chordName' 'inversion' 'duration'
			auxChord = (auxChord.substring(0, auxChord.length - 1) +
						chord.chordName + inversion + 
						auxChord.substring(auxChord.length - 1))
		}
		
		// add the chord pattern minus the extra '+' at the end
		return auxChord
	}
	
	/**
	 * Converts from Simple-Sonora harmony pattern to the JFugue one.
	 * 
	 * @param harmony Harmony containing chord and melody notes that will be played together.
	 * @return String with JFugue pattern notation for harmony.
	 */
	def String harmonyToPattern(Harmony harmony){
		var h = ""
		
		for (n : harmony.harmonyNotes.toList)
			// for each "harmony note" (will be played together, like a chord)
			h = h.concat(n.noteToPattern + "+")
		
		for(n : harmony.notes.toList)
			// subsequent notes that will be played while chord is still playing
			h = h.concat(n.noteToPattern + "_")		
		
		return h.substring(0, h.length - 1)
	}
	
	/**
	 * Converts from Simple-Sonora tuplet pattern to the JFugue one.
	 * 
	 * @param tuplet Tuplet containing sequence of notes and it's duration to be.
	 * @return String with JFugue pattern notation for tuplet.
	 */
	def String tuppletToPattern(Tuplet tuplet){
		val numOfNotes = tuplet.tuplet.length
		val duration = tuplet.duration
		var auxTuplet = ""
		
		for(n : tuplet.tuplet){
			switch(n.eClass.name){
				case 'Note':	// note inside tuplet
					auxTuplet = auxTuplet.concat(
						(n as Note).noteToPattern + "*" + 
						numOfNotes.toString + duration.toString + " " )
					
				case 'Chord': {	// chord inside tuplet
					auxTuplet = auxTuplet.concat(
						(n as Chord).chordToPattern + "*" +
						numOfNotes.toString + duration.toString + " " )
				}
			}
		}
		
		return auxTuplet
	}
	
	/**
	 * Converts Simple-Sonora to JFugue duration pattern.
	 * 
	 * @param dur Simple-Sonora notation for duration.
	 * @return JFugue notation for duration.
	 */
	def String durationToPattern(String dur){
		switch(dur){
			case ':1':		// 1		semibreve
				return 'w'			
			case ':2':		// 1/2		minim
				return 'h'
			case ':4':		// 1/4		crotchet
				return 'q'
			case ':8':		// 1/8		quaver
				return 'i'
			case ':16':		// 1/16		semiquaver
				return 's'
			case ':32':		// 1/32		demisemiquaver
				return 't'
			case ':64':		// 1/64		hemidemisemiquaver
				return 'x'
			case ':128':	// 1/128	semihemidemisemiquaver
				return 'o'			
		}		
		return ""
	}
	
	/**
	 * Converts Simple-Sonora to JFugue accidental pattern.
	 * 
	 * @param acc Simple-Sonora accidental notation.
	 * @return JFugue accidental notation.
	 */
	def String accidentalToPattern(String acc){
		switch(acc){
			case '+':		// sharp
				return '#'			
			case '-':		// flat
				return 'b'
			case '@':		// natural
				return 'n'		
		}
		// other case '.' don't need to be converted			
		return acc
	}
}
