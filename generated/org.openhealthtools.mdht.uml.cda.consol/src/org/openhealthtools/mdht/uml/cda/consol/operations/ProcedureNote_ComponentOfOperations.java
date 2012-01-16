/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureNote_ComponentOf;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.Component1Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure Note Component Of</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote_ComponentOf#validateComponentOfEncompassingEncounter5(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Component Of Encompassing Encounter5</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcedureNote_ComponentOfOperations extends Component1Operations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureNote_ComponentOfOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateComponentOfEncompassingEncounter5(ProcedureNote_ComponentOf, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Component Of Encompassing Encounter5</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateComponentOfEncompassingEncounter5(ProcedureNote_ComponentOf, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER5__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.encompassingEncounter->one(encompassingEncounter : cda::EncompassingEncounter | not encompassingEncounter.oclIsUndefined() and encompassingEncounter.oclIsKindOf(cda::EncompassingEncounter))";

	/**
	 * The cached OCL invariant for the '{@link #validateComponentOfEncompassingEncounter5(ProcedureNote_ComponentOf, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Component Of Encompassing Encounter5</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateComponentOfEncompassingEncounter5(ProcedureNote_ComponentOf, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER5__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.encompassingEncounter->one(encompassingEncounter : cda::EncompassingEncounter | not encompassingEncounter.oclIsUndefined() and encompassingEncounter.oclIsKindOf(cda::EncompassingEncounter))
	 * @param procedureNote_ComponentOf The receiving '<em><b>Procedure Note Component Of</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateComponentOfEncompassingEncounter5(
			ProcedureNote_ComponentOf procedureNote_ComponentOf, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER5__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE_COMPONENT_OF);
			try {
				VALIDATE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER5__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER5__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER5__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureNote_ComponentOf)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_NOTE_COMPONENT_OF__COMPONENT_OF_ENCOMPASSING_ENCOUNTER5,
					ConsolPlugin.INSTANCE.getString("ComponentOfEncompassingEncounter5"),
					new Object[] { procedureNote_ComponentOf }));
			}
			return false;
		}
		return true;
	}

} // ProcedureNote_ComponentOfOperations