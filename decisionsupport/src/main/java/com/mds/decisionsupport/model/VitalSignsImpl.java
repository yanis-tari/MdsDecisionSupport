

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
 * Implementation of {@link com.mds.decisionsupport.model.VitalSigns}
 * Use the com.mds.decisionsupport.model.MdsFactory to create instances of this class.
 * <p>(URI: http://ontology/mds#VitalSigns)</p>
 * <br>
 */
public class VitalSignsImpl extends com.ibm.adtech.jastor.ThingImpl implements com.mds.decisionsupport.model.VitalSigns {
	

	private static com.hp.hpl.jena.rdf.model.Property hasGeographicalLocationProperty = ResourceFactory.createProperty("http://ontology/mds#hasGeographicalLocation");
	private java.util.ArrayList hasGeographicalLocation;
	private static com.hp.hpl.jena.rdf.model.Property endDateOfMedicalItemProperty = ResourceFactory.createProperty("http://ontology/mds#endDateOfMedicalItem");
	private com.hp.hpl.jena.datatypes.xsd.XSDDateTime endDateOfMedicalItem;
	private static com.hp.hpl.jena.rdf.model.Property hasSourceProperty = ResourceFactory.createProperty("http://ontology/mds#hasSource");
	private java.util.ArrayList hasSource_asNaturalPerson;
	private java.util.ArrayList hasSource_asSensingDevice;
	private static com.hp.hpl.jena.rdf.model.Property startDateOfMedicalItemProperty = ResourceFactory.createProperty("http://ontology/mds#startDateOfMedicalItem");
	private com.hp.hpl.jena.datatypes.xsd.XSDDateTime startDateOfMedicalItem;
	private static com.hp.hpl.jena.rdf.model.Property hasEffectTimeProperty = ResourceFactory.createProperty("http://ontology/mds#hasEffectTime");
	private com.hp.hpl.jena.datatypes.xsd.XSDDateTime hasEffectTime;
	private static com.hp.hpl.jena.rdf.model.Property hasNomenclatureCodeProperty = ResourceFactory.createProperty("http://ontology/mds#hasNomenclatureCode");
	private java.util.ArrayList hasNomenclatureCode;
	private static com.hp.hpl.jena.rdf.model.Property isPartOfProperty = ResourceFactory.createProperty("http://ontology/mds#isPartOf");
	private java.util.ArrayList isPartOf;
	private static com.hp.hpl.jena.rdf.model.Property hasMedicalObjectProperty = ResourceFactory.createProperty("http://ontology/mds#hasMedicalObject");
	private java.util.ArrayList hasMedicalObject;
	private static com.hp.hpl.jena.rdf.model.Property hasContextProperty = ResourceFactory.createProperty("http://ontology/mds#hasContext");
	private java.util.ArrayList hasContext;
	private static com.hp.hpl.jena.rdf.model.Property commentOfMedicalItemProperty = ResourceFactory.createProperty("http://ontology/mds#commentOfMedicalItem");
	private java.lang.String commentOfMedicalItem;
	private static com.hp.hpl.jena.rdf.model.Property hasAmountProperty = ResourceFactory.createProperty("http://ontology/mds#hasAmount");
	private java.util.ArrayList hasAmount;
	private static com.hp.hpl.jena.rdf.model.Property hasTimeStampProperty = ResourceFactory.createProperty("http://ontology/mds#hasTimeStamp");
	private com.hp.hpl.jena.datatypes.xsd.XSDDateTime hasTimeStamp;
 

	VitalSignsImpl(Resource resource, Model model) throws JastorException {
		super(resource, model);
		setupModelListener();
	}     
    	
	static VitalSignsImpl getVitalSigns(Resource resource, Model model) throws JastorException {
		return new VitalSignsImpl(resource, model);
	}
	    
	static VitalSignsImpl createVitalSigns(Resource resource, Model model) throws JastorException { 
		VitalSignsImpl impl = new VitalSignsImpl(resource, model);
		
		if (!impl._model.contains(new com.hp.hpl.jena.rdf.model.impl.StatementImpl(impl._resource, RDF.type, VitalSigns.TYPE)))
			impl._model.add(impl._resource, RDF.type, VitalSigns.TYPE);
		impl.addSuperTypes();
		impl.addHasValueValues();
		return impl;
	}
	
	void addSuperTypes() {
		if (!_model.contains(_resource, RDF.type, com.mds.decisionsupport.model.MedicalItem.TYPE))
			_model.add(new com.hp.hpl.jena.rdf.model.impl.StatementImpl(_resource, RDF.type, com.mds.decisionsupport.model.MedicalItem.TYPE));     
		if (!_model.contains(_resource, RDF.type, com.mds.decisionsupport.model.Objective.TYPE))
			_model.add(new com.hp.hpl.jena.rdf.model.impl.StatementImpl(_resource, RDF.type, com.mds.decisionsupport.model.Objective.TYPE));     
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
		it = _model.listStatements(_resource,hasGeographicalLocationProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,endDateOfMedicalItemProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,hasSourceProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,startDateOfMedicalItemProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,hasEffectTimeProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,hasNomenclatureCodeProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,isPartOfProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,hasMedicalObjectProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,hasContextProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,commentOfMedicalItemProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,hasAmountProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,hasTimeStampProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,RDF.type, com.mds.decisionsupport.model.VitalSigns.TYPE);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,RDF.type, com.mds.decisionsupport.model.MedicalItem.TYPE);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,RDF.type, com.mds.decisionsupport.model.Objective.TYPE);
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
	
	public void clearCache() {
		hasGeographicalLocation = null;
		endDateOfMedicalItem = null;
		hasSource_asNaturalPerson = null;
		hasSource_asSensingDevice = null;
		startDateOfMedicalItem = null;
		hasEffectTime = null;
		hasNomenclatureCode = null;
		isPartOf = null;
		hasMedicalObject = null;
		hasContext = null;
		commentOfMedicalItem = null;
		hasAmount = null;
		hasTimeStamp = null;
	}

	private com.hp.hpl.jena.rdf.model.Literal createLiteral(Object obj) {
		return _model.createTypedLiteral(obj);
	}


	private void initHasGeographicalLocation() throws JastorException {
		this.hasGeographicalLocation = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, hasGeographicalLocationProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://ontology/mds#hasGeographicalLocation properties in VitalSigns model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing hasGeographicalLocation = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.hasGeographicalLocation.add(hasGeographicalLocation);
			}
		}
	}

	public java.util.Iterator getHasGeographicalLocation() throws JastorException {
		if (hasGeographicalLocation == null)
			initHasGeographicalLocation();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(hasGeographicalLocation,_resource,hasGeographicalLocationProperty,true);
	}

	public void addHasGeographicalLocation(com.ibm.adtech.jastor.Thing hasGeographicalLocation) throws JastorException {
		if (this.hasGeographicalLocation == null)
			initHasGeographicalLocation();
		if (this.hasGeographicalLocation.contains(hasGeographicalLocation)) {
			this.hasGeographicalLocation.remove(hasGeographicalLocation);
			this.hasGeographicalLocation.add(hasGeographicalLocation);
			return;
		}
		this.hasGeographicalLocation.add(hasGeographicalLocation);
		_model.add(_model.createStatement(_resource,hasGeographicalLocationProperty,hasGeographicalLocation.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addHasGeographicalLocation() throws JastorException {
		com.ibm.adtech.jastor.Thing hasGeographicalLocation = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.hasGeographicalLocation == null)
			initHasGeographicalLocation();
		this.hasGeographicalLocation.add(hasGeographicalLocation);
		_model.add(_model.createStatement(_resource,hasGeographicalLocationProperty,hasGeographicalLocation.resource()));
		return hasGeographicalLocation;
	}
	
	public com.ibm.adtech.jastor.Thing addHasGeographicalLocation(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing hasGeographicalLocation = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.hasGeographicalLocation == null)
			initHasGeographicalLocation();
		if (this.hasGeographicalLocation.contains(hasGeographicalLocation))
			return hasGeographicalLocation;
		this.hasGeographicalLocation.add(hasGeographicalLocation);
		_model.add(_model.createStatement(_resource,hasGeographicalLocationProperty,hasGeographicalLocation.resource()));
		return hasGeographicalLocation;
	}
	
	public void removeHasGeographicalLocation(com.ibm.adtech.jastor.Thing hasGeographicalLocation) throws JastorException {
		if (this.hasGeographicalLocation == null)
			initHasGeographicalLocation();
		if (!this.hasGeographicalLocation.contains(hasGeographicalLocation))
			return;
		if (!_model.contains(_resource, hasGeographicalLocationProperty, hasGeographicalLocation.resource()))
			return;
		this.hasGeographicalLocation.remove(hasGeographicalLocation);
		_model.removeAll(_resource, hasGeographicalLocationProperty, hasGeographicalLocation.resource());
	}
		 
	public com.hp.hpl.jena.datatypes.xsd.XSDDateTime getEndDateOfMedicalItem() throws JastorException {
		if (endDateOfMedicalItem != null)
			return endDateOfMedicalItem;
		com.hp.hpl.jena.rdf.model.Statement stmt = _model.getProperty(_resource, endDateOfMedicalItemProperty);
		if (stmt == null)
			return null;
		if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
			throw new JastorInvalidRDFNodeException(uri() + ": endDateOfMedicalItem getProperty() in com.mds.decisionsupport.model.VitalSigns model not Literal", stmt.getObject());
		com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
		Object obj = Util.fixLiteral(true,literal,"com.hp.hpl.jena.datatypes.xsd.XSDDateTime","http://www.w3.org/2001/XMLSchema#dateTime");
		endDateOfMedicalItem = (com.hp.hpl.jena.datatypes.xsd.XSDDateTime)obj;
		return endDateOfMedicalItem;
	}
	
	public void setEndDateOfMedicalItem(com.hp.hpl.jena.datatypes.xsd.XSDDateTime endDateOfMedicalItem) throws JastorException {
		if (_model.contains(_resource,endDateOfMedicalItemProperty)) {
			_model.removeAll(_resource,endDateOfMedicalItemProperty,null);
		}
		this.endDateOfMedicalItem = endDateOfMedicalItem;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
		if (endDateOfMedicalItem != null) {
			_model.add(_model.createStatement(_resource,endDateOfMedicalItemProperty, createLiteral(endDateOfMedicalItem)));
		}	
	}


	private void initHasSource_asNaturalPerson() throws JastorException {
		this.hasSource_asNaturalPerson = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, hasSourceProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://ontology/mds#hasSource properties in VitalSigns model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (_model.contains(resource,RDF.type,com.mds.decisionsupport.model.NaturalPerson.TYPE)) {
				com.mds.decisionsupport.model.NaturalPerson hasSource = com.mds.decisionsupport.model.MdsFactory.getNaturalPerson(resource,_model);
				this.hasSource_asNaturalPerson.add(hasSource);
			}
		}
	}

	public java.util.Iterator getHasSource_asNaturalPerson() throws JastorException {
		if (hasSource_asNaturalPerson == null)
			initHasSource_asNaturalPerson();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(hasSource_asNaturalPerson,_resource,hasSourceProperty,true);
	}

	public void addHasSource(com.mds.decisionsupport.model.NaturalPerson hasSource) throws JastorException {
		if (this.hasSource_asNaturalPerson == null)
			initHasSource_asNaturalPerson();
		if (this.hasSource_asNaturalPerson.contains(hasSource)) {
			this.hasSource_asNaturalPerson.remove(hasSource);
			this.hasSource_asNaturalPerson.add(hasSource);
			return;
		}
		this.hasSource_asNaturalPerson.add(hasSource);
		_model.add(_model.createStatement(_resource,hasSourceProperty,hasSource.resource()));
	}
	
	public com.mds.decisionsupport.model.NaturalPerson addHasSource_asNaturalPerson() throws JastorException {
		com.mds.decisionsupport.model.NaturalPerson hasSource = com.mds.decisionsupport.model.MdsFactory.createNaturalPerson(_model.createResource(),_model);
		if (this.hasSource_asNaturalPerson == null)
			initHasSource_asNaturalPerson();
		this.hasSource_asNaturalPerson.add(hasSource);
		_model.add(_model.createStatement(_resource,hasSourceProperty,hasSource.resource()));
		return hasSource;
	}
	
	public com.mds.decisionsupport.model.NaturalPerson addHasSource_asNaturalPerson(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.mds.decisionsupport.model.NaturalPerson hasSource = com.mds.decisionsupport.model.MdsFactory.getNaturalPerson(resource,_model);
		if (this.hasSource_asNaturalPerson == null)
			initHasSource_asNaturalPerson();
		if (this.hasSource_asNaturalPerson.contains(hasSource))
			return hasSource;
		this.hasSource_asNaturalPerson.add(hasSource);
		_model.add(_model.createStatement(_resource,hasSourceProperty,hasSource.resource()));
		return hasSource;
	}
	
	public void removeHasSource(com.mds.decisionsupport.model.NaturalPerson hasSource) throws JastorException {
		if (this.hasSource_asNaturalPerson == null)
			initHasSource_asNaturalPerson();
		if (!this.hasSource_asNaturalPerson.contains(hasSource))
			return;
		if (!_model.contains(_resource, hasSourceProperty, hasSource.resource()))
			return;
		this.hasSource_asNaturalPerson.remove(hasSource);
		_model.removeAll(_resource, hasSourceProperty, hasSource.resource());
	}
		
	private void initHasSource_asSensingDevice() throws JastorException {
		this.hasSource_asSensingDevice = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, hasSourceProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://ontology/mds#hasSource properties in VitalSigns model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (_model.contains(resource,RDF.type,com.mds.decisionsupport.model.SensingDevice.TYPE)) {
				com.mds.decisionsupport.model.SensingDevice hasSource = com.mds.decisionsupport.model.MdsFactory.getSensingDevice(resource,_model);
				this.hasSource_asSensingDevice.add(hasSource);
			}
		}
	}

	public java.util.Iterator getHasSource_asSensingDevice() throws JastorException {
		if (hasSource_asSensingDevice == null)
			initHasSource_asSensingDevice();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(hasSource_asSensingDevice,_resource,hasSourceProperty,true);
	}

	public void addHasSource(com.mds.decisionsupport.model.SensingDevice hasSource) throws JastorException {
		if (this.hasSource_asSensingDevice == null)
			initHasSource_asSensingDevice();
		if (this.hasSource_asSensingDevice.contains(hasSource)) {
			this.hasSource_asSensingDevice.remove(hasSource);
			this.hasSource_asSensingDevice.add(hasSource);
			return;
		}
		this.hasSource_asSensingDevice.add(hasSource);
		_model.add(_model.createStatement(_resource,hasSourceProperty,hasSource.resource()));
	}
	
	public com.mds.decisionsupport.model.SensingDevice addHasSource_asSensingDevice() throws JastorException {
		com.mds.decisionsupport.model.SensingDevice hasSource = com.mds.decisionsupport.model.MdsFactory.createSensingDevice(_model.createResource(),_model);
		if (this.hasSource_asSensingDevice == null)
			initHasSource_asSensingDevice();
		this.hasSource_asSensingDevice.add(hasSource);
		_model.add(_model.createStatement(_resource,hasSourceProperty,hasSource.resource()));
		return hasSource;
	}
	
	public com.mds.decisionsupport.model.SensingDevice addHasSource_asSensingDevice(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.mds.decisionsupport.model.SensingDevice hasSource = com.mds.decisionsupport.model.MdsFactory.getSensingDevice(resource,_model);
		if (this.hasSource_asSensingDevice == null)
			initHasSource_asSensingDevice();
		if (this.hasSource_asSensingDevice.contains(hasSource))
			return hasSource;
		this.hasSource_asSensingDevice.add(hasSource);
		_model.add(_model.createStatement(_resource,hasSourceProperty,hasSource.resource()));
		return hasSource;
	}
	
	public void removeHasSource(com.mds.decisionsupport.model.SensingDevice hasSource) throws JastorException {
		if (this.hasSource_asSensingDevice == null)
			initHasSource_asSensingDevice();
		if (!this.hasSource_asSensingDevice.contains(hasSource))
			return;
		if (!_model.contains(_resource, hasSourceProperty, hasSource.resource()))
			return;
		this.hasSource_asSensingDevice.remove(hasSource);
		_model.removeAll(_resource, hasSourceProperty, hasSource.resource());
	}
		 
	public com.hp.hpl.jena.datatypes.xsd.XSDDateTime getStartDateOfMedicalItem() throws JastorException {
		if (startDateOfMedicalItem != null)
			return startDateOfMedicalItem;
		com.hp.hpl.jena.rdf.model.Statement stmt = _model.getProperty(_resource, startDateOfMedicalItemProperty);
		if (stmt == null)
			return null;
		if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
			throw new JastorInvalidRDFNodeException(uri() + ": startDateOfMedicalItem getProperty() in com.mds.decisionsupport.model.VitalSigns model not Literal", stmt.getObject());
		com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
		Object obj = Util.fixLiteral(true,literal,"com.hp.hpl.jena.datatypes.xsd.XSDDateTime","http://www.w3.org/2001/XMLSchema#dateTime");
		startDateOfMedicalItem = (com.hp.hpl.jena.datatypes.xsd.XSDDateTime)obj;
		return startDateOfMedicalItem;
	}
	
	public void setStartDateOfMedicalItem(com.hp.hpl.jena.datatypes.xsd.XSDDateTime startDateOfMedicalItem) throws JastorException {
		if (_model.contains(_resource,startDateOfMedicalItemProperty)) {
			_model.removeAll(_resource,startDateOfMedicalItemProperty,null);
		}
		this.startDateOfMedicalItem = startDateOfMedicalItem;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
		if (startDateOfMedicalItem != null) {
			_model.add(_model.createStatement(_resource,startDateOfMedicalItemProperty, createLiteral(startDateOfMedicalItem)));
		}	
	}

	public com.hp.hpl.jena.datatypes.xsd.XSDDateTime getHasEffectTime() throws JastorException {
		if (hasEffectTime != null)
			return hasEffectTime;
		com.hp.hpl.jena.rdf.model.Statement stmt = _model.getProperty(_resource, hasEffectTimeProperty);
		if (stmt == null)
			return null;
		if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
			throw new JastorInvalidRDFNodeException(uri() + ": hasEffectTime getProperty() in com.mds.decisionsupport.model.VitalSigns model not Literal", stmt.getObject());
		com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
		Object obj = Util.fixLiteral(true,literal,"com.hp.hpl.jena.datatypes.xsd.XSDDateTime","http://www.w3.org/2001/XMLSchema#dateTime");
		hasEffectTime = (com.hp.hpl.jena.datatypes.xsd.XSDDateTime)obj;
		return hasEffectTime;
	}
	
	public void setHasEffectTime(com.hp.hpl.jena.datatypes.xsd.XSDDateTime hasEffectTime) throws JastorException {
		if (_model.contains(_resource,hasEffectTimeProperty)) {
			_model.removeAll(_resource,hasEffectTimeProperty,null);
		}
		this.hasEffectTime = hasEffectTime;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
		if (hasEffectTime != null) {
			_model.add(_model.createStatement(_resource,hasEffectTimeProperty, createLiteral(hasEffectTime)));
		}	
	}


	private void initHasNomenclatureCode() throws JastorException {
		this.hasNomenclatureCode = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, hasNomenclatureCodeProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://ontology/mds#hasNomenclatureCode properties in VitalSigns model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.ibm.adtech.jastor.Thing hasNomenclatureCode = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
				this.hasNomenclatureCode.add(hasNomenclatureCode);
			}
		}
	}

	public java.util.Iterator getHasNomenclatureCode() throws JastorException {
		if (hasNomenclatureCode == null)
			initHasNomenclatureCode();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(hasNomenclatureCode,_resource,hasNomenclatureCodeProperty,true);
	}

	public void addHasNomenclatureCode(com.ibm.adtech.jastor.Thing hasNomenclatureCode) throws JastorException {
		if (this.hasNomenclatureCode == null)
			initHasNomenclatureCode();
		if (this.hasNomenclatureCode.contains(hasNomenclatureCode)) {
			this.hasNomenclatureCode.remove(hasNomenclatureCode);
			this.hasNomenclatureCode.add(hasNomenclatureCode);
			return;
		}
		this.hasNomenclatureCode.add(hasNomenclatureCode);
		_model.add(_model.createStatement(_resource,hasNomenclatureCodeProperty,hasNomenclatureCode.resource()));
	}
	
	public com.ibm.adtech.jastor.Thing addHasNomenclatureCode() throws JastorException {
		com.ibm.adtech.jastor.Thing hasNomenclatureCode = com.ibm.adtech.jastor.ThingFactory.createThing(_model.createResource(),_model);
		if (this.hasNomenclatureCode == null)
			initHasNomenclatureCode();
		this.hasNomenclatureCode.add(hasNomenclatureCode);
		_model.add(_model.createStatement(_resource,hasNomenclatureCodeProperty,hasNomenclatureCode.resource()));
		return hasNomenclatureCode;
	}
	
	public com.ibm.adtech.jastor.Thing addHasNomenclatureCode(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.ibm.adtech.jastor.Thing hasNomenclatureCode = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
		if (this.hasNomenclatureCode == null)
			initHasNomenclatureCode();
		if (this.hasNomenclatureCode.contains(hasNomenclatureCode))
			return hasNomenclatureCode;
		this.hasNomenclatureCode.add(hasNomenclatureCode);
		_model.add(_model.createStatement(_resource,hasNomenclatureCodeProperty,hasNomenclatureCode.resource()));
		return hasNomenclatureCode;
	}
	
	public void removeHasNomenclatureCode(com.ibm.adtech.jastor.Thing hasNomenclatureCode) throws JastorException {
		if (this.hasNomenclatureCode == null)
			initHasNomenclatureCode();
		if (!this.hasNomenclatureCode.contains(hasNomenclatureCode))
			return;
		if (!_model.contains(_resource, hasNomenclatureCodeProperty, hasNomenclatureCode.resource()))
			return;
		this.hasNomenclatureCode.remove(hasNomenclatureCode);
		_model.removeAll(_resource, hasNomenclatureCodeProperty, hasNomenclatureCode.resource());
	}
		 

	private void initIsPartOf() throws JastorException {
		this.isPartOf = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, isPartOfProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://ontology/mds#isPartOf properties in VitalSigns model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.mds.decisionsupport.model.CompositionOfMedicalItems isPartOf = com.mds.decisionsupport.model.MdsFactory.getCompositionOfMedicalItems(resource,_model);
				this.isPartOf.add(isPartOf);
			}
		}
	}

	public java.util.Iterator getIsPartOf() throws JastorException {
		if (isPartOf == null)
			initIsPartOf();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(isPartOf,_resource,isPartOfProperty,true);
	}

	public void addIsPartOf(com.mds.decisionsupport.model.CompositionOfMedicalItems isPartOf) throws JastorException {
		if (this.isPartOf == null)
			initIsPartOf();
		if (this.isPartOf.contains(isPartOf)) {
			this.isPartOf.remove(isPartOf);
			this.isPartOf.add(isPartOf);
			return;
		}
		this.isPartOf.add(isPartOf);
		_model.add(_model.createStatement(_resource,isPartOfProperty,isPartOf.resource()));
	}
	
	public com.mds.decisionsupport.model.CompositionOfMedicalItems addIsPartOf() throws JastorException {
		com.mds.decisionsupport.model.CompositionOfMedicalItems isPartOf = com.mds.decisionsupport.model.MdsFactory.createCompositionOfMedicalItems(_model.createResource(),_model);
		if (this.isPartOf == null)
			initIsPartOf();
		this.isPartOf.add(isPartOf);
		_model.add(_model.createStatement(_resource,isPartOfProperty,isPartOf.resource()));
		return isPartOf;
	}
	
	public com.mds.decisionsupport.model.CompositionOfMedicalItems addIsPartOf(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.mds.decisionsupport.model.CompositionOfMedicalItems isPartOf = com.mds.decisionsupport.model.MdsFactory.getCompositionOfMedicalItems(resource,_model);
		if (this.isPartOf == null)
			initIsPartOf();
		if (this.isPartOf.contains(isPartOf))
			return isPartOf;
		this.isPartOf.add(isPartOf);
		_model.add(_model.createStatement(_resource,isPartOfProperty,isPartOf.resource()));
		return isPartOf;
	}
	
	public void removeIsPartOf(com.mds.decisionsupport.model.CompositionOfMedicalItems isPartOf) throws JastorException {
		if (this.isPartOf == null)
			initIsPartOf();
		if (!this.isPartOf.contains(isPartOf))
			return;
		if (!_model.contains(_resource, isPartOfProperty, isPartOf.resource()))
			return;
		this.isPartOf.remove(isPartOf);
		_model.removeAll(_resource, isPartOfProperty, isPartOf.resource());
	}
		 

	private void initHasMedicalObject() throws JastorException {
		this.hasMedicalObject = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, hasMedicalObjectProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://ontology/mds#hasMedicalObject properties in VitalSigns model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.mds.decisionsupport.model.MedicalItem hasMedicalObject = com.mds.decisionsupport.model.MdsFactory.getMedicalItem(resource,_model);
				this.hasMedicalObject.add(hasMedicalObject);
			}
		}
	}

	public java.util.Iterator getHasMedicalObject() throws JastorException {
		if (hasMedicalObject == null)
			initHasMedicalObject();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(hasMedicalObject,_resource,hasMedicalObjectProperty,true);
	}

	public void addHasMedicalObject(com.mds.decisionsupport.model.MedicalItem hasMedicalObject) throws JastorException {
		if (this.hasMedicalObject == null)
			initHasMedicalObject();
		if (this.hasMedicalObject.contains(hasMedicalObject)) {
			this.hasMedicalObject.remove(hasMedicalObject);
			this.hasMedicalObject.add(hasMedicalObject);
			return;
		}
		this.hasMedicalObject.add(hasMedicalObject);
		_model.add(_model.createStatement(_resource,hasMedicalObjectProperty,hasMedicalObject.resource()));
	}
	
	public com.mds.decisionsupport.model.MedicalItem addHasMedicalObject() throws JastorException {
		com.mds.decisionsupport.model.MedicalItem hasMedicalObject = com.mds.decisionsupport.model.MdsFactory.createMedicalItem(_model.createResource(),_model);
		if (this.hasMedicalObject == null)
			initHasMedicalObject();
		this.hasMedicalObject.add(hasMedicalObject);
		_model.add(_model.createStatement(_resource,hasMedicalObjectProperty,hasMedicalObject.resource()));
		return hasMedicalObject;
	}
	
	public com.mds.decisionsupport.model.MedicalItem addHasMedicalObject(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.mds.decisionsupport.model.MedicalItem hasMedicalObject = com.mds.decisionsupport.model.MdsFactory.getMedicalItem(resource,_model);
		if (this.hasMedicalObject == null)
			initHasMedicalObject();
		if (this.hasMedicalObject.contains(hasMedicalObject))
			return hasMedicalObject;
		this.hasMedicalObject.add(hasMedicalObject);
		_model.add(_model.createStatement(_resource,hasMedicalObjectProperty,hasMedicalObject.resource()));
		return hasMedicalObject;
	}
	
	public void removeHasMedicalObject(com.mds.decisionsupport.model.MedicalItem hasMedicalObject) throws JastorException {
		if (this.hasMedicalObject == null)
			initHasMedicalObject();
		if (!this.hasMedicalObject.contains(hasMedicalObject))
			return;
		if (!_model.contains(_resource, hasMedicalObjectProperty, hasMedicalObject.resource()))
			return;
		this.hasMedicalObject.remove(hasMedicalObject);
		_model.removeAll(_resource, hasMedicalObjectProperty, hasMedicalObject.resource());
	}
		 

	private void initHasContext() throws JastorException {
		hasContext = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, hasContextProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://ontology/mds#hasContext properties in VitalSigns model not a Literal", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
			hasContext.add(literal);
		}
	}

	public java.util.Iterator getHasContext() throws JastorException {
		if (hasContext == null)
			initHasContext();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(hasContext,_resource,hasContextProperty,false);
	}

	public void addHasContext(com.hp.hpl.jena.rdf.model.Literal hasContext) throws JastorException {
		if (this.hasContext == null)
			initHasContext();
		if (this.hasContext.contains(hasContext))
			return;
		if (_model.contains(_resource, hasContextProperty, createLiteral(hasContext)))
			return;
		this.hasContext.add(hasContext);
		_model.add(_resource, hasContextProperty, hasContext);
	}
	
	public void removeHasContext(com.hp.hpl.jena.rdf.model.Literal hasContext) throws JastorException {
		if (this.hasContext == null)
			initHasContext();
		if (!this.hasContext.contains(hasContext))
			return;
		if (!_model.contains(_resource, hasContextProperty, createLiteral(hasContext)))
			return;
		this.hasContext.remove(hasContext);
		_model.removeAll(_resource, hasContextProperty, createLiteral(hasContext));
	}

	public java.lang.String getCommentOfMedicalItem() throws JastorException {
		if (commentOfMedicalItem != null)
			return commentOfMedicalItem;
		com.hp.hpl.jena.rdf.model.Statement stmt = _model.getProperty(_resource, commentOfMedicalItemProperty);
		if (stmt == null)
			return null;
		if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
			throw new JastorInvalidRDFNodeException(uri() + ": commentOfMedicalItem getProperty() in com.mds.decisionsupport.model.VitalSigns model not Literal", stmt.getObject());
		com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
		Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
		commentOfMedicalItem = (java.lang.String)obj;
		return commentOfMedicalItem;
	}
	
	public void setCommentOfMedicalItem(java.lang.String commentOfMedicalItem) throws JastorException {
		if (_model.contains(_resource,commentOfMedicalItemProperty)) {
			_model.removeAll(_resource,commentOfMedicalItemProperty,null);
		}
		this.commentOfMedicalItem = commentOfMedicalItem;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
		if (commentOfMedicalItem != null) {
			_model.add(_model.createStatement(_resource,commentOfMedicalItemProperty, createLiteral(commentOfMedicalItem)));
		}	
	}


	private void initHasAmount() throws JastorException {
		this.hasAmount = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, hasAmountProperty, (RDFNode)null);
		while(it.hasNext()) {
			com.hp.hpl.jena.rdf.model.Statement stmt = (com.hp.hpl.jena.rdf.model.Statement)it.next();
			if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://ontology/mds#hasAmount properties in VitalSigns model not a Resource", stmt.getObject());
			com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				com.mds.decisionsupport.model.Amount hasAmount = com.mds.decisionsupport.model.MdsFactory.getAmount(resource,_model);
				this.hasAmount.add(hasAmount);
			}
		}
	}

	public java.util.Iterator getHasAmount() throws JastorException {
		if (hasAmount == null)
			initHasAmount();
		return new com.ibm.adtech.jastor.util.CachedPropertyIterator(hasAmount,_resource,hasAmountProperty,true);
	}

	public void addHasAmount(com.mds.decisionsupport.model.Amount hasAmount) throws JastorException {
		if (this.hasAmount == null)
			initHasAmount();
		if (this.hasAmount.contains(hasAmount)) {
			this.hasAmount.remove(hasAmount);
			this.hasAmount.add(hasAmount);
			return;
		}
		this.hasAmount.add(hasAmount);
		_model.add(_model.createStatement(_resource,hasAmountProperty,hasAmount.resource()));
	}
	
	public com.mds.decisionsupport.model.Amount addHasAmount() throws JastorException {
		com.mds.decisionsupport.model.Amount hasAmount = com.mds.decisionsupport.model.MdsFactory.createAmount(_model.createResource(),_model);
		if (this.hasAmount == null)
			initHasAmount();
		this.hasAmount.add(hasAmount);
		_model.add(_model.createStatement(_resource,hasAmountProperty,hasAmount.resource()));
		return hasAmount;
	}
	
	public com.mds.decisionsupport.model.Amount addHasAmount(com.hp.hpl.jena.rdf.model.Resource resource) throws JastorException {
		com.mds.decisionsupport.model.Amount hasAmount = com.mds.decisionsupport.model.MdsFactory.getAmount(resource,_model);
		if (this.hasAmount == null)
			initHasAmount();
		if (this.hasAmount.contains(hasAmount))
			return hasAmount;
		this.hasAmount.add(hasAmount);
		_model.add(_model.createStatement(_resource,hasAmountProperty,hasAmount.resource()));
		return hasAmount;
	}
	
	public void removeHasAmount(com.mds.decisionsupport.model.Amount hasAmount) throws JastorException {
		if (this.hasAmount == null)
			initHasAmount();
		if (!this.hasAmount.contains(hasAmount))
			return;
		if (!_model.contains(_resource, hasAmountProperty, hasAmount.resource()))
			return;
		this.hasAmount.remove(hasAmount);
		_model.removeAll(_resource, hasAmountProperty, hasAmount.resource());
	}
		 
	public com.hp.hpl.jena.datatypes.xsd.XSDDateTime getHasTimeStamp() throws JastorException {
		if (hasTimeStamp != null)
			return hasTimeStamp;
		com.hp.hpl.jena.rdf.model.Statement stmt = _model.getProperty(_resource, hasTimeStampProperty);
		if (stmt == null)
			return null;
		if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
			throw new JastorInvalidRDFNodeException(uri() + ": hasTimeStamp getProperty() in com.mds.decisionsupport.model.VitalSigns model not Literal", stmt.getObject());
		com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
		Object obj = Util.fixLiteral(true,literal,"com.hp.hpl.jena.datatypes.xsd.XSDDateTime","http://www.w3.org/2001/XMLSchema#dateTime");
		hasTimeStamp = (com.hp.hpl.jena.datatypes.xsd.XSDDateTime)obj;
		return hasTimeStamp;
	}
	
	public void setHasTimeStamp(com.hp.hpl.jena.datatypes.xsd.XSDDateTime hasTimeStamp) throws JastorException {
		if (_model.contains(_resource,hasTimeStampProperty)) {
			_model.removeAll(_resource,hasTimeStampProperty,null);
		}
		this.hasTimeStamp = hasTimeStamp;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
		if (hasTimeStamp != null) {
			_model.add(_model.createStatement(_resource,hasTimeStampProperty, createLiteral(hasTimeStamp)));
		}	
	}
 


	private java.util.ArrayList listeners;
	
	public void registerListener(ThingListener listener) {
		if (!(listener instanceof VitalSignsListener))
			throw new IllegalArgumentException("ThingListener must be instance of VitalSignsListener"); 
		if (listeners == null)
			setupModelListener();
		if(!this.listeners.contains(listener)){
			this.listeners.add((VitalSignsListener)listener);
		}
	}
	
	public void unregisterListener(ThingListener listener) {
		if (!(listener instanceof VitalSignsListener))
			throw new IllegalArgumentException("ThingListener must be instance of VitalSignsListener"); 
		if (listeners == null)
			return;
		if (this.listeners.contains(listener)){
			listeners.remove(listener);
		}
	}



	
		public void addedStatement(com.hp.hpl.jena.rdf.model.Statement stmt) {

			if (stmt.getPredicate().equals(hasGeographicalLocationProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _hasGeographicalLocation = null;
					try {
						_hasGeographicalLocation = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (hasGeographicalLocation == null) {
						try {
							initHasGeographicalLocation();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!hasGeographicalLocation.contains(_hasGeographicalLocation))
						hasGeographicalLocation.add(_hasGeographicalLocation);
					if (listeners != null) {
						java.util.ArrayList consumersForHasGeographicalLocation;
						synchronized (listeners) {
							consumersForHasGeographicalLocation = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHasGeographicalLocation.iterator();iter.hasNext();){
							VitalSignsListener listener=(VitalSignsListener)iter.next();
							listener.hasGeographicalLocationAdded(com.mds.decisionsupport.model.VitalSignsImpl.this,_hasGeographicalLocation);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(endDateOfMedicalItemProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				endDateOfMedicalItem = (com.hp.hpl.jena.datatypes.xsd.XSDDateTime)Util.fixLiteral(true,literal,"com.hp.hpl.jena.datatypes.xsd.XSDDateTime","http://www.w3.org/2001/XMLSchema#dateTime");
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						VitalSignsListener listener=(VitalSignsListener)iter.next();
						listener.endDateOfMedicalItemChanged(com.mds.decisionsupport.model.VitalSignsImpl.this);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(hasSourceProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (_model.contains(resource,RDF.type,com.mds.decisionsupport.model.NaturalPerson.TYPE)) {
					com.mds.decisionsupport.model.NaturalPerson _hasSource_asNaturalPerson = null;
					try {
						_hasSource_asNaturalPerson = com.mds.decisionsupport.model.MdsFactory.getNaturalPerson(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (hasSource_asNaturalPerson == null) {
						try {
							initHasSource_asNaturalPerson();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!hasSource_asNaturalPerson.contains(_hasSource_asNaturalPerson))
						hasSource_asNaturalPerson.add(_hasSource_asNaturalPerson);
					if (listeners != null) {
						java.util.ArrayList consumersForHasSource_asNaturalPerson;
						synchronized (listeners) {
							consumersForHasSource_asNaturalPerson = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHasSource_asNaturalPerson.iterator();iter.hasNext();){
							VitalSignsListener listener=(VitalSignsListener)iter.next();
							listener.hasSourceAdded(com.mds.decisionsupport.model.VitalSignsImpl.this,_hasSource_asNaturalPerson);
						}
					}
				}
				if (_model.contains(resource,RDF.type,com.mds.decisionsupport.model.SensingDevice.TYPE)) {
					com.mds.decisionsupport.model.SensingDevice _hasSource_asSensingDevice = null;
					try {
						_hasSource_asSensingDevice = com.mds.decisionsupport.model.MdsFactory.getSensingDevice(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (hasSource_asSensingDevice == null) {
						try {
							initHasSource_asSensingDevice();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!hasSource_asSensingDevice.contains(_hasSource_asSensingDevice))
						hasSource_asSensingDevice.add(_hasSource_asSensingDevice);
					if (listeners != null) {
						java.util.ArrayList consumersForHasSource_asSensingDevice;
						synchronized (listeners) {
							consumersForHasSource_asSensingDevice = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHasSource_asSensingDevice.iterator();iter.hasNext();){
							VitalSignsListener listener=(VitalSignsListener)iter.next();
							listener.hasSourceAdded(com.mds.decisionsupport.model.VitalSignsImpl.this,_hasSource_asSensingDevice);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(startDateOfMedicalItemProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				startDateOfMedicalItem = (com.hp.hpl.jena.datatypes.xsd.XSDDateTime)Util.fixLiteral(true,literal,"com.hp.hpl.jena.datatypes.xsd.XSDDateTime","http://www.w3.org/2001/XMLSchema#dateTime");
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						VitalSignsListener listener=(VitalSignsListener)iter.next();
						listener.startDateOfMedicalItemChanged(com.mds.decisionsupport.model.VitalSignsImpl.this);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(hasEffectTimeProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				hasEffectTime = (com.hp.hpl.jena.datatypes.xsd.XSDDateTime)Util.fixLiteral(true,literal,"com.hp.hpl.jena.datatypes.xsd.XSDDateTime","http://www.w3.org/2001/XMLSchema#dateTime");
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						VitalSignsListener listener=(VitalSignsListener)iter.next();
						listener.hasEffectTimeChanged(com.mds.decisionsupport.model.VitalSignsImpl.this);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(hasNomenclatureCodeProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _hasNomenclatureCode = null;
					try {
						_hasNomenclatureCode = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (hasNomenclatureCode == null) {
						try {
							initHasNomenclatureCode();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!hasNomenclatureCode.contains(_hasNomenclatureCode))
						hasNomenclatureCode.add(_hasNomenclatureCode);
					if (listeners != null) {
						java.util.ArrayList consumersForHasNomenclatureCode;
						synchronized (listeners) {
							consumersForHasNomenclatureCode = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHasNomenclatureCode.iterator();iter.hasNext();){
							VitalSignsListener listener=(VitalSignsListener)iter.next();
							listener.hasNomenclatureCodeAdded(com.mds.decisionsupport.model.VitalSignsImpl.this,_hasNomenclatureCode);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(isPartOfProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.mds.decisionsupport.model.CompositionOfMedicalItems _isPartOf = null;
					try {
						_isPartOf = com.mds.decisionsupport.model.MdsFactory.getCompositionOfMedicalItems(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (isPartOf == null) {
						try {
							initIsPartOf();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!isPartOf.contains(_isPartOf))
						isPartOf.add(_isPartOf);
					if (listeners != null) {
						java.util.ArrayList consumersForIsPartOf;
						synchronized (listeners) {
							consumersForIsPartOf = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForIsPartOf.iterator();iter.hasNext();){
							VitalSignsListener listener=(VitalSignsListener)iter.next();
							listener.isPartOfAdded(com.mds.decisionsupport.model.VitalSignsImpl.this,_isPartOf);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(hasMedicalObjectProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.mds.decisionsupport.model.MedicalItem _hasMedicalObject = null;
					try {
						_hasMedicalObject = com.mds.decisionsupport.model.MdsFactory.getMedicalItem(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (hasMedicalObject == null) {
						try {
							initHasMedicalObject();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!hasMedicalObject.contains(_hasMedicalObject))
						hasMedicalObject.add(_hasMedicalObject);
					if (listeners != null) {
						java.util.ArrayList consumersForHasMedicalObject;
						synchronized (listeners) {
							consumersForHasMedicalObject = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHasMedicalObject.iterator();iter.hasNext();){
							VitalSignsListener listener=(VitalSignsListener)iter.next();
							listener.hasMedicalObjectAdded(com.mds.decisionsupport.model.VitalSignsImpl.this,_hasMedicalObject);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(hasContextProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				if (hasContext == null)
					try {
						initHasContext();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				if (!hasContext.contains(literal))
					hasContext.add(literal);
				if (listeners != null) {
					java.util.ArrayList consumersForHasContext;
					synchronized (listeners) {
						consumersForHasContext = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForHasContext.iterator();iter.hasNext();){
						VitalSignsListener listener=(VitalSignsListener)iter.next();
						listener.hasContextAdded(com.mds.decisionsupport.model.VitalSignsImpl.this,literal);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(commentOfMedicalItemProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				commentOfMedicalItem = (java.lang.String)Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						VitalSignsListener listener=(VitalSignsListener)iter.next();
						listener.commentOfMedicalItemChanged(com.mds.decisionsupport.model.VitalSignsImpl.this);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(hasAmountProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.mds.decisionsupport.model.Amount _hasAmount = null;
					try {
						_hasAmount = com.mds.decisionsupport.model.MdsFactory.getAmount(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (hasAmount == null) {
						try {
							initHasAmount();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!hasAmount.contains(_hasAmount))
						hasAmount.add(_hasAmount);
					if (listeners != null) {
						java.util.ArrayList consumersForHasAmount;
						synchronized (listeners) {
							consumersForHasAmount = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHasAmount.iterator();iter.hasNext();){
							VitalSignsListener listener=(VitalSignsListener)iter.next();
							listener.hasAmountAdded(com.mds.decisionsupport.model.VitalSignsImpl.this,_hasAmount);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(hasTimeStampProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				hasTimeStamp = (com.hp.hpl.jena.datatypes.xsd.XSDDateTime)Util.fixLiteral(true,literal,"com.hp.hpl.jena.datatypes.xsd.XSDDateTime","http://www.w3.org/2001/XMLSchema#dateTime");
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						VitalSignsListener listener=(VitalSignsListener)iter.next();
						listener.hasTimeStampChanged(com.mds.decisionsupport.model.VitalSignsImpl.this);
					}
				}
				return;
			}
		}
		
		public void removedStatement(com.hp.hpl.jena.rdf.model.Statement stmt) {
//			if (!stmt.getSubject().equals(_resource))
//				return;
			if (stmt.getPredicate().equals(hasGeographicalLocationProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _hasGeographicalLocation = null;
					if (hasGeographicalLocation != null) {
						boolean found = false;
						for (int i=0;i<hasGeographicalLocation.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) hasGeographicalLocation.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_hasGeographicalLocation = __item;
								break;
							}
						}
						if (found)
							hasGeographicalLocation.remove(_hasGeographicalLocation);
						else {
							try {
								_hasGeographicalLocation = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_hasGeographicalLocation = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForHasGeographicalLocation;
						synchronized (listeners) {
							consumersForHasGeographicalLocation = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHasGeographicalLocation.iterator();iter.hasNext();){
							VitalSignsListener listener=(VitalSignsListener)iter.next();
							listener.hasGeographicalLocationRemoved(com.mds.decisionsupport.model.VitalSignsImpl.this,_hasGeographicalLocation);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(endDateOfMedicalItemProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"com.hp.hpl.jena.datatypes.xsd.XSDDateTime","http://www.w3.org/2001/XMLSchema#dateTime");
				if (endDateOfMedicalItem != null && endDateOfMedicalItem.equals(obj))
					endDateOfMedicalItem = null;
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						VitalSignsListener listener=(VitalSignsListener)iter.next();
						listener.endDateOfMedicalItemChanged(com.mds.decisionsupport.model.VitalSignsImpl.this);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(hasSourceProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (_model.contains(resource,RDF.type,com.mds.decisionsupport.model.NaturalPerson.TYPE)) {
					com.mds.decisionsupport.model.NaturalPerson _hasSource_asNaturalPerson = null;
					if (hasSource_asNaturalPerson != null) {
						boolean found = false;
						for (int i=0;i<hasSource_asNaturalPerson.size();i++) {
							com.mds.decisionsupport.model.NaturalPerson __item = (com.mds.decisionsupport.model.NaturalPerson) hasSource_asNaturalPerson.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_hasSource_asNaturalPerson = __item;
								break;
							}
						}
						if (found)
							hasSource_asNaturalPerson.remove(_hasSource_asNaturalPerson);
						else {
							try {
								_hasSource_asNaturalPerson = com.mds.decisionsupport.model.MdsFactory.getNaturalPerson(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_hasSource_asNaturalPerson = com.mds.decisionsupport.model.MdsFactory.getNaturalPerson(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForHasSource_asNaturalPerson;
						synchronized (listeners) {
							consumersForHasSource_asNaturalPerson = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHasSource_asNaturalPerson.iterator();iter.hasNext();){
							VitalSignsListener listener=(VitalSignsListener)iter.next();
							listener.hasSourceRemoved(com.mds.decisionsupport.model.VitalSignsImpl.this,_hasSource_asNaturalPerson);
						}
					}
				}
				if (_model.contains(resource,RDF.type,com.mds.decisionsupport.model.SensingDevice.TYPE)) {
					com.mds.decisionsupport.model.SensingDevice _hasSource_asSensingDevice = null;
					if (hasSource_asSensingDevice != null) {
						boolean found = false;
						for (int i=0;i<hasSource_asSensingDevice.size();i++) {
							com.mds.decisionsupport.model.SensingDevice __item = (com.mds.decisionsupport.model.SensingDevice) hasSource_asSensingDevice.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_hasSource_asSensingDevice = __item;
								break;
							}
						}
						if (found)
							hasSource_asSensingDevice.remove(_hasSource_asSensingDevice);
						else {
							try {
								_hasSource_asSensingDevice = com.mds.decisionsupport.model.MdsFactory.getSensingDevice(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_hasSource_asSensingDevice = com.mds.decisionsupport.model.MdsFactory.getSensingDevice(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForHasSource_asSensingDevice;
						synchronized (listeners) {
							consumersForHasSource_asSensingDevice = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHasSource_asSensingDevice.iterator();iter.hasNext();){
							VitalSignsListener listener=(VitalSignsListener)iter.next();
							listener.hasSourceRemoved(com.mds.decisionsupport.model.VitalSignsImpl.this,_hasSource_asSensingDevice);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(startDateOfMedicalItemProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"com.hp.hpl.jena.datatypes.xsd.XSDDateTime","http://www.w3.org/2001/XMLSchema#dateTime");
				if (startDateOfMedicalItem != null && startDateOfMedicalItem.equals(obj))
					startDateOfMedicalItem = null;
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						VitalSignsListener listener=(VitalSignsListener)iter.next();
						listener.startDateOfMedicalItemChanged(com.mds.decisionsupport.model.VitalSignsImpl.this);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(hasEffectTimeProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"com.hp.hpl.jena.datatypes.xsd.XSDDateTime","http://www.w3.org/2001/XMLSchema#dateTime");
				if (hasEffectTime != null && hasEffectTime.equals(obj))
					hasEffectTime = null;
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						VitalSignsListener listener=(VitalSignsListener)iter.next();
						listener.hasEffectTimeChanged(com.mds.decisionsupport.model.VitalSignsImpl.this);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(hasNomenclatureCodeProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.ibm.adtech.jastor.Thing _hasNomenclatureCode = null;
					if (hasNomenclatureCode != null) {
						boolean found = false;
						for (int i=0;i<hasNomenclatureCode.size();i++) {
							com.ibm.adtech.jastor.Thing __item = (com.ibm.adtech.jastor.Thing) hasNomenclatureCode.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_hasNomenclatureCode = __item;
								break;
							}
						}
						if (found)
							hasNomenclatureCode.remove(_hasNomenclatureCode);
						else {
							try {
								_hasNomenclatureCode = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_hasNomenclatureCode = com.ibm.adtech.jastor.ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForHasNomenclatureCode;
						synchronized (listeners) {
							consumersForHasNomenclatureCode = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHasNomenclatureCode.iterator();iter.hasNext();){
							VitalSignsListener listener=(VitalSignsListener)iter.next();
							listener.hasNomenclatureCodeRemoved(com.mds.decisionsupport.model.VitalSignsImpl.this,_hasNomenclatureCode);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(isPartOfProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.mds.decisionsupport.model.CompositionOfMedicalItems _isPartOf = null;
					if (isPartOf != null) {
						boolean found = false;
						for (int i=0;i<isPartOf.size();i++) {
							com.mds.decisionsupport.model.CompositionOfMedicalItems __item = (com.mds.decisionsupport.model.CompositionOfMedicalItems) isPartOf.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_isPartOf = __item;
								break;
							}
						}
						if (found)
							isPartOf.remove(_isPartOf);
						else {
							try {
								_isPartOf = com.mds.decisionsupport.model.MdsFactory.getCompositionOfMedicalItems(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_isPartOf = com.mds.decisionsupport.model.MdsFactory.getCompositionOfMedicalItems(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForIsPartOf;
						synchronized (listeners) {
							consumersForIsPartOf = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForIsPartOf.iterator();iter.hasNext();){
							VitalSignsListener listener=(VitalSignsListener)iter.next();
							listener.isPartOfRemoved(com.mds.decisionsupport.model.VitalSignsImpl.this,_isPartOf);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(hasMedicalObjectProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.mds.decisionsupport.model.MedicalItem _hasMedicalObject = null;
					if (hasMedicalObject != null) {
						boolean found = false;
						for (int i=0;i<hasMedicalObject.size();i++) {
							com.mds.decisionsupport.model.MedicalItem __item = (com.mds.decisionsupport.model.MedicalItem) hasMedicalObject.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_hasMedicalObject = __item;
								break;
							}
						}
						if (found)
							hasMedicalObject.remove(_hasMedicalObject);
						else {
							try {
								_hasMedicalObject = com.mds.decisionsupport.model.MdsFactory.getMedicalItem(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_hasMedicalObject = com.mds.decisionsupport.model.MdsFactory.getMedicalItem(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForHasMedicalObject;
						synchronized (listeners) {
							consumersForHasMedicalObject = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHasMedicalObject.iterator();iter.hasNext();){
							VitalSignsListener listener=(VitalSignsListener)iter.next();
							listener.hasMedicalObjectRemoved(com.mds.decisionsupport.model.VitalSignsImpl.this,_hasMedicalObject);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(hasContextProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				if (hasContext != null) {
					if (hasContext.contains(literal))
						hasContext.remove(literal);
				}
				if (listeners != null) {
					java.util.ArrayList consumersForHasContext;
					synchronized (listeners) {
						consumersForHasContext = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForHasContext.iterator();iter.hasNext();){
						VitalSignsListener listener=(VitalSignsListener)iter.next();
						listener.hasContextRemoved(com.mds.decisionsupport.model.VitalSignsImpl.this,literal);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(commentOfMedicalItemProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (commentOfMedicalItem != null && commentOfMedicalItem.equals(obj))
					commentOfMedicalItem = null;
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						VitalSignsListener listener=(VitalSignsListener)iter.next();
						listener.commentOfMedicalItemChanged(com.mds.decisionsupport.model.VitalSignsImpl.this);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(hasAmountProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Resource.class))
					return;
				com.hp.hpl.jena.rdf.model.Resource resource = (com.hp.hpl.jena.rdf.model.Resource) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					com.mds.decisionsupport.model.Amount _hasAmount = null;
					if (hasAmount != null) {
						boolean found = false;
						for (int i=0;i<hasAmount.size();i++) {
							com.mds.decisionsupport.model.Amount __item = (com.mds.decisionsupport.model.Amount) hasAmount.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_hasAmount = __item;
								break;
							}
						}
						if (found)
							hasAmount.remove(_hasAmount);
						else {
							try {
								_hasAmount = com.mds.decisionsupport.model.MdsFactory.getAmount(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_hasAmount = com.mds.decisionsupport.model.MdsFactory.getAmount(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForHasAmount;
						synchronized (listeners) {
							consumersForHasAmount = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForHasAmount.iterator();iter.hasNext();){
							VitalSignsListener listener=(VitalSignsListener)iter.next();
							listener.hasAmountRemoved(com.mds.decisionsupport.model.VitalSignsImpl.this,_hasAmount);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(hasTimeStampProperty)) {
				if (!stmt.getObject().canAs(com.hp.hpl.jena.rdf.model.Literal.class))
					return;
				com.hp.hpl.jena.rdf.model.Literal literal = (com.hp.hpl.jena.rdf.model.Literal) stmt.getObject().as(com.hp.hpl.jena.rdf.model.Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"com.hp.hpl.jena.datatypes.xsd.XSDDateTime","http://www.w3.org/2001/XMLSchema#dateTime");
				if (hasTimeStamp != null && hasTimeStamp.equals(obj))
					hasTimeStamp = null;
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						VitalSignsListener listener=(VitalSignsListener)iter.next();
						listener.hasTimeStampChanged(com.mds.decisionsupport.model.VitalSignsImpl.this);
					}
				}
				return;
			}
		}

	//}
	


}