/**
 */
package org.xtext.simplesonora.simpleSonora.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.simplesonora.simpleSonora.Header;
import org.xtext.simplesonora.simpleSonora.SimpleSonoraPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
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
   * The default value of the '{@link #getTempo() <em>Tempo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTempo()
   * @generated
   * @ordered
   */
  protected static final int TEMPO_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getTempo() <em>Tempo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTempo()
   * @generated
   * @ordered
   */
  protected int tempo = TEMPO_EDEFAULT;

  /**
   * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKey()
   * @generated
   * @ordered
   */
  protected static final String KEY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getKey() <em>Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKey()
   * @generated
   * @ordered
   */
  protected String key = KEY_EDEFAULT;

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
  public int getTempo()
  {
    return tempo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTempo(int newTempo)
  {
    int oldTempo = tempo;
    tempo = newTempo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleSonoraPackage.HEADER__TEMPO, oldTempo, tempo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getKey()
  {
    return key;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKey(String newKey)
  {
    String oldKey = key;
    key = newKey;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleSonoraPackage.HEADER__KEY, oldKey, key));
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
      case SimpleSonoraPackage.HEADER__SONG_NAME:
        setSongName((String)newValue);
        return;
      case SimpleSonoraPackage.HEADER__TEMPO:
        setTempo((Integer)newValue);
        return;
      case SimpleSonoraPackage.HEADER__KEY:
        setKey((String)newValue);
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
      case SimpleSonoraPackage.HEADER__SONG_NAME:
        setSongName(SONG_NAME_EDEFAULT);
        return;
      case SimpleSonoraPackage.HEADER__TEMPO:
        setTempo(TEMPO_EDEFAULT);
        return;
      case SimpleSonoraPackage.HEADER__KEY:
        setKey(KEY_EDEFAULT);
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
      case SimpleSonoraPackage.HEADER__SONG_NAME:
        return SONG_NAME_EDEFAULT == null ? songName != null : !SONG_NAME_EDEFAULT.equals(songName);
      case SimpleSonoraPackage.HEADER__TEMPO:
        return tempo != TEMPO_EDEFAULT;
      case SimpleSonoraPackage.HEADER__KEY:
        return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
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
    result.append(" (songName: ");
    result.append(songName);
    result.append(", tempo: ");
    result.append(tempo);
    result.append(", key: ");
    result.append(key);
    result.append(')');
    return result.toString();
  }

} //HeaderImpl
