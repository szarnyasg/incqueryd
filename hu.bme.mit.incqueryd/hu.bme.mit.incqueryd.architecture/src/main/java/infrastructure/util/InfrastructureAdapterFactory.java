/**
 */
package infrastructure.util;

import arch.ElementWithTraceInfo;

import infrastructure.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see infrastructure.InfrastructurePackage
 * @generated
 */
public class InfrastructureAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static InfrastructurePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InfrastructureAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = InfrastructurePackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InfrastructureSwitch<Adapter> modelSwitch =
    new InfrastructureSwitch<Adapter>()
    {
      @Override
      public Adapter caseCluster(Cluster object)
      {
        return createClusterAdapter();
      }
      @Override
      public Adapter caseStorage(Storage object)
      {
        return createStorageAdapter();
      }
      @Override
      public Adapter caseMachine(Machine object)
      {
        return createMachineAdapter();
      }
      @Override
      public Adapter caseGraphStore(GraphStore object)
      {
        return createGraphStoreAdapter();
      }
      @Override
      public Adapter caseInfrastructureNode(InfrastructureNode object)
      {
        return createInfrastructureNodeAdapter();
      }
      @Override
      public Adapter caseServiceNode(ServiceNode object)
      {
        return createServiceNodeAdapter();
      }
      @Override
      public Adapter caseElementWithTraceInfo(ElementWithTraceInfo object)
      {
        return createElementWithTraceInfoAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link infrastructure.Cluster <em>Cluster</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see infrastructure.Cluster
   * @generated
   */
  public Adapter createClusterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link infrastructure.Storage <em>Storage</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see infrastructure.Storage
   * @generated
   */
  public Adapter createStorageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link infrastructure.Machine <em>Machine</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see infrastructure.Machine
   * @generated
   */
  public Adapter createMachineAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link infrastructure.GraphStore <em>Graph Store</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see infrastructure.GraphStore
   * @generated
   */
  public Adapter createGraphStoreAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link infrastructure.InfrastructureNode <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see infrastructure.InfrastructureNode
   * @generated
   */
  public Adapter createInfrastructureNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link infrastructure.ServiceNode <em>Service Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see infrastructure.ServiceNode
   * @generated
   */
  public Adapter createServiceNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link arch.ElementWithTraceInfo <em>Element With Trace Info</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see arch.ElementWithTraceInfo
   * @generated
   */
  public Adapter createElementWithTraceInfoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //InfrastructureAdapterFactory