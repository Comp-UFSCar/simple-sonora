/**
 */
package org.xtext.simplesonora.simpleSonora;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instrument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.simplesonora.simpleSonora.Instrument#getInstrumentName <em>Instrument Name</em>}</li>
 *   <li>{@link org.xtext.simplesonora.simpleSonora.Instrument#getSequences <em>Sequences</em>}</li>
 * </ul>
 *
 * @see org.xtext.simplesonora.simpleSonora.SimpleSonoraPackage#getInstrument()
 * @model
 * @generated
 */
public interface Instrument extends EObject
{
  /**
   * Returns the value of the '<em><b>Instrument Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instrument Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instrument Name</em>' attribute.
   * @see #setInstrumentName(String)
   * @see org.xtext.simplesonora.simpleSonora.SimpleSonoraPackage#getInstrument_InstrumentName()
   * @model
   * @generated
   */
  String getInstrumentName();

  /**
   * Sets the value of the '{@link org.xtext.simplesonora.simpleSonora.Instrument#getInstrumentName <em>Instrument Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Instrument Name</em>' attribute.
   * @see #getInstrumentName()
   * @generated
   */
  void setInstrumentName(String value);

  /**
   * Returns the value of the '<em><b>Sequences</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.simplesonora.simpleSonora.Sequence}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sequences</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sequences</em>' containment reference list.
   * @see org.xtext.simplesonora.simpleSonora.SimpleSonoraPackage#getInstrument_Sequences()
   * @model containment="true"
   * @generated
   */
  EList<Sequence> getSequences();

} // Instrument
