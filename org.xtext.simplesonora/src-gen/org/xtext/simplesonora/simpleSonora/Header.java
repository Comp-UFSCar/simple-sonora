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
 *   <li>{@link org.xtext.simplesonora.simpleSonora.Header#getSongName <em>Song Name</em>}</li>
 *   <li>{@link org.xtext.simplesonora.simpleSonora.Header#getTempo <em>Tempo</em>}</li>
 *   <li>{@link org.xtext.simplesonora.simpleSonora.Header#getTime <em>Time</em>}</li>
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
   * Returns the value of the '<em><b>Tempo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tempo</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tempo</em>' attribute.
   * @see #setTempo(int)
   * @see org.xtext.simplesonora.simpleSonora.SimpleSonoraPackage#getHeader_Tempo()
   * @model
   * @generated
   */
  int getTempo();

  /**
   * Sets the value of the '{@link org.xtext.simplesonora.simpleSonora.Header#getTempo <em>Tempo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tempo</em>' attribute.
   * @see #getTempo()
   * @generated
   */
  void setTempo(int value);

  /**
   * Returns the value of the '<em><b>Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Time</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Time</em>' attribute.
   * @see #setTime(String)
   * @see org.xtext.simplesonora.simpleSonora.SimpleSonoraPackage#getHeader_Time()
   * @model
   * @generated
   */
  String getTime();

  /**
   * Sets the value of the '{@link org.xtext.simplesonora.simpleSonora.Header#getTime <em>Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Time</em>' attribute.
   * @see #getTime()
   * @generated
   */
  void setTime(String value);

  /**
   * Returns the value of the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Key</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key</em>' attribute.
   * @see #setKey(String)
   * @see org.xtext.simplesonora.simpleSonora.SimpleSonoraPackage#getHeader_Key()
   * @model
   * @generated
   */
  String getKey();

  /**
   * Sets the value of the '{@link org.xtext.simplesonora.simpleSonora.Header#getKey <em>Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Key</em>' attribute.
   * @see #getKey()
   * @generated
   */
  void setKey(String value);

} // Header
