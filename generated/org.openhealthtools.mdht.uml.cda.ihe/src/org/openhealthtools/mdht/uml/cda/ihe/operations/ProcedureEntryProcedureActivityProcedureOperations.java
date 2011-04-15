/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.ccd.operations.ProcedureActivityProcedureOperations;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.InternalReference;
import org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntryProcedureActivityProcedure;
import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure Entry Procedure Activity Procedure</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntryProcedureActivityProcedure#validateProcedureEntryProcedureActivityProcedureHasTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Has Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntryProcedureActivityProcedure#validateProcedureEntryProcedureActivityProcedureTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntryProcedureActivityProcedure#validateProcedureEntryProcedureActivityProcedureClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntryProcedureActivityProcedure#validateProcedureEntryProcedureActivityProcedureText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntryProcedureActivityProcedure#validateProcedureEntryProcedureActivityProcedureApproachSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Approach Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntryProcedureActivityProcedure#validateProcedureEntryProcedureActivityProcedureInternalReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Internal Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntryProcedureActivityProcedure#validateProcedureEntryProcedureActivityProcedureInternalReferenceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Internal Reference Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntryProcedureActivityProcedure#getInternalReference() <em>Get Internal Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntryProcedureActivityProcedure#getInternalReferenceReasons() <em>Get Internal Reference Reasons</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcedureEntryProcedureActivityProcedureOperations extends ProcedureActivityProcedureOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureEntryProcedureActivityProcedureOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(ihe::InternalReference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
	 * @param procedureEntryProcedureActivityProcedure The receiving '<em><b>Procedure Entry Procedure Activity Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProcedureEntryProcedureActivityProcedureInternalReference(ProcedureEntryProcedureActivityProcedure procedureEntryProcedureActivityProcedure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_INTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE);
			try {
				VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_INTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_INTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_INTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedureEntryProcedureActivityProcedure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_INTERNAL_REFERENCE,
						 IHEPlugin.INSTANCE.getString("ProcedureEntryProcedureActivityProcedureInternalReference"),
						 new Object [] { procedureEntryProcedureActivityProcedure }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(ihe::InternalReference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)
	 * @param procedureEntryProcedureActivityProcedure The receiving '<em><b>Procedure Entry Procedure Activity Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProcedureEntryProcedureActivityProcedureInternalReferenceReason(ProcedureEntryProcedureActivityProcedure procedureEntryProcedureActivityProcedure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_INTERNAL_REFERENCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE);
			try {
				VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_INTERNAL_REFERENCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_INTERNAL_REFERENCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_INTERNAL_REFERENCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedureEntryProcedureActivityProcedure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_INTERNAL_REFERENCE_REASON,
						 IHEPlugin.INSTANCE.getString("ProcedureEntryProcedureActivityProcedureInternalReferenceReason"),
						 new Object [] { procedureEntryProcedureActivityProcedure }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureEntryProcedureActivityProcedureHasTextReference(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Has Text Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureEntryProcedureActivityProcedureHasTextReference(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.reference.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureEntryProcedureActivityProcedureHasTextReference(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Has Text Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureEntryProcedureActivityProcedureHasTextReference(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.text.reference.oclIsUndefined()
	 * @param procedureEntryProcedureActivityProcedure The receiving '<em><b>Procedure Entry Procedure Activity Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProcedureEntryProcedureActivityProcedureHasTextReference(ProcedureEntryProcedureActivityProcedure procedureEntryProcedureActivityProcedure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE);
			try {
				VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedureEntryProcedureActivityProcedure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_HAS_TEXT_REFERENCE,
						 IHEPlugin.INSTANCE.getString("ProcedureEntryProcedureActivityProcedureHasTextReference"),
						 new Object [] { procedureEntryProcedureActivityProcedure }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureEntryProcedureActivityProcedureTemplateId(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureEntryProcedureActivityProcedureTemplateId(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.19')";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureEntryProcedureActivityProcedureTemplateId(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureEntryProcedureActivityProcedureTemplateId(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.19')
	 * @param procedureEntryProcedureActivityProcedure The receiving '<em><b>Procedure Entry Procedure Activity Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProcedureEntryProcedureActivityProcedureTemplateId(ProcedureEntryProcedureActivityProcedure procedureEntryProcedureActivityProcedure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE);
			try {
				VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedureEntryProcedureActivityProcedure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_TEMPLATE_ID,
						 IHEPlugin.INSTANCE.getString("ProcedureEntryProcedureActivityProcedureTemplateId"),
						 new Object [] { procedureEntryProcedureActivityProcedure }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureEntryProcedureActivityProcedureClassCode(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureEntryProcedureActivityProcedureClassCode(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.classCode.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureEntryProcedureActivityProcedureClassCode(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureEntryProcedureActivityProcedureClassCode(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.classCode.oclIsUndefined()
	 * @param procedureEntryProcedureActivityProcedure The receiving '<em><b>Procedure Entry Procedure Activity Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProcedureEntryProcedureActivityProcedureClassCode(ProcedureEntryProcedureActivityProcedure procedureEntryProcedureActivityProcedure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE);
			try {
				VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedureEntryProcedureActivityProcedure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_CLASS_CODE,
						 IHEPlugin.INSTANCE.getString("ProcedureEntryProcedureActivityProcedureClassCode"),
						 new Object [] { procedureEntryProcedureActivityProcedure }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.approachSiteCode->isEmpty() or self.approachSiteCode->exists(element | element.isNullFlavorUndefined())) implies (not self.approachSiteCode->isEmpty())
	 * @param procedureEntryProcedureActivityProcedure The receiving '<em><b>Procedure Entry Procedure Activity Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProcedureEntryProcedureActivityProcedureApproachSiteCode(ProcedureEntryProcedureActivityProcedure procedureEntryProcedureActivityProcedure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE);
			try {
				VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedureEntryProcedureActivityProcedure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_APPROACH_SITE_CODE,
						 IHEPlugin.INSTANCE.getString("ProcedureEntryProcedureActivityProcedureApproachSiteCode"),
						 new Object [] { procedureEntryProcedureActivityProcedure }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(ihe::InternalReference))->asSequence()->first().oclAsType(ihe::InternalReference)
	 * @param procedureEntryProcedureActivityProcedure The receiving '<em><b>Procedure Entry Procedure Activity Procedure</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  InternalReference getInternalReference(ProcedureEntryProcedureActivityProcedure procedureEntryProcedureActivityProcedure) {
		if (GET_INTERNAL_REFERENCE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(IHEPackage.Literals.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE, IHEPackage.Literals.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE.getEAllOperations().get(57));
			try {
				GET_INTERNAL_REFERENCE__EOCL_QRY = helper.createQuery(GET_INTERNAL_REFERENCE__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_INTERNAL_REFERENCE__EOCL_QRY);
		return (InternalReference) query.evaluate(procedureEntryProcedureActivityProcedure);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(ihe::InternalReference)).oclAsType(ihe::InternalReference)
	 * @param procedureEntryProcedureActivityProcedure The receiving '<em><b>Procedure Entry Procedure Activity Procedure</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<InternalReference> getInternalReferenceReasons(ProcedureEntryProcedureActivityProcedure procedureEntryProcedureActivityProcedure) {
		if (GET_INTERNAL_REFERENCE_REASONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(IHEPackage.Literals.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE, IHEPackage.Literals.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE.getEAllOperations().get(58));
			try {
				GET_INTERNAL_REFERENCE_REASONS__EOCL_QRY = helper.createQuery(GET_INTERNAL_REFERENCE_REASONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_INTERNAL_REFERENCE_REASONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<InternalReference> result = (Collection<InternalReference>) query.evaluate(procedureEntryProcedureActivityProcedure);
		return new BasicEList.UnmodifiableEList<InternalReference>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureEntryProcedureActivityProcedureText(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureEntryProcedureActivityProcedureText(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureEntryProcedureActivityProcedureText(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureEntryProcedureActivityProcedureText(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureEntryProcedureActivityProcedureApproachSiteCode(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Approach Site Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureEntryProcedureActivityProcedureApproachSiteCode(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.approachSiteCode->isEmpty() or self.approachSiteCode->exists(element | element.isNullFlavorUndefined())) implies (not self.approachSiteCode->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureEntryProcedureActivityProcedureApproachSiteCode(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Approach Site Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureEntryProcedureActivityProcedureApproachSiteCode(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureEntryProcedureActivityProcedureInternalReference(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Internal Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureEntryProcedureActivityProcedureInternalReference(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_INTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(ihe::InternalReference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureEntryProcedureActivityProcedureInternalReference(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Internal Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureEntryProcedureActivityProcedureInternalReference(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_INTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureEntryProcedureActivityProcedureInternalReferenceReason(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Internal Reference Reason</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureEntryProcedureActivityProcedureInternalReferenceReason(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_INTERNAL_REFERENCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(ihe::InternalReference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureEntryProcedureActivityProcedureInternalReferenceReason(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Internal Reference Reason</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureEntryProcedureActivityProcedureInternalReferenceReason(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_INTERNAL_REFERENCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * The cached OCL expression body for the '{@link #getInternalReference(ProcedureEntryProcedureActivityProcedure) <em>Get Internal Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalReference(ProcedureEntryProcedureActivityProcedure)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INTERNAL_REFERENCE__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(ihe::InternalReference))->asSequence()->first().oclAsType(ihe::InternalReference)";

	/**
	 * The cached OCL query for the '{@link #getInternalReference(ProcedureEntryProcedureActivityProcedure) <em>Get Internal Reference</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalReference(ProcedureEntryProcedureActivityProcedure)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INTERNAL_REFERENCE__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #getInternalReferenceReasons(ProcedureEntryProcedureActivityProcedure) <em>Get Internal Reference Reasons</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalReferenceReasons(ProcedureEntryProcedureActivityProcedure)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INTERNAL_REFERENCE_REASONS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(ihe::InternalReference)).oclAsType(ihe::InternalReference)";

	/**
	 * The cached OCL query for the '{@link #getInternalReferenceReasons(ProcedureEntryProcedureActivityProcedure) <em>Get Internal Reference Reasons</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalReferenceReasons(ProcedureEntryProcedureActivityProcedure)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INTERNAL_REFERENCE_REASONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())
	 * @param procedureEntryProcedureActivityProcedure The receiving '<em><b>Procedure Entry Procedure Activity Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProcedureEntryProcedureActivityProcedureText(ProcedureEntryProcedureActivityProcedure procedureEntryProcedureActivityProcedure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE);
			try {
				VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedureEntryProcedureActivityProcedure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_TEXT,
						 IHEPlugin.INSTANCE.getString("ProcedureEntryProcedureActivityProcedureText"),
						 new Object [] { procedureEntryProcedureActivityProcedure }));
			}
			return false;
		}
		return true;
	}

} // ProcedureEntryProcedureActivityProcedureOperations