/**
 */
package org.xtext.simplesonora.simpleSonora;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Note</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.simplesonora.simpleSonora.Note#getOctave <em>Octave</em>}</li>
 *   <li>{@link org.xtext.simplesonora.simpleSonora.Note#getNote <em>Note</em>}</li>
 *   <li>{@link org.xtext.simplesonora.simpleSonora.Note#getAccidental <em>Accidental</em>}</li>
 *   <li>{@link org.xtext.simplesonora.simpleSonora.Note#getDuration <em>Duration</em>}</li>
 * </ul>
 *
 * @see org.xtext.simplesonora.simpleSonora.SimpleSonoraPackage#getNote()
 * @model
 * @generated
 */
public interface Note extends EObject
{
  /**
   * Returns the value of the '<em><b>Octave</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Octave</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Octave</em>' attribute.
   * @see #setOctave(String)
   * @see org.xtext.simplesonora.simpleSonora.SimpleSonoraPackage#getNote_Octave()
   * @model
   * @generated
   */
  String getOctave();

  /**
   * Sets the value of the '{@link org.xtext.simplesonora.simpleSonora.Note#getOctave <em>Octave</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Octave</em>' attribute.
   * @see #getOctave()
   * @generated
   */
  void setOctave(String value);

  /**
   * Returns the value of the '<em><b>Note</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Note</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Note</em>' attribute.
   * @see #setNote(String)
   * @see org.xtext.simplesonora.simpleSonora.SimpleSonoraPackage#getNote_Note()
   * @model
   * @generated
   */
  String getNote();

  /**
   * Sets the value of the '{@link org.xtext.simplesonora.simpleSonora.Note#getNote <em>Note</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Note</em>' attribute.
   * @see #getNote()
   * @generated
   */
  void setNote(String value);

  /**
   * Returns the value of the '<em><b>Accidental</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Accidental</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Accidental</em>' attribute.
   * @see #setAccidental(String)
   * @see org.xtext.simplesonora.simpleSonora.SimpleSonoraPackage#getNote_Accidental()
   * @model
   * @generated
   */
  String getAccidental();

  /**
   * Sets the value of the '{@link org.xtext.simplesonora.simpleSonora.Note#getAccidental <em>Accidental</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Accidental</em>' attribute.
   * @see #getAccidental()
   * @generated
   */
  void setAccidental(String value);

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
   * @see org.xtext.simplesonora.simpleSonora.SimpleSonoraPackage#getNote_Duration()
   * @model
   * @generated
   */
  String getDuration();

  /**
   * Sets the value of the '{@link org.xtext.simplesonora.simpleSonora.Note#getDuration <em>Duration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Duration</em>' attribute.
   * @see #getDuration()
   * @generated
   */
  void setDuration(String value);

} // Note
