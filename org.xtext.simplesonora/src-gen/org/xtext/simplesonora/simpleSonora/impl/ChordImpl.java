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

import org.xtext.simplesonora.simpleSonora.Chord;
import org.xtext.simplesonora.simpleSonora.Note;
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
 *   <li>{@link org.xtext.simplesonora.simpleSonora.impl.ChordImpl#getChordName <em>Chord Name</em>}</li>
 *   <li>{@link org.xtext.simplesonora.simpleSonora.impl.ChordImpl#getInversion <em>Inversion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChordImpl extends MinimalEObjectImpl.Container implements Chord
{
  /**
   * The cached value of the '{@link #getChordNotes() <em>Chord Notes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChordNotes()
   * @generated
   * @ordered
   */
  protected EList<Note> chordNotes;

  /**
   * The default value of the '{@link #getChordName() <em>Chord Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChordName()
   * @generated
   * @ordered
   */
  protected static final String CHORD_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getChordName() <em>Chord Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChordName()
   * @generated
   * @ordered
   */
  protected String chordName = CHORD_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getInversion() <em>Inversion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInversion()
   * @generated
   * @ordered
   */
  protected static final String INVERSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInversion() <em>Inversion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInversion()
   * @generated
   * @ordered
   */
  protected String inversion = INVERSION_EDEFAULT;

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
  public EList<Note> getChordNotes()
  {
    if (chordNotes == null)
    {
      chordNotes = new EObjectContainmentEList<Note>(Note.class, this, SimpleSonoraPackage.CHORD__CHORD_NOTES);
    }
    return chordNotes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getChordName()
  {
    return chordName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setChordName(String newChordName)
  {
    String oldChordName = chordName;
    chordName = newChordName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleSonoraPackage.CHORD__CHORD_NAME, oldChordName, chordName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInversion()
  {
    return inversion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInversion(String newInversion)
  {
    String oldInversion = inversion;
    inversion = newInversion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleSonoraPackage.CHORD__INVERSION, oldInversion, inversion));
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
      case SimpleSonoraPackage.CHORD__CHORD_NOTES:
        return ((InternalEList<?>)getChordNotes()).basicRemove(otherEnd, msgs);
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
      case SimpleSonoraPackage.CHORD__CHORD_NOTES:
        return getChordNotes();
      case SimpleSonoraPackage.CHORD__CHORD_NAME:
        return getChordName();
      case SimpleSonoraPackage.CHORD__INVERSION:
        return getInversion();
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
        getChordNotes().addAll((Collection<? extends Note>)newValue);
        return;
      case SimpleSonoraPackage.CHORD__CHORD_NAME:
        setChordName((String)newValue);
        return;
      case SimpleSonoraPackage.CHORD__INVERSION:
        setInversion((String)newValue);
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
      case SimpleSonoraPackage.CHORD__CHORD_NAME:
        setChordName(CHORD_NAME_EDEFAULT);
        return;
      case SimpleSonoraPackage.CHORD__INVERSION:
        setInversion(INVERSION_EDEFAULT);
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
      case SimpleSonoraPackage.CHORD__CHORD_NAME:
        return CHORD_NAME_EDEFAULT == null ? chordName != null : !CHORD_NAME_EDEFAULT.equals(chordName);
      case SimpleSonoraPackage.CHORD__INVERSION:
        return INVERSION_EDEFAULT == null ? inversion != null : !INVERSION_EDEFAULT.equals(inversion);
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
    result.append(" (chordName: ");
    result.append(chordName);
    result.append(", inversion: ");
    result.append(inversion);
    result.append(')');
    return result.toString();
  }

} //ChordImpl
