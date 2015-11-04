/**
 */
package org.xtext.simplesonora.simpleSonora;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.simplesonora.simpleSonora.SimpleSonoraFactory
 * @model kind="package"
 * @generated
 */
public interface SimpleSonoraPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "simpleSonora";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/simplesonora/SimpleSonora";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "simpleSonora";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SimpleSonoraPackage eINSTANCE = org.xtext.simplesonora.simpleSonora.impl.SimpleSonoraPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.simplesonora.simpleSonora.impl.DocumentImpl <em>Document</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.simplesonora.simpleSonora.impl.DocumentImpl
   * @see org.xtext.simplesonora.simpleSonora.impl.SimpleSonoraPackageImpl#getDocument()
   * @generated
   */
  int DOCUMENT = 0;

  /**
   * The feature id for the '<em><b>Header</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT__HEADER = 0;

  /**
   * The feature id for the '<em><b>Song</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT__SONG = 1;

  /**
   * The number of structural features of the '<em>Document</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.simplesonora.simpleSonora.impl.HeaderImpl <em>Header</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.simplesonora.simpleSonora.impl.HeaderImpl
   * @see org.xtext.simplesonora.simpleSonora.impl.SimpleSonoraPackageImpl#getHeader()
   * @generated
   */
  int HEADER = 1;

  /**
   * The feature id for the '<em><b>Nofeedback</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER__NOFEEDBACK = 0;

  /**
   * The feature id for the '<em><b>Song Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER__SONG_NAME = 1;

  /**
   * The feature id for the '<em><b>Tempo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER__TEMPO = 2;

  /**
   * The feature id for the '<em><b>Key</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER__KEY = 3;

  /**
   * The number of structural features of the '<em>Header</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.simplesonora.simpleSonora.impl.TempoImpl <em>Tempo</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.simplesonora.simpleSonora.impl.TempoImpl
   * @see org.xtext.simplesonora.simpleSonora.impl.SimpleSonoraPackageImpl#getTempo()
   * @generated
   */
  int TEMPO = 2;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPO__VALUE = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPO__ID = 1;

  /**
   * The number of structural features of the '<em>Tempo</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPO_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.simplesonora.simpleSonora.impl.KeyImpl <em>Key</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.simplesonora.simpleSonora.impl.KeyImpl
   * @see org.xtext.simplesonora.simpleSonora.impl.SimpleSonoraPackageImpl#getKey()
   * @generated
   */
  int KEY = 3;

  /**
   * The feature id for the '<em><b>Note</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY__NOTE = 0;

  /**
   * The feature id for the '<em><b>Accidental</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY__ACCIDENTAL = 1;

  /**
   * The feature id for the '<em><b>Interval</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY__INTERVAL = 2;

  /**
   * The number of structural features of the '<em>Key</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.simplesonora.simpleSonora.impl.SongImpl <em>Song</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.simplesonora.simpleSonora.impl.SongImpl
   * @see org.xtext.simplesonora.simpleSonora.impl.SimpleSonoraPackageImpl#getSong()
   * @generated
   */
  int SONG = 4;

  /**
   * The feature id for the '<em><b>Instruments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SONG__INSTRUMENTS = 0;

  /**
   * The number of structural features of the '<em>Song</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SONG_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.simplesonora.simpleSonora.impl.InstrumentImpl <em>Instrument</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.simplesonora.simpleSonora.impl.InstrumentImpl
   * @see org.xtext.simplesonora.simpleSonora.impl.SimpleSonoraPackageImpl#getInstrument()
   * @generated
   */
  int INSTRUMENT = 5;

  /**
   * The feature id for the '<em><b>Instrument Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUMENT__INSTRUMENT_NAME = 0;

  /**
   * The feature id for the '<em><b>Sequences</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUMENT__SEQUENCES = 1;

  /**
   * The number of structural features of the '<em>Instrument</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.simplesonora.simpleSonora.impl.SequenceImpl <em>Sequence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.simplesonora.simpleSonora.impl.SequenceImpl
   * @see org.xtext.simplesonora.simpleSonora.impl.SimpleSonoraPackageImpl#getSequence()
   * @generated
   */
  int SEQUENCE = 6;

  /**
   * The feature id for the '<em><b>Note</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE__NOTE = 0;

  /**
   * The feature id for the '<em><b>Chord</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE__CHORD = 1;

  /**
   * The feature id for the '<em><b>Harmony</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE__HARMONY = 2;

  /**
   * The feature id for the '<em><b>Tuplet</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE__TUPLET = 3;

  /**
   * The feature id for the '<em><b>Measure</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE__MEASURE = 4;

  /**
   * The number of structural features of the '<em>Sequence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.simplesonora.simpleSonora.impl.NoteImpl <em>Note</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.simplesonora.simpleSonora.impl.NoteImpl
   * @see org.xtext.simplesonora.simpleSonora.impl.SimpleSonoraPackageImpl#getNote()
   * @generated
   */
  int NOTE = 7;

  /**
   * The feature id for the '<em><b>Octave</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTE__OCTAVE = 0;

  /**
   * The feature id for the '<em><b>Note</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTE__NOTE = 1;

  /**
   * The feature id for the '<em><b>Accidental</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTE__ACCIDENTAL = 2;

  /**
   * The feature id for the '<em><b>Duration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTE__DURATION = 3;

  /**
   * The feature id for the '<em><b>Point</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTE__POINT = 4;

  /**
   * The feature id for the '<em><b>Tie</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTE__TIE = 5;

  /**
   * The number of structural features of the '<em>Note</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTE_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.xtext.simplesonora.simpleSonora.impl.ChordImpl <em>Chord</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.simplesonora.simpleSonora.impl.ChordImpl
   * @see org.xtext.simplesonora.simpleSonora.impl.SimpleSonoraPackageImpl#getChord()
   * @generated
   */
  int CHORD = 8;

  /**
   * The feature id for the '<em><b>Chord Notes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHORD__CHORD_NOTES = 0;

  /**
   * The feature id for the '<em><b>Chord Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHORD__CHORD_NAME = 1;

  /**
   * The feature id for the '<em><b>Inversion</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHORD__INVERSION = 2;

  /**
   * The number of structural features of the '<em>Chord</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHORD_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.simplesonora.simpleSonora.impl.HarmonyImpl <em>Harmony</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.simplesonora.simpleSonora.impl.HarmonyImpl
   * @see org.xtext.simplesonora.simpleSonora.impl.SimpleSonoraPackageImpl#getHarmony()
   * @generated
   */
  int HARMONY = 9;

  /**
   * The feature id for the '<em><b>Harmony Notes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HARMONY__HARMONY_NOTES = 0;

  /**
   * The feature id for the '<em><b>Notes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HARMONY__NOTES = 1;

  /**
   * The number of structural features of the '<em>Harmony</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HARMONY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.simplesonora.simpleSonora.impl.TupletImpl <em>Tuplet</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.simplesonora.simpleSonora.impl.TupletImpl
   * @see org.xtext.simplesonora.simpleSonora.impl.SimpleSonoraPackageImpl#getTuplet()
   * @generated
   */
  int TUPLET = 10;

  /**
   * The feature id for the '<em><b>Tuplet</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUPLET__TUPLET = 0;

  /**
   * The feature id for the '<em><b>Duration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUPLET__DURATION = 1;

  /**
   * The number of structural features of the '<em>Tuplet</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUPLET_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link org.xtext.simplesonora.simpleSonora.Document <em>Document</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Document</em>'.
   * @see org.xtext.simplesonora.simpleSonora.Document
   * @generated
   */
  EClass getDocument();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simplesonora.simpleSonora.Document#getHeader <em>Header</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Header</em>'.
   * @see org.xtext.simplesonora.simpleSonora.Document#getHeader()
   * @see #getDocument()
   * @generated
   */
  EReference getDocument_Header();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simplesonora.simpleSonora.Document#getSong <em>Song</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Song</em>'.
   * @see org.xtext.simplesonora.simpleSonora.Document#getSong()
   * @see #getDocument()
   * @generated
   */
  EReference getDocument_Song();

  /**
   * Returns the meta object for class '{@link org.xtext.simplesonora.simpleSonora.Header <em>Header</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Header</em>'.
   * @see org.xtext.simplesonora.simpleSonora.Header
   * @generated
   */
  EClass getHeader();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.simplesonora.simpleSonora.Header#isNofeedback <em>Nofeedback</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nofeedback</em>'.
   * @see org.xtext.simplesonora.simpleSonora.Header#isNofeedback()
   * @see #getHeader()
   * @generated
   */
  EAttribute getHeader_Nofeedback();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.simplesonora.simpleSonora.Header#getSongName <em>Song Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Song Name</em>'.
   * @see org.xtext.simplesonora.simpleSonora.Header#getSongName()
   * @see #getHeader()
   * @generated
   */
  EAttribute getHeader_SongName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simplesonora.simpleSonora.Header#getTempo <em>Tempo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tempo</em>'.
   * @see org.xtext.simplesonora.simpleSonora.Header#getTempo()
   * @see #getHeader()
   * @generated
   */
  EReference getHeader_Tempo();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simplesonora.simpleSonora.Header#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Key</em>'.
   * @see org.xtext.simplesonora.simpleSonora.Header#getKey()
   * @see #getHeader()
   * @generated
   */
  EReference getHeader_Key();

  /**
   * Returns the meta object for class '{@link org.xtext.simplesonora.simpleSonora.Tempo <em>Tempo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tempo</em>'.
   * @see org.xtext.simplesonora.simpleSonora.Tempo
   * @generated
   */
  EClass getTempo();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.simplesonora.simpleSonora.Tempo#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.simplesonora.simpleSonora.Tempo#getValue()
   * @see #getTempo()
   * @generated
   */
  EAttribute getTempo_Value();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.simplesonora.simpleSonora.Tempo#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.xtext.simplesonora.simpleSonora.Tempo#getId()
   * @see #getTempo()
   * @generated
   */
  EAttribute getTempo_Id();

  /**
   * Returns the meta object for class '{@link org.xtext.simplesonora.simpleSonora.Key <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Key</em>'.
   * @see org.xtext.simplesonora.simpleSonora.Key
   * @generated
   */
  EClass getKey();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.simplesonora.simpleSonora.Key#getNote <em>Note</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Note</em>'.
   * @see org.xtext.simplesonora.simpleSonora.Key#getNote()
   * @see #getKey()
   * @generated
   */
  EAttribute getKey_Note();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.simplesonora.simpleSonora.Key#getAccidental <em>Accidental</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Accidental</em>'.
   * @see org.xtext.simplesonora.simpleSonora.Key#getAccidental()
   * @see #getKey()
   * @generated
   */
  EAttribute getKey_Accidental();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.simplesonora.simpleSonora.Key#getInterval <em>Interval</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Interval</em>'.
   * @see org.xtext.simplesonora.simpleSonora.Key#getInterval()
   * @see #getKey()
   * @generated
   */
  EAttribute getKey_Interval();

  /**
   * Returns the meta object for class '{@link org.xtext.simplesonora.simpleSonora.Song <em>Song</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Song</em>'.
   * @see org.xtext.simplesonora.simpleSonora.Song
   * @generated
   */
  EClass getSong();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.simplesonora.simpleSonora.Song#getInstruments <em>Instruments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Instruments</em>'.
   * @see org.xtext.simplesonora.simpleSonora.Song#getInstruments()
   * @see #getSong()
   * @generated
   */
  EReference getSong_Instruments();

  /**
   * Returns the meta object for class '{@link org.xtext.simplesonora.simpleSonora.Instrument <em>Instrument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instrument</em>'.
   * @see org.xtext.simplesonora.simpleSonora.Instrument
   * @generated
   */
  EClass getInstrument();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.simplesonora.simpleSonora.Instrument#getInstrumentName <em>Instrument Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Instrument Name</em>'.
   * @see org.xtext.simplesonora.simpleSonora.Instrument#getInstrumentName()
   * @see #getInstrument()
   * @generated
   */
  EAttribute getInstrument_InstrumentName();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.simplesonora.simpleSonora.Instrument#getSequences <em>Sequences</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sequences</em>'.
   * @see org.xtext.simplesonora.simpleSonora.Instrument#getSequences()
   * @see #getInstrument()
   * @generated
   */
  EReference getInstrument_Sequences();

  /**
   * Returns the meta object for class '{@link org.xtext.simplesonora.simpleSonora.Sequence <em>Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sequence</em>'.
   * @see org.xtext.simplesonora.simpleSonora.Sequence
   * @generated
   */
  EClass getSequence();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simplesonora.simpleSonora.Sequence#getNote <em>Note</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Note</em>'.
   * @see org.xtext.simplesonora.simpleSonora.Sequence#getNote()
   * @see #getSequence()
   * @generated
   */
  EReference getSequence_Note();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simplesonora.simpleSonora.Sequence#getChord <em>Chord</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Chord</em>'.
   * @see org.xtext.simplesonora.simpleSonora.Sequence#getChord()
   * @see #getSequence()
   * @generated
   */
  EReference getSequence_Chord();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simplesonora.simpleSonora.Sequence#getHarmony <em>Harmony</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Harmony</em>'.
   * @see org.xtext.simplesonora.simpleSonora.Sequence#getHarmony()
   * @see #getSequence()
   * @generated
   */
  EReference getSequence_Harmony();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simplesonora.simpleSonora.Sequence#getTuplet <em>Tuplet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tuplet</em>'.
   * @see org.xtext.simplesonora.simpleSonora.Sequence#getTuplet()
   * @see #getSequence()
   * @generated
   */
  EReference getSequence_Tuplet();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.simplesonora.simpleSonora.Sequence#isMeasure <em>Measure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Measure</em>'.
   * @see org.xtext.simplesonora.simpleSonora.Sequence#isMeasure()
   * @see #getSequence()
   * @generated
   */
  EAttribute getSequence_Measure();

  /**
   * Returns the meta object for class '{@link org.xtext.simplesonora.simpleSonora.Note <em>Note</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Note</em>'.
   * @see org.xtext.simplesonora.simpleSonora.Note
   * @generated
   */
  EClass getNote();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.simplesonora.simpleSonora.Note#getOctave <em>Octave</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Octave</em>'.
   * @see org.xtext.simplesonora.simpleSonora.Note#getOctave()
   * @see #getNote()
   * @generated
   */
  EAttribute getNote_Octave();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.simplesonora.simpleSonora.Note#getNote <em>Note</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Note</em>'.
   * @see org.xtext.simplesonora.simpleSonora.Note#getNote()
   * @see #getNote()
   * @generated
   */
  EAttribute getNote_Note();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.simplesonora.simpleSonora.Note#getAccidental <em>Accidental</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Accidental</em>'.
   * @see org.xtext.simplesonora.simpleSonora.Note#getAccidental()
   * @see #getNote()
   * @generated
   */
  EAttribute getNote_Accidental();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.simplesonora.simpleSonora.Note#getDuration <em>Duration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Duration</em>'.
   * @see org.xtext.simplesonora.simpleSonora.Note#getDuration()
   * @see #getNote()
   * @generated
   */
  EAttribute getNote_Duration();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.simplesonora.simpleSonora.Note#isPoint <em>Point</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Point</em>'.
   * @see org.xtext.simplesonora.simpleSonora.Note#isPoint()
   * @see #getNote()
   * @generated
   */
  EAttribute getNote_Point();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.simplesonora.simpleSonora.Note#isTie <em>Tie</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tie</em>'.
   * @see org.xtext.simplesonora.simpleSonora.Note#isTie()
   * @see #getNote()
   * @generated
   */
  EAttribute getNote_Tie();

  /**
   * Returns the meta object for class '{@link org.xtext.simplesonora.simpleSonora.Chord <em>Chord</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Chord</em>'.
   * @see org.xtext.simplesonora.simpleSonora.Chord
   * @generated
   */
  EClass getChord();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.simplesonora.simpleSonora.Chord#getChordNotes <em>Chord Notes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Chord Notes</em>'.
   * @see org.xtext.simplesonora.simpleSonora.Chord#getChordNotes()
   * @see #getChord()
   * @generated
   */
  EReference getChord_ChordNotes();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.simplesonora.simpleSonora.Chord#getChordName <em>Chord Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Chord Name</em>'.
   * @see org.xtext.simplesonora.simpleSonora.Chord#getChordName()
   * @see #getChord()
   * @generated
   */
  EAttribute getChord_ChordName();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.simplesonora.simpleSonora.Chord#getInversion <em>Inversion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Inversion</em>'.
   * @see org.xtext.simplesonora.simpleSonora.Chord#getInversion()
   * @see #getChord()
   * @generated
   */
  EAttribute getChord_Inversion();

  /**
   * Returns the meta object for class '{@link org.xtext.simplesonora.simpleSonora.Harmony <em>Harmony</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Harmony</em>'.
   * @see org.xtext.simplesonora.simpleSonora.Harmony
   * @generated
   */
  EClass getHarmony();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.simplesonora.simpleSonora.Harmony#getHarmonyNotes <em>Harmony Notes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Harmony Notes</em>'.
   * @see org.xtext.simplesonora.simpleSonora.Harmony#getHarmonyNotes()
   * @see #getHarmony()
   * @generated
   */
  EReference getHarmony_HarmonyNotes();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.simplesonora.simpleSonora.Harmony#getNotes <em>Notes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Notes</em>'.
   * @see org.xtext.simplesonora.simpleSonora.Harmony#getNotes()
   * @see #getHarmony()
   * @generated
   */
  EReference getHarmony_Notes();

  /**
   * Returns the meta object for class '{@link org.xtext.simplesonora.simpleSonora.Tuplet <em>Tuplet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tuplet</em>'.
   * @see org.xtext.simplesonora.simpleSonora.Tuplet
   * @generated
   */
  EClass getTuplet();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.simplesonora.simpleSonora.Tuplet#getTuplet <em>Tuplet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tuplet</em>'.
   * @see org.xtext.simplesonora.simpleSonora.Tuplet#getTuplet()
   * @see #getTuplet()
   * @generated
   */
  EReference getTuplet_Tuplet();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.simplesonora.simpleSonora.Tuplet#getDuration <em>Duration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Duration</em>'.
   * @see org.xtext.simplesonora.simpleSonora.Tuplet#getDuration()
   * @see #getTuplet()
   * @generated
   */
  EAttribute getTuplet_Duration();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SimpleSonoraFactory getSimpleSonoraFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.simplesonora.simpleSonora.impl.DocumentImpl <em>Document</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.simplesonora.simpleSonora.impl.DocumentImpl
     * @see org.xtext.simplesonora.simpleSonora.impl.SimpleSonoraPackageImpl#getDocument()
     * @generated
     */
    EClass DOCUMENT = eINSTANCE.getDocument();

    /**
     * The meta object literal for the '<em><b>Header</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT__HEADER = eINSTANCE.getDocument_Header();

    /**
     * The meta object literal for the '<em><b>Song</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT__SONG = eINSTANCE.getDocument_Song();

    /**
     * The meta object literal for the '{@link org.xtext.simplesonora.simpleSonora.impl.HeaderImpl <em>Header</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.simplesonora.simpleSonora.impl.HeaderImpl
     * @see org.xtext.simplesonora.simpleSonora.impl.SimpleSonoraPackageImpl#getHeader()
     * @generated
     */
    EClass HEADER = eINSTANCE.getHeader();

    /**
     * The meta object literal for the '<em><b>Nofeedback</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HEADER__NOFEEDBACK = eINSTANCE.getHeader_Nofeedback();

    /**
     * The meta object literal for the '<em><b>Song Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HEADER__SONG_NAME = eINSTANCE.getHeader_SongName();

    /**
     * The meta object literal for the '<em><b>Tempo</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HEADER__TEMPO = eINSTANCE.getHeader_Tempo();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HEADER__KEY = eINSTANCE.getHeader_Key();

    /**
     * The meta object literal for the '{@link org.xtext.simplesonora.simpleSonora.impl.TempoImpl <em>Tempo</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.simplesonora.simpleSonora.impl.TempoImpl
     * @see org.xtext.simplesonora.simpleSonora.impl.SimpleSonoraPackageImpl#getTempo()
     * @generated
     */
    EClass TEMPO = eINSTANCE.getTempo();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEMPO__VALUE = eINSTANCE.getTempo_Value();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEMPO__ID = eINSTANCE.getTempo_Id();

    /**
     * The meta object literal for the '{@link org.xtext.simplesonora.simpleSonora.impl.KeyImpl <em>Key</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.simplesonora.simpleSonora.impl.KeyImpl
     * @see org.xtext.simplesonora.simpleSonora.impl.SimpleSonoraPackageImpl#getKey()
     * @generated
     */
    EClass KEY = eINSTANCE.getKey();

    /**
     * The meta object literal for the '<em><b>Note</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KEY__NOTE = eINSTANCE.getKey_Note();

    /**
     * The meta object literal for the '<em><b>Accidental</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KEY__ACCIDENTAL = eINSTANCE.getKey_Accidental();

    /**
     * The meta object literal for the '<em><b>Interval</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KEY__INTERVAL = eINSTANCE.getKey_Interval();

    /**
     * The meta object literal for the '{@link org.xtext.simplesonora.simpleSonora.impl.SongImpl <em>Song</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.simplesonora.simpleSonora.impl.SongImpl
     * @see org.xtext.simplesonora.simpleSonora.impl.SimpleSonoraPackageImpl#getSong()
     * @generated
     */
    EClass SONG = eINSTANCE.getSong();

    /**
     * The meta object literal for the '<em><b>Instruments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SONG__INSTRUMENTS = eINSTANCE.getSong_Instruments();

    /**
     * The meta object literal for the '{@link org.xtext.simplesonora.simpleSonora.impl.InstrumentImpl <em>Instrument</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.simplesonora.simpleSonora.impl.InstrumentImpl
     * @see org.xtext.simplesonora.simpleSonora.impl.SimpleSonoraPackageImpl#getInstrument()
     * @generated
     */
    EClass INSTRUMENT = eINSTANCE.getInstrument();

    /**
     * The meta object literal for the '<em><b>Instrument Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTRUMENT__INSTRUMENT_NAME = eINSTANCE.getInstrument_InstrumentName();

    /**
     * The meta object literal for the '<em><b>Sequences</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUMENT__SEQUENCES = eINSTANCE.getInstrument_Sequences();

    /**
     * The meta object literal for the '{@link org.xtext.simplesonora.simpleSonora.impl.SequenceImpl <em>Sequence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.simplesonora.simpleSonora.impl.SequenceImpl
     * @see org.xtext.simplesonora.simpleSonora.impl.SimpleSonoraPackageImpl#getSequence()
     * @generated
     */
    EClass SEQUENCE = eINSTANCE.getSequence();

    /**
     * The meta object literal for the '<em><b>Note</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEQUENCE__NOTE = eINSTANCE.getSequence_Note();

    /**
     * The meta object literal for the '<em><b>Chord</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEQUENCE__CHORD = eINSTANCE.getSequence_Chord();

    /**
     * The meta object literal for the '<em><b>Harmony</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEQUENCE__HARMONY = eINSTANCE.getSequence_Harmony();

    /**
     * The meta object literal for the '<em><b>Tuplet</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEQUENCE__TUPLET = eINSTANCE.getSequence_Tuplet();

    /**
     * The meta object literal for the '<em><b>Measure</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SEQUENCE__MEASURE = eINSTANCE.getSequence_Measure();

    /**
     * The meta object literal for the '{@link org.xtext.simplesonora.simpleSonora.impl.NoteImpl <em>Note</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.simplesonora.simpleSonora.impl.NoteImpl
     * @see org.xtext.simplesonora.simpleSonora.impl.SimpleSonoraPackageImpl#getNote()
     * @generated
     */
    EClass NOTE = eINSTANCE.getNote();

    /**
     * The meta object literal for the '<em><b>Octave</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NOTE__OCTAVE = eINSTANCE.getNote_Octave();

    /**
     * The meta object literal for the '<em><b>Note</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NOTE__NOTE = eINSTANCE.getNote_Note();

    /**
     * The meta object literal for the '<em><b>Accidental</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NOTE__ACCIDENTAL = eINSTANCE.getNote_Accidental();

    /**
     * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NOTE__DURATION = eINSTANCE.getNote_Duration();

    /**
     * The meta object literal for the '<em><b>Point</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NOTE__POINT = eINSTANCE.getNote_Point();

    /**
     * The meta object literal for the '<em><b>Tie</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NOTE__TIE = eINSTANCE.getNote_Tie();

    /**
     * The meta object literal for the '{@link org.xtext.simplesonora.simpleSonora.impl.ChordImpl <em>Chord</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.simplesonora.simpleSonora.impl.ChordImpl
     * @see org.xtext.simplesonora.simpleSonora.impl.SimpleSonoraPackageImpl#getChord()
     * @generated
     */
    EClass CHORD = eINSTANCE.getChord();

    /**
     * The meta object literal for the '<em><b>Chord Notes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHORD__CHORD_NOTES = eINSTANCE.getChord_ChordNotes();

    /**
     * The meta object literal for the '<em><b>Chord Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHORD__CHORD_NAME = eINSTANCE.getChord_ChordName();

    /**
     * The meta object literal for the '<em><b>Inversion</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHORD__INVERSION = eINSTANCE.getChord_Inversion();

    /**
     * The meta object literal for the '{@link org.xtext.simplesonora.simpleSonora.impl.HarmonyImpl <em>Harmony</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.simplesonora.simpleSonora.impl.HarmonyImpl
     * @see org.xtext.simplesonora.simpleSonora.impl.SimpleSonoraPackageImpl#getHarmony()
     * @generated
     */
    EClass HARMONY = eINSTANCE.getHarmony();

    /**
     * The meta object literal for the '<em><b>Harmony Notes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HARMONY__HARMONY_NOTES = eINSTANCE.getHarmony_HarmonyNotes();

    /**
     * The meta object literal for the '<em><b>Notes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HARMONY__NOTES = eINSTANCE.getHarmony_Notes();

    /**
     * The meta object literal for the '{@link org.xtext.simplesonora.simpleSonora.impl.TupletImpl <em>Tuplet</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.simplesonora.simpleSonora.impl.TupletImpl
     * @see org.xtext.simplesonora.simpleSonora.impl.SimpleSonoraPackageImpl#getTuplet()
     * @generated
     */
    EClass TUPLET = eINSTANCE.getTuplet();

    /**
     * The meta object literal for the '<em><b>Tuplet</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TUPLET__TUPLET = eINSTANCE.getTuplet_Tuplet();

    /**
     * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TUPLET__DURATION = eINSTANCE.getTuplet_Duration();

  }

} //SimpleSonoraPackage
