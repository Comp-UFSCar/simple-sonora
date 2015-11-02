/*
 * generated by Xtext
 */
grammar InternalSimpleSonora;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package org.xtext.simplesonora.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.simplesonora.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.simplesonora.services.SimpleSonoraGrammarAccess;

}

@parser::members {
 
 	private SimpleSonoraGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(SimpleSonoraGrammarAccess grammarAccess) {
    	this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected Grammar getGrammar() {
    	return grammarAccess.getGrammar();
    }
    
    @Override
    protected String getValueForTokenName(String tokenName) {
    	return tokenName;
    }

}




// Entry rule entryRuleDocument
entryRuleDocument 
:
{ before(grammarAccess.getDocumentRule()); }
	 ruleDocument
{ after(grammarAccess.getDocumentRule()); } 
	 EOF 
;

// Rule Document
ruleDocument
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getDocumentAccess().getGroup()); }
(rule__Document__Group__0)
{ after(grammarAccess.getDocumentAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleHeader
entryRuleHeader 
:
{ before(grammarAccess.getHeaderRule()); }
	 ruleHeader
{ after(grammarAccess.getHeaderRule()); } 
	 EOF 
;

// Rule Header
ruleHeader
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getHeaderAccess().getGroup()); }
(rule__Header__Group__0)
{ after(grammarAccess.getHeaderAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleKey
entryRuleKey 
:
{ before(grammarAccess.getKeyRule()); }
	 ruleKey
{ after(grammarAccess.getKeyRule()); } 
	 EOF 
;

// Rule Key
ruleKey
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getKeyAccess().getGroup()); }
(rule__Key__Group__0)
{ after(grammarAccess.getKeyAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleSong
entryRuleSong 
:
{ before(grammarAccess.getSongRule()); }
	 ruleSong
{ after(grammarAccess.getSongRule()); } 
	 EOF 
;

// Rule Song
ruleSong
    @init {
		int stackSize = keepStackSize();
    }
	:
(
(
{ before(grammarAccess.getSongAccess().getInstrumentsAssignment()); }
(rule__Song__InstrumentsAssignment)
{ after(grammarAccess.getSongAccess().getInstrumentsAssignment()); }
)
(
{ before(grammarAccess.getSongAccess().getInstrumentsAssignment()); }
(rule__Song__InstrumentsAssignment)*
{ after(grammarAccess.getSongAccess().getInstrumentsAssignment()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleInstrument
entryRuleInstrument 
:
{ before(grammarAccess.getInstrumentRule()); }
	 ruleInstrument
{ after(grammarAccess.getInstrumentRule()); } 
	 EOF 
;

// Rule Instrument
ruleInstrument
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getInstrumentAccess().getGroup()); }
(rule__Instrument__Group__0)
{ after(grammarAccess.getInstrumentAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleSequence
entryRuleSequence 
:
{ before(grammarAccess.getSequenceRule()); }
	 ruleSequence
{ after(grammarAccess.getSequenceRule()); } 
	 EOF 
;

// Rule Sequence
ruleSequence
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getSequenceAccess().getAlternatives()); }
(rule__Sequence__Alternatives)
{ after(grammarAccess.getSequenceAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleHarmony
entryRuleHarmony 
:
{ before(grammarAccess.getHarmonyRule()); }
	 ruleHarmony
{ after(grammarAccess.getHarmonyRule()); } 
	 EOF 
;

// Rule Harmony
ruleHarmony
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getHarmonyAccess().getGroup()); }
(rule__Harmony__Group__0)
{ after(grammarAccess.getHarmonyAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleChord
entryRuleChord 
:
{ before(grammarAccess.getChordRule()); }
	 ruleChord
{ after(grammarAccess.getChordRule()); } 
	 EOF 
;

// Rule Chord
ruleChord
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getChordAccess().getGroup()); }
(rule__Chord__Group__0)
{ after(grammarAccess.getChordAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleNote
entryRuleNote 
:
{ before(grammarAccess.getNoteRule()); }
	 ruleNote
{ after(grammarAccess.getNoteRule()); } 
	 EOF 
;

// Rule Note
ruleNote
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getNoteAccess().getGroup()); }
(rule__Note__Group__0)
{ after(grammarAccess.getNoteAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}




rule__Sequence__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSequenceAccess().getAlternatives_0()); }
(rule__Sequence__Alternatives_0)
{ after(grammarAccess.getSequenceAccess().getAlternatives_0()); }
)

    |(
{ before(grammarAccess.getSequenceAccess().getMeasureAssignment_1()); }
(rule__Sequence__MeasureAssignment_1)
{ after(grammarAccess.getSequenceAccess().getMeasureAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Sequence__Alternatives_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSequenceAccess().getNoteAssignment_0_0()); }
(rule__Sequence__NoteAssignment_0_0)
{ after(grammarAccess.getSequenceAccess().getNoteAssignment_0_0()); }
)

    |(
{ before(grammarAccess.getSequenceAccess().getChordAssignment_0_1()); }
(rule__Sequence__ChordAssignment_0_1)
{ after(grammarAccess.getSequenceAccess().getChordAssignment_0_1()); }
)

    |(
{ before(grammarAccess.getSequenceAccess().getHarmonyAssignment_0_2()); }
(rule__Sequence__HarmonyAssignment_0_2)
{ after(grammarAccess.getSequenceAccess().getHarmonyAssignment_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__Document__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Document__Group__0__Impl
	rule__Document__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Document__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDocumentAccess().getHeaderAssignment_0()); }
(rule__Document__HeaderAssignment_0)
{ after(grammarAccess.getDocumentAccess().getHeaderAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Document__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Document__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Document__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDocumentAccess().getSongAssignment_1()); }
(rule__Document__SongAssignment_1)
{ after(grammarAccess.getDocumentAccess().getSongAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Header__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Header__Group__0__Impl
	rule__Header__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Header__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHeaderAccess().getNofeedbackAssignment_0()); }
(rule__Header__NofeedbackAssignment_0)?
{ after(grammarAccess.getHeaderAccess().getNofeedbackAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Header__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Header__Group__1__Impl
	rule__Header__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Header__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHeaderAccess().getGroup_1()); }
(rule__Header__Group_1__0)
{ after(grammarAccess.getHeaderAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Header__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Header__Group__2__Impl
	rule__Header__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Header__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHeaderAccess().getGroup_2()); }
(rule__Header__Group_2__0)?
{ after(grammarAccess.getHeaderAccess().getGroup_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Header__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Header__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Header__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHeaderAccess().getGroup_3()); }
(rule__Header__Group_3__0)?
{ after(grammarAccess.getHeaderAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__Header__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Header__Group_1__0__Impl
	rule__Header__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Header__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHeaderAccess().getTitleKeyword_1_0()); }

	'title' 

{ after(grammarAccess.getHeaderAccess().getTitleKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Header__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Header__Group_1__1__Impl
	rule__Header__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Header__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHeaderAccess().getEqualsSignKeyword_1_1()); }

	'=' 

{ after(grammarAccess.getHeaderAccess().getEqualsSignKeyword_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Header__Group_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Header__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Header__Group_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHeaderAccess().getSongNameAssignment_1_2()); }
(rule__Header__SongNameAssignment_1_2)
{ after(grammarAccess.getHeaderAccess().getSongNameAssignment_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Header__Group_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Header__Group_2__0__Impl
	rule__Header__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Header__Group_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHeaderAccess().getTempoKeyword_2_0()); }

	'tempo' 

{ after(grammarAccess.getHeaderAccess().getTempoKeyword_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Header__Group_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Header__Group_2__1__Impl
	rule__Header__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Header__Group_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHeaderAccess().getEqualsSignKeyword_2_1()); }

	'=' 

{ after(grammarAccess.getHeaderAccess().getEqualsSignKeyword_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Header__Group_2__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Header__Group_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Header__Group_2__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHeaderAccess().getTempoAssignment_2_2()); }
(rule__Header__TempoAssignment_2_2)
{ after(grammarAccess.getHeaderAccess().getTempoAssignment_2_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Header__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Header__Group_3__0__Impl
	rule__Header__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Header__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHeaderAccess().getKeyKeyword_3_0()); }

	'key' 

{ after(grammarAccess.getHeaderAccess().getKeyKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Header__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Header__Group_3__1__Impl
	rule__Header__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Header__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHeaderAccess().getEqualsSignKeyword_3_1()); }

	'=' 

{ after(grammarAccess.getHeaderAccess().getEqualsSignKeyword_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Header__Group_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Header__Group_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Header__Group_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHeaderAccess().getKeyAssignment_3_2()); }
(rule__Header__KeyAssignment_3_2)
{ after(grammarAccess.getHeaderAccess().getKeyAssignment_3_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Key__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Key__Group__0__Impl
	rule__Key__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Key__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getKeyAccess().getNOTE_IDTerminalRuleCall_0()); }
	RULE_NOTE_ID
{ after(grammarAccess.getKeyAccess().getNOTE_IDTerminalRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Key__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Key__Group__1__Impl
	rule__Key__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Key__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getKeyAccess().getACCIDENTALTerminalRuleCall_1()); }
(	RULE_ACCIDENTAL)?
{ after(grammarAccess.getKeyAccess().getACCIDENTALTerminalRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Key__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Key__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Key__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getKeyAccess().getINTERVALTerminalRuleCall_2()); }
	RULE_INTERVAL
{ after(grammarAccess.getKeyAccess().getINTERVALTerminalRuleCall_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Instrument__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Instrument__Group__0__Impl
	rule__Instrument__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Instrument__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInstrumentAccess().getInstrumentNameAssignment_0()); }
(rule__Instrument__InstrumentNameAssignment_0)
{ after(grammarAccess.getInstrumentAccess().getInstrumentNameAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Instrument__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Instrument__Group__1__Impl
	rule__Instrument__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Instrument__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInstrumentAccess().getLeftCurlyBracketKeyword_1()); }

	'{' 

{ after(grammarAccess.getInstrumentAccess().getLeftCurlyBracketKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Instrument__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Instrument__Group__2__Impl
	rule__Instrument__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Instrument__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getInstrumentAccess().getSequencesAssignment_2()); }
(rule__Instrument__SequencesAssignment_2)
{ after(grammarAccess.getInstrumentAccess().getSequencesAssignment_2()); }
)
(
{ before(grammarAccess.getInstrumentAccess().getSequencesAssignment_2()); }
(rule__Instrument__SequencesAssignment_2)*
{ after(grammarAccess.getInstrumentAccess().getSequencesAssignment_2()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Instrument__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Instrument__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Instrument__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInstrumentAccess().getRightCurlyBracketKeyword_3()); }

	'}' 

{ after(grammarAccess.getInstrumentAccess().getRightCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__Harmony__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Harmony__Group__0__Impl
	rule__Harmony__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Harmony__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHarmonyAccess().getHarmonyNotesAssignment_0()); }
(rule__Harmony__HarmonyNotesAssignment_0)
{ after(grammarAccess.getHarmonyAccess().getHarmonyNotesAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Harmony__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Harmony__Group__1__Impl
	rule__Harmony__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Harmony__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHarmonyAccess().getGroup_1()); }
(rule__Harmony__Group_1__0)*
{ after(grammarAccess.getHarmonyAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Harmony__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Harmony__Group__2__Impl
	rule__Harmony__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Harmony__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHarmonyAccess().getLeftSquareBracketKeyword_2()); }

	'[' 

{ after(grammarAccess.getHarmonyAccess().getLeftSquareBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Harmony__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Harmony__Group__3__Impl
	rule__Harmony__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Harmony__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getHarmonyAccess().getNotesAssignment_3()); }
(rule__Harmony__NotesAssignment_3)
{ after(grammarAccess.getHarmonyAccess().getNotesAssignment_3()); }
)
(
{ before(grammarAccess.getHarmonyAccess().getNotesAssignment_3()); }
(rule__Harmony__NotesAssignment_3)*
{ after(grammarAccess.getHarmonyAccess().getNotesAssignment_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Harmony__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Harmony__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Harmony__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHarmonyAccess().getRightSquareBracketKeyword_4()); }

	']' 

{ after(grammarAccess.getHarmonyAccess().getRightSquareBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__Harmony__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Harmony__Group_1__0__Impl
	rule__Harmony__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Harmony__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHarmonyAccess().getSolidusKeyword_1_0()); }

	'/' 

{ after(grammarAccess.getHarmonyAccess().getSolidusKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Harmony__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Harmony__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Harmony__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHarmonyAccess().getHarmonyNotesAssignment_1_1()); }
(rule__Harmony__HarmonyNotesAssignment_1_1)
{ after(grammarAccess.getHarmonyAccess().getHarmonyNotesAssignment_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Chord__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Chord__Group__0__Impl
	rule__Chord__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Chord__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getChordAccess().getChordNotesAssignment_0()); }
(rule__Chord__ChordNotesAssignment_0)
{ after(grammarAccess.getChordAccess().getChordNotesAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Chord__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Chord__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Chord__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getChordAccess().getGroup_1()); }
(rule__Chord__Group_1__0)
{ after(grammarAccess.getChordAccess().getGroup_1()); }
)
(
{ before(grammarAccess.getChordAccess().getGroup_1()); }
(rule__Chord__Group_1__0)*
{ after(grammarAccess.getChordAccess().getGroup_1()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Chord__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Chord__Group_1__0__Impl
	rule__Chord__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Chord__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getChordAccess().getSolidusKeyword_1_0()); }

	'/' 

{ after(grammarAccess.getChordAccess().getSolidusKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Chord__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Chord__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Chord__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getChordAccess().getChordNotesAssignment_1_1()); }
(rule__Chord__ChordNotesAssignment_1_1)
{ after(grammarAccess.getChordAccess().getChordNotesAssignment_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Note__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Note__Group__0__Impl
	rule__Note__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Note__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNoteAccess().getOctaveAssignment_0()); }
(rule__Note__OctaveAssignment_0)?
{ after(grammarAccess.getNoteAccess().getOctaveAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Note__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Note__Group__1__Impl
	rule__Note__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Note__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNoteAccess().getNoteAssignment_1()); }
(rule__Note__NoteAssignment_1)
{ after(grammarAccess.getNoteAccess().getNoteAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Note__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Note__Group__2__Impl
	rule__Note__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Note__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNoteAccess().getAccidentalAssignment_2()); }
(rule__Note__AccidentalAssignment_2)?
{ after(grammarAccess.getNoteAccess().getAccidentalAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Note__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Note__Group__3__Impl
	rule__Note__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Note__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNoteAccess().getDurationAssignment_3()); }
(rule__Note__DurationAssignment_3)?
{ after(grammarAccess.getNoteAccess().getDurationAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Note__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Note__Group__4__Impl
	rule__Note__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Note__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNoteAccess().getPointAssignment_4()); }
(rule__Note__PointAssignment_4)?
{ after(grammarAccess.getNoteAccess().getPointAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Note__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Note__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Note__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNoteAccess().getTieAssignment_5()); }
(rule__Note__TieAssignment_5)?
{ after(grammarAccess.getNoteAccess().getTieAssignment_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}















rule__Document__HeaderAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDocumentAccess().getHeaderHeaderParserRuleCall_0_0()); }
	ruleHeader{ after(grammarAccess.getDocumentAccess().getHeaderHeaderParserRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Document__SongAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDocumentAccess().getSongSongParserRuleCall_1_0()); }
	ruleSong{ after(grammarAccess.getDocumentAccess().getSongSongParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Header__NofeedbackAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHeaderAccess().getNofeedbackNoFeedbackKeyword_0_0()); }
(
{ before(grammarAccess.getHeaderAccess().getNofeedbackNoFeedbackKeyword_0_0()); }

	'no-feedback' 

{ after(grammarAccess.getHeaderAccess().getNofeedbackNoFeedbackKeyword_0_0()); }
)

{ after(grammarAccess.getHeaderAccess().getNofeedbackNoFeedbackKeyword_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Header__SongNameAssignment_1_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHeaderAccess().getSongNameIDTerminalRuleCall_1_2_0()); }
	RULE_ID{ after(grammarAccess.getHeaderAccess().getSongNameIDTerminalRuleCall_1_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Header__TempoAssignment_2_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHeaderAccess().getTempoINTTerminalRuleCall_2_2_0()); }
	RULE_INT{ after(grammarAccess.getHeaderAccess().getTempoINTTerminalRuleCall_2_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Header__KeyAssignment_3_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHeaderAccess().getKeyKeyParserRuleCall_3_2_0()); }
	ruleKey{ after(grammarAccess.getHeaderAccess().getKeyKeyParserRuleCall_3_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Song__InstrumentsAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSongAccess().getInstrumentsInstrumentParserRuleCall_0()); }
	ruleInstrument{ after(grammarAccess.getSongAccess().getInstrumentsInstrumentParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Instrument__InstrumentNameAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInstrumentAccess().getInstrumentNameIDTerminalRuleCall_0_0()); }
	RULE_ID{ after(grammarAccess.getInstrumentAccess().getInstrumentNameIDTerminalRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Instrument__SequencesAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInstrumentAccess().getSequencesSequenceParserRuleCall_2_0()); }
	ruleSequence{ after(grammarAccess.getInstrumentAccess().getSequencesSequenceParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Sequence__NoteAssignment_0_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSequenceAccess().getNoteNoteParserRuleCall_0_0_0()); }
	ruleNote{ after(grammarAccess.getSequenceAccess().getNoteNoteParserRuleCall_0_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Sequence__ChordAssignment_0_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSequenceAccess().getChordChordParserRuleCall_0_1_0()); }
	ruleChord{ after(grammarAccess.getSequenceAccess().getChordChordParserRuleCall_0_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Sequence__HarmonyAssignment_0_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSequenceAccess().getHarmonyHarmonyParserRuleCall_0_2_0()); }
	ruleHarmony{ after(grammarAccess.getSequenceAccess().getHarmonyHarmonyParserRuleCall_0_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Sequence__MeasureAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSequenceAccess().getMeasureMEASURETerminalRuleCall_1_0()); }
	RULE_MEASURE{ after(grammarAccess.getSequenceAccess().getMeasureMEASURETerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Harmony__HarmonyNotesAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHarmonyAccess().getHarmonyNotesNoteParserRuleCall_0_0()); }
	ruleNote{ after(grammarAccess.getHarmonyAccess().getHarmonyNotesNoteParserRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Harmony__HarmonyNotesAssignment_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHarmonyAccess().getHarmonyNotesNoteParserRuleCall_1_1_0()); }
	ruleNote{ after(grammarAccess.getHarmonyAccess().getHarmonyNotesNoteParserRuleCall_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Harmony__NotesAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHarmonyAccess().getNotesNoteParserRuleCall_3_0()); }
	ruleNote{ after(grammarAccess.getHarmonyAccess().getNotesNoteParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Chord__ChordNotesAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getChordAccess().getChordNotesNoteParserRuleCall_0_0()); }
	ruleNote{ after(grammarAccess.getChordAccess().getChordNotesNoteParserRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Chord__ChordNotesAssignment_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getChordAccess().getChordNotesNoteParserRuleCall_1_1_0()); }
	ruleNote{ after(grammarAccess.getChordAccess().getChordNotesNoteParserRuleCall_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Note__OctaveAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNoteAccess().getOctaveOCTAVETerminalRuleCall_0_0()); }
	RULE_OCTAVE{ after(grammarAccess.getNoteAccess().getOctaveOCTAVETerminalRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Note__NoteAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNoteAccess().getNoteNOTE_IDTerminalRuleCall_1_0()); }
	RULE_NOTE_ID{ after(grammarAccess.getNoteAccess().getNoteNOTE_IDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Note__AccidentalAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNoteAccess().getAccidentalACCIDENTALTerminalRuleCall_2_0()); }
	RULE_ACCIDENTAL{ after(grammarAccess.getNoteAccess().getAccidentalACCIDENTALTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Note__DurationAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNoteAccess().getDurationDURATIONTerminalRuleCall_3_0()); }
	RULE_DURATION{ after(grammarAccess.getNoteAccess().getDurationDURATIONTerminalRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Note__PointAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNoteAccess().getPointFullStopKeyword_4_0()); }
(
{ before(grammarAccess.getNoteAccess().getPointFullStopKeyword_4_0()); }

	'.' 

{ after(grammarAccess.getNoteAccess().getPointFullStopKeyword_4_0()); }
)

{ after(grammarAccess.getNoteAccess().getPointFullStopKeyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Note__TieAssignment_5
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNoteAccess().getTie_Keyword_5_0()); }
(
{ before(grammarAccess.getNoteAccess().getTie_Keyword_5_0()); }

	'_' 

{ after(grammarAccess.getNoteAccess().getTie_Keyword_5_0()); }
)

{ after(grammarAccess.getNoteAccess().getTie_Keyword_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_INTERVAL : ('maj'|'min');

RULE_OCTAVE : ('<'+|'o' '0'..'9'|'>'+);

RULE_ACCIDENTAL : ('+'|'-'|'@');

RULE_NOTE_ID : ('a'..'g'|'A'..'G'|('R'|'r'));

RULE_DURATION : ':' ('1'|'2'|'4'|'8'|'16'|'32');

RULE_MEASURE : '|'?;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


