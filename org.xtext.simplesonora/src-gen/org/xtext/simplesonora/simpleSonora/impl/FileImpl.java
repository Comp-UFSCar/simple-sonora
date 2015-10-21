/**
 */
package org.xtext.simplesonora.simpleSonora.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.simplesonora.simpleSonora.File;
import org.xtext.simplesonora.simpleSonora.Header;
import org.xtext.simplesonora.simpleSonora.Melody;
import org.xtext.simplesonora.simpleSonora.SimpleSonoraPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.simplesonora.simpleSonora.impl.FileImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link org.xtext.simplesonora.simpleSonora.impl.FileImpl#getMelody <em>Melody</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FileImpl extends MinimalEObjectImpl.Container implements File
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
   * The cached value of the '{@link #getMelody() <em>Melody</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMelody()
   * @generated
   * @ordered
   */
  protected Melody melody;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FileImpl()
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
    return SimpleSonoraPackage.Literals.FILE;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleSonoraPackage.FILE__HEADER, oldHeader, newHeader);
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
        msgs = ((InternalEObject)header).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleSonoraPackage.FILE__HEADER, null, msgs);
      if (newHeader != null)
        msgs = ((InternalEObject)newHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleSonoraPackage.FILE__HEADER, null, msgs);
      msgs = basicSetHeader(newHeader, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleSonoraPackage.FILE__HEADER, newHeader, newHeader));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Melody getMelody()
  {
    return melody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMelody(Melody newMelody, NotificationChain msgs)
  {
    Melody oldMelody = melody;
    melody = newMelody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleSonoraPackage.FILE__MELODY, oldMelody, newMelody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMelody(Melody newMelody)
  {
    if (newMelody != melody)
    {
      NotificationChain msgs = null;
      if (melody != null)
        msgs = ((InternalEObject)melody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleSonoraPackage.FILE__MELODY, null, msgs);
      if (newMelody != null)
        msgs = ((InternalEObject)newMelody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleSonoraPackage.FILE__MELODY, null, msgs);
      msgs = basicSetMelody(newMelody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleSonoraPackage.FILE__MELODY, newMelody, newMelody));
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
      case SimpleSonoraPackage.FILE__HEADER:
        return basicSetHeader(null, msgs);
      case SimpleSonoraPackage.FILE__MELODY:
        return basicSetMelody(null, msgs);
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
      case SimpleSonoraPackage.FILE__HEADER:
        return getHeader();
      case SimpleSonoraPackage.FILE__MELODY:
        return getMelody();
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
      case SimpleSonoraPackage.FILE__HEADER:
        setHeader((Header)newValue);
        return;
      case SimpleSonoraPackage.FILE__MELODY:
        setMelody((Melody)newValue);
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
      case SimpleSonoraPackage.FILE__HEADER:
        setHeader((Header)null);
        return;
      case SimpleSonoraPackage.FILE__MELODY:
        setMelody((Melody)null);
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
      case SimpleSonoraPackage.FILE__HEADER:
        return header != null;
      case SimpleSonoraPackage.FILE__MELODY:
        return melody != null;
    }
    return super.eIsSet(featureID);
  }

} //FileImpl
