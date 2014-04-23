

package com.mds.decisionsupport.model;

/*
import com.hp.hpl.jena.datatypes.xsd.*;
import com.hp.hpl.jena.datatypes.xsd.impl.*;
*/
import com.hp.hpl.jena.rdf.model.*;
import com.hp.hpl.jena.vocabulary.RDF;
import com.ibm.adtech.jastor.*;


/**
 * Implementation of {@link com.mds.decisionsupport.model.CompositionOfMedicalItems}
 * Use the com.mds.decisionsupport.model.MdsFactory to create instances of this class.
 * <p>(URI: http://ontology/mds#CompositionOfMedicalItems)</p>
 * <br>
 */
@SuppressWarnings({ "rawtypes", "unchecked" })
public class CompositionOfMedicalItemsImpl extends com.ibm.adtech.jastor.ThingImpl implements com.mds.decisionsupport.model.CompositionOfMedicalItems {
	

	private static com.hp.hpl.jena.rdf.model.Property hasMedicalItemsRegroupedProperty = ResourceFactory.createProperty("http://ontology/mds#hasMedicalItemsRegrouped");
	private java.util.ArrayList hasMedicalItemsRegrouped;
 

	CompositionOfMedicalItemsImpl(Resource resource, Model model) throws JastorException {
		super(resource, model);
		setupModelListener();
	}     
    	
	static CompositionOfMedicalItemsImpl getCompositionOfMedicalItems(Resource resource, Model model) throws JastorException {
		return new CompositionOfMedicalItemsImpl(resource, model);
	}
	    
