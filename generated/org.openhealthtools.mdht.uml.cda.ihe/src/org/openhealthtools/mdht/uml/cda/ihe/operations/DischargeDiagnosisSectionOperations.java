/*******************************************************************************
 * Copyright (c) 2009, 2011 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ihe.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.ihe.DischargeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemConcernEntry;
import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;
import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Discharge Diagnosis Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.DischargeDiagnosisSection#validateDischargeDiagnosisSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Diagnosis Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.DischargeDiagnosisSection#validateDischargeDiagnosisSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Diagnosis Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.DischargeDiagnosisSection#validateDischargeDiagnosisSectionProblemConcernEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Diagnosis Section Problem Concern Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.DischargeDiagnosisSection#getProblemConcernEntry() <em>Get Problem Concern Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DischargeDiagnosisSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DischargeDiagnosisSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeDiagnosisSectionTemplateId(DischargeDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Diagnosis Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeDiagnosisSectionTemplateId(DischargeDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.3.7')";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeDiagnosisSectionTemplateId(DischargeDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Diagnosis Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeDiagnosisSectionTemplateId(DischargeDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DISCHARGE_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.3.7')
	 * @param dischargeDiagnosisSection The receiving '<em><b>Discharge Diagnosis Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeDiagnosisSectionTemplateId(
			DischargeDiagnosisSection dischargeDiagnosisSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_DISCHARGE_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.DISCHARGE_DIAGNOSIS_SECTION);
			try {
				VALIDATE_DISCHARGE_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeDiagnosisSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.DISCHARGE_DIAGNOSIS_SECTION__DISCHARGE_DIAGNOSIS_SECTION_TEMPLATE_ID,
					IHEPlugin.INSTANCE.getString("DischargeDiagnosisSectionTemplateId"),
					new Object[] { dischargeDiagnosisSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeDiagnosisSectionCode(DischargeDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Diagnosis Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeDiagnosisSectionCode(DischargeDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_DIAGNOSIS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.code = '11535-2' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeDiagnosisSectionCode(DischargeDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Diagnosis Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeDiagnosisSectionCode(DischargeDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DISCHARGE_DIAGNOSIS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
	 * value.code = '11535-2' and value.codeSystem = '2.16.840.1.113883.6.1')
	 * @param dischargeDiagnosisSection The receiving '<em><b>Discharge Diagnosis Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeDiagnosisSectionCode(DischargeDiagnosisSection dischargeDiagnosisSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DISCHARGE_DIAGNOSIS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.DISCHARGE_DIAGNOSIS_SECTION);
			try {
				VALIDATE_DISCHARGE_DIAGNOSIS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_DIAGNOSIS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_DIAGNOSIS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeDiagnosisSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.DISCHARGE_DIAGNOSIS_SECTION__DISCHARGE_DIAGNOSIS_SECTION_CODE,
					IHEPlugin.INSTANCE.getString("DischargeDiagnosisSectionCode"),
					new Object[] { dischargeDiagnosisSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeDiagnosisSectionProblemConcernEntry(DischargeDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Diagnosis Section Problem Concern Entry</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeDiagnosisSectionProblemConcernEntry(DischargeDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_DIAGNOSIS_SECTION_PROBLEM_CONCERN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(ihe::ProblemConcernEntry))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeDiagnosisSectionProblemConcernEntry(DischargeDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Diagnosis Section Problem Concern Entry</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeDiagnosisSectionProblemConcernEntry(DischargeDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DISCHARGE_DIAGNOSIS_SECTION_PROBLEM_CONCERN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(ihe::ProblemConcernEntry))
	 * @param dischargeDiagnosisSection The receiving '<em><b>Discharge Diagnosis Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeDiagnosisSectionProblemConcernEntry(
			DischargeDiagnosisSection dischargeDiagnosisSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_DISCHARGE_DIAGNOSIS_SECTION_PROBLEM_CONCERN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.DISCHARGE_DIAGNOSIS_SECTION);
			try {
				VALIDATE_DISCHARGE_DIAGNOSIS_SECTION_PROBLEM_CONCERN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_DIAGNOSIS_SECTION_PROBLEM_CONCERN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_DISCHARGE_DIAGNOSIS_SECTION_PROBLEM_CONCERN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeDiagnosisSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.DISCHARGE_DIAGNOSIS_SECTION__DISCHARGE_DIAGNOSIS_SECTION_PROBLEM_CONCERN_ENTRY,
					IHEPlugin.INSTANCE.getString("DischargeDiagnosisSectionProblemConcernEntry"),
					new Object[] { dischargeDiagnosisSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getProblemConcernEntry(DischargeDiagnosisSection) <em>Get Problem Concern Entry</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemConcernEntry(DischargeDiagnosisSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_CONCERN_ENTRY__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(ihe::ProblemConcernEntry))->asSequence()->first().oclAsType(ihe::ProblemConcernEntry)";

	/**
	 * The cached OCL query for the '{@link #getProblemConcernEntry(DischargeDiagnosisSection) <em>Get Problem Concern Entry</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemConcernEntry(DischargeDiagnosisSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROBLEM_CONCERN_ENTRY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(ihe::ProblemConcernEntry))->asSequence()->first().oclAsType(ihe::ProblemConcernEntry)
	 * @param dischargeDiagnosisSection The receiving '<em><b>Discharge Diagnosis Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static ProblemConcernEntry getProblemConcernEntry(DischargeDiagnosisSection dischargeDiagnosisSection) {
		if (GET_PROBLEM_CONCERN_ENTRY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IHEPackage.Literals.DISCHARGE_DIAGNOSIS_SECTION,
				IHEPackage.Literals.DISCHARGE_DIAGNOSIS_SECTION.getEAllOperations().get(58));
			try {
				GET_PROBLEM_CONCERN_ENTRY__EOCL_QRY = helper.createQuery(GET_PROBLEM_CONCERN_ENTRY__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_CONCERN_ENTRY__EOCL_QRY);
		return (ProblemConcernEntry) query.evaluate(dischargeDiagnosisSection);
	}

} // DischargeDiagnosisSectionOperations
