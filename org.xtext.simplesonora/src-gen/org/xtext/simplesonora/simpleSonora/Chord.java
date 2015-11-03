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
 *   <li>{@link org.xtext.simplesonora.simpleSonora.Chord#getChordName <em>Chord Name</em>}</li>
 *   <li>{@link org.xtext.simplesonora.simpleSonora.Chord#getInversion <em>Inversion</em>}</li>
 * </ul>
 *
 * @see org.xtext.simplesonora.simpleSonora.SimpleSonoraPackage#getChord()
 * @model
 * @generated
 */
public interface Chord extends EObject
{
  /**
   * Returns the value of the '<em><b>Chord Notes</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.simplesonora.simpleSonora.Note}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Chord Notes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Chord Notes</em>' containment reference list.
   * @see org.xtext.simplesonora.simpleSonora.SimpleSonoraPackage#getChord_ChordNotes()
   * @model containment="true"
   * @generated
   */
  EList<Note> getChordNotes();

  /**
   * Returns the value of the '<em><b>Chord Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Chord Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Chord Name</em>' attribute.
   * @see #setChordName(String)
   * @see org.xtext.simplesonora.simpleSonora.SimpleSonoraPackage#getChord_ChordName()
   * @model
   * @generated
   */
  String getChordName();

  /**
   * Sets the value of the '{@link org.xtext.simplesonora.simpleSonora.Chord#getChordName <em>Chord Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Chord Name</em>' attribute.
   * @see #getChordName()
   * @generated
   */
  void setChordName(String value);

  /**
   * Returns the value of the '<em><b>Inversion</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inversion</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inversion</em>' attribute.
   * @see #setInversion(String)
   * @see org.xtext.simplesonora.simpleSonora.SimpleSonoraPackage#getChord_Inversion()
   * @model
   * @generated
   */
  String getInversion();

  /**
   * Sets the value of the '{@link org.xtext.simplesonora.simpleSonora.Chord#getInversion <em>Inversion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inversion</em>' attribute.
   * @see #getInversion()
   * @generated
   */
  void setInversion(String value);

} // Chord
