/**
 */
package org.xtext.simplesonora.simpleSonora.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.simplesonora.simpleSonora.Key;
import org.xtext.simplesonora.simpleSonora.SimpleSonoraPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.simplesonora.simpleSonora.impl.KeyImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.xtext.simplesonora.simpleSonora.impl.KeyImpl#getAccidental <em>Accidental</em>}</li>
 *   <li>{@link org.xtext.simplesonora.simpleSonora.impl.KeyImpl#getInterval <em>Interval</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KeyImpl extends MinimalEObjectImpl.Container implements Key
{
  /**
   * The default value of the '{@link #getNote() <em>Note</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNote()
   * @generated
   * @ordered
   */
  protected static final String NOTE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNote() <em>Note</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNote()
   * @generated
   * @ordered
   */
  protected String note = NOTE_EDEFAULT;

  /**
   * The default value of the '{@link #getAccidental() <em>Accidental</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAccidental()
   * @generated
   * @ordered
   */
  protected static final String ACCIDENTAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAccidental() <em>Accidental</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAccidental()
   * @generated
   * @ordered
   */
  protected String accidental = ACCIDENTAL_EDEFAULT;

  /**
   * The default value of the '{@link #getInterval() <em>Interval</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterval()
   * @generated
   * @ordered
   */
  protected static final String INTERVAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInterval() <em>Interval</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterval()
   * @generated
   * @ordered
   */
  protected String interval = INTERVAL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected KeyImpl()
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
    return SimpleSonoraPackage.Literals.KEY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNote()
  {
    return note;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNote(String newNote)
  {
    String oldNote = note;
    note = newNote;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleSonoraPackage.KEY__NOTE, oldNote, note));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAccidental()
  {
    return accidental;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAccidental(String newAccidental)
  {
    String oldAccidental = accidental;
    accidental = newAccidental;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleSonoraPackage.KEY__ACCIDENTAL, oldAccidental, accidental));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInterval()
  {
    return interval;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInterval(String newInterval)
  {
    String oldInterval = interval;
    interval = newInterval;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleSonoraPackage.KEY__INTERVAL, oldInterval, interval));
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
      case SimpleSonoraPackage.KEY__NOTE:
        return getNote();
      case SimpleSonoraPackage.KEY__ACCIDENTAL:
        return getAccidental();
      case SimpleSonoraPackage.KEY__INTERVAL:
        return getInterval();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SimpleSonoraPackage.KEY__NOTE:
        setNote((String)newValue);
        return;
      case SimpleSonoraPackage.KEY__ACCIDENTAL:
        setAccidental((String)newValue);
        return;
      case SimpleSonoraPackage.KEY__INTERVAL:
        setInterval((String)newValue);
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
      case SimpleSonoraPackage.KEY__NOTE:
        setNote(NOTE_EDEFAULT);
        return;
      case SimpleSonoraPackage.KEY__ACCIDENTAL:
        setAccidental(ACCIDENTAL_EDEFAULT);
        return;
      case SimpleSonoraPackage.KEY__INTERVAL:
        setInterval(INTERVAL_EDEFAULT);
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
      case SimpleSonoraPackage.KEY__NOTE:
        return NOTE_EDEFAULT == null ? note != null : !NOTE_EDEFAULT.equals(note);
      case SimpleSonoraPackage.KEY__ACCIDENTAL:
        return ACCIDENTAL_EDEFAULT == null ? accidental != null : !ACCIDENTAL_EDEFAULT.equals(accidental);
      case SimpleSonoraPackage.KEY__INTERVAL:
        return INTERVAL_EDEFAULT == null ? interval != null : !INTERVAL_EDEFAULT.equals(interval);
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
    result.append(" (note: ");
    result.append(note);
    result.append(", accidental: ");
    result.append(accidental);
    result.append(", interval: ");
    result.append(interval);
    result.append(')');
    return result.toString();
  }

} //KeyImpl
