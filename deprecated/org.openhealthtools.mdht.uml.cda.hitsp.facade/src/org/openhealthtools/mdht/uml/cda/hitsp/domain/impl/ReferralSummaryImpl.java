/*******************************************************************************
 * Copyright (c) 2011, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.hitsp.domain.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.Authenticator;
import org.openhealthtools.mdht.uml.cda.Author;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.Component2;
import org.openhealthtools.mdht.uml.cda.Custodian;
import org.openhealthtools.mdht.uml.cda.DataEnterer;
import org.openhealthtools.mdht.uml.cda.InformationRecipient;
import org.openhealthtools.mdht.uml.cda.InfrastructureRootTypeId;
import org.openhealthtools.mdht.uml.cda.LegalAuthenticator;
import org.openhealthtools.mdht.uml.cda.RecordTarget;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IDomainPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IReferralSummary;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;
import org.openhealthtools.mdht.uml.hl7.datatypes.TS;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Referral Summary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ReferralSummaryImpl#getCDAType <em>CDA Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReferralSummaryImpl extends EObjectImpl implements IReferralSummary {
	/**
	 * The cached value of the '{@link #getCDAType() <em>CDA Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCDAType()
	 * @generated
	 * @ordered
	 */
	protected ClinicalDocument cDAType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferralSummaryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IDomainPackage.eINSTANCE.getReferralSummary();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalDocument getCDAType() {
		if (cDAType != null && cDAType.eIsProxy()) {
			InternalEObject oldCDAType = (InternalEObject) cDAType;
			cDAType = (ClinicalDocument) eResolveProxy(oldCDAType);
			if (cDAType != oldCDAType) {
			}
		}
		return cDAType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalDocument basicGetCDAType() {
		return cDAType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCDAType(ClinicalDocument newCDAType) {
		cDAType = newCDAType;
	}

	/**
	 * The cached OCL expression body for the '{@link #getAuthors() <em>Get Authors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthors()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_AUTHORS__EOCL_EXP = "self.getAuthors()->select(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author)).oclAsType(cda::Author)";

	/**
	 * The cached OCL query for the '{@link #getAuthors() <em>Get Authors</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthors()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_AUTHORS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Author> getAuthors() {
		if (GET_AUTHORS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getReferralSummary(),
				IDomainPackage.eINSTANCE.getReferralSummary().getEAllOperations().get(24));
			try {
				GET_AUTHORS__EOCL_QRY = helper.createQuery(GET_AUTHORS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_AUTHORS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Author> result = (Collection<Author>) query.evaluate(this);
		return new BasicEList.UnmodifiableEList<Author>(result.size(), result.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Author addAuthor() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.cda.CDAFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("Author");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		Author value = (Author) eObject;
		this.getCDAType().getAuthors().add(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IReferralSummary addAuthor(Author value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached OCL expression body for the '{@link #getCustodian() <em>Get Custodian</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustodian()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CUSTODIAN__EOCL_EXP = "self.getCustodians()->select(custodian : cda::Custodian | not custodian.oclIsUndefined() and custodian.oclIsKindOf(cda::Custodian))->asSequence()->first().oclAsType(cda::Custodian)";

	/**
	 * The cached OCL query for the '{@link #getCustodian() <em>Get Custodian</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustodian()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CUSTODIAN__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Custodian getCustodian() {
		if (GET_CUSTODIAN__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getReferralSummary(),
				IDomainPackage.eINSTANCE.getReferralSummary().getEAllOperations().get(27));
			try {
				GET_CUSTODIAN__EOCL_QRY = helper.createQuery(GET_CUSTODIAN__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CUSTODIAN__EOCL_QRY);
		return (Custodian) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Custodian withCustodian() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.cda.CDAFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("Custodian");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		Custodian value = (Custodian) eObject;
		this.getCDAType().setCustodian(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IReferralSummary setCustodian(Custodian value) {
		this.getCDAType().setCustodian(value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getTypeId() <em>Get Type Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_TYPE_ID__EOCL_EXP = "self.typeId.oclAsType(cda::InfrastructureRootTypeId)";

	/**
	 * The cached OCL query for the '{@link #getTypeId() <em>Get Type Id</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeId()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_TYPE_ID__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureRootTypeId getTypeId() {
		if (GET_TYPE_ID__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getReferralSummary(),
				IDomainPackage.eINSTANCE.getReferralSummary().getEAllOperations().get(0));
			try {
				GET_TYPE_ID__EOCL_QRY = helper.createQuery(GET_TYPE_ID__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_TYPE_ID__EOCL_QRY);
		return (InfrastructureRootTypeId) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureRootTypeId withTypeId() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.cda.CDAFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("InfrastructureRootTypeId");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		InfrastructureRootTypeId value = (InfrastructureRootTypeId) eObject;
		this.getCDAType().setTypeId(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IReferralSummary setTypeId(InfrastructureRootTypeId value) {
		this.getCDAType().setTypeId(value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getId() <em>Get Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ID__EOCL_EXP = "self.id.oclAsType(datatypes::II)";

	/**
	 * The cached OCL query for the '{@link #getId() <em>Get Id</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ID__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public II getId() {
		if (GET_ID__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getReferralSummary(),
				IDomainPackage.eINSTANCE.getReferralSummary().getEAllOperations().get(3));
			try {
				GET_ID__EOCL_QRY = helper.createQuery(GET_ID__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ID__EOCL_QRY);
		return (II) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public II withId() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("II");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		II value = (II) eObject;
		this.getCDAType().setId(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IReferralSummary setId(II value) {
		this.getCDAType().setId(value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getCode() <em>Get Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CODE__EOCL_EXP = "self.code.oclAsType(datatypes::CE)";

	/**
	 * The cached OCL query for the '{@link #getCode() <em>Get Code</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CODE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CE getCode() {
		if (GET_CODE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getReferralSummary(),
				IDomainPackage.eINSTANCE.getReferralSummary().getEAllOperations().get(6));
			try {
				GET_CODE__EOCL_QRY = helper.createQuery(GET_CODE__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CODE__EOCL_QRY);
		return (CE) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CE withCode() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("CE");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		CE value = (CE) eObject;
		this.getCDAType().setCode(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IReferralSummary setCode(CE value) {
		this.getCDAType().setCode(value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getTitle() <em>Get Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_TITLE__EOCL_EXP = "self.title.oclAsType(datatypes::ST)";

	/**
	 * The cached OCL query for the '{@link #getTitle() <em>Get Title</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_TITLE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ST getTitle() {
		if (GET_TITLE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getReferralSummary(),
				IDomainPackage.eINSTANCE.getReferralSummary().getEAllOperations().get(9));
			try {
				GET_TITLE__EOCL_QRY = helper.createQuery(GET_TITLE__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_TITLE__EOCL_QRY);
		return (ST) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ST withTitle() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("ST");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		ST value = (ST) eObject;
		this.getCDAType().setTitle(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IReferralSummary setTitle(ST value) {
		this.getCDAType().setTitle(value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getEffectiveTime() <em>Get Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveTime()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_EFFECTIVE_TIME__EOCL_EXP = "self.effectiveTime.oclAsType(datatypes::TS)";

	/**
	 * The cached OCL query for the '{@link #getEffectiveTime() <em>Get Effective Time</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveTime()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_EFFECTIVE_TIME__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TS getEffectiveTime() {
		if (GET_EFFECTIVE_TIME__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getReferralSummary(),
				IDomainPackage.eINSTANCE.getReferralSummary().getEAllOperations().get(12));
			try {
				GET_EFFECTIVE_TIME__EOCL_QRY = helper.createQuery(GET_EFFECTIVE_TIME__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_EFFECTIVE_TIME__EOCL_QRY);
		return (TS) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TS withEffectiveTime() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("TS");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		TS value = (TS) eObject;
		this.getCDAType().setEffectiveTime(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IReferralSummary setEffectiveTime(TS value) {
		this.getCDAType().setEffectiveTime(value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getConfidentialityCode() <em>Get Confidentiality Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidentialityCode()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONFIDENTIALITY_CODE__EOCL_EXP = "self.confidentialityCode.oclAsType(datatypes::CE)";

	/**
	 * The cached OCL query for the '{@link #getConfidentialityCode() <em>Get Confidentiality Code</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidentialityCode()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONFIDENTIALITY_CODE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CE getConfidentialityCode() {
		if (GET_CONFIDENTIALITY_CODE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getReferralSummary(),
				IDomainPackage.eINSTANCE.getReferralSummary().getEAllOperations().get(15));
			try {
				GET_CONFIDENTIALITY_CODE__EOCL_QRY = helper.createQuery(GET_CONFIDENTIALITY_CODE__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CONFIDENTIALITY_CODE__EOCL_QRY);
		return (CE) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CE withConfidentialityCode() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("CE");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		CE value = (CE) eObject;
		this.getCDAType().setConfidentialityCode(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IReferralSummary setConfidentialityCode(CE value) {
		this.getCDAType().setConfidentialityCode(value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getLanguageCode() <em>Get Language Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageCode()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_LANGUAGE_CODE__EOCL_EXP = "self.languageCode.oclAsType(datatypes::CS)";

	/**
	 * The cached OCL query for the '{@link #getLanguageCode() <em>Get Language Code</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageCode()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_LANGUAGE_CODE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CS getLanguageCode() {
		if (GET_LANGUAGE_CODE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getReferralSummary(),
				IDomainPackage.eINSTANCE.getReferralSummary().getEAllOperations().get(18));
			try {
				GET_LANGUAGE_CODE__EOCL_QRY = helper.createQuery(GET_LANGUAGE_CODE__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_LANGUAGE_CODE__EOCL_QRY);
		return (CS) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CS withLanguageCode() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("CS");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		CS value = (CS) eObject;
		this.getCDAType().setLanguageCode(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IReferralSummary setLanguageCode(CS value) {
		this.getCDAType().setLanguageCode(value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getRecordTargets() <em>Get Record Targets</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordTargets()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RECORD_TARGETS__EOCL_EXP = "self.getRecordTargets()->select(recordTarget : cda::RecordTarget | not recordTarget.oclIsUndefined() and recordTarget.oclIsKindOf(cda::RecordTarget)).oclAsType(cda::RecordTarget)";

	/**
	 * The cached OCL query for the '{@link #getRecordTargets() <em>Get Record Targets</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordTargets()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RECORD_TARGETS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RecordTarget> getRecordTargets() {
		if (GET_RECORD_TARGETS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getReferralSummary(),
				IDomainPackage.eINSTANCE.getReferralSummary().getEAllOperations().get(21));
			try {
				GET_RECORD_TARGETS__EOCL_QRY = helper.createQuery(GET_RECORD_TARGETS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_RECORD_TARGETS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<RecordTarget> result = (Collection<RecordTarget>) query.evaluate(this);
		return new BasicEList.UnmodifiableEList<RecordTarget>(result.size(), result.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecordTarget addRecordTarget() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.cda.CDAFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("RecordTarget");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		RecordTarget value = (RecordTarget) eObject;
		this.getCDAType().getRecordTargets().add(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IReferralSummary addRecordTarget(RecordTarget value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached OCL expression body for the '{@link #getComponent() <em>Get Component</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_COMPONENT__EOCL_EXP = "self.getComponent2s()->select(component2 : cda::Component2 | not component2.oclIsUndefined() and component2.oclIsKindOf(cda::Component2))->asSequence()->first().oclAsType(cda::Component2)";

	/**
	 * The cached OCL query for the '{@link #getComponent() <em>Get Component</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_COMPONENT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component2 getComponent() {
		if (GET_COMPONENT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getReferralSummary(),
				IDomainPackage.eINSTANCE.getReferralSummary().getEAllOperations().get(30));
			try {
				GET_COMPONENT__EOCL_QRY = helper.createQuery(GET_COMPONENT__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_COMPONENT__EOCL_QRY);
		return (Component2) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component2 withComponent() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.cda.CDAFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("Component2");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		Component2 value = (Component2) eObject;
		this.getCDAType().setComponent(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IReferralSummary setComponent(Component2 value) {
		this.getCDAType().setComponent(value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getDataEnterer() <em>Get Data Enterer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataEnterer()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DATA_ENTERER__EOCL_EXP = "self.getDataEnterers()->select(dataEnterer : cda::DataEnterer | not dataEnterer.oclIsUndefined() and dataEnterer.oclIsKindOf(cda::DataEnterer))->asSequence()->first().oclAsType(cda::DataEnterer)";

	/**
	 * The cached OCL query for the '{@link #getDataEnterer() <em>Get Data Enterer</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataEnterer()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DATA_ENTERER__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataEnterer getDataEnterer() {
		if (GET_DATA_ENTERER__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getReferralSummary(),
				IDomainPackage.eINSTANCE.getReferralSummary().getEAllOperations().get(33));
			try {
				GET_DATA_ENTERER__EOCL_QRY = helper.createQuery(GET_DATA_ENTERER__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_DATA_ENTERER__EOCL_QRY);
		return (DataEnterer) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataEnterer withDataEnterer() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.cda.CDAFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("DataEnterer");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		DataEnterer value = (DataEnterer) eObject;
		this.getCDAType().setDataEnterer(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IReferralSummary setDataEnterer(DataEnterer value) {
		this.getCDAType().setDataEnterer(value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getInformationRecipients() <em>Get Information Recipients</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformationRecipients()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INFORMATION_RECIPIENTS__EOCL_EXP = "self.getInformationRecipients()->select(informationRecipient : cda::InformationRecipient | not informationRecipient.oclIsUndefined() and informationRecipient.oclIsKindOf(cda::InformationRecipient)).oclAsType(cda::InformationRecipient)";

	/**
	 * The cached OCL query for the '{@link #getInformationRecipients() <em>Get Information Recipients</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformationRecipients()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INFORMATION_RECIPIENTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InformationRecipient> getInformationRecipients() {
		if (GET_INFORMATION_RECIPIENTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getReferralSummary(),
				IDomainPackage.eINSTANCE.getReferralSummary().getEAllOperations().get(36));
			try {
				GET_INFORMATION_RECIPIENTS__EOCL_QRY = helper.createQuery(GET_INFORMATION_RECIPIENTS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_INFORMATION_RECIPIENTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<InformationRecipient> result = (Collection<InformationRecipient>) query.evaluate(this);
		return new BasicEList.UnmodifiableEList<InformationRecipient>(result.size(), result.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationRecipient addInformationRecipient() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.cda.CDAFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("InformationRecipient");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		InformationRecipient value = (InformationRecipient) eObject;
		this.getCDAType().getInformationRecipients().add(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IReferralSummary addInformationRecipient(InformationRecipient value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached OCL expression body for the '{@link #getLegalAuthenticator() <em>Get Legal Authenticator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegalAuthenticator()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_LEGAL_AUTHENTICATOR__EOCL_EXP = "self.getLegalAuthenticators()->select(legalAuthenticator : cda::LegalAuthenticator | not legalAuthenticator.oclIsUndefined() and legalAuthenticator.oclIsKindOf(cda::LegalAuthenticator))->asSequence()->first().oclAsType(cda::LegalAuthenticator)";

	/**
	 * The cached OCL query for the '{@link #getLegalAuthenticator() <em>Get Legal Authenticator</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegalAuthenticator()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_LEGAL_AUTHENTICATOR__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegalAuthenticator getLegalAuthenticator() {
		if (GET_LEGAL_AUTHENTICATOR__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getReferralSummary(),
				IDomainPackage.eINSTANCE.getReferralSummary().getEAllOperations().get(39));
			try {
				GET_LEGAL_AUTHENTICATOR__EOCL_QRY = helper.createQuery(GET_LEGAL_AUTHENTICATOR__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_LEGAL_AUTHENTICATOR__EOCL_QRY);
		return (LegalAuthenticator) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegalAuthenticator withLegalAuthenticator() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.cda.CDAFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("LegalAuthenticator");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		LegalAuthenticator value = (LegalAuthenticator) eObject;
		this.getCDAType().setLegalAuthenticator(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IReferralSummary setLegalAuthenticator(LegalAuthenticator value) {
		this.getCDAType().setLegalAuthenticator(value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getAuthenticators() <em>Get Authenticators</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticators()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_AUTHENTICATORS__EOCL_EXP = "self.getAuthenticators()->select(authenticator : cda::Authenticator | not authenticator.oclIsUndefined() and authenticator.oclIsKindOf(cda::Authenticator)).oclAsType(cda::Authenticator)";

	/**
	 * The cached OCL query for the '{@link #getAuthenticators() <em>Get Authenticators</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticators()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_AUTHENTICATORS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Authenticator> getAuthenticators() {
		if (GET_AUTHENTICATORS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getReferralSummary(),
				IDomainPackage.eINSTANCE.getReferralSummary().getEAllOperations().get(42));
			try {
				GET_AUTHENTICATORS__EOCL_QRY = helper.createQuery(GET_AUTHENTICATORS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_AUTHENTICATORS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Authenticator> result = (Collection<Authenticator>) query.evaluate(this);
		return new BasicEList.UnmodifiableEList<Authenticator>(result.size(), result.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Authenticator addAuthenticator() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.cda.CDAFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("Authenticator");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		Authenticator value = (Authenticator) eObject;
		this.getCDAType().getAuthenticators().add(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IReferralSummary addAuthenticator(Authenticator value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IDomainPackage.REFERRAL_SUMMARY__CDA_TYPE:
				if (resolve) {
					return getCDAType();
				}
				return basicGetCDAType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IDomainPackage.REFERRAL_SUMMARY__CDA_TYPE:
				setCDAType((ClinicalDocument) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case IDomainPackage.REFERRAL_SUMMARY__CDA_TYPE:
				setCDAType((ClinicalDocument) null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IDomainPackage.REFERRAL_SUMMARY__CDA_TYPE:
				return cDAType != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * The cached environment for evaluating OCL expressions.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final OCL EOCL_ENV = OCL.newInstance();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IReferralSummary init() {
		CDAUtil.init(this);
		return this;
	}
} // ReferralSummaryImpl
