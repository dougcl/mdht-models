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
package org.openhealthtools.mdht.uml.cda.ihe.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.ccd.impl.PlanOfCareActivityProcedureImpl;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.InternalReference;
import org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntryPlanOfCareActivityProcedure;
import org.openhealthtools.mdht.uml.cda.ihe.operations.ProcedureEntryOperations;
import org.openhealthtools.mdht.uml.cda.ihe.operations.ProcedureEntryPlanOfCareActivityProcedureOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure Entry Plan Of Care Activity Procedure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ProcedureEntryPlanOfCareActivityProcedureImpl extends PlanOfCareActivityProcedureImpl implements
		ProcedureEntryPlanOfCareActivityProcedure {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected ProcedureEntryPlanOfCareActivityProcedureImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return IHEPackage.Literals.PROCEDURE_ENTRY_PLAN_OF_CARE_ACTIVITY_PROCEDURE;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateProcedureEntryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureEntryOperations.validateProcedureEntryMoodCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateProcedureEntryHasTextReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureEntryOperations.validateProcedureEntryHasTextReference(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateProcedureEntryPriorityCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureEntryOperations.validateProcedureEntryPriorityCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateProcedureEntryHasInversionIndForEncounter(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureEntryOperations.validateProcedureEntryHasInversionIndForEncounter(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateProcedureEntryTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureEntryOperations.validateProcedureEntryTemplateId(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateProcedureEntryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureEntryOperations.validateProcedureEntryClassCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateProcedureEntryText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureEntryOperations.validateProcedureEntryText(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateProcedureEntryApproachSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureEntryOperations.validateProcedureEntryApproachSiteCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateProcedureEntryInternalReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureEntryOperations.validateProcedureEntryInternalReference(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateProcedureEntryInternalReferenceReason(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureEntryOperations.validateProcedureEntryInternalReferenceReason(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public InternalReference getInternalReference() {
		return ProcedureEntryOperations.getInternalReference(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public EList<InternalReference> getInternalReferenceReasons() {
		return ProcedureEntryOperations.getInternalReferenceReasons(this);
	}

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @generated
	*/
	@Override
	public boolean validatePlanOfCareActivityProcedureMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureEntryPlanOfCareActivityProcedureOperations.validatePlanOfCareActivityProcedureMoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcedureEntryPlanOfCareActivityProcedure init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcedureEntryPlanOfCareActivityProcedure init(
			Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ProcedureEntryPlanOfCareActivityProcedureImpl
