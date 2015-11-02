/**
 */
package org.xtext.simplesonora.simpleSonora.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.simplesonora.simpleSonora.Note;
import org.xtext.simplesonora.simpleSonora.SimpleSonoraPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Note</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.simplesonora.simpleSonora.impl.NoteImpl#getOctave <em>Octave</em>}</li>
 *   <li>{@link org.xtext.simplesonora.simpleSonora.impl.NoteImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.xtext.simplesonora.simpleSonora.impl.NoteImpl#getAccidental <em>Accidental</em>}</li>
 *   <li>{@link org.xtext.simplesonora.simpleSonora.impl.NoteImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.xtext.simplesonora.simpleSonora.impl.NoteImpl#isPoint <em>Point</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NoteImpl extends MinimalEObjectImpl.Container implements Note
{
  /**
   * The default value of the '{@link #getOctave() <em>Octave</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOctave()
   * @generated
   * @ordered
   */
  protected static final String OCTAVE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOctave() <em>Octave</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOctave()
   * @generated
   * @ordered
   */
  protected String octave = OCTAVE_EDEFAULT;

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
   * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDuration()
   * @generated
   * @ordered
   */
  protected static final String DURATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDuration()
   * @generated
   * @ordered
   */
  protected String duration = DURATION_EDEFAULT;

  /**
   * The default value of the '{@link #isPoint() <em>Point</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPoint()
   * @generated
   * @ordered
   */
  protected static final boolean POINT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPoint() <em>Point</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPoint()
   * @generated
   * @ordered
   */
  protected boolean point = POINT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NoteImpl()
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
    return SimpleSonoraPackage.Literals.NOTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOctave()
  {
    return octave;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOctave(String newOctave)
  {
    String oldOctave = octave;
    octave = newOctave;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleSonoraPackage.NOTE__OCTAVE, oldOctave, octave));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleSonoraPackage.NOTE__NOTE, oldNote, note));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleSonoraPackage.NOTE__ACCIDENTAL, oldAccidental, accidental));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDuration()
  {
    return duration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDuration(String newDuration)
  {
    String oldDuration = duration;
    duration = newDuration;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleSonoraPackage.NOTE__DURATION, oldDuration, duration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPoint()
  {
    return point;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPoint(boolean newPoint)
  {
    boolean oldPoint = point;
    point = newPoint;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleSonoraPackage.NOTE__POINT, oldPoint, point));
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
      case SimpleSonoraPackage.NOTE__OCTAVE:
        return getOctave();
      case SimpleSonoraPackage.NOTE__NOTE:
        return getNote();
      case SimpleSonoraPackage.NOTE__ACCIDENTAL:
        return getAccidental();
      case SimpleSonoraPackage.NOTE__DURATION:
        return getDuration();
      case SimpleSonoraPackage.NOTE__POINT:
        return isPoint();
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
      case SimpleSonoraPackage.NOTE__OCTAVE:
        setOctave((String)newValue);
        return;
      case SimpleSonoraPackage.NOTE__NOTE:
        setNote((String)newValue);
        return;
      case SimpleSonoraPackage.NOTE__ACCIDENTAL:
        setAccidental((String)newValue);
        return;
      case SimpleSonoraPackage.NOTE__DURATION:
        setDuration((String)newValue);
        return;
      case SimpleSonoraPackage.NOTE__POINT:
        setPoint((Boolean)newValue);
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
      case SimpleSonoraPackage.NOTE__OCTAVE:
        setOctave(OCTAVE_EDEFAULT);
        return;
      case SimpleSonoraPackage.NOTE__NOTE:
        setNote(NOTE_EDEFAULT);
        return;
      case SimpleSonoraPackage.NOTE__ACCIDENTAL:
        setAccidental(ACCIDENTAL_EDEFAULT);
        return;
      case SimpleSonoraPackage.NOTE__DURATION:
        setDuration(DURATION_EDEFAULT);
        return;
      case SimpleSonoraPackage.NOTE__POINT:
        setPoint(POINT_EDEFAULT);
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
      case SimpleSonoraPackage.NOTE__OCTAVE:
        return OCTAVE_EDEFAULT == null ? octave != null : !OCTAVE_EDEFAULT.equals(octave);
      case SimpleSonoraPackage.NOTE__NOTE:
        return NOTE_EDEFAULT == null ? note != null : !NOTE_EDEFAULT.equals(note);
      case SimpleSonoraPackage.NOTE__ACCIDENTAL:
        return ACCIDENTAL_EDEFAULT == null ? accidental != null : !ACCIDENTAL_EDEFAULT.equals(accidental);
      case SimpleSonoraPackage.NOTE__DURATION:
        return DURATION_EDEFAULT == null ? duration != null : !DURATION_EDEFAULT.equals(duration);
      case SimpleSonoraPackage.NOTE__POINT:
        return point != POINT_EDEFAULT;
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
    result.append(" (octave: ");
    result.append(octave);
    result.append(", note: ");
    result.append(note);
    result.append(", accidental: ");
    result.append(accidental);
    result.append(", duration: ");
    result.append(duration);
    result.append(", point: ");
    result.append(point);
    result.append(')');
    return result.toString();
  }

} //NoteImpl
