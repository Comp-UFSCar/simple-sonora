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

import org.xtext.simplesonora.simpleSonora.Melody;
import org.xtext.simplesonora.simpleSonora.Sequence;
import org.xtext.simplesonora.simpleSonora.SimpleSonoraPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Melody</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.simplesonora.simpleSonora.impl.MelodyImpl#getSequences <em>Sequences</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MelodyImpl extends MinimalEObjectImpl.Container implements Melody
{
  /**
   * The cached value of the '{@link #getSequences() <em>Sequences</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSequences()
   * @generated
   * @ordered
   */
  protected EList<Sequence> sequences;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MelodyImpl()
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
    return SimpleSonoraPackage.Literals.MELODY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Sequence> getSequences()
  {
    if (sequences == null)
    {
      sequences = new EObjectContainmentEList<Sequence>(Sequence.class, this, SimpleSonoraPackage.MELODY__SEQUENCES);
    }
    return sequences;
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
      case SimpleSonoraPackage.MELODY__SEQUENCES:
        return ((InternalEList<?>)getSequences()).basicRemove(otherEnd, msgs);
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
      case SimpleSonoraPackage.MELODY__SEQUENCES:
        return getSequences();
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
      case SimpleSonoraPackage.MELODY__SEQUENCES:
        getSequences().clear();
        getSequences().addAll((Collection<? extends Sequence>)newValue);
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
      case SimpleSonoraPackage.MELODY__SEQUENCES:
        getSequences().clear();
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
      case SimpleSonoraPackage.MELODY__SEQUENCES:
        return sequences != null && !sequences.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //MelodyImpl
