

package com.mds.decisionsupport.model;

import com.hp.hpl.jena.rdf.model.*;
import com.hp.hpl.jena.vocabulary.RDF;
import com.ibm.adtech.jastor.*;
import com.ibm.adtech.jastor.util.*;


/**
 * Implementation of {@link com.mds.decisionsupport.model.Amount}
 * Use the com.mds.decisionsupport.model.MdsFactory to create instances of this class.
 * <p>(URI: http://ontology/mds#Amount)</p>
 * <br>
 */
public class AmountImpl extends com.ibm.adtech.jastor.ThingImpl implements com.mds.decisionsupport.model.Amount {
	

	private static com.hp.hpl.jena.rdf.model.Property hasConfidenceProperty = ResourceFactory.createProperty("http://ontology/mds#hasConfidence");
	private java.lang.Float hasConfidence;
	private static com.hp.hpl.jena.rdf.model.Property hasUnitProperty = ResourceFactory.createProperty("http://ontology/mds#hasUnit");
	private java.lang.String hasUnit;
	private static com.hp.hpl.jena.rdf.model.Property hasDatavalueProperty = ResourceFactory.createProperty("http://ontology/mds#hasDatavalue");
	private java.lang.String hasDatavalue;
 

	AmountImpl(Resource resource, Model model) throws JastorException {
		super(resource, model);
		setupModelListener();
	}     
    	
	static AmountImpl getAmount(Resource resource, Model model) throws JastorException {
		return new AmountImpl(resource, model);
	}
	    
	static AmountImpl createAmount(Resource resource, Model model) throws JastorException { 
		AmountImpl impl = new AmountImpl(resource, model);
		
		if (!impl._model.contains(new com.hp.hpl.jena.rdf.model.impl.StatementImpl(impl._resource, RDF.type, Amount.TYPE)))
			impl._model.add(impl._resource, RDF.type, Amount.TYPE);
		impl.addSuperTypes();
		impl.addHasValueValues();
		return impl;
	}
	
	void addSuperTypes() {
	}
   
	void addHasValueValues() {
	}
    
