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
import org.openhealthtools.mdht.uml.cda.consol.ServiceEvent_PrimaryPerformer;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.hl7.rim.operations.ParticipationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Service Event Primary Performer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ServiceEvent_PrimaryPerformer#validatePrimaryPerformerFunctionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Primary Performer Function Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ServiceEvent_PrimaryPerformer#validatePrimaryPerformerTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Primary Performer Type Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceEvent_PrimaryPerformerOperations extends ParticipationOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceEvent_PrimaryPerformerOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrimaryPerformerFunctionCode(ServiceEvent_PrimaryPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Primary Performer Function Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrimaryPerformerFunctionCode(ServiceEvent_PrimaryPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIMARY_PERFORMER_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.functionCode.oclIsUndefined() or self.functionCode.isNullFlavorUndefined()) implies (self.functionCode.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.functionCode.oclAsType(datatypes::CE) in ("
			+ "value.codeSystem = '2.16.840.1.113883.6.101' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validatePrimaryPerformerFunctionCode(ServiceEvent_PrimaryPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Primary Performer Function Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrimaryPerformerFunctionCode(ServiceEvent_PrimaryPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PRIMARY_PERFORMER_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.functionCode.oclIsUndefined() or self.functionCode.isNullFlavorUndefined()) implies (self.functionCode.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.functionCode.oclAsType(datatypes::CE) in (
	 * value.codeSystem = '2.16.840.1.113883.6.101' and not value.code.oclIsUndefined()))
	 * @param serviceEvent_PrimaryPerformer The receiving '<em><b>Service Event Primary Performer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePrimaryPerformerFunctionCode(
			ServiceEvent_PrimaryPerformer serviceEvent_PrimaryPerformer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PRIMARY_PERFORMER_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SERVICE_EVENT_PRIMARY_PERFORMER);
			try {
				VALIDATE_PRIMARY_PERFORMER_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRIMARY_PERFORMER_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRIMARY_PERFORMER_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			serviceEvent_PrimaryPerformer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SERVICE_EVENT_PRIMARY_PERFORMER__PRIMARY_PERFORMER_FUNCTION_CODE,
					ConsolPlugin.INSTANCE.getString("PrimaryPerformerFunctionCode"),
					new Object[] { serviceEvent_PrimaryPerformer }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrimaryPerformerTypeCode(ServiceEvent_PrimaryPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Primary Performer Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrimaryPerformerTypeCode(ServiceEvent_PrimaryPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIMARY_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('typeCode')";

	/**
	 * The cached OCL invariant for the '{@link #validatePrimaryPerformerTypeCode(ServiceEvent_PrimaryPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Primary Performer Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrimaryPerformerTypeCode(ServiceEvent_PrimaryPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PRIMARY_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * isDefined('typeCode')
	 * @param serviceEvent_PrimaryPerformer The receiving '<em><b>Service Event Primary Performer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePrimaryPerformerTypeCode(ServiceEvent_PrimaryPerformer serviceEvent_PrimaryPerformer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PRIMARY_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SERVICE_EVENT_PRIMARY_PERFORMER);
			try {
				VALIDATE_PRIMARY_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRIMARY_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRIMARY_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			serviceEvent_PrimaryPerformer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SERVICE_EVENT_PRIMARY_PERFORMER__PRIMARY_PERFORMER_TYPE_CODE,
					ConsolPlugin.INSTANCE.getString("PrimaryPerformerTypeCode"),
					new Object[] { serviceEvent_PrimaryPerformer }));
			}
			return false;
		}
		return true;
	}

} // ServiceEvent_PrimaryPerformerOperations