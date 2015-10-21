/**
 */
package org.xtext.simplesonora.simpleSonora.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.xtext.simplesonora.simpleSonora.Chord;
import org.xtext.simplesonora.simpleSonora.SimpleSonoraPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chord</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.simplesonora.simpleSonora.impl.ChordImpl#getChordNotes <em>Chord Notes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChordImpl extends MinimalEObjectImpl.Container implements Chord
{
  /**
   * The cached value of the '{@link #getChordNotes() <em>Chord Notes</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChordNotes()
   * @generated
   * @ordered
   */
  protected EList<String> chordNotes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ChordImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SimpleSonoraPackage.Literals.CHORD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getChordNotes()
  {
    if (chordNotes == null)
    {
      chordNotes = new EDataTypeEList<String>(String.class, this, SimpleSonoraPackage.CHORD__CHORD_NOTES);
    }
    return chordNotes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SimpleSonoraPackage.CHORD__CHORD_NOTES:
        return getChordNotes();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SimpleSonoraPackage.CHORD__CHORD_NOTES:
        getChordNotes().clear();
        getChordNotes().addAll((Collection<? extends String>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SimpleSonoraPackage.CHORD__CHORD_NOTES:
        getChordNotes().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SimpleSonoraPackage.CHORD__CHORD_NOTES:
        return chordNotes != null && !chordNotes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (chordNotes: ");
    result.append(chordNotes);
    result.append(')');
    return result.toString();
  }

} //ChordImpl
