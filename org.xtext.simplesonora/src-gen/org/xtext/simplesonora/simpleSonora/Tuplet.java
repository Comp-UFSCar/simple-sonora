/**
 */
package org.xtext.simplesonora.simpleSonora;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tuplet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.simplesonora.simpleSonora.Tuplet#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.xtext.simplesonora.simpleSonora.Tuplet#getDuration <em>Duration</em>}</li>
 * </ul>
 *
 * @see org.xtext.simplesonora.simpleSonora.SimpleSonoraPackage#getTuplet()
 * @model
 * @generated
 */
public interface Tuplet extends EObject
{
  /**
   * Returns the value of the '<em><b>Notes</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.simplesonora.simpleSonora.Note}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Notes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Notes</em>' containment reference list.
   * @see org.xtext.simplesonora.simpleSonora.SimpleSonoraPackage#getTuplet_Notes()
   * @model containment="true"
   * @generated
   */
  EList<Note> getNotes();

  /**
   * Returns the value of the '<em><b>Duration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Duration</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Duration</em>' attribute.
   * @see #setDuration(String)
   * @see org.xtext.simplesonora.simpleSonora.SimpleSonoraPackage#getTuplet_Duration()
   * @model
   * @generated
   */
  String getDuration();

  /**
   * Sets the value of the '{@link org.xtext.simplesonora.simpleSonora.Tuplet#getDuration <em>Duration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Duration</em>' attribute.
   * @see #getDuration()
   * @generated
   */
  void setDuration(String value);

} // Tuplet
