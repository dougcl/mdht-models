/*******************************************************************************
 * Copyright (c) 2012, Public Health Data Standards Consortium (PHDSC)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     PHDSC - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.phcr.flu.operations;

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

import org.openhealthtools.mdht.uml.cda.phcr.flu.FluPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaTherapeuticRegimenAct;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaTreatmentGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaTreatmentNotGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.flu.fluPackage;

import org.openhealthtools.mdht.uml.cda.phcr.flu.util.fluValidator;

import org.openhealthtools.mdht.uml.cda.phcr.operations.TherapeuticRegimenActOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Influenza Therapeutic Regimen Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaTherapeuticRegimenAct#validateInfluenzaTherapeuticRegimenActInfluenzaTreatmentGivenSubstanceAdministration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Influenza Therapeutic Regimen Act Influenza Treatment Given Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaTherapeuticRegimenAct#validateInfluenzaTherapeuticRegimenActInfluenzaTreatmentNotGivenSubstanceAdministration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Influenza Therapeutic Regimen Act Influenza Treatment Not Given Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaTherapeuticRegimenAct#getInfluenzaTreatmentGivenSubstanceAdministrations() <em>Get Influenza Treatment Given Substance Administrations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaTherapeuticRegimenAct#getInfluenzaTreatmentNotGivenSubstanceAdministrations() <em>Get Influenza Treatment Not Given Substance Administrations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaTherapeuticRegimenAct#validateTherapeuticRegimenActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InfluenzaTherapeuticRegimenActOperations extends TherapeuticRegimenActOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfluenzaTherapeuticRegimenActOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInfluenzaTherapeuticRegimenActInfluenzaTreatmentGivenSubstanceAdministration(InfluenzaTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Influenza Therapeutic Regimen Act Influenza Treatment Given Substance Administration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfluenzaTherapeuticRegimenActInfluenzaTreatmentGivenSubstanceAdministration(InfluenzaTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INFLUENZA_THERAPEUTIC_REGIMEN_ACT_INFLUENZA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.substanceAdministration.oclIsUndefined() and entryRelationship.substanceAdministration.oclIsKindOf(flu::InfluenzaTreatmentGivenSubstanceAdministration) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateInfluenzaTherapeuticRegimenActInfluenzaTreatmentGivenSubstanceAdministration(InfluenzaTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Influenza Therapeutic Regimen Act Influenza Treatment Given Substance Administration</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfluenzaTherapeuticRegimenActInfluenzaTreatmentGivenSubstanceAdministration(InfluenzaTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INFLUENZA_THERAPEUTIC_REGIMEN_ACT_INFLUENZA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.substanceAdministration.oclIsUndefined() and entryRelationship.substanceAdministration.oclIsKindOf(flu::InfluenzaTreatmentGivenSubstanceAdministration) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
	 * @param influenzaTherapeuticRegimenAct The receiving '<em><b>Influenza Therapeutic Regimen Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInfluenzaTherapeuticRegimenActInfluenzaTreatmentGivenSubstanceAdministration(InfluenzaTherapeuticRegimenAct influenzaTherapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INFLUENZA_THERAPEUTIC_REGIMEN_ACT_INFLUENZA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(fluPackage.Literals.INFLUENZA_THERAPEUTIC_REGIMEN_ACT);
			try {
				VALIDATE_INFLUENZA_THERAPEUTIC_REGIMEN_ACT_INFLUENZA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INFLUENZA_THERAPEUTIC_REGIMEN_ACT_INFLUENZA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INFLUENZA_THERAPEUTIC_REGIMEN_ACT_INFLUENZA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(influenzaTherapeuticRegimenAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 fluValidator.DIAGNOSTIC_SOURCE,
						 fluValidator.INFLUENZA_THERAPEUTIC_REGIMEN_ACT__INFLUENZA_THERAPEUTIC_REGIMEN_ACT_INFLUENZA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION,
						 FluPlugin.INSTANCE.getString("InfluenzaTherapeuticRegimenActInfluenzaTreatmentGivenSubstanceAdministration"),
						 new Object [] { influenzaTherapeuticRegimenAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInfluenzaTherapeuticRegimenActInfluenzaTreatmentNotGivenSubstanceAdministration(InfluenzaTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Influenza Therapeutic Regimen Act Influenza Treatment Not Given Substance Administration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfluenzaTherapeuticRegimenActInfluenzaTreatmentNotGivenSubstanceAdministration(InfluenzaTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INFLUENZA_THERAPEUTIC_REGIMEN_ACT_INFLUENZA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.substanceAdministration.oclIsUndefined() and entryRelationship.substanceAdministration.oclIsKindOf(flu::InfluenzaTreatmentNotGivenSubstanceAdministration) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateInfluenzaTherapeuticRegimenActInfluenzaTreatmentNotGivenSubstanceAdministration(InfluenzaTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Influenza Therapeutic Regimen Act Influenza Treatment Not Given Substance Administration</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfluenzaTherapeuticRegimenActInfluenzaTreatmentNotGivenSubstanceAdministration(InfluenzaTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INFLUENZA_THERAPEUTIC_REGIMEN_ACT_INFLUENZA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.substanceAdministration.oclIsUndefined() and entryRelationship.substanceAdministration.oclIsKindOf(flu::InfluenzaTreatmentNotGivenSubstanceAdministration) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
	 * @param influenzaTherapeuticRegimenAct The receiving '<em><b>Influenza Therapeutic Regimen Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInfluenzaTherapeuticRegimenActInfluenzaTreatmentNotGivenSubstanceAdministration(InfluenzaTherapeuticRegimenAct influenzaTherapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INFLUENZA_THERAPEUTIC_REGIMEN_ACT_INFLUENZA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(fluPackage.Literals.INFLUENZA_THERAPEUTIC_REGIMEN_ACT);
			try {
				VALIDATE_INFLUENZA_THERAPEUTIC_REGIMEN_ACT_INFLUENZA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INFLUENZA_THERAPEUTIC_REGIMEN_ACT_INFLUENZA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INFLUENZA_THERAPEUTIC_REGIMEN_ACT_INFLUENZA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(influenzaTherapeuticRegimenAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 fluValidator.DIAGNOSTIC_SOURCE,
						 fluValidator.INFLUENZA_THERAPEUTIC_REGIMEN_ACT__INFLUENZA_THERAPEUTIC_REGIMEN_ACT_INFLUENZA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION,
						 FluPlugin.INSTANCE.getString("InfluenzaTherapeuticRegimenActInfluenzaTreatmentNotGivenSubstanceAdministration"),
						 new Object [] { influenzaTherapeuticRegimenAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getInfluenzaTreatmentGivenSubstanceAdministrations(InfluenzaTherapeuticRegimenAct) <em>Get Influenza Treatment Given Substance Administrations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfluenzaTreatmentGivenSubstanceAdministrations(InfluenzaTherapeuticRegimenAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INFLUENZA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(flu::InfluenzaTreatmentGivenSubstanceAdministration)).oclAsType(flu::InfluenzaTreatmentGivenSubstanceAdministration)";

	/**
	 * The cached OCL query for the '{@link #getInfluenzaTreatmentGivenSubstanceAdministrations(InfluenzaTherapeuticRegimenAct) <em>Get Influenza Treatment Given Substance Administrations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfluenzaTreatmentGivenSubstanceAdministrations(InfluenzaTherapeuticRegimenAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INFLUENZA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(flu::InfluenzaTreatmentGivenSubstanceAdministration)).oclAsType(flu::InfluenzaTreatmentGivenSubstanceAdministration)
	 * @param influenzaTherapeuticRegimenAct The receiving '<em><b>Influenza Therapeutic Regimen Act</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  EList<InfluenzaTreatmentGivenSubstanceAdministration> getInfluenzaTreatmentGivenSubstanceAdministrations(InfluenzaTherapeuticRegimenAct influenzaTherapeuticRegimenAct) {
		if (GET_INFLUENZA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(fluPackage.Literals.INFLUENZA_THERAPEUTIC_REGIMEN_ACT, fluPackage.Literals.INFLUENZA_THERAPEUTIC_REGIMEN_ACT.getEAllOperations().get(63));
			try {
				GET_INFLUENZA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY = helper.createQuery(GET_INFLUENZA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_INFLUENZA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<InfluenzaTreatmentGivenSubstanceAdministration> result = (Collection<InfluenzaTreatmentGivenSubstanceAdministration>) query.evaluate(influenzaTherapeuticRegimenAct);
		return new BasicEList.UnmodifiableEList<InfluenzaTreatmentGivenSubstanceAdministration>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getInfluenzaTreatmentNotGivenSubstanceAdministrations(InfluenzaTherapeuticRegimenAct) <em>Get Influenza Treatment Not Given Substance Administrations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfluenzaTreatmentNotGivenSubstanceAdministrations(InfluenzaTherapeuticRegimenAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INFLUENZA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(flu::InfluenzaTreatmentNotGivenSubstanceAdministration)).oclAsType(flu::InfluenzaTreatmentNotGivenSubstanceAdministration)";

	/**
	 * The cached OCL query for the '{@link #getInfluenzaTreatmentNotGivenSubstanceAdministrations(InfluenzaTherapeuticRegimenAct) <em>Get Influenza Treatment Not Given Substance Administrations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfluenzaTreatmentNotGivenSubstanceAdministrations(InfluenzaTherapeuticRegimenAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INFLUENZA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(flu::InfluenzaTreatmentNotGivenSubstanceAdministration)).oclAsType(flu::InfluenzaTreatmentNotGivenSubstanceAdministration)
	 * @param influenzaTherapeuticRegimenAct The receiving '<em><b>Influenza Therapeutic Regimen Act</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  EList<InfluenzaTreatmentNotGivenSubstanceAdministration> getInfluenzaTreatmentNotGivenSubstanceAdministrations(InfluenzaTherapeuticRegimenAct influenzaTherapeuticRegimenAct) {
		if (GET_INFLUENZA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(fluPackage.Literals.INFLUENZA_THERAPEUTIC_REGIMEN_ACT, fluPackage.Literals.INFLUENZA_THERAPEUTIC_REGIMEN_ACT.getEAllOperations().get(64));
			try {
				GET_INFLUENZA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY = helper.createQuery(GET_INFLUENZA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_INFLUENZA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<InfluenzaTreatmentNotGivenSubstanceAdministration> result = (Collection<InfluenzaTreatmentNotGivenSubstanceAdministration>) query.evaluate(influenzaTherapeuticRegimenAct);
		return new BasicEList.UnmodifiableEList<InfluenzaTreatmentNotGivenSubstanceAdministration>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTherapeuticRegimenActTemplateId(InfluenzaTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTherapeuticRegimenActTemplateId(InfluenzaTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.75')";

	/**
	 * The cached OCL invariant for the '{@link #validateTherapeuticRegimenActTemplateId(InfluenzaTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTherapeuticRegimenActTemplateId(InfluenzaTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.75')
	 * @param influenzaTherapeuticRegimenAct The receiving '<em><b>Influenza Therapeutic Regimen Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTherapeuticRegimenActTemplateId(InfluenzaTherapeuticRegimenAct influenzaTherapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(fluPackage.Literals.INFLUENZA_THERAPEUTIC_REGIMEN_ACT);
			try {
				VALIDATE_THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(influenzaTherapeuticRegimenAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 fluValidator.DIAGNOSTIC_SOURCE,
						 fluValidator.INFLUENZA_THERAPEUTIC_REGIMEN_ACT__THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "TherapeuticRegimenActTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(influenzaTherapeuticRegimenAct, context) }),
						 new Object [] { influenzaTherapeuticRegimenAct }));
			}
			 
			return false;
		}
		return true;
	}

} // InfluenzaTherapeuticRegimenActOperations