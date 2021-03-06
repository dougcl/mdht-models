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
package org.openhealthtools.mdht.uml.cda.apitest.domain;

import org.eclipse.emf.common.util.EList;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IProblem Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>This section makes use of the linking, severity, clinical status and comment content specifications defined elsewhere in the technical framework. In HL7 RIM parlance, observations about a problem, complaint, symptom, finding, diagnosis, or functional limitation of a patient is the event (moodCode='EVN') of observing (&lt;observation classCode='OBS'>) that problem. The &lt;value> of the observation comes from a controlled vocabulary representing such things. The &lt;code> contained within the &lt;observation> describes the method of determination from yet another controlled vocabulary.</p>
 * 
 * <p>The basic pattern for reporting a problem uses the CDA &lt;observation> element, setting the classCode='OBS' to represent that this is an observation of a problem, and the moodCode='EVN', to represent that this is an observation that has in fact taken place. The negationInd attribute, if true, specifies that the problem indicated was observed to not have occurred (which is subtly but importantly different from having not been observed). The value of negationInd should not normally be set to true. Instead, to record that there is "no prior history of chicken pox", one would use a coded value indicated exactly that. However, it is not always possible to record problems in this manner, especially if using a controlled vocabulary that does not supply pre-coordinated negations , or which do not allow the negation to be recorded with post-coordinated coded terminology.</p>
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IProblemEntry#getCDAType <em>CDA Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.DomainPackage#getIProblemEntry()
 * @generated
 */
