/**
 */
package com.metasdlproj.model.metaSDLProj.impl;

import com.metasdlproj.model.metaSDLProj.Channel;
import com.metasdlproj.model.metaSDLProj.MetaSDLProjPackage;
import com.metasdlproj.model.metaSDLProj.Signal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Channel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.metasdlproj.model.metaSDLProj.impl.ChannelImpl#getFrom <em>From</em>}</li>
 *   <li>{@link com.metasdlproj.model.metaSDLProj.impl.ChannelImpl#getTo <em>To</em>}</li>
 *   <li>{@link com.metasdlproj.model.metaSDLProj.impl.ChannelImpl#getSignal <em>Signal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChannelImpl extends NamedElementImpl implements Channel {
	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected com.metasdlproj.model.metaSDLProj.Process from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected com.metasdlproj.model.metaSDLProj.Process to;

	/**
	 * The cached value of the '{@link #getSignal() <em>Signal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignal()
	 * @generated
	 * @ordered
	 */
	protected Signal signal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChannelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaSDLProjPackage.Literals.CHANNEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public com.metasdlproj.model.metaSDLProj.Process getFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrom(com.metasdlproj.model.metaSDLProj.Process newFrom, NotificationChain msgs) {
		com.metasdlproj.model.metaSDLProj.Process oldFrom = from;
		from = newFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MetaSDLProjPackage.CHANNEL__FROM, oldFrom, newFrom);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(com.metasdlproj.model.metaSDLProj.Process newFrom) {
		if (newFrom != from) {
			NotificationChain msgs = null;
			if (from != null)
				msgs = ((InternalEObject) from).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MetaSDLProjPackage.CHANNEL__FROM, null, msgs);
			if (newFrom != null)
				msgs = ((InternalEObject) newFrom).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MetaSDLProjPackage.CHANNEL__FROM, null, msgs);
			msgs = basicSetFrom(newFrom, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaSDLProjPackage.CHANNEL__FROM, newFrom, newFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public com.metasdlproj.model.metaSDLProj.Process getTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTo(com.metasdlproj.model.metaSDLProj.Process newTo, NotificationChain msgs) {
		com.metasdlproj.model.metaSDLProj.Process oldTo = to;
		to = newTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MetaSDLProjPackage.CHANNEL__TO, oldTo, newTo);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(com.metasdlproj.model.metaSDLProj.Process newTo) {
		if (newTo != to) {
			NotificationChain msgs = null;
			if (to != null)
				msgs = ((InternalEObject) to).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MetaSDLProjPackage.CHANNEL__TO, null, msgs);
			if (newTo != null)
				msgs = ((InternalEObject) newTo).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MetaSDLProjPackage.CHANNEL__TO, null, msgs);
			msgs = basicSetTo(newTo, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaSDLProjPackage.CHANNEL__TO, newTo, newTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal getSignal() {
		return signal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignal(Signal newSignal, NotificationChain msgs) {
		Signal oldSignal = signal;
		signal = newSignal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MetaSDLProjPackage.CHANNEL__SIGNAL, oldSignal, newSignal);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignal(Signal newSignal) {
		if (newSignal != signal) {
			NotificationChain msgs = null;
			if (signal != null)
				msgs = ((InternalEObject) signal).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MetaSDLProjPackage.CHANNEL__SIGNAL, null, msgs);
			if (newSignal != null)
				msgs = ((InternalEObject) newSignal).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MetaSDLProjPackage.CHANNEL__SIGNAL, null, msgs);
			msgs = basicSetSignal(newSignal, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaSDLProjPackage.CHANNEL__SIGNAL, newSignal,
					newSignal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetaSDLProjPackage.CHANNEL__FROM:
			return basicSetFrom(null, msgs);
		case MetaSDLProjPackage.CHANNEL__TO:
			return basicSetTo(null, msgs);
		case MetaSDLProjPackage.CHANNEL__SIGNAL:
			return basicSetSignal(null, msgs);
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
		case MetaSDLProjPackage.CHANNEL__FROM:
			return getFrom();
		case MetaSDLProjPackage.CHANNEL__TO:
			return getTo();
		case MetaSDLProjPackage.CHANNEL__SIGNAL:
			return getSignal();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MetaSDLProjPackage.CHANNEL__FROM:
			setFrom((com.metasdlproj.model.metaSDLProj.Process) newValue);
			return;
		case MetaSDLProjPackage.CHANNEL__TO:
			setTo((com.metasdlproj.model.metaSDLProj.Process) newValue);
			return;
		case MetaSDLProjPackage.CHANNEL__SIGNAL:
			setSignal((Signal) newValue);
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
		case MetaSDLProjPackage.CHANNEL__FROM:
			setFrom((com.metasdlproj.model.metaSDLProj.Process) null);
			return;
		case MetaSDLProjPackage.CHANNEL__TO:
			setTo((com.metasdlproj.model.metaSDLProj.Process) null);
			return;
		case MetaSDLProjPackage.CHANNEL__SIGNAL:
			setSignal((Signal) null);
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
		case MetaSDLProjPackage.CHANNEL__FROM:
			return from != null;
		case MetaSDLProjPackage.CHANNEL__TO:
			return to != null;
		case MetaSDLProjPackage.CHANNEL__SIGNAL:
			return signal != null;
		}
		return super.eIsSet(featureID);
	}

} //ChannelImpl