	static CompositionOfMedicalItemsImpl createCompositionOfMedicalItems(Resource resource, Model model) throws JastorException { 
		CompositionOfMedicalItemsImpl impl = new CompositionOfMedicalItemsImpl(resource, model);
		
		if (!impl._model.contains(new com.hp.hpl.jena.rdf.model.impl.StatementImpl(impl._resource, RDF.type, CompositionOfMedicalItems.TYPE)))
			impl._model.add(impl._resource, RDF.type, CompositionOfMedicalItems.TYPE);
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
		it = _model.listStatements(_resource,hasMedicalItemsRegroupedProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,RDF.type, com.mds.decisionsupport.model.CompositionOfMedicalItems.TYPE);
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
	
	public void clearCache() {
		hasMedicalItemsRegrouped = null;
	}

	@SuppressWarnings("unused")
	private com.hp.hpl.jena.rdf.model.Literal createLiteral(Object obj) {
		return _model.createTypedLiteral(obj);
	}


	private void initHasMedicalItemsRegrouped() throws JastorException {
		this.hasMedicalItemsRegrouped = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, hasMedicalItemsRegroupedProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://ontology/mds#hasMedicalItemsRegrouped properties in CompositionOfMedicalItems model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.mds.decisionsupport.model.MedicalItem hasMedicalItemsRegrouped = com.mds.decisionsupport.model.MdsFactory.getMedicalItem(resource,_model);
				this.hasMedicalItemsRegrouped.add(hasMedicalItemsRegrouped);
			}
		}
	}

	public java.util.Iterator getHasMedicalItemsRegrouped() throws JastorException {
		if (hasMedicalItemsRegrouped == null)
			initHasMedicalItemsRegrouped();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(hasMedicalItemsRegrouped,_resource,hasMedicalItemsRegroupedProperty,true);
	}

	public void addHasMedicalItemsRegrouped(com.mds.decisionsupport.model.MedicalItem hasMedicalItemsRegrouped) throws JastorException {
		if (this.hasMedicalItemsRegrouped == null)
			initHasMedicalItemsRegrouped();
		if (this.hasMedicalItemsRegrouped.contains(hasMedicalItemsRegrouped)) {
			this.hasMedicalItemsRegrouped.remove(hasMedicalItemsRegrouped);
			this.hasMedicalItemsRegrouped.add(hasMedicalItemsRegrouped);
			return;
		}
		this.hasMedicalItemsRegrouped.add(hasMedicalItemsRegrouped);
		_model.add(_model.createStatement(_resource,hasMedicalItemsRegroupedProperty,hasMedicalItemsRegrouped.resource()));
	}
	
	public com.mds.decisionsupport.model.MedicalItem addHasMedicalItemsRegrouped() throws JastorException {
		com.mds.decisionsupport.model.MedicalItem hasMedicalItemsRegrouped = com.mds.decisionsupport.model.MdsFactory.createMedicalItem(_model.createResource(),_model);
		if (this.hasMedicalItemsRegrouped == null)
			initHasMedicalItemsRegrouped();
		this.hasMedicalItemsRegrouped.add(hasMedicalItemsRegrouped);
		_model.add(_model.createStatement(_resource,hasMedicalItemsRegroupedProperty,hasMedicalItemsRegrouped.resource()));
		return hasMedicalItemsRegrouped;
	}
	
	public com.mds.decisionsupport.model.MedicalItem addHasMedicalItemsRegrouped(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.mds.decisionsupport.model.MedicalItem hasMedicalItemsRegrouped = com.mds.decisionsupport.model.MdsFactory.getMedicalItem(resource,_model);
		if (this.hasMedicalItemsRegrouped == null)
			initHasMedicalItemsRegrouped();
		if (this.hasMedicalItemsRegrouped.contains(hasMedicalItemsRegrouped))
			return hasMedicalItemsRegrouped;
		this.hasMedicalItemsRegrouped.add(hasMedicalItemsRegrouped);
		_model.add(_model.createStatement(_resource,hasMedicalItemsRegroupedProperty,hasMedicalItemsRegrouped.resource()));
		return hasMedicalItemsRegrouped;
	}
	
	public void removeHasMedicalItemsRegrouped(com.mds.decisionsupport.model.MedicalItem hasMedicalItemsRegrouped) throws JastorException {
		if (this.hasMedicalItemsRegrouped == null)
			initHasMedicalItemsRegrouped();
		if (!this.hasMedicalItemsRegrouped.contains(hasMedicalItemsRegrouped))
			return;
		if (!_model.contains(_resource, hasMedicalItemsRegroupedProperty, hasMedicalItemsRegrouped.resource()))
			return;
		this.hasMedicalItemsRegrouped.remove(hasMedicalItemsRegrouped);
		_model.removeAll(_resource, hasMedicalItemsRegroupedProperty, hasMedicalItemsRegrouped.resource());
	}
		  


	private java.util.ArrayList listeners;
	
	public void registerListener(ThingListener listener) {
		if (!(listener instanceof CompositionOfMedicalItemsListener))
			throw new IllegalArgumentException("ThingListener must be instance of CompositionOfMedicalItemsListener"); 
		if (listeners == null)
			setupModelListener();
		if(!this.listeners.contains(listener)){
			this.listeners.add((CompositionOfMedicalItemsListener)listener);
		}
	}
	
	public void unregisterListener(ThingListener listener) {
		if (!(listener instanceof CompositionOfMedicalItemsListener))
			throw new IllegalArgumentException("ThingListener must be instance of CompositionOfMedicalItemsListener"); 
		if (listeners == null)
			return;
		if (this.listeners.contains(listener)){
			listeners.remove(listener);
		}
	}



	
		public void addedStatement(com.hp.hpl.jena.rdf.model.Statement stmt) {

			if (stmt.getPredicate().equals(hasMedicalItemsRegroupedProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.mds.decisionsupport.model.MedicalItem _hasMedicalItemsRegrouped = null;
					try {
						_hasMedicalItemsRegrouped = com.mds.decisionsupport.model.MdsFactory.getMedicalItem(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (hasMedicalItemsRegrouped == null) {
						try {
							initHasMedicalItemsRegrouped();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!hasMedicalItemsRegrouped.contains(_hasMedicalItemsRegrouped))
						hasMedicalItemsRegrouped.add(_hasMedicalItemsRegrouped);
					if (listeners != null) {
						java.util.ArrayList consumersForHasMedicalItemsRegrouped;
						synchronized (listeners) {
							consumersForHasMedicalItemsRegrouped = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHasMedicalItemsRegrouped.iterator();iter.hasNext();){
							CompositionOfMedicalItemsListener listener=(CompositionOfMedicalItemsListener)iter.next();
							listener.hasMedicalItemsRegroupedAdded(com.mds.decisionsupport.model.CompositionOfMedicalItemsImpl.this,_hasMedicalItemsRegrouped);
						}
					}
				}
				return;
			}
		}
		
		public void removedStatement(com.hp.hpl.jena.rdf.model.Statement stmt) {
//			if (!stmt.getSubject().equals(_resource))
//				return;
			if (stmt.getPredicate().equals(hasMedicalItemsRegroupedProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.mds.decisionsupport.model.MedicalItem _hasMedicalItemsRegrouped = null;
					if (hasMedicalItemsRegrouped != null) {
						boolean found = false;
						for (int i=0;i<hasMedicalItemsRegrouped.size();i++) {
							com.mds.decisionsupport.model.MedicalItem __item = (com.mds.decisionsupport.model.MedicalItem) hasMedicalItemsRegrouped.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_hasMedicalItemsRegrouped = __item;
								break;
							}
						}
						if (found)
							hasMedicalItemsRegrouped.remove(_hasMedicalItemsRegrouped);
						else {
							try {
								_hasMedicalItemsRegrouped = com.mds.decisionsupport.model.MdsFactory.getMedicalItem(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_hasMedicalItemsRegrouped = com.mds.decisionsupport.model.MdsFactory.getMedicalItem(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForHasMedicalItemsRegrouped;
						synchronized (listeners) {
							consumersForHasMedicalItemsRegrouped = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHasMedicalItemsRegrouped.iterator();iter.hasNext();){
							CompositionOfMedicalItemsListener listener=(CompositionOfMedicalItemsListener)iter.next();
							listener.hasMedicalItemsRegroupedRemoved(com.mds.decisionsupport.model.CompositionOfMedicalItemsImpl.this,_hasMedicalItemsRegrouped);
						}
					}
				}
				return;
			}
		}

	//}
	


}