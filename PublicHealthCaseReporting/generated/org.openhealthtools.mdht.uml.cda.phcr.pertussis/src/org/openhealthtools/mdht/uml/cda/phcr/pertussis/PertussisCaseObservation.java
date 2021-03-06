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
package org.openhealthtools.mdht.uml.cda.phcr.pertussis;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.phcr.CaseObservation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisPackage#getPertussisCaseObservation()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='PertussisCaseObservationTemplateId PertussisCaseObservationValue PertussisCaseObservationValueP' templateId.root='2.16.840.1.113883.10.20.15.3.65' value.code='27836007' value.codeSystem='2.16.840.1.113883.6.96' value.codeSystemName='SNOMEDCT' value.displayName='Pertussis' constraints.validation.dependOn.PertussisCaseObservationValue='PertussisCaseObservationValueP' constraints.validation.warning='PertussisCaseObservationPertussisSignsAndSymptomsObservation'"
 * @generated
 */
public interface PertussisCaseObservation extends CaseObservation {
	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())'"
	 * @generated
	 */
  boolean validatePertussisCaseObservationValueP(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = element.oclAsType(datatypes::CD) in 
	 * value.code = '27836007' and value.codeSystem = '2.16.840.1.113883.6.96'))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and \r\nlet value : datatypes::CD = element.oclAsType(datatypes::CD) in \r\nvalue.code = \'27836007\' and value.codeSystem = \'2.16.840.1.113883.6.96\'))'"
	 * @generated
	 */
  boolean validatePertussisCaseObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(pertussis::PertussisSignsAndSymptomsObservation))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(pertussis::PertussisSignsAndSymptomsObservation))'"
	 * @generated
	 */
	boolean validatePertussisCaseObservationPertussisSignsAndSymptomsObservation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(pertussis::PertussisSignsAndSymptomsObservation)).oclAsType(pertussis::PertussisSignsAndSymptomsObservation)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(pertussis::PertussisSignsAndSymptomsObservation)).oclAsType(pertussis::PertussisSignsAndSymptomsObservation)'"
	 * @generated
	 */
	EList<PertussisSignsAndSymptomsObservation> getPertussisSignsAndSymptomsObservations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PertussisCaseObservation init();

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PertussisCaseObservation init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // PertussisCaseObservation
