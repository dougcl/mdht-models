/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer;

import org.openhealthtools.mdht.uml.cda.consol.operations.VitalSignsOrganizerOperations;

import org.openhealthtools.mdht.uml.cda.impl.OrganizerImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vital Signs Organizer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class VitalSignsOrganizerImpl extends OrganizerImpl implements VitalSignsOrganizer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VitalSignsOrganizerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.VITAL_SIGNS_ORGANIZER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizerCodeValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignsOrganizerOperations.validateVitalSignsOrganizerCodeValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizerComponentElement(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignsOrganizerOperations.validateVitalSignsOrganizerComponentElement(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizerInformationSource(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignsOrganizerOperations.validateVitalSignsOrganizerInformationSource(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizerRequireResultsOrganizerTemplateID(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return VitalSignsOrganizerOperations.validateVitalSignsOrganizerRequireResultsOrganizerTemplateID(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizerTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignsOrganizerOperations.validateVitalSignsOrganizerTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizerClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignsOrganizerOperations.validateVitalSignsOrganizerClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizerMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignsOrganizerOperations.validateVitalSignsOrganizerMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizerId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignsOrganizerOperations.validateVitalSignsOrganizerId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizerCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignsOrganizerOperations.validateVitalSignsOrganizerCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizerStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignsOrganizerOperations.validateVitalSignsOrganizerStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizerEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignsOrganizerOperations.validateVitalSignsOrganizerEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizerVitalSignObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return VitalSignsOrganizerOperations.validateVitalSignsOrganizerVitalSignObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VitalSignObservation> getVitalSignObservations() {
		return VitalSignsOrganizerOperations.getVitalSignObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VitalSignsOrganizer init() {
		CDAUtil.init(this);
		return this;
	}
} // VitalSignsOrganizerImpl
