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
package org.openhealthtools.mdht.uml.cda.phcr.anthrax.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPackage;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxSignsAndSymptomsObservation;

import org.openhealthtools.mdht.uml.cda.phcr.anthrax.operations.AnthraxSignsAndSymptomsObservationOperations;

import org.openhealthtools.mdht.uml.cda.phcr.impl.SignsAndSymptomsObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signs And Symptoms Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AnthraxSignsAndSymptomsObservationImpl extends SignsAndSymptomsObservationImpl implements AnthraxSignsAndSymptomsObservation {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected AnthraxSignsAndSymptomsObservationImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return AnthraxPackage.Literals.ANTHRAX_SIGNS_AND_SYMPTOMS_OBSERVATION;
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAnthraxSignsAndSymptomsObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AnthraxSignsAndSymptomsObservationOperations.validateAnthraxSignsAndSymptomsObservationValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public boolean validateSignsAndSymptomsObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return AnthraxSignsAndSymptomsObservationOperations.validateSignsAndSymptomsObservationTemplateId(this, diagnostics, context);
  }
} //AnthraxSignsAndSymptomsObservationImpl
