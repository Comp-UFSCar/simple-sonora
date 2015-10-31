/**
 */
package org.xtext.simplesonora.simpleSonora.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.simplesonora.simpleSonora.Document;
import org.xtext.simplesonora.simpleSonora.Header;
import org.xtext.simplesonora.simpleSonora.SimpleSonoraPackage;
import org.xtext.simplesonora.simpleSonora.Song;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.simplesonora.simpleSonora.impl.DocumentImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link org.xtext.simplesonora.simpleSonora.impl.DocumentImpl#getSong <em>Song</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentImpl extends MinimalEObjectImpl.Container implements Document
{
  /**
   * The cached value of the '{@link #getHeader() <em>Header</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeader()
   * @generated
   * @ordered
   */
  protected Header header;

  /**
   * The cached value of the '{@link #getSong() <em>Song</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSong()
   * @generated
   * @ordered
   */
  protected Song song;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DocumentImpl()
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
    return SimpleSonoraPackage.Literals.DOCUMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Header getHeader()
  {
    return header;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHeader(Header newHeader, NotificationChain msgs)
  {
    Header oldHeader = header;
    header = newHeader;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleSonoraPackage.DOCUMENT__HEADER, oldHeader, newHeader);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHeader(Header newHeader)
  {
    if (newHeader != header)
    {
      NotificationChain msgs = null;
      if (header != null)
        msgs = ((InternalEObject)header).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleSonoraPackage.DOCUMENT__HEADER, null, msgs);
      if (newHeader != null)
        msgs = ((InternalEObject)newHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleSonoraPackage.DOCUMENT__HEADER, null, msgs);
      msgs = basicSetHeader(newHeader, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleSonoraPackage.DOCUMENT__HEADER, newHeader, newHeader));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Song getSong()
  {
    return song;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSong(Song newSong, NotificationChain msgs)
  {
    Song oldSong = song;
    song = newSong;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleSonoraPackage.DOCUMENT__SONG, oldSong, newSong);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSong(Song newSong)
  {
    if (newSong != song)
    {
      NotificationChain msgs = null;
      if (song != null)
        msgs = ((InternalEObject)song).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleSonoraPackage.DOCUMENT__SONG, null, msgs);
      if (newSong != null)
        msgs = ((InternalEObject)newSong).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleSonoraPackage.DOCUMENT__SONG, null, msgs);
      msgs = basicSetSong(newSong, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleSonoraPackage.DOCUMENT__SONG, newSong, newSong));
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
      case SimpleSonoraPackage.DOCUMENT__HEADER:
        return basicSetHeader(null, msgs);
      case SimpleSonoraPackage.DOCUMENT__SONG:
        return basicSetSong(null, msgs);
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
      case SimpleSonoraPackage.DOCUMENT__HEADER:
        return getHeader();
      case SimpleSonoraPackage.DOCUMENT__SONG:
        return getSong();
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
      case SimpleSonoraPackage.DOCUMENT__HEADER:
        setHeader((Header)newValue);
        return;
      case SimpleSonoraPackage.DOCUMENT__SONG:
        setSong((Song)newValue);
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
      case SimpleSonoraPackage.DOCUMENT__HEADER:
        setHeader((Header)null);
        return;
      case SimpleSonoraPackage.DOCUMENT__SONG:
        setSong((Song)null);
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
      case SimpleSonoraPackage.DOCUMENT__HEADER:
        return header != null;
      case SimpleSonoraPackage.DOCUMENT__SONG:
        return song != null;
    }
    return super.eIsSet(featureID);
  }

} //DocumentImpl
