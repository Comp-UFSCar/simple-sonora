/**
 */
package org.xtext.simplesonora.simpleSonora.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.simplesonora.simpleSonora.Header;
import org.xtext.simplesonora.simpleSonora.Key;
import org.xtext.simplesonora.simpleSonora.SimpleSonoraPackage;
import org.xtext.simplesonora.simpleSonora.Tempo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.simplesonora.simpleSonora.impl.HeaderImpl#isNofeedback <em>Nofeedback</em>}</li>
 *   <li>{@link org.xtext.simplesonora.simpleSonora.impl.HeaderImpl#getSongName <em>Song Name</em>}</li>
 *   <li>{@link org.xtext.simplesonora.simpleSonora.impl.HeaderImpl#getTempo <em>Tempo</em>}</li>
 *   <li>{@link org.xtext.simplesonora.simpleSonora.impl.HeaderImpl#getKey <em>Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HeaderImpl extends MinimalEObjectImpl.Container implements Header
{
  /**
   * The default value of the '{@link #isNofeedback() <em>Nofeedback</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNofeedback()
   * @generated
   * @ordered
   */
  protected static final boolean NOFEEDBACK_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNofeedback() <em>Nofeedback</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNofeedback()
   * @generated
   * @ordered
   */
  protected boolean nofeedback = NOFEEDBACK_EDEFAULT;

  /**
   * The default value of the '{@link #getSongName() <em>Song Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSongName()
   * @generated
   * @ordered
   */
  protected static final String SONG_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSongName() <em>Song Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSongName()
   * @generated
   * @ordered
   */
  protected String songName = SONG_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getTempo() <em>Tempo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTempo()
   * @generated
   * @ordered
   */
  protected Tempo tempo;

  /**
   * The cached value of the '{@link #getKey() <em>Key</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKey()
   * @generated
   * @ordered
   */
  protected Key key;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HeaderImpl()
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
    return SimpleSonoraPackage.Literals.HEADER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNofeedback()
  {
    return nofeedback;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNofeedback(boolean newNofeedback)
  {
    boolean oldNofeedback = nofeedback;
    nofeedback = newNofeedback;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleSonoraPackage.HEADER__NOFEEDBACK, oldNofeedback, nofeedback));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSongName()
  {
    return songName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSongName(String newSongName)
  {
    String oldSongName = songName;
    songName = newSongName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleSonoraPackage.HEADER__SONG_NAME, oldSongName, songName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Tempo getTempo()
  {
    return tempo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTempo(Tempo newTempo, NotificationChain msgs)
  {
    Tempo oldTempo = tempo;
    tempo = newTempo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleSonoraPackage.HEADER__TEMPO, oldTempo, newTempo);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTempo(Tempo newTempo)
  {
    if (newTempo != tempo)
    {
      NotificationChain msgs = null;
      if (tempo != null)
        msgs = ((InternalEObject)tempo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleSonoraPackage.HEADER__TEMPO, null, msgs);
      if (newTempo != null)
        msgs = ((InternalEObject)newTempo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleSonoraPackage.HEADER__TEMPO, null, msgs);
      msgs = basicSetTempo(newTempo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleSonoraPackage.HEADER__TEMPO, newTempo, newTempo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Key getKey()
  {
    return key;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetKey(Key newKey, NotificationChain msgs)
  {
    Key oldKey = key;
    key = newKey;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleSonoraPackage.HEADER__KEY, oldKey, newKey);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKey(Key newKey)
  {
    if (newKey != key)
    {
      NotificationChain msgs = null;
      if (key != null)
        msgs = ((InternalEObject)key).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleSonoraPackage.HEADER__KEY, null, msgs);
      if (newKey != null)
        msgs = ((InternalEObject)newKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleSonoraPackage.HEADER__KEY, null, msgs);
      msgs = basicSetKey(newKey, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleSonoraPackage.HEADER__KEY, newKey, newKey));
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
      case SimpleSonoraPackage.HEADER__TEMPO:
        return basicSetTempo(null, msgs);
      case SimpleSonoraPackage.HEADER__KEY:
        return basicSetKey(null, msgs);
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
      case SimpleSonoraPackage.HEADER__NOFEEDBACK:
        return isNofeedback();
      case SimpleSonoraPackage.HEADER__SONG_NAME:
        return getSongName();
      case SimpleSonoraPackage.HEADER__TEMPO:
        return getTempo();
      case SimpleSonoraPackage.HEADER__KEY:
        return getKey();
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
      case SimpleSonoraPackage.HEADER__NOFEEDBACK:
        setNofeedback((Boolean)newValue);
        return;
      case SimpleSonoraPackage.HEADER__SONG_NAME:
        setSongName((String)newValue);
        return;
      case SimpleSonoraPackage.HEADER__TEMPO:
        setTempo((Tempo)newValue);
        return;
      case SimpleSonoraPackage.HEADER__KEY:
        setKey((Key)newValue);
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
      case SimpleSonoraPackage.HEADER__NOFEEDBACK:
        setNofeedback(NOFEEDBACK_EDEFAULT);
        return;
      case SimpleSonoraPackage.HEADER__SONG_NAME:
        setSongName(SONG_NAME_EDEFAULT);
        return;
      case SimpleSonoraPackage.HEADER__TEMPO:
        setTempo((Tempo)null);
        return;
      case SimpleSonoraPackage.HEADER__KEY:
        setKey((Key)null);
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
      case SimpleSonoraPackage.HEADER__NOFEEDBACK:
        return nofeedback != NOFEEDBACK_EDEFAULT;
      case SimpleSonoraPackage.HEADER__SONG_NAME:
        return SONG_NAME_EDEFAULT == null ? songName != null : !SONG_NAME_EDEFAULT.equals(songName);
      case SimpleSonoraPackage.HEADER__TEMPO:
        return tempo != null;
      case SimpleSonoraPackage.HEADER__KEY:
        return key != null;
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
    result.append(" (nofeedback: ");
    result.append(nofeedback);
    result.append(", songName: ");
    result.append(songName);
    result.append(')');
    return result.toString();
  }

} //HeaderImpl
