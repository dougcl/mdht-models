/*******************************************************************************
 * Copyright (c) 2009, 2012 David A Carlson and others.
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
import org.openhealthtools.mdht.uml.cda.ihe.HospitalDischargeMedicationsSection;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.Medication;
import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;
import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Hospital Discharge Medications Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.HospitalDischargeMedicationsSection#validateHospitalDischargeMedicationsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Medications Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.HospitalDischargeMedicationsSection#validateHospitalDischargeMedicationsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Medications Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.HospitalDischargeMedicationsSection#validateHospitalDischargeMedicationsSectionMedication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Medications Section Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.HospitalDischargeMedicationsSection#getMedication() <em>Get Medication</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HospitalDischargeMedicationsSectionOperations extends SectionOperations {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected HospitalDischargeMedicationsSectionOperations() {
		super();
	}

	/**
	* The cached OCL expression body for the '{@link #validateHospitalDischargeMedicationsSectionTemplateId(HospitalDischargeMedicationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Medications Section Template Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHospitalDischargeMedicationsSectionTemplateId(HospitalDischargeMedicationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.3.22')";

	/**
	* The cached OCL invariant for the '{@link #validateHospitalDischargeMedicationsSectionTemplateId(HospitalDischargeMedicationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Medications Section Template Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHospitalDischargeMedicationsSectionTemplateId(HospitalDischargeMedicationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param hospitalDischargeMedicationsSection The receiving '<em><b>Hospital Discharge Medications Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateHospitalDischargeMedicationsSectionTemplateId(
			HospitalDischargeMedicationsSection hospitalDischargeMedicationsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION);
			try {
				VALIDATE_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			hospitalDischargeMedicationsSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_TEMPLATE_ID,
					IHEPlugin.INSTANCE.getString("HospitalDischargeMedicationsSectionTemplateId"),
					new Object[] { hospitalDischargeMedicationsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateHospitalDischargeMedicationsSectionCode(HospitalDischargeMedicationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Medications Section Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHospitalDischargeMedicationsSectionCode(HospitalDischargeMedicationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.code = '10183-2' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	* The cached OCL invariant for the '{@link #validateHospitalDischargeMedicationsSectionCode(HospitalDischargeMedicationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Medications Section Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHospitalDischargeMedicationsSectionCode(HospitalDischargeMedicationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param hospitalDischargeMedicationsSection The receiving '<em><b>Hospital Discharge Medications Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateHospitalDischargeMedicationsSectionCode(
			HospitalDischargeMedicationsSection hospitalDischargeMedicationsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION);
			try {
				VALIDATE_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			hospitalDischargeMedicationsSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_CODE,
					IHEPlugin.INSTANCE.getString("HospitalDischargeMedicationsSectionCode"),
					new Object[] { hospitalDischargeMedicationsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateHospitalDischargeMedicationsSectionMedication(HospitalDischargeMedicationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Medications Section Medication</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHospitalDischargeMedicationsSectionMedication(HospitalDischargeMedicationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.substanceAdministration.oclIsUndefined() and entry.substanceAdministration.oclIsKindOf(ihe::Medication))";

	/**
	* The cached OCL invariant for the '{@link #validateHospitalDischargeMedicationsSectionMedication(HospitalDischargeMedicationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Medications Section Medication</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHospitalDischargeMedicationsSectionMedication(HospitalDischargeMedicationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param hospitalDischargeMedicationsSection The receiving '<em><b>Hospital Discharge Medications Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateHospitalDischargeMedicationsSectionMedication(
			HospitalDischargeMedicationsSection hospitalDischargeMedicationsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION);
			try {
				VALIDATE_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			hospitalDischargeMedicationsSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_MEDICATION,
					IHEPlugin.INSTANCE.getString("HospitalDischargeMedicationsSectionMedication"),
					new Object[] { hospitalDischargeMedicationsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #getMedication(HospitalDischargeMedicationsSection) <em>Get Medication</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getMedication(HospitalDischargeMedicationsSection)
	* @generated
	* @ordered
	*/
	protected static final String GET_MEDICATION__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(ihe::Medication))->asSequence()->any(true).oclAsType(ihe::Medication)";

	/**
	* The cached OCL query for the '{@link #getMedication(HospitalDischargeMedicationsSection) <em>Get Medication</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getMedication(HospitalDischargeMedicationsSection)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_MEDICATION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public static Medication getMedication(HospitalDischargeMedicationsSection hospitalDischargeMedicationsSection) {
		if (GET_MEDICATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IHEPackage.Literals.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION,
				IHEPackage.Literals.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION.getEAllOperations().get(58));
			try {
				GET_MEDICATION__EOCL_QRY = helper.createQuery(GET_MEDICATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATION__EOCL_QRY);
		return (Medication) query.evaluate(hospitalDischargeMedicationsSection);
	}

} // HospitalDischargeMedicationsSectionOperations