    @SuppressWarnings("rawtypes")
	private void setupModelListener() {
    	listeners = new java.util.ArrayList();
    	com.mds.decisionsupport.model.MdsFactory.registerThing(this);
    }

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public java.util.List listStatements() {
		java.util.List list = new java.util.ArrayList();
		StmtIterator it = null;
		it = _model.listStatements(_resource,hasConfidenceProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,hasUnitProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,hasDatavalueProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,RDF.type, com.mds.decisionsupport.model.Amount.TYPE);
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
	
	public void clearCache() {
		hasConfidence = null;
		hasUnit = null;
		hasDatavalue = null;
	}

	private com.hp.hpl.jena.rdf.model.Literal createLiteral(Object obj) {
		return _model.createTypedLiteral(obj);
	}

	public java.lang.Float getHasConfidence() throws JastorException {
		if (hasConfidence != null)
			return hasConfidence;
		com.hp.hpl.jena.rdf.model.Statement stmt = _model.getProperty(_resource, hasConfidenceProperty);
		if (stmt == null)
			return null;
		if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
			throw new JastorInvalidRDFNodeException(uri() + ": hasConfidence getProperty() in com.mds.decisionsupport.model.Amount model not Literal", stmt.getObject());
		com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
		Object obj = Util.fixLiteral(true,literal,"java.lang.Float","http://www.w3.org/2001/XMLSchema#float");
		hasConfidence = (java.lang.Float)obj;
		return hasConfidence;
	}
	
	public void setHasConfidence(java.lang.Float hasConfidence) throws JastorException {
		if (_model.contains(_resource,hasConfidenceProperty)) {
			_model.removeAll(_resource,hasConfidenceProperty,null);
		}
		this.hasConfidence = hasConfidence;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
		if (hasConfidence != null) {
			_model.add(_model.createStatement(_resource,hasConfidenceProperty, createLiteral(hasConfidence)));
		}	
	}

	public java.lang.String getHasUnit() throws JastorException {
		if (hasUnit != null)
			return hasUnit;
		com.hp.hpl.jena.rdf.model.Statement stmt = _model.getProperty(_resource, hasUnitProperty);
		if (stmt == null)
			return null;
		if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
			throw new JastorInvalidRDFNodeException(uri() + ": hasUnit getProperty() in com.mds.decisionsupport.model.Amount model not Literal", stmt.getObject());
		com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
		Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
		hasUnit = (java.lang.String)obj;
		return hasUnit;
	}
	
	public void setHasUnit(java.lang.String hasUnit) throws JastorException {
		if (_model.contains(_resource,hasUnitProperty)) {
			_model.removeAll(_resource,hasUnitProperty,null);
		}
		this.hasUnit = hasUnit;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
		if (hasUnit != null) {
			_model.add(_model.createStatement(_resource,hasUnitProperty, createLiteral(hasUnit)));
		}	
	}

	public java.lang.String getHasDatavalue() throws JastorException {
		if (hasDatavalue != null)
			return hasDatavalue;
		com.hp.hpl.jena.rdf.model.Statement stmt = _model.getProperty(_resource, hasDatavalueProperty);
		if (stmt == null)
			return null;
		if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
			throw new JastorInvalidRDFNodeException(uri() + ": hasDatavalue getProperty() in com.mds.decisionsupport.model.Amount model not Literal", stmt.getObject());
		com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
		Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
		hasDatavalue = (java.lang.String)obj;
		return hasDatavalue;
	}
	
	public void setHasDatavalue(java.lang.String hasDatavalue) throws JastorException {
		if (_model.contains(_resource,hasDatavalueProperty)) {
			_model.removeAll(_resource,hasDatavalueProperty,null);
		}
		this.hasDatavalue = hasDatavalue;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
		if (hasDatavalue != null) {
			_model.add(_model.createStatement(_resource,hasDatavalueProperty, createLiteral(hasDatavalue)));
		}	
	}
 


	@SuppressWarnings("rawtypes")
	private java.util.ArrayList listeners;
	
	@SuppressWarnings("unchecked")
	public void registerListener(ThingListener listener) {
		if (!(listener instanceof AmountListener))
			throw new IllegalArgumentException("ThingListener must be instance of AmountListener"); 
		if (listeners == null)
			setupModelListener();
		if(!this.listeners.contains(listener)){
			this.listeners.add((AmountListener)listener);
		}
	}
	
	public void unregisterListener(ThingListener listener) {
		if (!(listener instanceof AmountListener))
			throw new IllegalArgumentException("ThingListener must be instance of AmountListener"); 
		if (listeners == null)
			return;
		if (this.listeners.contains(listener)){
			listeners.remove(listener);
		}
	}



	
		@SuppressWarnings("rawtypes")
		public void addedStatement(com.hp.hpl.jena.rdf.model.Statement stmt) {

			if (stmt.getPredicate().equals(hasConfidenceProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				hasConfidence = (java.lang.Float)Util.fixLiteral(true,literal,"java.lang.Float","http://www.w3.org/2001/XMLSchema#float");
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						AmountListener listener=(AmountListener)iter.next();
						listener.hasConfidenceChanged(com.mds.decisionsupport.model.AmountImpl.this);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(hasUnitProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				hasUnit = (java.lang.String)Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						AmountListener listener=(AmountListener)iter.next();
						listener.hasUnitChanged(com.mds.decisionsupport.model.AmountImpl.this);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(hasDatavalueProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				hasDatavalue = (java.lang.String)Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						AmountListener listener=(AmountListener)iter.next();
						listener.hasDatavalueChanged(com.mds.decisionsupport.model.AmountImpl.this);
					}
				}
				return;
			}
		}
		
		@SuppressWarnings("rawtypes")
		public void removedStatement(com.hp.hpl.jena.rdf.model.Statement stmt) {
//			if (!stmt.getSubject().equals(_resource))
//				return;
			if (stmt.getPredicate().equals(hasConfidenceProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.Float","http://www.w3.org/2001/XMLSchema#float");
				if (hasConfidence != null && hasConfidence.equals(obj))
					hasConfidence = null;
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						AmountListener listener=(AmountListener)iter.next();
						listener.hasConfidenceChanged(com.mds.decisionsupport.model.AmountImpl.this);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(hasUnitProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (hasUnit != null && hasUnit.equals(obj))
					hasUnit = null;
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						AmountListener listener=(AmountListener)iter.next();
						listener.hasUnitChanged(com.mds.decisionsupport.model.AmountImpl.this);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(hasDatavalueProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (hasDatavalue != null && hasDatavalue.equals(obj))
					hasDatavalue = null;
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						AmountListener listener=(AmountListener)iter.next();
						listener.hasDatavalueChanged(com.mds.decisionsupport.model.AmountImpl.this);
					}
				}
				return;
			}
		}

	//}
	


}