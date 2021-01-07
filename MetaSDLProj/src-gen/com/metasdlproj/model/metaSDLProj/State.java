/**
 */
package com.metasdlproj.model.metaSDLProj;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.metasdlproj.model.metaSDLProj.State#getNextstate <em>Nextstate</em>}</li>
 *   <li>{@link com.metasdlproj.model.metaSDLProj.State#getInput <em>Input</em>}</li>
 *   <li>{@link com.metasdlproj.model.metaSDLProj.State#getOutput <em>Output</em>}</li>
 *   <li>{@link com.metasdlproj.model.metaSDLProj.State#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see com.metasdlproj.model.metaSDLProj.MetaSDLProjPackage#getState()
 * @model
 * @generated
 */
public interface State extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Nextstate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nextstate</em>' reference.
	 * @see #setNextstate(State)
	 * @see com.metasdlproj.model.metaSDLProj.MetaSDLProjPackage#getState_Nextstate()
	 * @model required="true"
	 * @generated
	 */
	State getNextstate();

	/**
	 * Sets the value of the '{@link com.metasdlproj.model.metaSDLProj.State#getNextstate <em>Nextstate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nextstate</em>' reference.
	 * @see #getNextstate()
	 * @generated
	 */
	void setNextstate(State value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference.
	 * @see #setInput(Signal)
	 * @see com.metasdlproj.model.metaSDLProj.MetaSDLProjPackage#getState_Input()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Signal getInput();

	/**
	 * Sets the value of the '{@link com.metasdlproj.model.metaSDLProj.State#getInput <em>Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' containment reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(Signal value);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference.
	 * @see #setOutput(Signal)
	 * @see com.metasdlproj.model.metaSDLProj.MetaSDLProjPackage#getState_Output()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Signal getOutput();

	/**
	 * Sets the value of the '{@link com.metasdlproj.model.metaSDLProj.State#getOutput <em>Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' containment reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(Signal value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see com.metasdlproj.model.metaSDLProj.MetaSDLProjPackage#getState_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link com.metasdlproj.model.metaSDLProj.State#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // State
