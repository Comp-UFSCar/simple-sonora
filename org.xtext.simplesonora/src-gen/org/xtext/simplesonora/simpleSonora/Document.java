/**
 */
package org.xtext.simplesonora.simpleSonora;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.simplesonora.simpleSonora.Document#getHeader <em>Header</em>}</li>
 *   <li>{@link org.xtext.simplesonora.simpleSonora.Document#getSong <em>Song</em>}</li>
 * </ul>
 *
 * @see org.xtext.simplesonora.simpleSonora.SimpleSonoraPackage#getDocument()
 * @model
 * @generated
 */
public interface Document extends EObject
{
  /**
   * Returns the value of the '<em><b>Header</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Header</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Header</em>' containment reference.
   * @see #setHeader(Header)
   * @see org.xtext.simplesonora.simpleSonora.SimpleSonoraPackage#getDocument_Header()
   * @model containment="true"
   * @generated
   */
  Header getHeader();

  /**
   * Sets the value of the '{@link org.xtext.simplesonora.simpleSonora.Document#getHeader <em>Header</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Header</em>' containment reference.
   * @see #getHeader()
   * @generated
   */
  void setHeader(Header value);

  /**
   * Returns the value of the '<em><b>Song</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Song</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Song</em>' containment reference.
   * @see #setSong(Song)
   * @see org.xtext.simplesonora.simpleSonora.SimpleSonoraPackage#getDocument_Song()
   * @model containment="true"
   * @generated
   */
  Song getSong();

  /**
   * Sets the value of the '{@link org.xtext.simplesonora.simpleSonora.Document#getSong <em>Song</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Song</em>' containment reference.
   * @see #getSong()
   * @generated
   */
  void setSong(Song value);

} // Document
