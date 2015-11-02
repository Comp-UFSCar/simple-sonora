/**
 */
package org.xtext.simplesonora.simpleSonora;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.simplesonora.simpleSonora.Sequence#getNote <em>Note</em>}</li>
 *   <li>{@link org.xtext.simplesonora.simpleSonora.Sequence#getChord <em>Chord</em>}</li>
 *   <li>{@link org.xtext.simplesonora.simpleSonora.Sequence#getHarmony <em>Harmony</em>}</li>
 *   <li>{@link org.xtext.simplesonora.simpleSonora.Sequence#isMeasure <em>Measure</em>}</li>
 * </ul>
 *
 * @see org.xtext.simplesonora.simpleSonora.SimpleSonoraPackage#getSequence()
 * @model
 * @generated
 */
public interface Sequence extends EObject
{
  /**
   * Returns the value of the '<em><b>Note</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Note</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Note</em>' containment reference.
   * @see #setNote(Note)
   * @see org.xtext.simplesonora.simpleSonora.SimpleSonoraPackage#getSequence_Note()
   * @model containment="true"
   * @generated
   */
  Note getNote();

  /**
   * Sets the value of the '{@link org.xtext.simplesonora.simpleSonora.Sequence#getNote <em>Note</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Note</em>' containment reference.
   * @see #getNote()
   * @generated
   */
  void setNote(Note value);

  /**
   * Returns the value of the '<em><b>Chord</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Chord</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Chord</em>' containment reference.
   * @see #setChord(Chord)
   * @see org.xtext.simplesonora.simpleSonora.SimpleSonoraPackage#getSequence_Chord()
   * @model containment="true"
   * @generated
   */
  Chord getChord();

  /**
   * Sets the value of the '{@link org.xtext.simplesonora.simpleSonora.Sequence#getChord <em>Chord</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Chord</em>' containment reference.
   * @see #getChord()
   * @generated
   */
  void setChord(Chord value);

  /**
   * Returns the value of the '<em><b>Harmony</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Harmony</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Harmony</em>' containment reference.
   * @see #setHarmony(Harmony)
   * @see org.xtext.simplesonora.simpleSonora.SimpleSonoraPackage#getSequence_Harmony()
   * @model containment="true"
   * @generated
   */
  Harmony getHarmony();

  /**
   * Sets the value of the '{@link org.xtext.simplesonora.simpleSonora.Sequence#getHarmony <em>Harmony</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Harmony</em>' containment reference.
   * @see #getHarmony()
   * @generated
   */
  void setHarmony(Harmony value);

  /**
   * Returns the value of the '<em><b>Measure</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Measure</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Measure</em>' attribute.
   * @see #setMeasure(boolean)
   * @see org.xtext.simplesonora.simpleSonora.SimpleSonoraPackage#getSequence_Measure()
   * @model
   * @generated
   */
  boolean isMeasure();

  /**
   * Sets the value of the '{@link org.xtext.simplesonora.simpleSonora.Sequence#isMeasure <em>Measure</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Measure</em>' attribute.
   * @see #isMeasure()
   * @generated
   */
  void setMeasure(boolean value);

} // Sequence
