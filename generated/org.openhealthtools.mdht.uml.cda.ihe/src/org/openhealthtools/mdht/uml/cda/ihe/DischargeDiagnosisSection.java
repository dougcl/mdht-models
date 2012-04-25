/*******************************************************************************
 * Copyright (c) 2009, 2011 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ihe;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.openhealthtools.mdht.uml.cda.Section;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discharge Diagnosis Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The discharge diagnosis section shall contain a narrative description of the conditions that need to be monitored after
 * discharge from the hospital and those that were resolved during the hospital course. It shall include entries for patient
 * conditions as described in the Entry Content Module.
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.ihe.IHEPackage#getDischargeDiagnosisSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='DischargeDiagnosisSectionTemplateId DischargeDiagnosisSectionCode DischargeDiagnosisSectionProblemConcernEntry' templateId.root='1.3.6.1.4.1.19376.1.5.3.1.3.7' code.codeSystemName='LOINC' code.displayName='HOSPITAL DISCHARGE DX' code.codeSystem='2.16.840.1.113883.6.1' code.code='11535-2'"
 * @generated
 */
public interface DischargeDiagnosisSection extends Section {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.3.7')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'1.3.6.1.4.1.19376.1.5.3.1.3.7\')'"
	 * @generated
	 */
	boolean validateDischargeDiagnosisSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
	 * value.code = '11535-2' and value.codeSystem = '2.16.840.1.113883.6.1')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in \r\nvalue.code = \'11535-2\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
	 * @generated
	 */
	boolean validateDischargeDiagnosisSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(ihe::ProblemConcernEntry))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(ihe::ProblemConcernEntry))'"
	 * @generated
	 */
	boolean validateDischargeDiagnosisSectionProblemConcernEntry(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(ihe::ProblemConcernEntry))->asSequence()->first().oclAsType(ihe::ProblemConcernEntry)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(ihe::ProblemConcernEntry))->asSequence()->first().oclAsType(ihe::ProblemConcernEntry)'"
	 * @generated
	 */
	ProblemConcernEntry getProblemConcernEntry();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DischargeDiagnosisSection init();
} // DischargeDiagnosisSection
