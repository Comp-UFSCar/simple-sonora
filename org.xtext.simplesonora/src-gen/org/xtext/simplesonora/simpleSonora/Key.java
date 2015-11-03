/**
 */
package org.xtext.simplesonora.simpleSonora;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.simplesonora.simpleSonora.Key#getNote <em>Note</em>}</li>
 *   <li>{@link org.xtext.simplesonora.simpleSonora.Key#getAccidental <em>Accidental</em>}</li>
 *   <li>{@link org.xtext.simplesonora.simpleSonora.Key#getInterval <em>Interval</em>}</li>
 * </ul>
 *
 * @see org.xtext.simplesonora.simpleSonora.SimpleSonoraPackage#getKey()
 * @model
 * @generated
 */
public interface Key extends EObject
{
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
   * @see org.xtext.simplesonora.simpleSonora.SimpleSonoraPackage#getKey_Note()
   * @model
   * @generated
   */
  String getNote();

  /**
   * Sets the value of the '{@link org.xtext.simplesonora.simpleSonora.Key#getNote <em>Note</em>}' attribute.
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
   * @see org.xtext.simplesonora.simpleSonora.SimpleSonoraPackage#getKey_Accidental()
   * @model
   * @generated
   */
  String getAccidental();

  /**
   * Sets the value of the '{@link org.xtext.simplesonora.simpleSonora.Key#getAccidental <em>Accidental</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Accidental</em>' attribute.
   * @see #getAccidental()
   * @generated
   */
  void setAccidental(String value);

  /**
   * Returns the value of the '<em><b>Interval</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interval</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interval</em>' attribute.
   * @see #setInterval(String)
   * @see org.xtext.simplesonora.simpleSonora.SimpleSonoraPackage#getKey_Interval()
   * @model
   * @generated
   */
  String getInterval();

  /**
   * Sets the value of the '{@link org.xtext.simplesonora.simpleSonora.Key#getInterval <em>Interval</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interval</em>' attribute.
   * @see #getInterval()
   * @generated
   */
  void setInterval(String value);

} // Key
