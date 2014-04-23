

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
 * Implementation of {@link com.mds.decisionsupport.model.MedicalRecord}
 * Use the com.mds.decisionsupport.model.MdsFactory to create instances of this class.
 * <p>(URI: http://ontology/mds#MedicalRecord)</p>
 * <br>
 */

@SuppressWarnings({ "rawtypes", "unchecked" })
public class MedicalRecordImpl extends com.ibm.adtech.jastor.ThingImpl implements com.mds.decisionsupport.model.MedicalRecord {
	

	private static com.hp.hpl.jena.rdf.model.Property commentOfMedicalRecordProperty = ResourceFactory.createProperty("http://ontology/mds#commentOfMedicalRecord");
	private java.lang.String commentOfMedicalRecord;
	private static com.hp.hpl.jena.rdf.model.Property hasContactsProperty = ResourceFactory.createProperty("http://ontology/mds#hasContacts");
	private java.util.ArrayList hasContacts;
	private static com.hp.hpl.jena.rdf.model.Property hasStaticInformationProperty = ResourceFactory.createProperty("http://ontology/mds#hasStaticInformation");
	private com.mds.decisionsupport.model.Patient hasStaticInformation;
 

	MedicalRecordImpl(Resource resource, Model model) throws JastorException {
		super(resource, model);
		setupModelListener();
	}     
    	
	static MedicalRecordImpl getMedicalRecord(Resource resource, Model model) throws JastorException {
		return new MedicalRecordImpl(resource, model);
	}
	    
	static MedicalRecordImpl createMedicalRecord(Resource resource, Model model) throws JastorException { 
		MedicalRecordImpl impl = new MedicalRecordImpl(resource, model);
		
		if (!impl._model.contains(new com.hp.hpl.jena.rdf.model.impl.StatementImpl(impl._resource, RDF.type, MedicalRecord.TYPE)))
			impl._model.add(impl._resource, RDF.type, MedicalRecord.TYPE);
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
		it = _model.listStatements(_resource,commentOfMedicalRecordProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,hasContactsProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,hasStaticInformationProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,RDF.type, com.mds.decisionsupport.model.MedicalRecord.TYPE);
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
	
	public void clearCache() {
		commentOfMedicalRecord = null;
		hasContacts = null;
		hasStaticInformation = null;
	}

	private com.hp.hpl.jena.rdf.model.Literal createLiteral(Object obj) {
		return _model.createTypedLiteral(obj);
	}

	public java.lang.String getCommentOfMedicalRecord() throws JastorException {
		if (commentOfMedicalRecord != null)
			return commentOfMedicalRecord;
		com.hp.hpl.jena.rdf.model.Statement stmt = _model.getProperty(_resource, commentOfMedicalRecordProperty);
		if (stmt == null)
			return null;
		if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
			throw new JastorInvalidRDFNodeException(uri() + ": commentOfMedicalRecord getProperty() in com.mds.decisionsupport.model.MedicalRecord model not Literal", stmt.getObject());
		com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
		Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
		commentOfMedicalRecord = (java.lang.String)obj;
		return commentOfMedicalRecord;
	}
	
	public void setCommentOfMedicalRecord(java.lang.String commentOfMedicalRecord) throws JastorException {
		if (_model.contains(_resource,commentOfMedicalRecordProperty)) {
			_model.removeAll(_resource,commentOfMedicalRecordProperty,null);
		}
		this.commentOfMedicalRecord = commentOfMedicalRecord;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
		if (commentOfMedicalRecord != null) {
			_model.add(_model.createStatement(_resource,commentOfMedicalRecordProperty, createLiteral(commentOfMedicalRecord)));
		}	
	}


	private void initHasContacts() throws JastorException {
		this.hasContacts = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, hasContactsProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://ontology/mds#hasContacts properties in MedicalRecord model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.mds.decisionsupport.model.Contact hasContacts = com.mds.decisionsupport.model.MdsFactory.getContact(resource,_model);
				this.hasContacts.add(hasContacts);
			}
		}
	}

	public java.util.Iterator getHasContacts() throws JastorException {
		if (hasContacts == null)
			initHasContacts();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(hasContacts,_resource,hasContactsProperty,true);
	}

	public void addHasContacts(com.mds.decisionsupport.model.Contact hasContacts) throws JastorException {
		if (this.hasContacts == null)
			initHasContacts();
		if (this.hasContacts.contains(hasContacts)) {
			this.hasContacts.remove(hasContacts);
			this.hasContacts.add(hasContacts);
			return;
		}
		this.hasContacts.add(hasContacts);
		_model.add(_model.createStatement(_resource,hasContactsProperty,hasContacts.resource()));
	}
	
	public com.mds.decisionsupport.model.Contact addHasContacts() throws JastorException {
		com.mds.decisionsupport.model.Contact hasContacts = com.mds.decisionsupport.model.MdsFactory.createContact(_model.createResource(),_model);
		if (this.hasContacts == null)
			initHasContacts();
		this.hasContacts.add(hasContacts);
		_model.add(_model.createStatement(_resource,hasContactsProperty,hasContacts.resource()));
		return hasContacts;
	}
	
	public com.mds.decisionsupport.model.Contact addHasContacts(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.mds.decisionsupport.model.Contact hasContacts = com.mds.decisionsupport.model.MdsFactory.getContact(resource,_model);
		if (this.hasContacts == null)
			initHasContacts();
		if (this.hasContacts.contains(hasContacts))
			return hasContacts;
		this.hasContacts.add(hasContacts);
		_model.add(_model.createStatement(_resource,hasContactsProperty,hasContacts.resource()));
		return hasContacts;
	}
	
	public void removeHasContacts(com.mds.decisionsupport.model.Contact hasContacts) throws JastorException {
		if (this.hasContacts == null)
			initHasContacts();
		if (!this.hasContacts.contains(hasContacts))
			return;
		if (!_model.contains(_resource, hasContactsProperty, hasContacts.resource()))
			return;
		this.hasContacts.remove(hasContacts);
		_model.removeAll(_resource, hasContactsProperty, hasContacts.resource());
	}
		 

	public com.mds.decisionsupport.model.Patient getHasStaticInformation() throws JastorException {
		if (hasStaticInformation != null)
			return hasStaticInformation;
		com.hp.hpl.jena.rdf.model.Statement stmt = _model.getProperty(_resource, hasStaticInformationProperty);
		if (stmt == null)
			return null;
		if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
			throw new JastorInvalidRDFNodeException(uri() + ": hasStaticInformation getProperty() in com.mds.decisionsupport.model.MedicalRecord model not Resource", stmt.getObject());
		com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
		hasStaticInformation = com.mds.decisionsupport.model.MdsFactory.getPatient(resource,_model);
		return hasStaticInformation;
	}

	public void setHasStaticInformation(com.mds.decisionsupport.model.Patient hasStaticInformation) throws JastorException {
		if (_model.contains(_resource,hasStaticInformationProperty)) {
			_model.removeAll(_resource,hasStaticInformationProperty,null);
		}
		this.hasStaticInformation = hasStaticInformation;
		if (hasStaticInformation != null) {
			_model.add(_model.createStatement(_resource,hasStaticInformationProperty, hasStaticInformation.resource()));
		}			
	}
		
	public com.mds.decisionsupport.model.Patient setHasStaticInformation() throws JastorException {
		if (_model.contains(_resource,hasStaticInformationProperty)) {
			_model.removeAll(_resource,hasStaticInformationProperty,null);
		}
		com.mds.decisionsupport.model.Patient hasStaticInformation = com.mds.decisionsupport.model.MdsFactory.createPatient(_model.createResource(),_model);
		this.hasStaticInformation = hasStaticInformation;
		_model.add(_model.createStatement(_resource,hasStaticInformationProperty, hasStaticInformation.resource()));
		return hasStaticInformation;
	}
	
	public com.mds.decisionsupport.model.Patient setHasStaticInformation(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		if (_model.contains(_resource,hasStaticInformationProperty)) {
			_model.removeAll(_resource,hasStaticInformationProperty,null);
		}
		com.mds.decisionsupport.model.Patient hasStaticInformation = com.mds.decisionsupport.model.MdsFactory.getPatient(resource,_model);
		this.hasStaticInformation = hasStaticInformation;
		_model.add(_model.createStatement(_resource,hasStaticInformationProperty, hasStaticInformation.resource()));
		return hasStaticInformation;
	}
	 


	private java.util.ArrayList listeners;
	
	public void registerListener(ThingListener listener) {
		if (!(listener instanceof MedicalRecordListener))
			throw new IllegalArgumentException("ThingListener must be instance of MedicalRecordListener"); 
		if (listeners == null)
			setupModelListener();
		if(!this.listeners.contains(listener)){
			this.listeners.add((MedicalRecordListener)listener);
		}
	}
	
	public void unregisterListener(ThingListener listener) {
		if (!(listener instanceof MedicalRecordListener))
			throw new IllegalArgumentException("ThingListener must be instance of MedicalRecordListener"); 
		if (listeners == null)
			return;
		if (this.listeners.contains(listener)){
			listeners.remove(listener);
		}
	}



	
		public void addedStatement(com.hp.hpl.jena.rdf.model.Statement stmt) {

			if (stmt.getPredicate().equals(commentOfMedicalRecordProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				commentOfMedicalRecord = (java.lang.String)Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						MedicalRecordListener listener=(MedicalRecordListener)iter.next();
						listener.commentOfMedicalRecordChanged(com.mds.decisionsupport.model.MedicalRecordImpl.this);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(hasContactsProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.mds.decisionsupport.model.Contact _hasContacts = null;
					try {
						_hasContacts = com.mds.decisionsupport.model.MdsFactory.getContact(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (hasContacts == null) {
						try {
							initHasContacts();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!hasContacts.contains(_hasContacts))
						hasContacts.add(_hasContacts);
					if (listeners != null) {
						java.util.ArrayList consumersForHasContacts;
						synchronized (listeners) {
							consumersForHasContacts = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHasContacts.iterator();iter.hasNext();){
							MedicalRecordListener listener=(MedicalRecordListener)iter.next();
							listener.hasContactsAdded(com.mds.decisionsupport.model.MedicalRecordImpl.this,_hasContacts);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(hasStaticInformationProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				hasStaticInformation = null;
				if (true) { // don't check resource type if the property range is Resource
					try {
						hasStaticInformation = com.mds.decisionsupport.model.MdsFactory.getPatient(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						MedicalRecordListener listener=(MedicalRecordListener)iter.next();
						listener.hasStaticInformationChanged(com.mds.decisionsupport.model.MedicalRecordImpl.this);
					}
				}
				return;
			}
		}
		
		public void removedStatement(com.hp.hpl.jena.rdf.model.Statement stmt) {
//			if (!stmt.getSubject().equals(_resource))
//				return;
			if (stmt.getPredicate().equals(commentOfMedicalRecordProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (commentOfMedicalRecord != null && commentOfMedicalRecord.equals(obj))
					commentOfMedicalRecord = null;
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						MedicalRecordListener listener=(MedicalRecordListener)iter.next();
						listener.commentOfMedicalRecordChanged(com.mds.decisionsupport.model.MedicalRecordImpl.this);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(hasContactsProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.mds.decisionsupport.model.Contact _hasContacts = null;
					if (hasContacts != null) {
						boolean found = false;
						for (int i=0;i<hasContacts.size();i++) {
							com.mds.decisionsupport.model.Contact __item = (com.mds.decisionsupport.model.Contact) hasContacts.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_hasContacts = __item;
								break;
							}
						}
						if (found)
							hasContacts.remove(_hasContacts);
						else {
							try {
								_hasContacts = com.mds.decisionsupport.model.MdsFactory.getContact(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_hasContacts = com.mds.decisionsupport.model.MdsFactory.getContact(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForHasContacts;
						synchronized (listeners) {
							consumersForHasContacts = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHasContacts.iterator();iter.hasNext();){
							MedicalRecordListener listener=(MedicalRecordListener)iter.next();
							listener.hasContactsRemoved(com.mds.decisionsupport.model.MedicalRecordImpl.this,_hasContacts);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(hasStaticInformationProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
					if (hasStaticInformation != null && hasStaticInformation.resource().equals(resource))
						hasStaticInformation = null;				
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						MedicalRecordListener listener=(MedicalRecordListener)iter.next();
						listener.hasStaticInformationChanged(com.mds.decisionsupport.model.MedicalRecordImpl.this);
					}
				}
				return;
			}
		}

	//}
	


}