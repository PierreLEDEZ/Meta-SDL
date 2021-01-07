/**
 */
package com.metasdlproj.model.metaSDLProj;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Channel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.metasdlproj.model.metaSDLProj.Channel#getFrom <em>From</em>}</li>
 *   <li>{@link com.metasdlproj.model.metaSDLProj.Channel#getTo <em>To</em>}</li>
 *   <li>{@link com.metasdlproj.model.metaSDLProj.Channel#getSignal <em>Signal</em>}</li>
 * </ul>
 *
 * @see com.metasdlproj.model.metaSDLProj.MetaSDLProjPackage#getChannel()
 * @model
 * @generated
 */
public interface Channel extends NamedElement {
	/**
	 * Returns the value of the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' containment reference.
	 * @see #setFrom(com.metasdlproj.model.metaSDLProj.Process)
	 * @see com.metasdlproj.model.metaSDLProj.MetaSDLProjPackage#getChannel_From()
	 * @model containment="true"
	 * @generated
	 */
	com.metasdlproj.model.metaSDLProj.Process getFrom();

	/**
	 * Sets the value of the '{@link com.metasdlproj.model.metaSDLProj.Channel#getFrom <em>From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' containment reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(com.metasdlproj.model.metaSDLProj.Process value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' containment reference.
	 * @see #setTo(com.metasdlproj.model.metaSDLProj.Process)
	 * @see com.metasdlproj.model.metaSDLProj.MetaSDLProjPackage#getChannel_To()
	 * @model containment="true"
	 * @generated
	 */
	com.metasdlproj.model.metaSDLProj.Process getTo();

	/**
	 * Sets the value of the '{@link com.metasdlproj.model.metaSDLProj.Channel#getTo <em>To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' containment reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(com.metasdlproj.model.metaSDLProj.Process value);

	/**
	 * Returns the value of the '<em><b>Signal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal</em>' containment reference.
	 * @see #setSignal(Signal)
	 * @see com.metasdlproj.model.metaSDLProj.MetaSDLProjPackage#getChannel_Signal()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Signal getSignal();

	/**
	 * Sets the value of the '{@link com.metasdlproj.model.metaSDLProj.Channel#getSignal <em>Signal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal</em>' containment reference.
	 * @see #getSignal()
	 * @generated
	 */
	void setSignal(Signal value);

} // Channel
