/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allergies Section Entries Optional2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getAllergiesSectionEntriesOptional2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='AllergiesSectionEntriesOptionalTemplateId AllergiesSectionEntriesOptionalCode AllergiesSectionEntriesOptionalCodeP' templateId.root='2.16.840.1.113883.10.20.22.2.6' templateId.extension='2014-06-09' code.code='48765-2' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Allergies, adverse reactions, alerts' constraints.validation.dependOn.AllergiesSectionEntriesOptionalCode='AllergiesSectionEntriesOptionalCodeP' constraints.validation.warning='AllergiesSectionEntriesOptionalAllergyProblemAct'"
 * @generated
 */
public interface AllergiesSectionEntriesOptional2 extends AllergiesSectionEntriesOptional {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::AllergyConcernAct2)).oclAsType(consol::AllergyConcernAct2)'"
	 * @generated
	 */
	EList<AllergyConcernAct2> getConsolAllergyConcernAct2s();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllergiesSectionEntriesOptional2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllergiesSectionEntriesOptional2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // AllergiesSectionEntriesOptional2
