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
package org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.ccd.impl.ProblemObservationImpl;

import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisRelevantMedicalConditionProblemObservation;

import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.operations.TuberculosisRelevantMedicalConditionProblemObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relevant Medical Condition Problem Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TuberculosisRelevantMedicalConditionProblemObservationImpl extends ProblemObservationImpl implements TuberculosisRelevantMedicalConditionProblemObservation
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected TuberculosisRelevantMedicalConditionProblemObservationImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return TuberculosisPackage.Literals.TUBERCULOSIS_RELEVANT_MEDICAL_CONDITION_PROBLEM_OBSERVATION;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisRelevantMedicalConditionProblemObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return TuberculosisRelevantMedicalConditionProblemObservationOperations.validateTuberculosisRelevantMedicalConditionProblemObservationCode(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean validateProblemObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return TuberculosisRelevantMedicalConditionProblemObservationOperations.validateProblemObservationTemplateId(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
public TuberculosisRelevantMedicalConditionProblemObservation init() {
	    return Initializer.Util.init(this);
	}

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public TuberculosisRelevantMedicalConditionProblemObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //TuberculosisRelevantMedicalConditionProblemObservationImpl
