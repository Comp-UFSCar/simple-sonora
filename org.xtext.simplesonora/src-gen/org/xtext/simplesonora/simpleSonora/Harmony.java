/**
 */
package org.xtext.simplesonora.simpleSonora;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Harmony</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.simplesonora.simpleSonora.Harmony#getHarmonyNotes <em>Harmony Notes</em>}</li>
 *   <li>{@link org.xtext.simplesonora.simpleSonora.Harmony#getNotes <em>Notes</em>}</li>
 * </ul>
 *
 * @see org.xtext.simplesonora.simpleSonora.SimpleSonoraPackage#getHarmony()
 * @model
 * @generated
 */
public interface Harmony extends EObject
{
  /**
   * Returns the value of the '<em><b>Harmony Notes</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.simplesonora.simpleSonora.Note}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Harmony Notes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Harmony Notes</em>' containment reference list.
   * @see org.xtext.simplesonora.simpleSonora.SimpleSonoraPackage#getHarmony_HarmonyNotes()
   * @model containment="true"
   * @generated
   */
  EList<Note> getHarmonyNotes();

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
   * @see org.xtext.simplesonora.simpleSonora.SimpleSonoraPackage#getHarmony_Notes()
   * @model containment="true"
   * @generated
   */
  EList<Note> getNotes();

} // Harmony
