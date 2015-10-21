/**
 */
package org.xtext.simplesonora.simpleSonora;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.simplesonora.simpleSonora.File#getHeader <em>Header</em>}</li>
 *   <li>{@link org.xtext.simplesonora.simpleSonora.File#getMelody <em>Melody</em>}</li>
 * </ul>
 *
 * @see org.xtext.simplesonora.simpleSonora.SimpleSonoraPackage#getFile()
 * @model
 * @generated
 */
public interface File extends EObject
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
   * @see org.xtext.simplesonora.simpleSonora.SimpleSonoraPackage#getFile_Header()
   * @model containment="true"
   * @generated
   */
  Header getHeader();

  /**
   * Sets the value of the '{@link org.xtext.simplesonora.simpleSonora.File#getHeader <em>Header</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Header</em>' containment reference.
   * @see #getHeader()
   * @generated
   */
  void setHeader(Header value);

  /**
   * Returns the value of the '<em><b>Melody</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Melody</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Melody</em>' containment reference.
   * @see #setMelody(Melody)
   * @see org.xtext.simplesonora.simpleSonora.SimpleSonoraPackage#getFile_Melody()
   * @model containment="true"
   * @generated
   */
  Melody getMelody();

  /**
   * Sets the value of the '{@link org.xtext.simplesonora.simpleSonora.File#getMelody <em>Melody</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Melody</em>' containment reference.
   * @see #getMelody()
   * @generated
   */
  void setMelody(Melody value);

} // File
