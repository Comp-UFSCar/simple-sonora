/**
 */
package org.xtext.simplesonora.simpleSonora;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chord</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.simplesonora.simpleSonora.Chord#getChordNotes <em>Chord Notes</em>}</li>
 * </ul>
 *
 * @see org.xtext.simplesonora.simpleSonora.SimpleSonoraPackage#getChord()
 * @model
 * @generated
 */
public interface Chord extends EObject
{
  /**
   * Returns the value of the '<em><b>Chord Notes</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Chord Notes</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Chord Notes</em>' attribute list.
   * @see org.xtext.simplesonora.simpleSonora.SimpleSonoraPackage#getChord_ChordNotes()
   * @model unique="false"
   * @generated
   */
  EList<String> getChordNotes();

} // Chord
