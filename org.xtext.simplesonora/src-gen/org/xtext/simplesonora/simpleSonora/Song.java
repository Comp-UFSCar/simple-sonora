/**
 */
package org.xtext.simplesonora.simpleSonora;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Song</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.simplesonora.simpleSonora.Song#getInstruments <em>Instruments</em>}</li>
 * </ul>
 *
 * @see org.xtext.simplesonora.simpleSonora.SimpleSonoraPackage#getSong()
 * @model
 * @generated
 */
public interface Song extends EObject
{
  /**
   * Returns the value of the '<em><b>Instruments</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.simplesonora.simpleSonora.Instrument}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instruments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instruments</em>' containment reference list.
   * @see org.xtext.simplesonora.simpleSonora.SimpleSonoraPackage#getSong_Instruments()
   * @model containment="true"
   * @generated
   */
  EList<Instrument> getInstruments();

} // Song
