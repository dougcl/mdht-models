/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vital Signs Organizer2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getVitalSignsOrganizer2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='VitalSignsOrganizerTemplateId VitalSignsOrganizerCode VitalSignsOrganizerVitalSignObservation' templateId.root='2.16.840.1.113883.10.20.22.4.26' templateId.extension='2014-06-09' code.code='74728-7' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Vital signs, weight, height, head circumference, oximetry, BMI, and BSA panel - HL7.CCDAr1.1' constraints.validation.info='VitalSignsOrganizerCodeP VitalSignsOrganizerEffectiveTime' constraints.validation.dependOn.VitalSignsOrganizerCode='VitalSignsOrganizerCodeP' constraints.validation.warning='VitalSignsOrganizer2AuthorParticipation'"
 * @generated
 */
public interface VitalSignsOrganizer2 extends VitalSignsOrganizer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))'"
	 * @generated
	 */
	boolean validateVitalSignsOrganizer2AuthorParticipation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::VitalSignObservation2)).oclAsType(consol::VitalSignObservation2)'"
	 * @generated
	 */
	EList<VitalSignObservation2> getConsolVitalSignObservation2s();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VitalSignsOrganizer2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VitalSignsOrganizer2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // VitalSignsOrganizer2
