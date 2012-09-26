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
package org.openhealthtools.mdht.uml.cda.phcr.streppneumo.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.impl.ActImpl;

import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPackage;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPossibleExposureLocationAct;

import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.operations.StrepPneumoPossibleExposureLocationActOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Possible Exposure Location Act</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class StrepPneumoPossibleExposureLocationActImpl extends ActImpl implements StrepPneumoPossibleExposureLocationAct {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StrepPneumoPossibleExposureLocationActImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StrepPneumoPackage.Literals.STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrepPneumoPossibleExposureLocationActTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StrepPneumoPossibleExposureLocationActOperations.validateStrepPneumoPossibleExposureLocationActTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrepPneumoPossibleExposureLocationActClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StrepPneumoPossibleExposureLocationActOperations.validateStrepPneumoPossibleExposureLocationActClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrepPneumoPossibleExposureLocationActCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StrepPneumoPossibleExposureLocationActOperations.validateStrepPneumoPossibleExposureLocationActCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrepPneumoPossibleExposureLocationActMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StrepPneumoPossibleExposureLocationActOperations.validateStrepPneumoPossibleExposureLocationActMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrepPneumoPossibleExposureLocationActStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StrepPneumoPossibleExposureLocationActOperations.validateStrepPneumoPossibleExposureLocationActStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateStrepPneumoPossibleExposureLocationActStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return StrepPneumoPossibleExposureLocationActOperations.validateStrepPneumoPossibleExposureLocationActStatusCodeP(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrepPneumoPossibleExposureLocationAct init() {
	    return Initializer.Util.init(this);
	}

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StrepPneumoPossibleExposureLocationAct init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //StrepPneumoPossibleExposureLocationActImpl
