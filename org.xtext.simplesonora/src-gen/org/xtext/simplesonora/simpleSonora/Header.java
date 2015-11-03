/**
 */
package org.xtext.simplesonora.simpleSonora;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.simplesonora.simpleSonora.Header#isNofeedback <em>Nofeedback</em>}</li>
 *   <li>{@link org.xtext.simplesonora.simpleSonora.Header#getSongName <em>Song Name</em>}</li>
 *   <li>{@link org.xtext.simplesonora.simpleSonora.Header#getTempo <em>Tempo</em>}</li>
 *   <li>{@link org.xtext.simplesonora.simpleSonora.Header#getKey <em>Key</em>}</li>
 * </ul>
 *
 * @see org.xtext.simplesonora.simpleSonora.SimpleSonoraPackage#getHeader()
 * @model
 * @generated
 */
public interface Header extends EObject
{
  /**
   * Returns the value of the '<em><b>Nofeedback</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nofeedback</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nofeedback</em>' attribute.
   * @see #setNofeedback(boolean)
   * @see org.xtext.simplesonora.simpleSonora.SimpleSonoraPackage#getHeader_Nofeedback()
   * @model
   * @generated
   */
  boolean isNofeedback();

  /**
   * Sets the value of the '{@link org.xtext.simplesonora.simpleSonora.Header#isNofeedback <em>Nofeedback</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nofeedback</em>' attribute.
   * @see #isNofeedback()
   * @generated
   */
  void setNofeedback(boolean value);

  /**
   * Returns the value of the '<em><b>Song Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Song Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Song Name</em>' attribute.
   * @see #setSongName(String)
   * @see org.xtext.simplesonora.simpleSonora.SimpleSonoraPackage#getHeader_SongName()
   * @model
   * @generated
   */
  String getSongName();

  /**
   * Sets the value of the '{@link org.xtext.simplesonora.simpleSonora.Header#getSongName <em>Song Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Song Name</em>' attribute.
   * @see #getSongName()
   * @generated
   */
  void setSongName(String value);

  /**
   * Returns the value of the '<em><b>Tempo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tempo</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tempo</em>' containment reference.
   * @see #setTempo(Tempo)
   * @see org.xtext.simplesonora.simpleSonora.SimpleSonoraPackage#getHeader_Tempo()
   * @model containment="true"
   * @generated
   */
  Tempo getTempo();

  /**
   * Sets the value of the '{@link org.xtext.simplesonora.simpleSonora.Header#getTempo <em>Tempo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tempo</em>' containment reference.
   * @see #getTempo()
   * @generated
   */
  void setTempo(Tempo value);

  /**
   * Returns the value of the '<em><b>Key</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Key</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key</em>' containment reference.
   * @see #setKey(Key)
   * @see org.xtext.simplesonora.simpleSonora.SimpleSonoraPackage#getHeader_Key()
   * @model containment="true"
   * @generated
   */
  Key getKey();

  /**
   * Sets the value of the '{@link org.xtext.simplesonora.simpleSonora.Header#getKey <em>Key</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Key</em>' containment reference.
   * @see #getKey()
   * @generated
   */
  void setKey(Key value);

} // Header
