/**
 */
package markedgraph;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link markedgraph.Place#getOutput <em>Output</em>}</li>
 *   <li>{@link markedgraph.Place#getInput <em>Input</em>}</li>
 *   <li>{@link markedgraph.Place#getTokenCount <em>Token Count</em>}</li>
 *   <li>{@link markedgraph.Place#getRuntimeTokenCount <em>Runtime Token Count</em>}</li>
 * </ul>
 * </p>
 *
 * @see markedgraph.MarkedgraphPackage#getPlace()
 * @model
 * @generated
 */
public interface Place extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link markedgraph.Transition#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference.
	 * @see #setOutput(Transition)
	 * @see markedgraph.MarkedgraphPackage#getPlace_Output()
	 * @see markedgraph.Transition#getInputs
	 * @model opposite="inputs" required="true"
	 * @generated
	 */
	Transition getOutput();

	/**
	 * Sets the value of the '{@link markedgraph.Place#getOutput <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(Transition value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link markedgraph.Transition#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference.
	 * @see #setInput(Transition)
	 * @see markedgraph.MarkedgraphPackage#getPlace_Input()
	 * @see markedgraph.Transition#getOutputs
	 * @model opposite="outputs" required="true"
	 * @generated
	 */
	Transition getInput();

	/**
	 * Sets the value of the '{@link markedgraph.Place#getInput <em>Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(Transition value);

	/**
	 * Returns the value of the '<em><b>Token Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Token Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token Count</em>' attribute.
	 * @see #setTokenCount(int)
	 * @see markedgraph.MarkedgraphPackage#getPlace_TokenCount()
	 * @model required="true"
	 * @generated
	 */
	int getTokenCount();

	/**
	 * Sets the value of the '{@link markedgraph.Place#getTokenCount <em>Token Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token Count</em>' attribute.
	 * @see #getTokenCount()
	 * @generated
	 */
	void setTokenCount(int value);

	/**
	 * Returns the value of the '<em><b>Runtime Token Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runtime Token Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime Token Count</em>' attribute.
	 * @see #setRuntimeTokenCount(int)
	 * @see markedgraph.MarkedgraphPackage#getPlace_RuntimeTokenCount()
	 * @model required="true"
	 * @generated
	 */
	int getRuntimeTokenCount();

	/**
	 * Sets the value of the '{@link markedgraph.Place#getRuntimeTokenCount <em>Runtime Token Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runtime Token Count</em>' attribute.
	 * @see #getRuntimeTokenCount()
	 * @generated
	 */
	void setRuntimeTokenCount(int value);

} // Place
