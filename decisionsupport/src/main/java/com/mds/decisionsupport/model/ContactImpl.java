

package com.mds.decisionsupport.model;

/*
import com.hp.hpl.jena.datatypes.xsd.*;
import com.hp.hpl.jena.datatypes.xsd.impl.*;
*/
import com.hp.hpl.jena.rdf.model.*;
import com.hp.hpl.jena.rdf.listeners.StatementListener;
import com.hp.hpl.jena.vocabulary.RDF;
import com.ibm.adtech.jastor.*;
import com.ibm.adtech.jastor.util.*;


/**
 * Implementation of {@link com.mds.decisionsupport.model.Contact}
 * Use the com.mds.decisionsupport.model.MdsFactory to create instances of this class.
 * <p>(URI: http://ontology/mds#Contact)</p>
 * <br>
 */
public class ContactImpl extends com.ibm.adtech.jastor.ThingImpl implements com.mds.decisionsupport.model.Contact {
	

	private static com.hp.hpl.jena.rdf.model.Property endDateOfContactProperty = ResourceFactory.createProperty("http://ontology/mds#endDateOfContact");
	private com.hp.hpl.jena.datatypes.xsd.XSDDateTime endDateOfContact;
	private static com.hp.hpl.jena.rdf.model.Property startDateOfContactProperty = ResourceFactory.createProperty("http://ontology/mds#startDateOfContact");
	private com.hp.hpl.jena.datatypes.xsd.XSDDateTime startDateOfContact;
	private static com.hp.hpl.jena.rdf.model.Property hasMedicalRecordInvolvedProperty = ResourceFactory.createProperty("http://ontology/mds#hasMedicalRecordInvolved");
	private java.util.ArrayList hasMedicalRecordInvolved;
	private static com.hp.hpl.jena.rdf.model.Property PatientConcernedProperty = ResourceFactory.createProperty("http://ontology/mds#PatientConcerned");
	private java.util.ArrayList PatientConcerned;
	private static com.hp.hpl.jena.rdf.model.Property commentOfContactProperty = ResourceFactory.createProperty("http://ontology/mds#commentOfContact");
	private java.lang.String commentOfContact;
	private static com.hp.hpl.jena.rdf.model.Property hasMedicalItemsProperty = ResourceFactory.createProperty("http://ontology/mds#hasMedicalItems");
	private java.util.ArrayList hasMedicalItems;
	private static com.hp.hpl.jena.rdf.model.Property hasMedicalItemsCompositionProperty = ResourceFactory.createProperty("http://ontology/mds#hasMedicalItemsComposition");
	private java.util.ArrayList hasMedicalItemsComposition;
	private static com.hp.hpl.jena.rdf.model.Property HealthcarePersonneConcernedProperty = ResourceFactory.createProperty("http://ontology/mds#HealthcarePersonneConcerned");
	private java.util.ArrayList HealthcarePersonneConcerned;
 

	ContactImpl(Resource resource, Model model) throws JastorException {
		super(resource, model);
		setupModelListener();
	}     
    	
	static ContactImpl getContact(Resource resource, Model model) throws JastorException {
		return new ContactImpl(resource, model);
	}
	    
	static ContactImpl createContact(Resource resource, Model model) throws JastorException { 
		ContactImpl impl = new ContactImpl(resource, model);
		
		if (!impl._model.contains(new com.hp.hpl.jena.rdf.model.impl.StatementImpl(impl._resource, RDF.type, Contact.TYPE)))
			impl._model.add(impl._resource, RDF.type, Contact.TYPE);
		impl.addSuperTypes();
		impl.addHasValueValues();
		return impl;
	}
	
