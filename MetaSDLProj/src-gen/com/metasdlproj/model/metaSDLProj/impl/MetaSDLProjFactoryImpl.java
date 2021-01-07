/**
 */
package com.metasdlproj.model.metaSDLProj.impl;

import com.metasdlproj.model.metaSDLProj.Channel;
import com.metasdlproj.model.metaSDLProj.MetaSDLProjFactory;
import com.metasdlproj.model.metaSDLProj.MetaSDLProjPackage;
import com.metasdlproj.model.metaSDLProj.Signal;
import com.metasdlproj.model.metaSDLProj.State;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetaSDLProjFactoryImpl extends EFactoryImpl implements MetaSDLProjFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MetaSDLProjFactory init() {
		try {
			MetaSDLProjFactory theMetaSDLProjFactory = (MetaSDLProjFactory) EPackage.Registry.INSTANCE
					.getEFactory(MetaSDLProjPackage.eNS_URI);
			if (theMetaSDLProjFactory != null) {
				return theMetaSDLProjFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MetaSDLProjFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaSDLProjFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case MetaSDLProjPackage.SYSTEM:
			return createSystem();
		case MetaSDLProjPackage.SIGNAL:
			return createSignal();
		case MetaSDLProjPackage.CHANNEL:
			return createChannel();
		case MetaSDLProjPackage.PROCESS:
			return createProcess();
		case MetaSDLProjPackage.STATE:
			return createState();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public com.metasdlproj.model.metaSDLProj.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal createSignal() {
		SignalImpl signal = new SignalImpl();
		return signal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Channel createChannel() {
		ChannelImpl channel = new ChannelImpl();
		return channel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public com.metasdlproj.model.metaSDLProj.Process createProcess() {
		ProcessImpl process = new ProcessImpl();
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaSDLProjPackage getMetaSDLProjPackage() {
		return (MetaSDLProjPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MetaSDLProjPackage getPackage() {
		return MetaSDLProjPackage.eINSTANCE;
	}

} //MetaSDLProjFactoryImpl