public interface IProblemEntry {
	/**
	 * Returns the value of the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CDA Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CDA Type</em>' reference.
	 * @see #setCDAType(Observation)
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.DomainPackage#getIProblemEntry_CDAType()
	 * @generated
	 */
	Observation getCDAType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IProblemEntry#getCDAType <em>CDA Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CDA Type</em>' reference.
	 * @see #getCDAType()
	 * @generated
	 */
	void setCDAType(Observation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Observation::id.
	 * The specific observation being recorded must have an identifier (&lt;id>) that shall be provided for tracking purposes. If the source EMR does not or cannot supply an intrinsic identifier, then a GUID shall be provided as the root, with no extension (e.g., &lt;id root='CE1215CD-69EC-4C7B-805F-569233C5E159'/>). At least one identifier must be present, more than one may appear.
	 * self.id.oclAsType(datatypes::II)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<II> getIds();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition Entry SHALL contain at least one [1..*] id.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	II addId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition Entry SHALL contain at least one [1..*] id.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProblemEntry addId(II value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Observation::code.
	 * This is a fixed value indicating the level of medical judgment used to determine the existence of a problem.
	 * self.code.oclAsType(datatypes::CD)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CD getProblemType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition Entry SHOULD contain exactly one [1..1] code, which SHOULD be selected from ValueSet 2.16.840.1.113883.3.88.12.3221.7.2 Problem Type STATIC 1.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CD withProblemType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition Entry SHOULD contain exactly one [1..1] code, which SHOULD be selected from ValueSet 2.16.840.1.113883.3.88.12.3221.7.2 Problem Type STATIC 1.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProblemEntry withProblemType(CD value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Observation::text.
	 * <p>This is a text description of the problem suffered.</p>
	 * <p>The &lt;text> element is required and points to the text describing the problem being recorded; including any dates, comments, et cetera. The &lt;reference> contains a URI in value attribute. This URI points to the free text description of the problem in the document that is being described.</p>
	 * self.text.oclAsType(datatypes::ED)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ED getProblemName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition Entry SHALL contain exactly one [1..1] text.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ED withProblemName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition Entry SHALL contain exactly one [1..1] text.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProblemEntry withProblemName(ED value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Observation::effectiveTime.
	 * <p>This is the range of time of which the problem was active for the patient or subject.</p>
	 * 
	 * <p>The &lt;effectiveTime> of this &lt;observation> is the time interval over which the &lt;observation> is known to be true. The &lt;low> and &lt;high> values should be no more precise than known, but as precise as possible. While CDA allows for multiple mechanisms to record this time interval (e.g., by low and high values, low and width, high and width, or center point and width), we are constraining Medical summaries to use only the low/high form. The &lt;low> value is the earliest point for which the condition is known to have existed. The &lt;high> value, when present, indicates the time at which the observation was no longer known to be true. Thus, the implication is made that if the &lt;high> value is specified, that the observation was no longer seen after this time, and it thus represents the date of resolution of the problem. Similarly, the &lt;low> value may seem to represent onset of the problem. Neither of these statements is necessarily precise, as the &lt;low> and &lt;high> values may represent only an approximation of the true onset and resolution (respectively) times. For example, it may be the case that onset occurred prior to the &lt;low> value, but no observation may have been possible before that time to discern whether the condition existed prior to that time. The &lt;low> value should normally be present. There are exceptions, such as for the case where the patient may be able to report that they had chicken pox, but are unsure when. In this case, the &lt;effectiveTime> element shall have a &lt;low> element with a nullFlavor attribute set to 'UNK'. The &lt;high> value need not be present when the observation is about a state of the patient that is unlikely to change (e.g., the diagnosis of an incurable disease).</p>
	 * self.effectiveTime.oclAsType(datatypes::IVL_TS)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVL_TS getProblemDate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition Entry SHOULD contain exactly one [1..1] effectiveTime.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVL_TS withProblemDate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition Entry SHOULD contain exactly one [1..1] effectiveTime.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProblemEntry withProblemDate(IVL_TS value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Observation::value.
	 * This value is a code describing the problem according to a specific vocabulary of problems.
	 * self.value.oclAsType(datatypes::CD)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CD getProblemCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition Entry SHALL contain exactly one [1..1] value, which SHALL be selected from ValueSet 2.16.840.1.113883.3.88.12.3221.7.4 Problem STATIC 1.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CD withProblemCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition Entry SHALL contain exactly one [1..1] value, which SHALL be selected from ValueSet 2.16.840.1.113883.3.88.12.3221.7.4 Problem STATIC 1.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProblemEntry withProblemCode(CD value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * apitest::ConditionEntry::ageObservation.
	 * The age of the patient or subject at onset of the condition.
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(domain::IAgeObservation))->asSequence()->first().oclAsType(domain::IAgeObservation)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IAgeObservation getAgeAtOnset();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition Entry MAY contain zero or one [0..1] entryRelationship (CONF-160), such that Contains @typeCode="SUBJ" SUBJ (has subject), and Contains exactly one [1..1] Age Observation (templateId: 2.16.840.1.113883.10.20.1.38).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IAgeObservation withAgeAtOnset();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition Entry MAY contain zero or one [0..1] entryRelationship (CONF-160), such that Contains @typeCode="SUBJ" SUBJ (has subject), and Contains exactly one [1..1] Age Observation (templateId: 2.16.840.1.113883.10.20.1.38).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProblemEntry withAgeAtOnset(IAgeObservation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * apitest::ConditionEntry::severity.
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(domain::ISeverity))->asSequence()->first().oclAsType(domain::ISeverity)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ISeverity getSeverity();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition Entry MAY contain zero or one [0..1] entryRelationship, such that Contains exactly one [1..1] Severity (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.1).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ISeverity withSeverity();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition Entry MAY contain zero or one [0..1] entryRelationship, such that Contains exactly one [1..1] Severity (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.1).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProblemEntry withSeverity(ISeverity value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * apitest::ConditionEntry::problemStatusObservation.
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(domain::IProblemStatusObservation))->asSequence()->first().oclAsType(domain::IProblemStatusObservation)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProblemStatusObservation getProblemStatus();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition Entry MAY contain zero or one [0..1] entryRelationship, such that Contains @typeCode="REFR" REFR (refers to), and Contains exactly one [1..1] Problem Status Observation (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.1.1).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProblemStatusObservation withProblemStatus();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition Entry MAY contain zero or one [0..1] entryRelationship, such that Contains @typeCode="REFR" REFR (refers to), and Contains exactly one [1..1] Problem Status Observation (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.1.1).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProblemEntry withProblemStatus(IProblemStatusObservation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * apitest::ConditionEntry::healthStatusObservation.
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(domain::IHealthStatusObservation))->asSequence()->first().oclAsType(domain::IHealthStatusObservation)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IHealthStatusObservation getHealthStatusObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition Entry MAY contain zero or one [0..1] entryRelationship, such that Contains @typeCode="REFR" REFR (refers to), and Contains exactly one [1..1] Health Status Observation (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.1.2).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IHealthStatusObservation withHealthStatusObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition Entry MAY contain zero or one [0..1] entryRelationship, such that Contains @typeCode="REFR" REFR (refers to), and Contains exactly one [1..1] Health Status Observation (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.1.2).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProblemEntry withHealthStatusObservation(IHealthStatusObservation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * apitest::ConditionEntry::comment.
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(domain::IComment)).oclAsType(domain::IComment)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<IComment> getComments();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition Entry MAY contain zero or more [0..*] entryRelationship, such that Contains @typeCode="SUBJ" SUBJ (has subject), and Contains exactly one [1..1] Comment (templateId: 2.16.840.1.113883.3.88.11.83.11).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IComment addComment();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition Entry MAY contain zero or more [0..*] entryRelationship, such that Contains @typeCode="SUBJ" SUBJ (has subject), and Contains exactly one [1..1] Comment (templateId: 2.16.840.1.113883.3.88.11.83.11).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProblemEntry addComment(IComment value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * apitest::ConditionEntry::causeOfDeathObservation.
	 * Indicates that this problem was one of the causes of death for the patient or subject of the condition.
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(domain::ICauseOfDeathObservation))->asSequence()->first().oclAsType(domain::ICauseOfDeathObservation)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ICauseOfDeathObservation getCauseOfDeath();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition Entry MAY contain zero or one [0..1] entryRelationship, such that Contains @typeCode="CAUS" CAUS (is etiology for), and Contains exactly one [1..1] Cause Of Death Observation (templateId: 2.16.840.1.113883.10.20.1.42).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ICauseOfDeathObservation withCauseOfDeath();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition Entry MAY contain zero or one [0..1] entryRelationship, such that Contains @typeCode="CAUS" CAUS (is etiology for), and Contains exactly one [1..1] Cause Of Death Observation (templateId: 2.16.840.1.113883.10.20.1.42).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProblemEntry withCauseOfDeath(ICauseOfDeathObservation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProblemEntry init();
} // IProblemEntry
