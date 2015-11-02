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
   * The feature id for the '<em><b>Song Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER__SONG_NAME = 0;

  /**
   * The feature id for the '<em><b>Tempo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER__TEMPO = 1;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER__KEY = 2;

  /**
   * The number of structural features of the '<em>Header</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.simplesonora.simpleSonora.impl.SongImpl <em>Song</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.simplesonora.simpleSonora.impl.SongImpl
   * @see org.xtext.simplesonora.simpleSonora.impl.SimpleSonoraPackageImpl#getSong()
   * @generated
   */
  int SONG = 2;

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
  int INSTRUMENT = 3;

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
  int SEQUENCE = 4;

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
   * The feature id for the '<em><b>Measure</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE__MEASURE = 3;

  /**
   * The number of structural features of the '<em>Sequence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.simplesonora.simpleSonora.impl.HarmonyImpl <em>Harmony</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.simplesonora.simpleSonora.impl.HarmonyImpl
   * @see org.xtext.simplesonora.simpleSonora.impl.SimpleSonoraPackageImpl#getHarmony()
   * @generated
   */
  int HARMONY = 5;

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
   * The meta object id for the '{@link org.xtext.simplesonora.simpleSonora.impl.ChordImpl <em>Chord</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.simplesonora.simpleSonora.impl.ChordImpl
   * @see org.xtext.simplesonora.simpleSonora.impl.SimpleSonoraPackageImpl#getChord()
   * @generated
   */
  int CHORD = 6;

  /**
   * The feature id for the '<em><b>Chord Notes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHORD__CHORD_NOTES = 0;

  /**
   * The number of structural features of the '<em>Chord</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHORD_FEATURE_COUNT = 1;

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
   * The number of structural features of the '<em>Note</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTE_FEATURE_COUNT = 5;


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
   * Returns the meta object for the attribute '{@link org.xtext.simplesonora.simpleSonora.Header#getTempo <em>Tempo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tempo</em>'.
   * @see org.xtext.simplesonora.simpleSonora.Header#getTempo()
   * @see #getHeader()
   * @generated
   */
  EAttribute getHeader_Tempo();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.simplesonora.simpleSonora.Header#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see org.xtext.simplesonora.simpleSonora.Header#getKey()
   * @see #getHeader()
   * @generated
   */
  EAttribute getHeader_Key();

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
     * The meta object literal for the '<em><b>Song Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HEADER__SONG_NAME = eINSTANCE.getHeader_SongName();

    /**
     * The meta object literal for the '<em><b>Tempo</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HEADER__TEMPO = eINSTANCE.getHeader_Tempo();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HEADER__KEY = eINSTANCE.getHeader_Key();

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
     * The meta object literal for the '<em><b>Measure</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SEQUENCE__MEASURE = eINSTANCE.getSequence_Measure();

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

  }

} //SimpleSonoraPackage
