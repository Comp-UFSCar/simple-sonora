/**
 */
package org.xtext.simplesonora.simpleSonora.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.simplesonora.simpleSonora.Chord;
import org.xtext.simplesonora.simpleSonora.Harmony;
import org.xtext.simplesonora.simpleSonora.Note;
import org.xtext.simplesonora.simpleSonora.Sequence;
import org.xtext.simplesonora.simpleSonora.SimpleSonoraPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.simplesonora.simpleSonora.impl.SequenceImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.xtext.simplesonora.simpleSonora.impl.SequenceImpl#getChord <em>Chord</em>}</li>
 *   <li>{@link org.xtext.simplesonora.simpleSonora.impl.SequenceImpl#getHarmony <em>Harmony</em>}</li>
 *   <li>{@link org.xtext.simplesonora.simpleSonora.impl.SequenceImpl#isMeasure <em>Measure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SequenceImpl extends MinimalEObjectImpl.Container implements Sequence
{
  /**
   * The cached value of the '{@link #getNote() <em>Note</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNote()
   * @generated
   * @ordered
   */
  protected Note note;

  /**
   * The cached value of the '{@link #getChord() <em>Chord</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChord()
   * @generated
   * @ordered
   */
  protected Chord chord;

  /**
   * The cached value of the '{@link #getHarmony() <em>Harmony</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHarmony()
   * @generated
   * @ordered
   */
  protected Harmony harmony;

  /**
   * The default value of the '{@link #isMeasure() <em>Measure</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMeasure()
   * @generated
   * @ordered
   */
  protected static final boolean MEASURE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMeasure() <em>Measure</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMeasure()
   * @generated
   * @ordered
   */
  protected boolean measure = MEASURE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SequenceImpl()
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
    return SimpleSonoraPackage.Literals.SEQUENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Note getNote()
  {
    return note;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNote(Note newNote, NotificationChain msgs)
  {
    Note oldNote = note;
    note = newNote;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleSonoraPackage.SEQUENCE__NOTE, oldNote, newNote);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNote(Note newNote)
  {
    if (newNote != note)
    {
      NotificationChain msgs = null;
      if (note != null)
        msgs = ((InternalEObject)note).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleSonoraPackage.SEQUENCE__NOTE, null, msgs);
      if (newNote != null)
        msgs = ((InternalEObject)newNote).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleSonoraPackage.SEQUENCE__NOTE, null, msgs);
      msgs = basicSetNote(newNote, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleSonoraPackage.SEQUENCE__NOTE, newNote, newNote));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Chord getChord()
  {
    return chord;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetChord(Chord newChord, NotificationChain msgs)
  {
    Chord oldChord = chord;
    chord = newChord;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleSonoraPackage.SEQUENCE__CHORD, oldChord, newChord);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setChord(Chord newChord)
  {
    if (newChord != chord)
    {
      NotificationChain msgs = null;
      if (chord != null)
        msgs = ((InternalEObject)chord).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleSonoraPackage.SEQUENCE__CHORD, null, msgs);
      if (newChord != null)
        msgs = ((InternalEObject)newChord).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleSonoraPackage.SEQUENCE__CHORD, null, msgs);
      msgs = basicSetChord(newChord, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleSonoraPackage.SEQUENCE__CHORD, newChord, newChord));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Harmony getHarmony()
  {
    return harmony;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHarmony(Harmony newHarmony, NotificationChain msgs)
  {
    Harmony oldHarmony = harmony;
    harmony = newHarmony;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleSonoraPackage.SEQUENCE__HARMONY, oldHarmony, newHarmony);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHarmony(Harmony newHarmony)
  {
    if (newHarmony != harmony)
    {
      NotificationChain msgs = null;
      if (harmony != null)
        msgs = ((InternalEObject)harmony).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleSonoraPackage.SEQUENCE__HARMONY, null, msgs);
      if (newHarmony != null)
        msgs = ((InternalEObject)newHarmony).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleSonoraPackage.SEQUENCE__HARMONY, null, msgs);
      msgs = basicSetHarmony(newHarmony, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleSonoraPackage.SEQUENCE__HARMONY, newHarmony, newHarmony));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isMeasure()
  {
    return measure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMeasure(boolean newMeasure)
  {
    boolean oldMeasure = measure;
    measure = newMeasure;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleSonoraPackage.SEQUENCE__MEASURE, oldMeasure, measure));
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
      case SimpleSonoraPackage.SEQUENCE__NOTE:
        return basicSetNote(null, msgs);
      case SimpleSonoraPackage.SEQUENCE__CHORD:
        return basicSetChord(null, msgs);
      case SimpleSonoraPackage.SEQUENCE__HARMONY:
        return basicSetHarmony(null, msgs);
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
      case SimpleSonoraPackage.SEQUENCE__NOTE:
        return getNote();
      case SimpleSonoraPackage.SEQUENCE__CHORD:
        return getChord();
      case SimpleSonoraPackage.SEQUENCE__HARMONY:
        return getHarmony();
      case SimpleSonoraPackage.SEQUENCE__MEASURE:
        return isMeasure();
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
      case SimpleSonoraPackage.SEQUENCE__NOTE:
        setNote((Note)newValue);
        return;
      case SimpleSonoraPackage.SEQUENCE__CHORD:
        setChord((Chord)newValue);
        return;
      case SimpleSonoraPackage.SEQUENCE__HARMONY:
        setHarmony((Harmony)newValue);
        return;
      case SimpleSonoraPackage.SEQUENCE__MEASURE:
        setMeasure((Boolean)newValue);
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
      case SimpleSonoraPackage.SEQUENCE__NOTE:
        setNote((Note)null);
        return;
      case SimpleSonoraPackage.SEQUENCE__CHORD:
        setChord((Chord)null);
        return;
      case SimpleSonoraPackage.SEQUENCE__HARMONY:
        setHarmony((Harmony)null);
        return;
      case SimpleSonoraPackage.SEQUENCE__MEASURE:
        setMeasure(MEASURE_EDEFAULT);
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
      case SimpleSonoraPackage.SEQUENCE__NOTE:
        return note != null;
      case SimpleSonoraPackage.SEQUENCE__CHORD:
        return chord != null;
      case SimpleSonoraPackage.SEQUENCE__HARMONY:
        return harmony != null;
      case SimpleSonoraPackage.SEQUENCE__MEASURE:
        return measure != MEASURE_EDEFAULT;
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
    result.append(" (measure: ");
    result.append(measure);
    result.append(')');
    return result.toString();
  }

} //SequenceImpl
