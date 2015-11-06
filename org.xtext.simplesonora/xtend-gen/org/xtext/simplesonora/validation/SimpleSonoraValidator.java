/**
 * generated by Xtext
 */
package org.xtext.simplesonora.validation;

import com.google.common.base.Objects;
import java.util.List;
import java.util.Set;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.jfugue.midi.MidiDictionary;
import org.xtext.simplesonora.simpleSonora.Chord;
import org.xtext.simplesonora.simpleSonora.Instrument;
import org.xtext.simplesonora.simpleSonora.Note;
import org.xtext.simplesonora.simpleSonora.SimpleSonoraPackage;
import org.xtext.simplesonora.simpleSonora.Tempo;
import org.xtext.simplesonora.validation.AbstractSimpleSonoraValidator;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class SimpleSonoraValidator extends AbstractSimpleSonoraValidator {
  private Set<String> instrumentNames = IterableExtensions.<String>toSet(MidiDictionary.INSTRUMENT_BYTE_TO_STRING.values());
  
  private Set<String> tempoNames = IterableExtensions.<String>toSet(MidiDictionary.TEMPO_INT_TO_STRING.values());
  
  private String lastNote = "";
  
  private boolean tied = false;
  
  /**
   * This will verify the existence of the instrument entered by
   * the user, if it doesn't match, an error will be shown.
   */
  @Check
  public void checkInstrument(final Instrument instrument) {
    String _instrumentName = instrument.getInstrumentName();
    String _lowerCase = _instrumentName.toLowerCase();
    String[] namelist = _lowerCase.split("_");
    StringBuilder convertedName = new StringBuilder();
    for (final String n : namelist) {
      String _firstUpper = StringExtensions.toFirstUpper(n);
      String _plus = (_firstUpper + "_");
      convertedName.append(_plus);
    }
    int _length = convertedName.length();
    int _minus = (_length - 1);
    convertedName.deleteCharAt(_minus);
    String _string = convertedName.toString();
    boolean _contains = this.instrumentNames.contains(_string);
    boolean _equals = (_contains == false);
    if (_equals) {
      this.error("Instrument invalid or not recognized. Check a general MIDI instrument list.", SimpleSonoraPackage.Literals.INSTRUMENT__INSTRUMENT_NAME);
    }
  }
  
  /**
   * A Tie must be used only with same notes so it add's the duration of
   * each one of them as a "single" note with the sum of all duration.
   */
  @Check
  public void checkTie(final Note n) {
    boolean _and = false;
    if (!this.tied) {
      _and = false;
    } else {
      String _note = n.getNote();
      boolean _equalsIgnoreCase = _note.equalsIgnoreCase(this.lastNote);
      boolean _not = (!_equalsIgnoreCase);
      _and = _not;
    }
    if (_and) {
      this.warning("A tie must be used with same notes.", SimpleSonoraPackage.Literals.NOTE__TIE);
    }
    boolean _isTie = n.isTie();
    if (_isTie) {
      String _note_1 = n.getNote();
      this.lastNote = _note_1;
      this.tied = true;
    } else {
      this.tied = false;
    }
  }
  
  @Check
  public void checkTempo(final Tempo tempo) {
    String _id = tempo.getId();
    boolean _notEquals = (!Objects.equal(_id, null));
    if (_notEquals) {
      String _id_1 = tempo.getId();
      String _string = _id_1.toString();
      String _upperCase = _string.toUpperCase();
      boolean _contains = this.tempoNames.contains(_upperCase);
      boolean _not = (!_contains);
      if (_not) {
        this.error("Tempo not valid, check the available constants.", SimpleSonoraPackage.Literals.TEMPO__ID);
      }
    } else {
      int _value = tempo.getValue();
      boolean _equals = (_value == 0);
      if (_equals) {
        this.error("Tempo not valid, value must be bigger than 0.", SimpleSonoraPackage.Literals.TEMPO__VALUE);
      }
    }
  }
  
  @Check
  public void checkChord(final Chord chord) {
    String _chordName = chord.getChordName();
    boolean _notEquals = (!Objects.equal(_chordName, null));
    if (_notEquals) {
      String[] _chordNames = org.jfugue.theory.Chord.getChordNames();
      String _chordName_1 = chord.getChordName();
      String _upperCase = _chordName_1.toUpperCase();
      boolean _contains = ((List<String>)Conversions.doWrapArray(_chordNames)).contains(_upperCase);
      boolean _not = (!_contains);
      if (_not) {
        this.error("Chord name not valid, verify valid names.", SimpleSonoraPackage.Literals.CHORD__CHORD_NAME);
      }
    }
  }
}