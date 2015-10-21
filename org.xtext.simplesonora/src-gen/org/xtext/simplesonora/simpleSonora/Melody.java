/**
 */
package org.xtext.simplesonora.simpleSonora;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Melody</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.simplesonora.simpleSonora.Melody#getSequences <em>Sequences</em>}</li>
 * </ul>
 *
 * @see org.xtext.simplesonora.simpleSonora.SimpleSonoraPackage#getMelody()
 * @model
 * @generated
 */
public interface Melody extends EObject
{
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
   * @see org.xtext.simplesonora.simpleSonora.SimpleSonoraPackage#getMelody_Sequences()
   * @model containment="true"
   * @generated
   */
  EList<Sequence> getSequences();

} // Melody
