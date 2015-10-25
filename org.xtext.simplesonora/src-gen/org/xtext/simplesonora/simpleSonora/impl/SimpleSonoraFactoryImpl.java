/**
 */
package org.xtext.simplesonora.simpleSonora.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.simplesonora.simpleSonora.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleSonoraFactoryImpl extends EFactoryImpl implements SimpleSonoraFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SimpleSonoraFactory init()
  {
    try
    {
      SimpleSonoraFactory theSimpleSonoraFactory = (SimpleSonoraFactory)EPackage.Registry.INSTANCE.getEFactory(SimpleSonoraPackage.eNS_URI);
      if (theSimpleSonoraFactory != null)
      {
        return theSimpleSonoraFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SimpleSonoraFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleSonoraFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SimpleSonoraPackage.FILE: return createFile();
      case SimpleSonoraPackage.HEADER: return createHeader();
      case SimpleSonoraPackage.MELODY: return createMelody();
      case SimpleSonoraPackage.SEQUENCE: return createSequence();
      case SimpleSonoraPackage.CHORD: return createChord();
      case SimpleSonoraPackage.NOTE: return createNote();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public File createFile()
  {
    FileImpl file = new FileImpl();
    return file;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Header createHeader()
  {
    HeaderImpl header = new HeaderImpl();
    return header;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Melody createMelody()
  {
    MelodyImpl melody = new MelodyImpl();
    return melody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sequence createSequence()
  {
    SequenceImpl sequence = new SequenceImpl();
    return sequence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Chord createChord()
  {
    ChordImpl chord = new ChordImpl();
    return chord;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Note createNote()
  {
    NoteImpl note = new NoteImpl();
    return note;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleSonoraPackage getSimpleSonoraPackage()
  {
    return (SimpleSonoraPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SimpleSonoraPackage getPackage()
  {
    return SimpleSonoraPackage.eINSTANCE;
  }

} //SimpleSonoraFactoryImpl
