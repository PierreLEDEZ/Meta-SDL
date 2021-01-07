/**
 */
package com.metasdlproj.model.metaSDLProj;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.metasdlproj.model.metaSDLProj.Process#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see com.metasdlproj.model.metaSDLProj.MetaSDLProjPackage#getProcess()
 * @model
 * @generated
 */
public interface Process extends NamedElement {
	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link com.metasdlproj.model.metaSDLProj.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see com.metasdlproj.model.metaSDLProj.MetaSDLProjPackage#getProcess_States()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getStates();

} // Process
