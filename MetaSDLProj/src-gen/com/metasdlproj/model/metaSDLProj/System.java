/**
 */
package com.metasdlproj.model.metaSDLProj;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.metasdlproj.model.metaSDLProj.System#getProcesses <em>Processes</em>}</li>
 *   <li>{@link com.metasdlproj.model.metaSDLProj.System#getChannels <em>Channels</em>}</li>
 *   <li>{@link com.metasdlproj.model.metaSDLProj.System#getSignals <em>Signals</em>}</li>
 * </ul>
 *
 * @see com.metasdlproj.model.metaSDLProj.MetaSDLProjPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Signals</b></em>' containment reference list.
	 * The list contents are of type {@link com.metasdlproj.model.metaSDLProj.Signal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signals</em>' containment reference list.
	 * @see com.metasdlproj.model.metaSDLProj.MetaSDLProjPackage#getSystem_Signals()
	 * @model containment="true"
	 * @generated
	 */
	EList<Signal> getSignals();

	/**
	 * Returns the value of the '<em><b>Processes</b></em>' containment reference list.
	 * The list contents are of type {@link com.metasdlproj.model.metaSDLProj.Process}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processes</em>' containment reference list.
	 * @see com.metasdlproj.model.metaSDLProj.MetaSDLProjPackage#getSystem_Processes()
	 * @model containment="true"
	 * @generated
	 */
	EList<com.metasdlproj.model.metaSDLProj.Process> getProcesses();

	/**
	 * Returns the value of the '<em><b>Channels</b></em>' containment reference list.
	 * The list contents are of type {@link com.metasdlproj.model.metaSDLProj.Channel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channels</em>' containment reference list.
	 * @see com.metasdlproj.model.metaSDLProj.MetaSDLProjPackage#getSystem_Channels()
	 * @model containment="true"
	 * @generated
	 */
	EList<Channel> getChannels();

} // System
