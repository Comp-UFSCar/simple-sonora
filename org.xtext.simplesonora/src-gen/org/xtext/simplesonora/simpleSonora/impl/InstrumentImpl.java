/**
 */
package org.xtext.simplesonora.simpleSonora.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.simplesonora.simpleSonora.Instrument;
import org.xtext.simplesonora.simpleSonora.Sequence;
import org.xtext.simplesonora.simpleSonora.SimpleSonoraPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instrument</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.simplesonora.simpleSonora.impl.InstrumentImpl#getInstrumentName <em>Instrument Name</em>}</li>
 *   <li>{@link org.xtext.simplesonora.simpleSonora.impl.InstrumentImpl#getSequences <em>Sequences</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstrumentImpl extends MinimalEObjectImpl.Container implements Instrument
{
  /**
   * The default value of the '{@link #getInstrumentName() <em>Instrument Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstrumentName()
   * @generated
   * @ordered
   */
  protected static final String INSTRUMENT_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInstrumentName() <em>Instrument Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstrumentName()
   * @generated
   * @ordered
   */
  protected String instrumentName = INSTRUMENT_NAME_EDEFAULT;

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
  protected InstrumentImpl()
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
    return SimpleSonoraPackage.Literals.INSTRUMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInstrumentName()
  {
    return instrumentName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInstrumentName(String newInstrumentName)
  {
    String oldInstrumentName = instrumentName;
    instrumentName = newInstrumentName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleSonoraPackage.INSTRUMENT__INSTRUMENT_NAME, oldInstrumentName, instrumentName));
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
      sequences = new EObjectContainmentEList<Sequence>(Sequence.class, this, SimpleSonoraPackage.INSTRUMENT__SEQUENCES);
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
      case SimpleSonoraPackage.INSTRUMENT__SEQUENCES:
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
      case SimpleSonoraPackage.INSTRUMENT__INSTRUMENT_NAME:
        return getInstrumentName();
      case SimpleSonoraPackage.INSTRUMENT__SEQUENCES:
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
      case SimpleSonoraPackage.INSTRUMENT__INSTRUMENT_NAME:
        setInstrumentName((String)newValue);
        return;
      case SimpleSonoraPackage.INSTRUMENT__SEQUENCES:
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
      case SimpleSonoraPackage.INSTRUMENT__INSTRUMENT_NAME:
        setInstrumentName(INSTRUMENT_NAME_EDEFAULT);
        return;
      case SimpleSonoraPackage.INSTRUMENT__SEQUENCES:
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
      case SimpleSonoraPackage.INSTRUMENT__INSTRUMENT_NAME:
        return INSTRUMENT_NAME_EDEFAULT == null ? instrumentName != null : !INSTRUMENT_NAME_EDEFAULT.equals(instrumentName);
      case SimpleSonoraPackage.INSTRUMENT__SEQUENCES:
        return sequences != null && !sequences.isEmpty();
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
    result.append(" (instrumentName: ");
    result.append(instrumentName);
    result.append(')');
    return result.toString();
  }

} //InstrumentImpl
