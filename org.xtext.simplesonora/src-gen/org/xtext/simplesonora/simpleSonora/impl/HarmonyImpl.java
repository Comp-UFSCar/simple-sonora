/**
 */
package org.xtext.simplesonora.simpleSonora.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.simplesonora.simpleSonora.Harmony;
import org.xtext.simplesonora.simpleSonora.Note;
import org.xtext.simplesonora.simpleSonora.SimpleSonoraPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Harmony</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.simplesonora.simpleSonora.impl.HarmonyImpl#getHarmonyNotes <em>Harmony Notes</em>}</li>
 *   <li>{@link org.xtext.simplesonora.simpleSonora.impl.HarmonyImpl#getNotes <em>Notes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HarmonyImpl extends MinimalEObjectImpl.Container implements Harmony
{
  /**
   * The cached value of the '{@link #getHarmonyNotes() <em>Harmony Notes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHarmonyNotes()
   * @generated
   * @ordered
   */
  protected EList<Note> harmonyNotes;

  /**
   * The cached value of the '{@link #getNotes() <em>Notes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNotes()
   * @generated
   * @ordered
   */
  protected EList<Note> notes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HarmonyImpl()
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
    return SimpleSonoraPackage.Literals.HARMONY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Note> getHarmonyNotes()
  {
    if (harmonyNotes == null)
    {
      harmonyNotes = new EObjectContainmentEList<Note>(Note.class, this, SimpleSonoraPackage.HARMONY__HARMONY_NOTES);
    }
    return harmonyNotes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Note> getNotes()
  {
    if (notes == null)
    {
      notes = new EObjectContainmentEList<Note>(Note.class, this, SimpleSonoraPackage.HARMONY__NOTES);
    }
    return notes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SimpleSonoraPackage.HARMONY__HARMONY_NOTES:
        return ((InternalEList<?>)getHarmonyNotes()).basicRemove(otherEnd, msgs);
      case SimpleSonoraPackage.HARMONY__NOTES:
        return ((InternalEList<?>)getNotes()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case SimpleSonoraPackage.HARMONY__HARMONY_NOTES:
        return getHarmonyNotes();
      case SimpleSonoraPackage.HARMONY__NOTES:
        return getNotes();
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
      case SimpleSonoraPackage.HARMONY__HARMONY_NOTES:
        getHarmonyNotes().clear();
        getHarmonyNotes().addAll((Collection<? extends Note>)newValue);
        return;
      case SimpleSonoraPackage.HARMONY__NOTES:
        getNotes().clear();
        getNotes().addAll((Collection<? extends Note>)newValue);
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
      case SimpleSonoraPackage.HARMONY__HARMONY_NOTES:
        getHarmonyNotes().clear();
        return;
      case SimpleSonoraPackage.HARMONY__NOTES:
        getNotes().clear();
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
      case SimpleSonoraPackage.HARMONY__HARMONY_NOTES:
        return harmonyNotes != null && !harmonyNotes.isEmpty();
      case SimpleSonoraPackage.HARMONY__NOTES:
        return notes != null && !notes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //HarmonyImpl
