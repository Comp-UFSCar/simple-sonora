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
   * The meta object id for the '{@link org.xtext.simplesonora.simpleSonora.impl.FileImpl <em>File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.simplesonora.simpleSonora.impl.FileImpl
   * @see org.xtext.simplesonora.simpleSonora.impl.SimpleSonoraPackageImpl#getFile()
   * @generated
   */
  int FILE = 0;

  /**
   * The feature id for the '<em><b>Header</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE__HEADER = 0;

  /**
   * The feature id for the '<em><b>Melody</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE__MELODY = 1;

  /**
   * The number of structural features of the '<em>File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_FEATURE_COUNT = 2;

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
   * The feature id for the '<em><b>Tempo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER__TEMPO = 0;

  /**
   * The feature id for the '<em><b>Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER__TIME = 1;

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
   * The meta object id for the '{@link org.xtext.simplesonora.simpleSonora.impl.MelodyImpl <em>Melody</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.simplesonora.simpleSonora.impl.MelodyImpl
   * @see org.xtext.simplesonora.simpleSonora.impl.SimpleSonoraPackageImpl#getMelody()
   * @generated
   */
  int MELODY = 2;

  /**
   * The feature id for the '<em><b>Sequences</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MELODY__SEQUENCES = 0;

  /**
   * The number of structural features of the '<em>Melody</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MELODY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.simplesonora.simpleSonora.impl.SequenceImpl <em>Sequence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.simplesonora.simpleSonora.impl.SequenceImpl
   * @see org.xtext.simplesonora.simpleSonora.impl.SimpleSonoraPackageImpl#getSequence()
   * @generated
   */
  int SEQUENCE = 3;

  /**
   * The feature id for the '<em><b>Octave</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE__OCTAVE = 0;

  /**
   * The feature id for the '<em><b>Note</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE__NOTE = 1;

  /**
   * The feature id for the '<em><b>Chord</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE__CHORD = 2;

  /**
   * The number of structural features of the '<em>Sequence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.simplesonora.simpleSonora.impl.ChordImpl <em>Chord</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.simplesonora.simpleSonora.impl.ChordImpl
   * @see org.xtext.simplesonora.simpleSonora.impl.SimpleSonoraPackageImpl#getChord()
   * @generated
   */
  int CHORD = 4;

  /**
   * The feature id for the '<em><b>Chord Notes</b></em>' attribute list.
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
   * Returns the meta object for class '{@link org.xtext.simplesonora.simpleSonora.File <em>File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>File</em>'.
   * @see org.xtext.simplesonora.simpleSonora.File
   * @generated
   */
  EClass getFile();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simplesonora.simpleSonora.File#getHeader <em>Header</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Header</em>'.
   * @see org.xtext.simplesonora.simpleSonora.File#getHeader()
   * @see #getFile()
   * @generated
   */
  EReference getFile_Header();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simplesonora.simpleSonora.File#getMelody <em>Melody</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Melody</em>'.
   * @see org.xtext.simplesonora.simpleSonora.File#getMelody()
   * @see #getFile()
   * @generated
   */
  EReference getFile_Melody();

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
   * Returns the meta object for the attribute '{@link org.xtext.simplesonora.simpleSonora.Header#getTime <em>Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Time</em>'.
   * @see org.xtext.simplesonora.simpleSonora.Header#getTime()
   * @see #getHeader()
   * @generated
   */
  EAttribute getHeader_Time();

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
   * Returns the meta object for class '{@link org.xtext.simplesonora.simpleSonora.Melody <em>Melody</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Melody</em>'.
   * @see org.xtext.simplesonora.simpleSonora.Melody
   * @generated
   */
  EClass getMelody();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.simplesonora.simpleSonora.Melody#getSequences <em>Sequences</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sequences</em>'.
   * @see org.xtext.simplesonora.simpleSonora.Melody#getSequences()
   * @see #getMelody()
   * @generated
   */
  EReference getMelody_Sequences();

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
   * Returns the meta object for the attribute '{@link org.xtext.simplesonora.simpleSonora.Sequence#getOctave <em>Octave</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Octave</em>'.
   * @see org.xtext.simplesonora.simpleSonora.Sequence#getOctave()
   * @see #getSequence()
   * @generated
   */
  EAttribute getSequence_Octave();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.simplesonora.simpleSonora.Sequence#getNote <em>Note</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Note</em>'.
   * @see org.xtext.simplesonora.simpleSonora.Sequence#getNote()
   * @see #getSequence()
   * @generated
   */
  EAttribute getSequence_Note();

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
   * Returns the meta object for class '{@link org.xtext.simplesonora.simpleSonora.Chord <em>Chord</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Chord</em>'.
   * @see org.xtext.simplesonora.simpleSonora.Chord
   * @generated
   */
  EClass getChord();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.simplesonora.simpleSonora.Chord#getChordNotes <em>Chord Notes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Chord Notes</em>'.
   * @see org.xtext.simplesonora.simpleSonora.Chord#getChordNotes()
   * @see #getChord()
   * @generated
   */
  EAttribute getChord_ChordNotes();

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
     * The meta object literal for the '{@link org.xtext.simplesonora.simpleSonora.impl.FileImpl <em>File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.simplesonora.simpleSonora.impl.FileImpl
     * @see org.xtext.simplesonora.simpleSonora.impl.SimpleSonoraPackageImpl#getFile()
     * @generated
     */
    EClass FILE = eINSTANCE.getFile();

    /**
     * The meta object literal for the '<em><b>Header</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILE__HEADER = eINSTANCE.getFile_Header();

    /**
     * The meta object literal for the '<em><b>Melody</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILE__MELODY = eINSTANCE.getFile_Melody();

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
     * The meta object literal for the '<em><b>Tempo</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HEADER__TEMPO = eINSTANCE.getHeader_Tempo();

    /**
     * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HEADER__TIME = eINSTANCE.getHeader_Time();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HEADER__KEY = eINSTANCE.getHeader_Key();

    /**
     * The meta object literal for the '{@link org.xtext.simplesonora.simpleSonora.impl.MelodyImpl <em>Melody</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.simplesonora.simpleSonora.impl.MelodyImpl
     * @see org.xtext.simplesonora.simpleSonora.impl.SimpleSonoraPackageImpl#getMelody()
     * @generated
     */
    EClass MELODY = eINSTANCE.getMelody();

    /**
     * The meta object literal for the '<em><b>Sequences</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MELODY__SEQUENCES = eINSTANCE.getMelody_Sequences();

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
     * The meta object literal for the '<em><b>Octave</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SEQUENCE__OCTAVE = eINSTANCE.getSequence_Octave();

    /**
     * The meta object literal for the '<em><b>Note</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SEQUENCE__NOTE = eINSTANCE.getSequence_Note();

    /**
     * The meta object literal for the '<em><b>Chord</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEQUENCE__CHORD = eINSTANCE.getSequence_Chord();

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
     * The meta object literal for the '<em><b>Chord Notes</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHORD__CHORD_NOTES = eINSTANCE.getChord_ChordNotes();

  }

} //SimpleSonoraPackage
