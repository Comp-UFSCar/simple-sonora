/**
 */
package org.xtext.simplesonora.simpleSonora;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.simplesonora.simpleSonora.SimpleSonoraPackage
 * @generated
 */
public interface SimpleSonoraFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SimpleSonoraFactory eINSTANCE = org.xtext.simplesonora.simpleSonora.impl.SimpleSonoraFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Document</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Document</em>'.
   * @generated
   */
  Document createDocument();

  /**
   * Returns a new object of class '<em>Header</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Header</em>'.
   * @generated
   */
  Header createHeader();

  /**
   * Returns a new object of class '<em>Tempo</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tempo</em>'.
   * @generated
   */
  Tempo createTempo();

  /**
   * Returns a new object of class '<em>Key</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Key</em>'.
   * @generated
   */
  Key createKey();

  /**
   * Returns a new object of class '<em>Song</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Song</em>'.
   * @generated
   */
  Song createSong();

  /**
   * Returns a new object of class '<em>Instrument</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instrument</em>'.
   * @generated
   */
  Instrument createInstrument();

  /**
   * Returns a new object of class '<em>Sequence</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sequence</em>'.
   * @generated
   */
  Sequence createSequence();

  /**
   * Returns a new object of class '<em>Note</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Note</em>'.
   * @generated
   */
  Note createNote();

  /**
   * Returns a new object of class '<em>Chord</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Chord</em>'.
   * @generated
   */
  Chord createChord();

  /**
   * Returns a new object of class '<em>Harmony</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Harmony</em>'.
   * @generated
   */
  Harmony createHarmony();

  /**
   * Returns a new object of class '<em>Tuplet</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tuplet</em>'.
   * @generated
   */
  Tuplet createTuplet();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SimpleSonoraPackage getSimpleSonoraPackage();

} //SimpleSonoraFactory
