/**
 */
package com.metasdlproj.model.metaSDLProj.impl;

import com.metasdlproj.model.metaSDLProj.Channel;
import com.metasdlproj.model.metaSDLProj.MetaSDLProjPackage;
import com.metasdlproj.model.metaSDLProj.Signal;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.metasdlproj.model.metaSDLProj.impl.SystemImpl#getProcesses <em>Processes</em>}</li>
 *   <li>{@link com.metasdlproj.model.metaSDLProj.impl.SystemImpl#getChannels <em>Channels</em>}</li>
 *   <li>{@link com.metasdlproj.model.metaSDLProj.impl.SystemImpl#getSignals <em>Signals</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemImpl extends NamedElementImpl implements com.metasdlproj.model.metaSDLProj.System {
	/**
	 * The cached value of the '{@link #getProcesses() <em>Processes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcesses()
	 * @generated
	 * @ordered
	 */
	protected EList<com.metasdlproj.model.metaSDLProj.Process> processes;

	/**
	 * The cached value of the '{@link #getChannels() <em>Channels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannels()
	 * @generated
	 * @ordered
	 */
	protected EList<Channel> channels;

	/**
	 * The cached value of the '{@link #getSignals() <em>Signals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignals()
	 * @generated
	 * @ordered
	 */
	protected EList<Signal> signals;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaSDLProjPackage.Literals.SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Signal> getSignals() {
		if (signals == null) {
			signals = new EObjectContainmentEList<Signal>(Signal.class, this, MetaSDLProjPackage.SYSTEM__SIGNALS);
		}
		return signals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<com.metasdlproj.model.metaSDLProj.Process> getProcesses() {
		if (processes == null) {
			processes = new EObjectContainmentEList<com.metasdlproj.model.metaSDLProj.Process>(
					com.metasdlproj.model.metaSDLProj.Process.class, this, MetaSDLProjPackage.SYSTEM__PROCESSES);
		}
		return processes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Channel> getChannels() {
		if (channels == null) {
			channels = new EObjectContainmentEList<Channel>(Channel.class, this, MetaSDLProjPackage.SYSTEM__CHANNELS);
		}
		return channels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetaSDLProjPackage.SYSTEM__PROCESSES:
			return ((InternalEList<?>) getProcesses()).basicRemove(otherEnd, msgs);
		case MetaSDLProjPackage.SYSTEM__CHANNELS:
			return ((InternalEList<?>) getChannels()).basicRemove(otherEnd, msgs);
		case MetaSDLProjPackage.SYSTEM__SIGNALS:
			return ((InternalEList<?>) getSignals()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetaSDLProjPackage.SYSTEM__PROCESSES:
			return getProcesses();
		case MetaSDLProjPackage.SYSTEM__CHANNELS:
			return getChannels();
		case MetaSDLProjPackage.SYSTEM__SIGNALS:
			return getSignals();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MetaSDLProjPackage.SYSTEM__PROCESSES:
			getProcesses().clear();
			getProcesses().addAll((Collection<? extends com.metasdlproj.model.metaSDLProj.Process>) newValue);
			return;
		case MetaSDLProjPackage.SYSTEM__CHANNELS:
			getChannels().clear();
			getChannels().addAll((Collection<? extends Channel>) newValue);
			return;
		case MetaSDLProjPackage.SYSTEM__SIGNALS:
			getSignals().clear();
			getSignals().addAll((Collection<? extends Signal>) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
		case MetaSDLProjPackage.SYSTEM__PROCESSES:
			getProcesses().clear();
			return;
		case MetaSDLProjPackage.SYSTEM__CHANNELS:
			getChannels().clear();
			return;
		case MetaSDLProjPackage.SYSTEM__SIGNALS:
			getSignals().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MetaSDLProjPackage.SYSTEM__PROCESSES:
			return processes != null && !processes.isEmpty();
		case MetaSDLProjPackage.SYSTEM__CHANNELS:
			return channels != null && !channels.isEmpty();
		case MetaSDLProjPackage.SYSTEM__SIGNALS:
			return signals != null && !signals.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SystemImpl