	void addSuperTypes() {
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
		it = _model.listStatements(_resource,endDateOfContactProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,startDateOfContactProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,hasMedicalRecordInvolvedProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,PatientConcernedProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,commentOfContactProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,hasMedicalItemsProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,hasMedicalItemsCompositionProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,HealthcarePersonneConcernedProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,RDF.type, com.mds.decisionsupport.model.Contact.TYPE);
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
	
	public void clearCache() {
		endDateOfContact = null;
		startDateOfContact = null;
		hasMedicalRecordInvolved = null;
		PatientConcerned = null;
		commentOfContact = null;
		hasMedicalItems = null;
		hasMedicalItemsComposition = null;
		HealthcarePersonneConcerned = null;
	}

	private com.hp.hpl.jena.rdf.model.Literal createLiteral(Object obj) {
		return _model.createTypedLiteral(obj);
	}

	public com.hp.hpl.jena.datatypes.xsd.XSDDateTime getEndDateOfContact() throws JastorException {
		if (endDateOfContact != null)
			return endDateOfContact;
		com.hp.hpl.jena.rdf.model.Statement stmt = _model.getProperty(_resource, endDateOfContactProperty);
		if (stmt == null)
			return null;
		if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
			throw new JastorInvalidRDFNodeException(uri() + ": endDateOfContact getProperty() in com.mds.decisionsupport.model.Contact model not Literal", stmt.getObject());
		com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
		Object obj = Util.fixLiteral(true,literal,"com.hp.hpl.jena.datatypes.xsd.XSDDateTime","http://www.w3.org/2001/XMLSchema#dateTime");
		endDateOfContact = (com.hp.hpl.jena.datatypes.xsd.XSDDateTime)obj;
		return endDateOfContact;
	}
	
	public void setEndDateOfContact(com.hp.hpl.jena.datatypes.xsd.XSDDateTime endDateOfContact) throws JastorException {
		if (_model.contains(_resource,endDateOfContactProperty)) {
			_model.removeAll(_resource,endDateOfContactProperty,null);
		}
		this.endDateOfContact = endDateOfContact;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
		if (endDateOfContact != null) {
			_model.add(_model.createStatement(_resource,endDateOfContactProperty, createLiteral(endDateOfContact)));
		}	
	}

	public com.hp.hpl.jena.datatypes.xsd.XSDDateTime getStartDateOfContact() throws JastorException {
		if (startDateOfContact != null)
			return startDateOfContact;
		com.hp.hpl.jena.rdf.model.Statement stmt = _model.getProperty(_resource, startDateOfContactProperty);
		if (stmt == null)
			return null;
		if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
			throw new JastorInvalidRDFNodeException(uri() + ": startDateOfContact getProperty() in com.mds.decisionsupport.model.Contact model not Literal", stmt.getObject());
		com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
		Object obj = Util.fixLiteral(true,literal,"com.hp.hpl.jena.datatypes.xsd.XSDDateTime","http://www.w3.org/2001/XMLSchema#dateTime");
		startDateOfContact = (com.hp.hpl.jena.datatypes.xsd.XSDDateTime)obj;
		return startDateOfContact;
	}
	
	public void setStartDateOfContact(com.hp.hpl.jena.datatypes.xsd.XSDDateTime startDateOfContact) throws JastorException {
		if (_model.contains(_resource,startDateOfContactProperty)) {
			_model.removeAll(_resource,startDateOfContactProperty,null);
		}
		this.startDateOfContact = startDateOfContact;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
		if (startDateOfContact != null) {
			_model.add(_model.createStatement(_resource,startDateOfContactProperty, createLiteral(startDateOfContact)));
		}	
	}


	private void initHasMedicalRecordInvolved() throws JastorException {
		this.hasMedicalRecordInvolved = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, hasMedicalRecordInvolvedProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://ontology/mds#hasMedicalRecordInvolved properties in Contact model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.mds.decisionsupport.model.MedicalRecord hasMedicalRecordInvolved = com.mds.decisionsupport.model.MdsFactory.getMedicalRecord(resource,_model);
				this.hasMedicalRecordInvolved.add(hasMedicalRecordInvolved);
			}
		}
	}

	public java.util.Iterator getHasMedicalRecordInvolved() throws JastorException {
		if (hasMedicalRecordInvolved == null)
			initHasMedicalRecordInvolved();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(hasMedicalRecordInvolved,_resource,hasMedicalRecordInvolvedProperty,true);
	}

	public void addHasMedicalRecordInvolved(com.mds.decisionsupport.model.MedicalRecord hasMedicalRecordInvolved) throws JastorException {
		if (this.hasMedicalRecordInvolved == null)
			initHasMedicalRecordInvolved();
		if (this.hasMedicalRecordInvolved.contains(hasMedicalRecordInvolved)) {
			this.hasMedicalRecordInvolved.remove(hasMedicalRecordInvolved);
			this.hasMedicalRecordInvolved.add(hasMedicalRecordInvolved);
			return;
		}
		this.hasMedicalRecordInvolved.add(hasMedicalRecordInvolved);
		_model.add(_model.createStatement(_resource,hasMedicalRecordInvolvedProperty,hasMedicalRecordInvolved.resource()));
	}
	
	public com.mds.decisionsupport.model.MedicalRecord addHasMedicalRecordInvolved() throws JastorException {
		com.mds.decisionsupport.model.MedicalRecord hasMedicalRecordInvolved = com.mds.decisionsupport.model.MdsFactory.createMedicalRecord(_model.createResource(),_model);
		if (this.hasMedicalRecordInvolved == null)
			initHasMedicalRecordInvolved();
		this.hasMedicalRecordInvolved.add(hasMedicalRecordInvolved);
		_model.add(_model.createStatement(_resource,hasMedicalRecordInvolvedProperty,hasMedicalRecordInvolved.resource()));
		return hasMedicalRecordInvolved;
	}
	
	public com.mds.decisionsupport.model.MedicalRecord addHasMedicalRecordInvolved(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.mds.decisionsupport.model.MedicalRecord hasMedicalRecordInvolved = com.mds.decisionsupport.model.MdsFactory.getMedicalRecord(resource,_model);
		if (this.hasMedicalRecordInvolved == null)
			initHasMedicalRecordInvolved();
		if (this.hasMedicalRecordInvolved.contains(hasMedicalRecordInvolved))
			return hasMedicalRecordInvolved;
		this.hasMedicalRecordInvolved.add(hasMedicalRecordInvolved);
		_model.add(_model.createStatement(_resource,hasMedicalRecordInvolvedProperty,hasMedicalRecordInvolved.resource()));
		return hasMedicalRecordInvolved;
	}
	
	public void removeHasMedicalRecordInvolved(com.mds.decisionsupport.model.MedicalRecord hasMedicalRecordInvolved) throws JastorException {
		if (this.hasMedicalRecordInvolved == null)
			initHasMedicalRecordInvolved();
		if (!this.hasMedicalRecordInvolved.contains(hasMedicalRecordInvolved))
			return;
		if (!_model.contains(_resource, hasMedicalRecordInvolvedProperty, hasMedicalRecordInvolved.resource()))
			return;
		this.hasMedicalRecordInvolved.remove(hasMedicalRecordInvolved);
		_model.removeAll(_resource, hasMedicalRecordInvolvedProperty, hasMedicalRecordInvolved.resource());
	}
		 

	private void initPatientConcerned() throws JastorException {
		this.PatientConcerned = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, PatientConcernedProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://ontology/mds#PatientConcerned properties in Contact model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.mds.decisionsupport.model.Patient PatientConcerned = com.mds.decisionsupport.model.MdsFactory.getPatient(resource,_model);
				this.PatientConcerned.add(PatientConcerned);
			}
		}
	}

	public java.util.Iterator getPatientConcerned() throws JastorException {
		if (PatientConcerned == null)
			initPatientConcerned();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(PatientConcerned,_resource,PatientConcernedProperty,true);
	}

	public void addPatientConcerned(com.mds.decisionsupport.model.Patient PatientConcerned) throws JastorException {
		if (this.PatientConcerned == null)
			initPatientConcerned();
		if (this.PatientConcerned.contains(PatientConcerned)) {
			this.PatientConcerned.remove(PatientConcerned);
			this.PatientConcerned.add(PatientConcerned);
			return;
		}
		this.PatientConcerned.add(PatientConcerned);
		_model.add(_model.createStatement(_resource,PatientConcernedProperty,PatientConcerned.resource()));
	}
	
	public com.mds.decisionsupport.model.Patient addPatientConcerned() throws JastorException {
		com.mds.decisionsupport.model.Patient PatientConcerned = com.mds.decisionsupport.model.MdsFactory.createPatient(_model.createResource(),_model);
		if (this.PatientConcerned == null)
			initPatientConcerned();
		this.PatientConcerned.add(PatientConcerned);
		_model.add(_model.createStatement(_resource,PatientConcernedProperty,PatientConcerned.resource()));
		return PatientConcerned;
	}
	
	public com.mds.decisionsupport.model.Patient addPatientConcerned(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.mds.decisionsupport.model.Patient PatientConcerned = com.mds.decisionsupport.model.MdsFactory.getPatient(resource,_model);
		if (this.PatientConcerned == null)
			initPatientConcerned();
		if (this.PatientConcerned.contains(PatientConcerned))
			return PatientConcerned;
		this.PatientConcerned.add(PatientConcerned);
		_model.add(_model.createStatement(_resource,PatientConcernedProperty,PatientConcerned.resource()));
		return PatientConcerned;
	}
	
	public void removePatientConcerned(com.mds.decisionsupport.model.Patient PatientConcerned) throws JastorException {
		if (this.PatientConcerned == null)
			initPatientConcerned();
		if (!this.PatientConcerned.contains(PatientConcerned))
			return;
		if (!_model.contains(_resource, PatientConcernedProperty, PatientConcerned.resource()))
			return;
		this.PatientConcerned.remove(PatientConcerned);
		_model.removeAll(_resource, PatientConcernedProperty, PatientConcerned.resource());
	}
		 
	public java.lang.String getCommentOfContact() throws JastorException {
		if (commentOfContact != null)
			return commentOfContact;
		com.hp.hpl.jena.rdf.model.Statement stmt = _model.getProperty(_resource, commentOfContactProperty);
		if (stmt == null)
			return null;
		if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
			throw new JastorInvalidRDFNodeException(uri() + ": commentOfContact getProperty() in com.mds.decisionsupport.model.Contact model not Literal", stmt.getObject());
		com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
		Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
		commentOfContact = (java.lang.String)obj;
		return commentOfContact;
	}
	
	public void setCommentOfContact(java.lang.String commentOfContact) throws JastorException {
		if (_model.contains(_resource,commentOfContactProperty)) {
			_model.removeAll(_resource,commentOfContactProperty,null);
		}
		this.commentOfContact = commentOfContact;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
		if (commentOfContact != null) {
			_model.add(_model.createStatement(_resource,commentOfContactProperty, createLiteral(commentOfContact)));
		}	
	}


	private void initHasMedicalItems() throws JastorException {
		this.hasMedicalItems = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, hasMedicalItemsProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://ontology/mds#hasMedicalItems properties in Contact model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.mds.decisionsupport.model.MedicalItem hasMedicalItems = com.mds.decisionsupport.model.MdsFactory.getMedicalItem(resource,_model);
				this.hasMedicalItems.add(hasMedicalItems);
			}
		}
	}

	public java.util.Iterator getHasMedicalItems() throws JastorException {
		if (hasMedicalItems == null)
			initHasMedicalItems();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(hasMedicalItems,_resource,hasMedicalItemsProperty,true);
	}

	public void addHasMedicalItems(com.mds.decisionsupport.model.MedicalItem hasMedicalItems) throws JastorException {
		if (this.hasMedicalItems == null)
			initHasMedicalItems();
		if (this.hasMedicalItems.contains(hasMedicalItems)) {
			this.hasMedicalItems.remove(hasMedicalItems);
			this.hasMedicalItems.add(hasMedicalItems);
			return;
		}
		this.hasMedicalItems.add(hasMedicalItems);
		_model.add(_model.createStatement(_resource,hasMedicalItemsProperty,hasMedicalItems.resource()));
	}
	
	public com.mds.decisionsupport.model.MedicalItem addHasMedicalItems() throws JastorException {
		com.mds.decisionsupport.model.MedicalItem hasMedicalItems = com.mds.decisionsupport.model.MdsFactory.createMedicalItem(_model.createResource(),_model);
		if (this.hasMedicalItems == null)
			initHasMedicalItems();
		this.hasMedicalItems.add(hasMedicalItems);
		_model.add(_model.createStatement(_resource,hasMedicalItemsProperty,hasMedicalItems.resource()));
		return hasMedicalItems;
	}
	
	public com.mds.decisionsupport.model.MedicalItem addHasMedicalItems(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.mds.decisionsupport.model.MedicalItem hasMedicalItems = com.mds.decisionsupport.model.MdsFactory.getMedicalItem(resource,_model);
		if (this.hasMedicalItems == null)
			initHasMedicalItems();
		if (this.hasMedicalItems.contains(hasMedicalItems))
			return hasMedicalItems;
		this.hasMedicalItems.add(hasMedicalItems);
		_model.add(_model.createStatement(_resource,hasMedicalItemsProperty,hasMedicalItems.resource()));
		return hasMedicalItems;
	}
	
	public void removeHasMedicalItems(com.mds.decisionsupport.model.MedicalItem hasMedicalItems) throws JastorException {
		if (this.hasMedicalItems == null)
			initHasMedicalItems();
		if (!this.hasMedicalItems.contains(hasMedicalItems))
			return;
		if (!_model.contains(_resource, hasMedicalItemsProperty, hasMedicalItems.resource()))
			return;
		this.hasMedicalItems.remove(hasMedicalItems);
		_model.removeAll(_resource, hasMedicalItemsProperty, hasMedicalItems.resource());
	}
		 

	private void initHasMedicalItemsComposition() throws JastorException {
		this.hasMedicalItemsComposition = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, hasMedicalItemsCompositionProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://ontology/mds#hasMedicalItemsComposition properties in Contact model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.mds.decisionsupport.model.CompositionOfMedicalItems hasMedicalItemsComposition = com.mds.decisionsupport.model.MdsFactory.getCompositionOfMedicalItems(resource,_model);
				this.hasMedicalItemsComposition.add(hasMedicalItemsComposition);
			}
		}
	}

	public java.util.Iterator getHasMedicalItemsComposition() throws JastorException {
		if (hasMedicalItemsComposition == null)
			initHasMedicalItemsComposition();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(hasMedicalItemsComposition,_resource,hasMedicalItemsCompositionProperty,true);
	}

	public void addHasMedicalItemsComposition(com.mds.decisionsupport.model.CompositionOfMedicalItems hasMedicalItemsComposition) throws JastorException {
		if (this.hasMedicalItemsComposition == null)
			initHasMedicalItemsComposition();
		if (this.hasMedicalItemsComposition.contains(hasMedicalItemsComposition)) {
			this.hasMedicalItemsComposition.remove(hasMedicalItemsComposition);
			this.hasMedicalItemsComposition.add(hasMedicalItemsComposition);
			return;
		}
		this.hasMedicalItemsComposition.add(hasMedicalItemsComposition);
		_model.add(_model.createStatement(_resource,hasMedicalItemsCompositionProperty,hasMedicalItemsComposition.resource()));
	}
	
	public com.mds.decisionsupport.model.CompositionOfMedicalItems addHasMedicalItemsComposition() throws JastorException {
		com.mds.decisionsupport.model.CompositionOfMedicalItems hasMedicalItemsComposition = com.mds.decisionsupport.model.MdsFactory.createCompositionOfMedicalItems(_model.createResource(),_model);
		if (this.hasMedicalItemsComposition == null)
			initHasMedicalItemsComposition();
		this.hasMedicalItemsComposition.add(hasMedicalItemsComposition);
		_model.add(_model.createStatement(_resource,hasMedicalItemsCompositionProperty,hasMedicalItemsComposition.resource()));
		return hasMedicalItemsComposition;
	}
	
	public com.mds.decisionsupport.model.CompositionOfMedicalItems addHasMedicalItemsComposition(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.mds.decisionsupport.model.CompositionOfMedicalItems hasMedicalItemsComposition = com.mds.decisionsupport.model.MdsFactory.getCompositionOfMedicalItems(resource,_model);
		if (this.hasMedicalItemsComposition == null)
			initHasMedicalItemsComposition();
		if (this.hasMedicalItemsComposition.contains(hasMedicalItemsComposition))
			return hasMedicalItemsComposition;
		this.hasMedicalItemsComposition.add(hasMedicalItemsComposition);
		_model.add(_model.createStatement(_resource,hasMedicalItemsCompositionProperty,hasMedicalItemsComposition.resource()));
		return hasMedicalItemsComposition;
	}
	
	public void removeHasMedicalItemsComposition(com.mds.decisionsupport.model.CompositionOfMedicalItems hasMedicalItemsComposition) throws JastorException {
		if (this.hasMedicalItemsComposition == null)
			initHasMedicalItemsComposition();
		if (!this.hasMedicalItemsComposition.contains(hasMedicalItemsComposition))
			return;
		if (!_model.contains(_resource, hasMedicalItemsCompositionProperty, hasMedicalItemsComposition.resource()))
			return;
		this.hasMedicalItemsComposition.remove(hasMedicalItemsComposition);
		_model.removeAll(_resource, hasMedicalItemsCompositionProperty, hasMedicalItemsComposition.resource());
	}
		 

	private void initHealthcarePersonneConcerned() throws JastorException {
		this.HealthcarePersonneConcerned = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, HealthcarePersonneConcernedProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://ontology/mds#HealthcarePersonneConcerned properties in Contact model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.mds.decisionsupport.model.HealthcarePersonnel HealthcarePersonneConcerned = com.mds.decisionsupport.model.MdsFactory.getHealthcarePersonnel(resource,_model);
				this.HealthcarePersonneConcerned.add(HealthcarePersonneConcerned);
			}
		}
	}

	public java.util.Iterator getHealthcarePersonneConcerned() throws JastorException {
		if (HealthcarePersonneConcerned == null)
			initHealthcarePersonneConcerned();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(HealthcarePersonneConcerned,_resource,HealthcarePersonneConcernedProperty,true);
	}

	public void addHealthcarePersonneConcerned(com.mds.decisionsupport.model.HealthcarePersonnel HealthcarePersonneConcerned) throws JastorException {
		if (this.HealthcarePersonneConcerned == null)
			initHealthcarePersonneConcerned();
		if (this.HealthcarePersonneConcerned.contains(HealthcarePersonneConcerned)) {
			this.HealthcarePersonneConcerned.remove(HealthcarePersonneConcerned);
			this.HealthcarePersonneConcerned.add(HealthcarePersonneConcerned);
			return;
		}
		this.HealthcarePersonneConcerned.add(HealthcarePersonneConcerned);
		_model.add(_model.createStatement(_resource,HealthcarePersonneConcernedProperty,HealthcarePersonneConcerned.resource()));
	}
	
	public com.mds.decisionsupport.model.HealthcarePersonnel addHealthcarePersonneConcerned() throws JastorException {
		com.mds.decisionsupport.model.HealthcarePersonnel HealthcarePersonneConcerned = com.mds.decisionsupport.model.MdsFactory.createHealthcarePersonnel(_model.createResource(),_model);
		if (this.HealthcarePersonneConcerned == null)
			initHealthcarePersonneConcerned();
		this.HealthcarePersonneConcerned.add(HealthcarePersonneConcerned);
		_model.add(_model.createStatement(_resource,HealthcarePersonneConcernedProperty,HealthcarePersonneConcerned.resource()));
		return HealthcarePersonneConcerned;
	}
	
	public com.mds.decisionsupport.model.HealthcarePersonnel addHealthcarePersonneConcerned(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.mds.decisionsupport.model.HealthcarePersonnel HealthcarePersonneConcerned = com.mds.decisionsupport.model.MdsFactory.getHealthcarePersonnel(resource,_model);
		if (this.HealthcarePersonneConcerned == null)
			initHealthcarePersonneConcerned();
		if (this.HealthcarePersonneConcerned.contains(HealthcarePersonneConcerned))
			return HealthcarePersonneConcerned;
		this.HealthcarePersonneConcerned.add(HealthcarePersonneConcerned);
		_model.add(_model.createStatement(_resource,HealthcarePersonneConcernedProperty,HealthcarePersonneConcerned.resource()));
		return HealthcarePersonneConcerned;
	}
	
	public void removeHealthcarePersonneConcerned(com.mds.decisionsupport.model.HealthcarePersonnel HealthcarePersonneConcerned) throws JastorException {
		if (this.HealthcarePersonneConcerned == null)
			initHealthcarePersonneConcerned();
		if (!this.HealthcarePersonneConcerned.contains(HealthcarePersonneConcerned))
			return;
		if (!_model.contains(_resource, HealthcarePersonneConcernedProperty, HealthcarePersonneConcerned.resource()))
			return;
		this.HealthcarePersonneConcerned.remove(HealthcarePersonneConcerned);
		_model.removeAll(_resource, HealthcarePersonneConcernedProperty, HealthcarePersonneConcerned.resource());
	}
		  


	private java.util.ArrayList listeners;
	
	public void registerListener(ThingListener listener) {
		if (!(listener instanceof ContactListener))
			throw new IllegalArgumentException("ThingListener must be instance of ContactListener"); 
		if (listeners == null)
			setupModelListener();
		if(!this.listeners.contains(listener)){
			this.listeners.add((ContactListener)listener);
		}
	}
	
	public void unregisterListener(ThingListener listener) {
		if (!(listener instanceof ContactListener))
			throw new IllegalArgumentException("ThingListener must be instance of ContactListener"); 
		if (listeners == null)
			return;
		if (this.listeners.contains(listener)){
			listeners.remove(listener);
		}
	}



	
		public void addedStatement(com.hp.hpl.jena.rdf.model.Statement stmt) {

			if (stmt.getPredicate().equals(endDateOfContactProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				endDateOfContact = (com.hp.hpl.jena.datatypes.xsd.XSDDateTime)Util.fixLiteral(true,literal,"com.hp.hpl.jena.datatypes.xsd.XSDDateTime","http://www.w3.org/2001/XMLSchema#dateTime");
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						ContactListener listener=(ContactListener)iter.next();
						listener.endDateOfContactChanged(com.mds.decisionsupport.model.ContactImpl.this);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(startDateOfContactProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				startDateOfContact = (com.hp.hpl.jena.datatypes.xsd.XSDDateTime)Util.fixLiteral(true,literal,"com.hp.hpl.jena.datatypes.xsd.XSDDateTime","http://www.w3.org/2001/XMLSchema#dateTime");
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						ContactListener listener=(ContactListener)iter.next();
						listener.startDateOfContactChanged(com.mds.decisionsupport.model.ContactImpl.this);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(hasMedicalRecordInvolvedProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.mds.decisionsupport.model.MedicalRecord _hasMedicalRecordInvolved = null;
					try {
						_hasMedicalRecordInvolved = com.mds.decisionsupport.model.MdsFactory.getMedicalRecord(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (hasMedicalRecordInvolved == null) {
						try {
							initHasMedicalRecordInvolved();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!hasMedicalRecordInvolved.contains(_hasMedicalRecordInvolved))
						hasMedicalRecordInvolved.add(_hasMedicalRecordInvolved);
					if (listeners != null) {
						java.util.ArrayList consumersForHasMedicalRecordInvolved;
						synchronized (listeners) {
							consumersForHasMedicalRecordInvolved = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHasMedicalRecordInvolved.iterator();iter.hasNext();){
							ContactListener listener=(ContactListener)iter.next();
							listener.hasMedicalRecordInvolvedAdded(com.mds.decisionsupport.model.ContactImpl.this,_hasMedicalRecordInvolved);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(PatientConcernedProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.mds.decisionsupport.model.Patient _PatientConcerned = null;
					try {
						_PatientConcerned = com.mds.decisionsupport.model.MdsFactory.getPatient(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (PatientConcerned == null) {
						try {
							initPatientConcerned();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!PatientConcerned.contains(_PatientConcerned))
						PatientConcerned.add(_PatientConcerned);
					if (listeners != null) {
						java.util.ArrayList consumersForPatientConcerned;
						synchronized (listeners) {
							consumersForPatientConcerned = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForPatientConcerned.iterator();iter.hasNext();){
							ContactListener listener=(ContactListener)iter.next();
							listener.PatientConcernedAdded(com.mds.decisionsupport.model.ContactImpl.this,_PatientConcerned);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(commentOfContactProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				commentOfContact = (java.lang.String)Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						ContactListener listener=(ContactListener)iter.next();
						listener.commentOfContactChanged(com.mds.decisionsupport.model.ContactImpl.this);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(hasMedicalItemsProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.mds.decisionsupport.model.MedicalItem _hasMedicalItems = null;
					try {
						_hasMedicalItems = com.mds.decisionsupport.model.MdsFactory.getMedicalItem(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (hasMedicalItems == null) {
						try {
							initHasMedicalItems();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!hasMedicalItems.contains(_hasMedicalItems))
						hasMedicalItems.add(_hasMedicalItems);
					if (listeners != null) {
						java.util.ArrayList consumersForHasMedicalItems;
						synchronized (listeners) {
							consumersForHasMedicalItems = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHasMedicalItems.iterator();iter.hasNext();){
							ContactListener listener=(ContactListener)iter.next();
							listener.hasMedicalItemsAdded(com.mds.decisionsupport.model.ContactImpl.this,_hasMedicalItems);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(hasMedicalItemsCompositionProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.mds.decisionsupport.model.CompositionOfMedicalItems _hasMedicalItemsComposition = null;
					try {
						_hasMedicalItemsComposition = com.mds.decisionsupport.model.MdsFactory.getCompositionOfMedicalItems(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (hasMedicalItemsComposition == null) {
						try {
							initHasMedicalItemsComposition();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!hasMedicalItemsComposition.contains(_hasMedicalItemsComposition))
						hasMedicalItemsComposition.add(_hasMedicalItemsComposition);
					if (listeners != null) {
						java.util.ArrayList consumersForHasMedicalItemsComposition;
						synchronized (listeners) {
							consumersForHasMedicalItemsComposition = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHasMedicalItemsComposition.iterator();iter.hasNext();){
							ContactListener listener=(ContactListener)iter.next();
							listener.hasMedicalItemsCompositionAdded(com.mds.decisionsupport.model.ContactImpl.this,_hasMedicalItemsComposition);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(HealthcarePersonneConcernedProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.mds.decisionsupport.model.HealthcarePersonnel _HealthcarePersonneConcerned = null;
					try {
						_HealthcarePersonneConcerned = com.mds.decisionsupport.model.MdsFactory.getHealthcarePersonnel(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (HealthcarePersonneConcerned == null) {
						try {
							initHealthcarePersonneConcerned();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!HealthcarePersonneConcerned.contains(_HealthcarePersonneConcerned))
						HealthcarePersonneConcerned.add(_HealthcarePersonneConcerned);
					if (listeners != null) {
						java.util.ArrayList consumersForHealthcarePersonneConcerned;
						synchronized (listeners) {
							consumersForHealthcarePersonneConcerned = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHealthcarePersonneConcerned.iterator();iter.hasNext();){
							ContactListener listener=(ContactListener)iter.next();
							listener.HealthcarePersonneConcernedAdded(com.mds.decisionsupport.model.ContactImpl.this,_HealthcarePersonneConcerned);
						}
					}
				}
				return;
			}
		}
		
		public void removedStatement(com.hp.hpl.jena.rdf.model.Statement stmt) {
//			if (!stmt.getSubject().equals(_resource))
//				return;
			if (stmt.getPredicate().equals(endDateOfContactProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"com.hp.hpl.jena.datatypes.xsd.XSDDateTime","http://www.w3.org/2001/XMLSchema#dateTime");
				if (endDateOfContact != null && endDateOfContact.equals(obj))
					endDateOfContact = null;
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						ContactListener listener=(ContactListener)iter.next();
						listener.endDateOfContactChanged(com.mds.decisionsupport.model.ContactImpl.this);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(startDateOfContactProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"com.hp.hpl.jena.datatypes.xsd.XSDDateTime","http://www.w3.org/2001/XMLSchema#dateTime");
				if (startDateOfContact != null && startDateOfContact.equals(obj))
					startDateOfContact = null;
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						ContactListener listener=(ContactListener)iter.next();
						listener.startDateOfContactChanged(com.mds.decisionsupport.model.ContactImpl.this);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(hasMedicalRecordInvolvedProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.mds.decisionsupport.model.MedicalRecord _hasMedicalRecordInvolved = null;
					if (hasMedicalRecordInvolved != null) {
						boolean found = false;
						for (int i=0;i<hasMedicalRecordInvolved.size();i++) {
							com.mds.decisionsupport.model.MedicalRecord __item = (com.mds.decisionsupport.model.MedicalRecord) hasMedicalRecordInvolved.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_hasMedicalRecordInvolved = __item;
								break;
							}
						}
						if (found)
							hasMedicalRecordInvolved.remove(_hasMedicalRecordInvolved);
						else {
							try {
								_hasMedicalRecordInvolved = com.mds.decisionsupport.model.MdsFactory.getMedicalRecord(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_hasMedicalRecordInvolved = com.mds.decisionsupport.model.MdsFactory.getMedicalRecord(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForHasMedicalRecordInvolved;
						synchronized (listeners) {
							consumersForHasMedicalRecordInvolved = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHasMedicalRecordInvolved.iterator();iter.hasNext();){
							ContactListener listener=(ContactListener)iter.next();
							listener.hasMedicalRecordInvolvedRemoved(com.mds.decisionsupport.model.ContactImpl.this,_hasMedicalRecordInvolved);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(PatientConcernedProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.mds.decisionsupport.model.Patient _PatientConcerned = null;
					if (PatientConcerned != null) {
						boolean found = false;
						for (int i=0;i<PatientConcerned.size();i++) {
							com.mds.decisionsupport.model.Patient __item = (com.mds.decisionsupport.model.Patient) PatientConcerned.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_PatientConcerned = __item;
								break;
							}
						}
						if (found)
							PatientConcerned.remove(_PatientConcerned);
						else {
							try {
								_PatientConcerned = com.mds.decisionsupport.model.MdsFactory.getPatient(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_PatientConcerned = com.mds.decisionsupport.model.MdsFactory.getPatient(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForPatientConcerned;
						synchronized (listeners) {
							consumersForPatientConcerned = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForPatientConcerned.iterator();iter.hasNext();){
							ContactListener listener=(ContactListener)iter.next();
							listener.PatientConcernedRemoved(com.mds.decisionsupport.model.ContactImpl.this,_PatientConcerned);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(commentOfContactProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (commentOfContact != null && commentOfContact.equals(obj))
					commentOfContact = null;
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						ContactListener listener=(ContactListener)iter.next();
						listener.commentOfContactChanged(com.mds.decisionsupport.model.ContactImpl.this);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(hasMedicalItemsProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.mds.decisionsupport.model.MedicalItem _hasMedicalItems = null;
					if (hasMedicalItems != null) {
						boolean found = false;
						for (int i=0;i<hasMedicalItems.size();i++) {
							com.mds.decisionsupport.model.MedicalItem __item = (com.mds.decisionsupport.model.MedicalItem) hasMedicalItems.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_hasMedicalItems = __item;
								break;
							}
						}
						if (found)
							hasMedicalItems.remove(_hasMedicalItems);
						else {
							try {
								_hasMedicalItems = com.mds.decisionsupport.model.MdsFactory.getMedicalItem(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_hasMedicalItems = com.mds.decisionsupport.model.MdsFactory.getMedicalItem(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForHasMedicalItems;
						synchronized (listeners) {
							consumersForHasMedicalItems = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHasMedicalItems.iterator();iter.hasNext();){
							ContactListener listener=(ContactListener)iter.next();
							listener.hasMedicalItemsRemoved(com.mds.decisionsupport.model.ContactImpl.this,_hasMedicalItems);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(hasMedicalItemsCompositionProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.mds.decisionsupport.model.CompositionOfMedicalItems _hasMedicalItemsComposition = null;
					if (hasMedicalItemsComposition != null) {
						boolean found = false;
						for (int i=0;i<hasMedicalItemsComposition.size();i++) {
							com.mds.decisionsupport.model.CompositionOfMedicalItems __item = (com.mds.decisionsupport.model.CompositionOfMedicalItems) hasMedicalItemsComposition.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_hasMedicalItemsComposition = __item;
								break;
							}
						}
						if (found)
							hasMedicalItemsComposition.remove(_hasMedicalItemsComposition);
						else {
							try {
								_hasMedicalItemsComposition = com.mds.decisionsupport.model.MdsFactory.getCompositionOfMedicalItems(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_hasMedicalItemsComposition = com.mds.decisionsupport.model.MdsFactory.getCompositionOfMedicalItems(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForHasMedicalItemsComposition;
						synchronized (listeners) {
							consumersForHasMedicalItemsComposition = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHasMedicalItemsComposition.iterator();iter.hasNext();){
							ContactListener listener=(ContactListener)iter.next();
							listener.hasMedicalItemsCompositionRemoved(com.mds.decisionsupport.model.ContactImpl.this,_hasMedicalItemsComposition);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(HealthcarePersonneConcernedProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.mds.decisionsupport.model.HealthcarePersonnel _HealthcarePersonneConcerned = null;
					if (HealthcarePersonneConcerned != null) {
						boolean found = false;
						for (int i=0;i<HealthcarePersonneConcerned.size();i++) {
							com.mds.decisionsupport.model.HealthcarePersonnel __item = (com.mds.decisionsupport.model.HealthcarePersonnel) HealthcarePersonneConcerned.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_HealthcarePersonneConcerned = __item;
								break;
							}
						}
						if (found)
							HealthcarePersonneConcerned.remove(_HealthcarePersonneConcerned);
						else {
							try {
								_HealthcarePersonneConcerned = com.mds.decisionsupport.model.MdsFactory.getHealthcarePersonnel(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_HealthcarePersonneConcerned = com.mds.decisionsupport.model.MdsFactory.getHealthcarePersonnel(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForHealthcarePersonneConcerned;
						synchronized (listeners) {
							consumersForHealthcarePersonneConcerned = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHealthcarePersonneConcerned.iterator();iter.hasNext();){
							ContactListener listener=(ContactListener)iter.next();
							listener.HealthcarePersonneConcernedRemoved(com.mds.decisionsupport.model.ContactImpl.this,_HealthcarePersonneConcerned);
						}
					}
				}
				return;
			}
		}

	//}
	


}