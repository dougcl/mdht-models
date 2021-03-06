/*******************************************************************************
 * Copyright (c) 2011, 2012 David A. Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.apitest.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.apitest.APITestPackage;
import org.openhealthtools.mdht.uml.cda.apitest.APITestPlugin;
import org.openhealthtools.mdht.uml.cda.apitest.EpisodeObservation;
import org.openhealthtools.mdht.uml.cda.apitest.util.APITestValidator;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Episode Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.EpisodeObservation#validateEpisodeObservationOneEntryRelationshipSUBJ(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Episode Observation One Entry Relationship SUBJ</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.EpisodeObservation#validateEpisodeObservationExistsEntryRelationshipSAS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Episode Observation Exists Entry Relationship SAS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.EpisodeObservation#validateEpisodeObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Episode Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.EpisodeObservation#validateEpisodeObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Episode Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.EpisodeObservation#validateEpisodeObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Episode Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.EpisodeObservation#validateEpisodeObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Episode Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.EpisodeObservation#validateEpisodeObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Episode Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.EpisodeObservation#validateEpisodeObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Episode Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EpisodeObservationOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EpisodeObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEpisodeObservationOneEntryRelationshipSUBJ(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Episode Observation One Entry Relationship SUBJ</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEpisodeObservationOneEntryRelationshipSUBJ(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EPISODE_OBSERVATION_ONE_ENTRY_RELATIONSHIP_SUBJ__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getEntryRelationshipTargets(vocab::x_ActRelationshipEntryRelationship::SUBJ, ccd::ProblemAct)->size() = 1"
			+ "  or self.getEntryRelationshipTargets(vocab::x_ActRelationshipEntryRelationship::SUBJ, ccd::SocialHistoryObservation)->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateEpisodeObservationOneEntryRelationshipSUBJ(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Episode Observation One Entry Relationship SUBJ</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEpisodeObservationOneEntryRelationshipSUBJ(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_EPISODE_OBSERVATION_ONE_ENTRY_RELATIONSHIP_SUBJ__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getEntryRelationshipTargets(vocab::x_ActRelationshipEntryRelationship::SUBJ, ccd::ProblemAct)->size() = 1
	 *   or self.getEntryRelationshipTargets(vocab::x_ActRelationshipEntryRelationship::SUBJ, ccd::SocialHistoryObservation)->size() = 1
	 * @param episodeObservation The receiving '<em><b>Episode Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateEpisodeObservationOneEntryRelationshipSUBJ(EpisodeObservation episodeObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_EPISODE_OBSERVATION_ONE_ENTRY_RELATIONSHIP_SUBJ__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.EPISODE_OBSERVATION);
			try {
				VALIDATE_EPISODE_OBSERVATION_ONE_ENTRY_RELATIONSHIP_SUBJ__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EPISODE_OBSERVATION_ONE_ENTRY_RELATIONSHIP_SUBJ__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_EPISODE_OBSERVATION_ONE_ENTRY_RELATIONSHIP_SUBJ__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			episodeObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, APITestValidator.DIAGNOSTIC_SOURCE,
					APITestValidator.EPISODE_OBSERVATION__EPISODE_OBSERVATION_ONE_ENTRY_RELATIONSHIP_SUBJ,
					APITestPlugin.INSTANCE.getString("EpisodeObservationOneEntryRelationshipSUBJ"),
					new Object[] { episodeObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEpisodeObservationExistsEntryRelationshipSAS(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Episode Observation Exists Entry Relationship SAS</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEpisodeObservationExistsEntryRelationshipSAS(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EPISODE_OBSERVATION_EXISTS_ENTRY_RELATIONSHIP_SAS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getEntryRelationshipTargets(vocab::x_ActRelationshipEntryRelationship::SAS, ccd::ProblemAct)->size() >0"
			+ "  or self.getEntryRelationshipTargets(vocab::x_ActRelationshipEntryRelationship::SAS, ccd::SocialHistoryObservation)->size() > 0";

	/**
	 * The cached OCL invariant for the '{@link #validateEpisodeObservationExistsEntryRelationshipSAS(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Episode Observation Exists Entry Relationship SAS</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEpisodeObservationExistsEntryRelationshipSAS(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_EPISODE_OBSERVATION_EXISTS_ENTRY_RELATIONSHIP_SAS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getEntryRelationshipTargets(vocab::x_ActRelationshipEntryRelationship::SAS, ccd::ProblemAct)->size() >0
	 *   or self.getEntryRelationshipTargets(vocab::x_ActRelationshipEntryRelationship::SAS, ccd::SocialHistoryObservation)->size() > 0
	 * @param episodeObservation The receiving '<em><b>Episode Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateEpisodeObservationExistsEntryRelationshipSAS(EpisodeObservation episodeObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_EPISODE_OBSERVATION_EXISTS_ENTRY_RELATIONSHIP_SAS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.EPISODE_OBSERVATION);
			try {
				VALIDATE_EPISODE_OBSERVATION_EXISTS_ENTRY_RELATIONSHIP_SAS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EPISODE_OBSERVATION_EXISTS_ENTRY_RELATIONSHIP_SAS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_EPISODE_OBSERVATION_EXISTS_ENTRY_RELATIONSHIP_SAS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			episodeObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, APITestValidator.DIAGNOSTIC_SOURCE,
					APITestValidator.EPISODE_OBSERVATION__EPISODE_OBSERVATION_EXISTS_ENTRY_RELATIONSHIP_SAS,
					APITestPlugin.INSTANCE.getString("EpisodeObservationExistsEntryRelationshipSAS"),
					new Object[] { episodeObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEpisodeObservationTemplateId(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Episode Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEpisodeObservationTemplateId(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EPISODE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.41')";

	/**
	 * The cached OCL invariant for the '{@link #validateEpisodeObservationTemplateId(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Episode Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEpisodeObservationTemplateId(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_EPISODE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.41')
	 * @param episodeObservation The receiving '<em><b>Episode Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateEpisodeObservationTemplateId(EpisodeObservation episodeObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_EPISODE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.EPISODE_OBSERVATION);
			try {
				VALIDATE_EPISODE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EPISODE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EPISODE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			episodeObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, APITestValidator.DIAGNOSTIC_SOURCE,
					APITestValidator.EPISODE_OBSERVATION__EPISODE_OBSERVATION_TEMPLATE_ID,
					APITestPlugin.INSTANCE.getString("EpisodeObservationTemplateId"),
					new Object[] { episodeObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEpisodeObservationClassCode(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Episode Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEpisodeObservationClassCode(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EPISODE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateEpisodeObservationClassCode(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Episode Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEpisodeObservationClassCode(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_EPISODE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.classCode=vocab::ActClassObservation::OBS
	 * @param episodeObservation The receiving '<em><b>Episode Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateEpisodeObservationClassCode(EpisodeObservation episodeObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_EPISODE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.EPISODE_OBSERVATION);
			try {
				VALIDATE_EPISODE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EPISODE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EPISODE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			episodeObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, APITestValidator.DIAGNOSTIC_SOURCE,
					APITestValidator.EPISODE_OBSERVATION__EPISODE_OBSERVATION_CLASS_CODE,
					APITestPlugin.INSTANCE.getString("EpisodeObservationClassCode"),
					new Object[] { episodeObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEpisodeObservationMoodCode(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Episode Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEpisodeObservationMoodCode(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EPISODE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateEpisodeObservationMoodCode(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Episode Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEpisodeObservationMoodCode(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_EPISODE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
	 * @param episodeObservation The receiving '<em><b>Episode Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateEpisodeObservationMoodCode(EpisodeObservation episodeObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_EPISODE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.EPISODE_OBSERVATION);
			try {
				VALIDATE_EPISODE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EPISODE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EPISODE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			episodeObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, APITestValidator.DIAGNOSTIC_SOURCE,
					APITestValidator.EPISODE_OBSERVATION__EPISODE_OBSERVATION_MOOD_CODE,
					APITestPlugin.INSTANCE.getString("EpisodeObservationMoodCode"), new Object[] { episodeObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEpisodeObservationCode(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Episode Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEpisodeObservationCode(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EPISODE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in ("
			+ "value.code = 'ASSERTION' and value.codeSystem = '2.16.840.1.113883.5.4'))";

	/**
	 * The cached OCL invariant for the '{@link #validateEpisodeObservationCode(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Episode Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEpisodeObservationCode(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_EPISODE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in (
	 * value.code = 'ASSERTION' and value.codeSystem = '2.16.840.1.113883.5.4'))
	 * @param episodeObservation The receiving '<em><b>Episode Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateEpisodeObservationCode(EpisodeObservation episodeObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_EPISODE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.EPISODE_OBSERVATION);
			try {
				VALIDATE_EPISODE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EPISODE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EPISODE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			episodeObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, APITestValidator.DIAGNOSTIC_SOURCE,
					APITestValidator.EPISODE_OBSERVATION__EPISODE_OBSERVATION_CODE,
					APITestPlugin.INSTANCE.getString("EpisodeObservationCode"), new Object[] { episodeObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEpisodeObservationStatusCode(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Episode Observation Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEpisodeObservationStatusCode(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EPISODE_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "
			+ "let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in ("
			+ "value.code = 'completed'))";

	/**
	 * The cached OCL invariant for the '{@link #validateEpisodeObservationStatusCode(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Episode Observation Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEpisodeObservationStatusCode(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_EPISODE_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in (
	 * value.code = 'completed'))
	 * @param episodeObservation The receiving '<em><b>Episode Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateEpisodeObservationStatusCode(EpisodeObservation episodeObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_EPISODE_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.EPISODE_OBSERVATION);
			try {
				VALIDATE_EPISODE_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EPISODE_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EPISODE_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			episodeObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, APITestValidator.DIAGNOSTIC_SOURCE,
					APITestValidator.EPISODE_OBSERVATION__EPISODE_OBSERVATION_STATUS_CODE,
					APITestPlugin.INSTANCE.getString("EpisodeObservationStatusCode"),
					new Object[] { episodeObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEpisodeObservationValue(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Episode Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEpisodeObservationValue(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EPISODE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "value.code = '404684003' and value.codeSystem = '2.16.840.1.113883.6.96'))";

	/**
	 * The cached OCL invariant for the '{@link #validateEpisodeObservationValue(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Episode Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEpisodeObservationValue(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_EPISODE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = element.oclAsType(datatypes::CD) in 
	 * value.code = '404684003' and value.codeSystem = '2.16.840.1.113883.6.96'))
	 * @param episodeObservation The receiving '<em><b>Episode Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateEpisodeObservationValue(EpisodeObservation episodeObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_EPISODE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.EPISODE_OBSERVATION);
			try {
				VALIDATE_EPISODE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EPISODE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EPISODE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			episodeObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, APITestValidator.DIAGNOSTIC_SOURCE,
					APITestValidator.EPISODE_OBSERVATION__EPISODE_OBSERVATION_VALUE,
					APITestPlugin.INSTANCE.getString("EpisodeObservationValue"), new Object[] { episodeObservation }));
			}
			return false;
		}
		return true;
	}

} // EpisodeObservationOperations
