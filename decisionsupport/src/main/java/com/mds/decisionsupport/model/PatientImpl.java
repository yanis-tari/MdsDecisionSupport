

package com.mds.decisionsupport.model;

/*

import com.hp.hpl.jena.datatypes.xsd.*;
import com.hp.hpl.jena.datatypes.xsd.impl.*;
*/

import com.hp.hpl.jena.rdf.model.*;
import com.hp.hpl.jena.vocabulary.RDF;
import com.ibm.adtech.jastor.*;
import com.ibm.adtech.jastor.util.*;


/**
 * Implementation of {@link com.mds.decisionsupport.model.Patient}
 * Use the com.mds.decisionsupport.model.MdsFactory to create instances of this class.
 * <p>(URI: http://ontology/mds#Patient)</p>
 * <br>
 */
@SuppressWarnings({ "rawtypes", "unchecked" })
public class PatientImpl extends com.ibm.adtech.jastor.ThingImpl implements com.mds.decisionsupport.model.Patient, java.io.Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static com.hp.hpl.jena.rdf.model.Property lastNameProperty = ResourceFactory.createProperty("http://ontology/mds#lastName");
	private java.lang.String lastName;
	private static com.hp.hpl.jena.rdf.model.Property birthDateProperty = ResourceFactory.createProperty("http://ontology/mds#birthDate");
	private com.hp.hpl.jena.datatypes.xsd.XSDDateTime birthDate;
	private static com.hp.hpl.jena.rdf.model.Property emailProperty = ResourceFactory.createProperty("http://ontology/mds#email");
	private java.lang.String email;
	private static com.hp.hpl.jena.rdf.model.Property firstNameProperty = ResourceFactory.createProperty("http://ontology/mds#firstName");
	private java.lang.String firstName;
	private static com.hp.hpl.jena.rdf.model.Property adressProperty = ResourceFactory.createProperty("http://ontology/mds#adress");
	private java.math.BigInteger adress;
	private static com.hp.hpl.jena.rdf.model.Property phoneNumberProperty = ResourceFactory.createProperty("http://ontology/mds#phoneNumber");
	private java.lang.String phoneNumber;
	private static com.hp.hpl.jena.rdf.model.Property medicalRecordOfPatientProperty = ResourceFactory.createProperty("http://ontology/mds#medicalRecordOfPatient");
	private java.util.ArrayList medicalRecordOfPatient;
 
	public PatientImpl() {
    }
	
	PatientImpl(Resource resource, Model model) throws JastorException {
		super(resource, model);
		setupModelListener();
	}     
    	
	static PatientImpl getPatient(Resource resource, Model model) throws JastorException {
		return new PatientImpl(resource, model);
	}
	    
	static PatientImpl createPatient(Resource resource, Model model) throws JastorException { 
		PatientImpl impl = new PatientImpl(resource, model);
		
		if (!impl._model.contains(new com.hp.hpl.jena.rdf.model.impl.StatementImpl(impl._resource, RDF.type, Patient.TYPE)))
			impl._model.add(impl._resource, RDF.type, Patient.TYPE);
		impl.addSuperTypes();
		impl.addHasValueValues();
		return impl;
	}
	
	void addSuperTypes() {
		if (!_model.contains(_resource, RDF.type, com.mds.decisionsupport.model.NaturalPerson.TYPE))
			_model.add(new com.hp.hpl.jena.rdf.model.impl.StatementImpl(_resource, RDF.type, com.mds.decisionsupport.model.NaturalPerson.TYPE));     
	}
   
	void addHasValueValues() {
	}
    
    private void setupModelListener() {
    	listeners = new java.util.ArrayList();
    	com.mds.decisionsupport.model.MdsFactory.registerThing(this);
    }

	public java.util.List listStatements() {
		java.util.List list = new java.util.ArrayList();
		StmtIterator it = null;
		it = _model.listStatements(_resource,lastNameProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,birthDateProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,emailProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,firstNameProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,adressProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,phoneNumberProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,medicalRecordOfPatientProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,RDF.type, com.mds.decisionsupport.model.Patient.TYPE);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,RDF.type, com.mds.decisionsupport.model.NaturalPerson.TYPE);
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
	
	public void clearCache() {
		lastName = null;
		birthDate = null;
		email = null;
		firstName = null;
		adress = null;
		phoneNumber = null;
		medicalRecordOfPatient = null;
	}

	private com.hp.hpl.jena.rdf.model.Literal createLiteral(Object obj) {
		return _model.createTypedLiteral(obj);
	}

	public java.lang.String getLastName() throws JastorException {
		if (lastName != null)
			return lastName;
		com.hp.hpl.jena.rdf.model.Statement stmt = _model.getProperty(_resource, lastNameProperty);
		if (stmt == null)
			return null;
		if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
			throw new JastorInvalidRDFNodeException(uri() + ": lastName getProperty() in com.mds.decisionsupport.model.Patient model not Literal", stmt.getObject());
		com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
		Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
		lastName = (java.lang.String)obj;
		return lastName;
	}
	
	public void setLastName(java.lang.String lastName) throws JastorException {
		if (_model.contains(_resource,lastNameProperty)) {
			_model.removeAll(_resource,lastNameProperty,null);
		}
		this.lastName = lastName;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
		if (lastName != null) {
			_model.add(_model.createStatement(_resource,lastNameProperty, createLiteral(lastName)));
		}	
	}

	public com.hp.hpl.jena.datatypes.xsd.XSDDateTime getBirthDate() throws JastorException {
		if (birthDate != null)
			return birthDate;
		com.hp.hpl.jena.rdf.model.Statement stmt = _model.getProperty(_resource, birthDateProperty);
		if (stmt == null)
			return null;
		if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
			throw new JastorInvalidRDFNodeException(uri() + ": birthDate getProperty() in com.mds.decisionsupport.model.Patient model not Literal", stmt.getObject());
		com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
		Object obj = Util.fixLiteral(true,literal,"com.hp.hpl.jena.datatypes.xsd.XSDDateTime","http://www.w3.org/2001/XMLSchema#dateTime");
		birthDate = (com.hp.hpl.jena.datatypes.xsd.XSDDateTime)obj;
		return birthDate;
	}
	
	public void setBirthDate(com.hp.hpl.jena.datatypes.xsd.XSDDateTime birthDate) throws JastorException {
		if (_model.contains(_resource,birthDateProperty)) {
			_model.removeAll(_resource,birthDateProperty,null);
		}
		this.birthDate = birthDate;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
		if (birthDate != null) {
			_model.add(_model.createStatement(_resource,birthDateProperty, createLiteral(birthDate)));
		}	
	}

	public java.lang.String getEmail() throws JastorException {
		if (email != null)
			return email;
		com.hp.hpl.jena.rdf.model.Statement stmt = _model.getProperty(_resource, emailProperty);
		if (stmt == null)
			return null;
		if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
			throw new JastorInvalidRDFNodeException(uri() + ": email getProperty() in com.mds.decisionsupport.model.Patient model not Literal", stmt.getObject());
		com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
		Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
		email = (java.lang.String)obj;
		return email;
	}
	
	public void setEmail(java.lang.String email) throws JastorException {
		if (_model.contains(_resource,emailProperty)) {
			_model.removeAll(_resource,emailProperty,null);
		}
		this.email = email;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
		if (email != null) {
			_model.add(_model.createStatement(_resource,emailProperty, createLiteral(email)));
		}	
	}

	public java.lang.String getFirstName() throws JastorException {
		if (firstName != null)
			return firstName;
		com.hp.hpl.jena.rdf.model.Statement stmt = _model.getProperty(_resource, firstNameProperty);
		if (stmt == null)
			return null;
		if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
			throw new JastorInvalidRDFNodeException(uri() + ": firstName getProperty() in com.mds.decisionsupport.model.Patient model not Literal", stmt.getObject());
		com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
		Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
		firstName = (java.lang.String)obj;
		return firstName;
	}
	
	public void setFirstName(java.lang.String firstName) throws JastorException {
		if (_model.contains(_resource,firstNameProperty)) {
			_model.removeAll(_resource,firstNameProperty,null);
		}
		this.firstName = firstName;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
		if (firstName != null) {
			_model.add(_model.createStatement(_resource,firstNameProperty, createLiteral(firstName)));
		}	
	}

	public java.math.BigInteger getAdress() throws JastorException {
		if (adress != null)
			return adress;
		com.hp.hpl.jena.rdf.model.Statement stmt = _model.getProperty(_resource, adressProperty);
		if (stmt == null)
			return null;
		if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
			throw new JastorInvalidRDFNodeException(uri() + ": adress getProperty() in com.mds.decisionsupport.model.Patient model not Literal", stmt.getObject());
		com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
		Object obj = Util.fixLiteral(true,literal,"java.math.BigInteger","http://www.w3.org/2001/XMLSchema#integer");
		adress = (java.math.BigInteger)obj;
		return adress;
	}
	
	public void setAdress(java.math.BigInteger adress) throws JastorException {
		if (_model.contains(_resource,adressProperty)) {
			_model.removeAll(_resource,adressProperty,null);
		}
		this.adress = adress;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
		if (adress != null) {
			_model.add(_model.createStatement(_resource,adressProperty, createLiteral(adress)));
		}	
	}

	public java.lang.String getPhoneNumber() throws JastorException {
		if (phoneNumber != null)
			return phoneNumber;
		com.hp.hpl.jena.rdf.model.Statement stmt = _model.getProperty(_resource, phoneNumberProperty);
		if (stmt == null)
			return null;
		if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
			throw new JastorInvalidRDFNodeException(uri() + ": phoneNumber getProperty() in com.mds.decisionsupport.model.Patient model not Literal", stmt.getObject());
		com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
		Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
		phoneNumber = (java.lang.String)obj;
		return phoneNumber;
	}
	
	public void setPhoneNumber(java.lang.String phoneNumber) throws JastorException {
		if (_model.contains(_resource,phoneNumberProperty)) {
			_model.removeAll(_resource,phoneNumberProperty,null);
		}
		this.phoneNumber = phoneNumber;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
		if (phoneNumber != null) {
			_model.add(_model.createStatement(_resource,phoneNumberProperty, createLiteral(phoneNumber)));
		}	
	}


	private void initMedicalRecordOfPatient() throws JastorException {
		this.medicalRecordOfPatient = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, medicalRecordOfPatientProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://ontology/mds#medicalRecordOfPatient properties in Patient model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.mds.decisionsupport.model.MedicalRecord medicalRecordOfPatient = com.mds.decisionsupport.model.MdsFactory.getMedicalRecord(resource,_model);
				this.medicalRecordOfPatient.add(medicalRecordOfPatient);
			}
		}
	}

	public java.util.Iterator getMedicalRecordOfPatient() throws JastorException {
		if (medicalRecordOfPatient == null)
			initMedicalRecordOfPatient();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(medicalRecordOfPatient,_resource,medicalRecordOfPatientProperty,true);
	}

	public void addMedicalRecordOfPatient(com.mds.decisionsupport.model.MedicalRecord medicalRecordOfPatient) throws JastorException {
		if (this.medicalRecordOfPatient == null)
			initMedicalRecordOfPatient();
		if (this.medicalRecordOfPatient.contains(medicalRecordOfPatient)) {
			this.medicalRecordOfPatient.remove(medicalRecordOfPatient);
			this.medicalRecordOfPatient.add(medicalRecordOfPatient);
			return;
		}
		this.medicalRecordOfPatient.add(medicalRecordOfPatient);
		_model.add(_model.createStatement(_resource,medicalRecordOfPatientProperty,medicalRecordOfPatient.resource()));
	}
	
	public com.mds.decisionsupport.model.MedicalRecord addMedicalRecordOfPatient() throws JastorException {
		com.mds.decisionsupport.model.MedicalRecord medicalRecordOfPatient = com.mds.decisionsupport.model.MdsFactory.createMedicalRecord(_model.createResource(),_model);
		if (this.medicalRecordOfPatient == null)
			initMedicalRecordOfPatient();
		this.medicalRecordOfPatient.add(medicalRecordOfPatient);
		_model.add(_model.createStatement(_resource,medicalRecordOfPatientProperty,medicalRecordOfPatient.resource()));
		return medicalRecordOfPatient;
	}
	
	public com.mds.decisionsupport.model.MedicalRecord addMedicalRecordOfPatient(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.mds.decisionsupport.model.MedicalRecord medicalRecordOfPatient = com.mds.decisionsupport.model.MdsFactory.getMedicalRecord(resource,_model);
		if (this.medicalRecordOfPatient == null)
			initMedicalRecordOfPatient();
		if (this.medicalRecordOfPatient.contains(medicalRecordOfPatient))
			return medicalRecordOfPatient;
		this.medicalRecordOfPatient.add(medicalRecordOfPatient);
		_model.add(_model.createStatement(_resource,medicalRecordOfPatientProperty,medicalRecordOfPatient.resource()));
		return medicalRecordOfPatient;
	}
	
	public void removeMedicalRecordOfPatient(com.mds.decisionsupport.model.MedicalRecord medicalRecordOfPatient) throws JastorException {
		if (this.medicalRecordOfPatient == null)
			initMedicalRecordOfPatient();
		if (!this.medicalRecordOfPatient.contains(medicalRecordOfPatient))
			return;
		if (!_model.contains(_resource, medicalRecordOfPatientProperty, medicalRecordOfPatient.resource()))
			return;
		this.medicalRecordOfPatient.remove(medicalRecordOfPatient);
		_model.removeAll(_resource, medicalRecordOfPatientProperty, medicalRecordOfPatient.resource());
	}
		  


	private java.util.ArrayList listeners;
	
	public void registerListener(ThingListener listener) {
		if (!(listener instanceof PatientListener))
			throw new IllegalArgumentException("ThingListener must be instance of PatientListener"); 
		if (listeners == null)
			setupModelListener();
		if(!this.listeners.contains(listener)){
			this.listeners.add((PatientListener)listener);
		}
	}
	
	public void unregisterListener(ThingListener listener) {
		if (!(listener instanceof PatientListener))
			throw new IllegalArgumentException("ThingListener must be instance of PatientListener"); 
		if (listeners == null)
			return;
		if (this.listeners.contains(listener)){
			listeners.remove(listener);
		}
	}



	
		public void addedStatement(com.hp.hpl.jena.rdf.model.Statement stmt) {

			if (stmt.getPredicate().equals(lastNameProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				lastName = (java.lang.String)Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						PatientListener listener=(PatientListener)iter.next();
						listener.lastNameChanged(com.mds.decisionsupport.model.PatientImpl.this);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(birthDateProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				birthDate = (com.hp.hpl.jena.datatypes.xsd.XSDDateTime)Util.fixLiteral(true,literal,"com.hp.hpl.jena.datatypes.xsd.XSDDateTime","http://www.w3.org/2001/XMLSchema#dateTime");
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						PatientListener listener=(PatientListener)iter.next();
						listener.birthDateChanged(com.mds.decisionsupport.model.PatientImpl.this);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(emailProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				email = (java.lang.String)Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						PatientListener listener=(PatientListener)iter.next();
						listener.emailChanged(com.mds.decisionsupport.model.PatientImpl.this);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(firstNameProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				firstName = (java.lang.String)Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						PatientListener listener=(PatientListener)iter.next();
						listener.firstNameChanged(com.mds.decisionsupport.model.PatientImpl.this);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(adressProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				adress = (java.math.BigInteger)Util.fixLiteral(true,literal,"java.math.BigInteger","http://www.w3.org/2001/XMLSchema#integer");
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						PatientListener listener=(PatientListener)iter.next();
						listener.adressChanged(com.mds.decisionsupport.model.PatientImpl.this);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(phoneNumberProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				phoneNumber = (java.lang.String)Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						PatientListener listener=(PatientListener)iter.next();
						listener.phoneNumberChanged(com.mds.decisionsupport.model.PatientImpl.this);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(medicalRecordOfPatientProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.mds.decisionsupport.model.MedicalRecord _medicalRecordOfPatient = null;
					try {
						_medicalRecordOfPatient = com.mds.decisionsupport.model.MdsFactory.getMedicalRecord(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (medicalRecordOfPatient == null) {
						try {
							initMedicalRecordOfPatient();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!medicalRecordOfPatient.contains(_medicalRecordOfPatient))
						medicalRecordOfPatient.add(_medicalRecordOfPatient);
					if (listeners != null) {
						java.util.ArrayList consumersForMedicalRecordOfPatient;
						synchronized (listeners) {
							consumersForMedicalRecordOfPatient = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForMedicalRecordOfPatient.iterator();iter.hasNext();){
							PatientListener listener=(PatientListener)iter.next();
							listener.medicalRecordOfPatientAdded(com.mds.decisionsupport.model.PatientImpl.this,_medicalRecordOfPatient);
						}
					}
				}
				return;
			}
		}
		
		public void removedStatement(com.hp.hpl.jena.rdf.model.Statement stmt) {
//			if (!stmt.getSubject().equals(_resource))
//				return;
			if (stmt.getPredicate().equals(lastNameProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (lastName != null && lastName.equals(obj))
					lastName = null;
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						PatientListener listener=(PatientListener)iter.next();
						listener.lastNameChanged(com.mds.decisionsupport.model.PatientImpl.this);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(birthDateProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"com.hp.hpl.jena.datatypes.xsd.XSDDateTime","http://www.w3.org/2001/XMLSchema#dateTime");
				if (birthDate != null && birthDate.equals(obj))
					birthDate = null;
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						PatientListener listener=(PatientListener)iter.next();
						listener.birthDateChanged(com.mds.decisionsupport.model.PatientImpl.this);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(emailProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (email != null && email.equals(obj))
					email = null;
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						PatientListener listener=(PatientListener)iter.next();
						listener.emailChanged(com.mds.decisionsupport.model.PatientImpl.this);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(firstNameProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (firstName != null && firstName.equals(obj))
					firstName = null;
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						PatientListener listener=(PatientListener)iter.next();
						listener.firstNameChanged(com.mds.decisionsupport.model.PatientImpl.this);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(adressProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.math.BigInteger","http://www.w3.org/2001/XMLSchema#integer");
				if (adress != null && adress.equals(obj))
					adress = null;
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						PatientListener listener=(PatientListener)iter.next();
						listener.adressChanged(com.mds.decisionsupport.model.PatientImpl.this);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(phoneNumberProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (phoneNumber != null && phoneNumber.equals(obj))
					phoneNumber = null;
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						PatientListener listener=(PatientListener)iter.next();
						listener.phoneNumberChanged(com.mds.decisionsupport.model.PatientImpl.this);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(medicalRecordOfPatientProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.mds.decisionsupport.model.MedicalRecord _medicalRecordOfPatient = null;
					if (medicalRecordOfPatient != null) {
						boolean found = false;
						for (int i=0;i<medicalRecordOfPatient.size();i++) {
							com.mds.decisionsupport.model.MedicalRecord __item = (com.mds.decisionsupport.model.MedicalRecord) medicalRecordOfPatient.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_medicalRecordOfPatient = __item;
								break;
							}
						}
						if (found)
							medicalRecordOfPatient.remove(_medicalRecordOfPatient);
						else {
							try {
								_medicalRecordOfPatient = com.mds.decisionsupport.model.MdsFactory.getMedicalRecord(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_medicalRecordOfPatient = com.mds.decisionsupport.model.MdsFactory.getMedicalRecord(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForMedicalRecordOfPatient;
						synchronized (listeners) {
							consumersForMedicalRecordOfPatient = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForMedicalRecordOfPatient.iterator();iter.hasNext();){
							PatientListener listener=(PatientListener)iter.next();
							listener.medicalRecordOfPatientRemoved(com.mds.decisionsupport.model.PatientImpl.this,_medicalRecordOfPatient);
						}
					}
				}
				return;
			}
		}

	//}
	


}