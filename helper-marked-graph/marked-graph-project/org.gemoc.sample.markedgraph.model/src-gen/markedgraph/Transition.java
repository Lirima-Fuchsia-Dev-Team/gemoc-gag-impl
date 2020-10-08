/**
 */
package markedgraph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link markedgraph.Transition#getInputs <em>Inputs</em>}</li>
 *   <li>{@link markedgraph.Transition#getOutputs <em>Outputs</em>}</li>
 * </ul>
 * </p>
 *
 * @see markedgraph.MarkedgraphPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' reference list.
	 * The list contents are of type {@link markedgraph.Place}.
	 * It is bidirectional and its opposite is '{@link markedgraph.Place#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' reference list.
	 * @see markedgraph.MarkedgraphPackage#getTransition_Inputs()
	 * @see markedgraph.Place#getOutput
	 * @model opposite="output"
	 * @generated
	 */
	EList<Place> getInputs();

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' reference list.
	 * The list contents are of type {@link markedgraph.Place}.
	 * It is bidirectional and its opposite is '{@link markedgraph.Place#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' reference list.
	 * @see markedgraph.MarkedgraphPackage#getTransition_Outputs()
	 * @see markedgraph.Place#getInput
	 * @model opposite="input"
	 * @generated
	 */
	EList<Place> getOutputs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void fire();

} // Transition
