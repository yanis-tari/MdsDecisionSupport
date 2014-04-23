

package com.mds.decisionsupport.model;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for Medical Item^^http://www.w3.org/2001/XMLSchema#string ontology class<br>
 * Use the com.mds.decisionsupport.model.MdsFactory to create instances of this interface.
 * <p>(URI: http://ontology/mds#MedicalItem)</p>
 * <br>
 * RDF Schema Standard Properties <br>
 * 	label : Medical Item^^http://www.w3.org/2001/XMLSchema#string <br>
 * <br>
 * <br>
 */
@SuppressWarnings({ "rawtypes" })
public interface MedicalItem extends com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://ontology/mds#MedicalItem");
	

	/**
	 * The Jena Property for hasGeographicalLocation 
	 * <p>(URI: http://ontology/mds#hasGeographicalLocation)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : has geographical location^^http://www.w3.org/2001/XMLSchema#string <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property hasGeographicalLocationProperty = ResourceFactory.createProperty("http://ontology/mds#hasGeographicalLocation");


	/**
	 * The Jena Property for endDateOfMedicalItem 
	 * <p>(URI: http://ontology/mds#endDateOfMedicalItem)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : end date of medical item <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property endDateOfMedicalItemProperty = ResourceFactory.createProperty("http://ontology/mds#endDateOfMedicalItem");


	/**
	 * The Jena Property for hasSource 
	 * <p>(URI: http://ontology/mds#hasSource)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : has Source^^http://www.w3.org/2001/XMLSchema#string <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property hasSourceProperty = ResourceFactory.createProperty("http://ontology/mds#hasSource");


	/**
	 * The Jena Property for startDateOfMedicalItem 
	 * <p>(URI: http://ontology/mds#startDateOfMedicalItem)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : start date of medical item <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property startDateOfMedicalItemProperty = ResourceFactory.createProperty("http://ontology/mds#startDateOfMedicalItem");


	/**
	 * The Jena Property for hasEffectTime 
	 * <p>(URI: http://ontology/mds#hasEffectTime)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : has effect time^^http://www.w3.org/2001/XMLSchema#string <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property hasEffectTimeProperty = ResourceFactory.createProperty("http://ontology/mds#hasEffectTime");


	/**
	 * The Jena Property for hasNomenclatureCode 
	 * <p>(URI: http://ontology/mds#hasNomenclatureCode)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : has nomenclature code^^http://www.w3.org/2001/XMLSchema#string <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property hasNomenclatureCodeProperty = ResourceFactory.createProperty("http://ontology/mds#hasNomenclatureCode");


	/**
	 * The Jena Property for isPartOf 
	 * <p>(URI: http://ontology/mds#isPartOf)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : is part of^^http://www.w3.org/2001/XMLSchema#string <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property isPartOfProperty = ResourceFactory.createProperty("http://ontology/mds#isPartOf");


	/**
	 * The Jena Property for hasMedicalObject 
	 * <p>(URI: http://ontology/mds#hasMedicalObject)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : has Medical Object^^http://www.w3.org/2001/XMLSchema#string <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property hasMedicalObjectProperty = ResourceFactory.createProperty("http://ontology/mds#hasMedicalObject");


	/**
	 * The Jena Property for hasContext 
	 * <p>(URI: http://ontology/mds#hasContext)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : has context^^http://www.w3.org/2001/XMLSchema#string <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property hasContextProperty = ResourceFactory.createProperty("http://ontology/mds#hasContext");


	/**
	 * The Jena Property for commentOfMedicalItem 
	 * <p>(URI: http://ontology/mds#commentOfMedicalItem)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : comment of Medical item <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property commentOfMedicalItemProperty = ResourceFactory.createProperty("http://ontology/mds#commentOfMedicalItem");


	/**
	 * The Jena Property for hasAmount 
	 * <p>(URI: http://ontology/mds#hasAmount)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : has amount^^http://www.w3.org/2001/XMLSchema#string <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property hasAmountProperty = ResourceFactory.createProperty("http://ontology/mds#hasAmount");


	/**
	 * The Jena Property for hasTimeStamp 
	 * <p>(URI: http://ontology/mds#hasTimeStamp)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : has time stamp^^http://www.w3.org/2001/XMLSchema#string <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property hasTimeStampProperty = ResourceFactory.createProperty("http://ontology/mds#hasTimeStamp");




	/**
	 * Get an Iterator the 'hasGeographicalLocation' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#hasGeographicalLocationProperty
	 */
	public java.util.Iterator getHasGeographicalLocation() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'hasGeographicalLocation' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#hasGeographicalLocationProperty
	 */
	public void addHasGeographicalLocation(com.ibm.adtech.jastor.Thing hasGeographicalLocation) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'hasGeographicalLocation' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#hasGeographicalLocationProperty
	 */
	public com.ibm.adtech.jastor.Thing addHasGeographicalLocation() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#hasGeographicalLocationProperty
	 */
	public com.ibm.adtech.jastor.Thing addHasGeographicalLocation(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'hasGeographicalLocation' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#hasGeographicalLocationProperty
	 */
	public void removeHasGeographicalLocation(com.ibm.adtech.jastor.Thing hasGeographicalLocation) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Gets the 'endDateOfMedicalItem' property value
	 * @return		{@link com.hp.hpl.jena.datatypes.xsd.XSDDateTime}
	 * @see			#endDateOfMedicalItemProperty
	 */
	public com.hp.hpl.jena.datatypes.xsd.XSDDateTime getEndDateOfMedicalItem() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Sets the 'endDateOfMedicalItem' property value
	 * @param		{@link com.hp.hpl.jena.datatypes.xsd.XSDDateTime}
	 * @see			#endDateOfMedicalItemProperty
	 */
	public void setEndDateOfMedicalItem(com.hp.hpl.jena.datatypes.xsd.XSDDateTime endDateOfMedicalItem) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Get an Iterator the 'hasSource' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.mds.decisionsupport.model.NaturalPerson}
	 * @see			#hasSourceProperty
	 */
	public java.util.Iterator getHasSource_asNaturalPerson() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'hasSource' property
	 * @param		The {@link com.mds.decisionsupport.model.NaturalPerson} to add
	 * @see			#hasSourceProperty
	 */
	public void addHasSource(com.mds.decisionsupport.model.NaturalPerson hasSource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'hasSource' property
	 * @return		The anoymous {@link com.mds.decisionsupport.model.NaturalPerson} created
	 * @see			#hasSourceProperty
	 */
	public com.mds.decisionsupport.model.NaturalPerson addHasSource_asNaturalPerson() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://ontology/mds#NaturalPerson.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#hasSourceProperty
	 */
	public com.mds.decisionsupport.model.NaturalPerson addHasSource_asNaturalPerson(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'hasSource' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.mds.decisionsupport.model.NaturalPerson} to remove
	 * @see			#hasSourceProperty
	 */
	public void removeHasSource(com.mds.decisionsupport.model.NaturalPerson hasSource) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'hasSource' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.mds.decisionsupport.model.SensingDevice}
	 * @see			#hasSourceProperty
	 */
	public java.util.Iterator getHasSource_asSensingDevice() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'hasSource' property
	 * @param		The {@link com.mds.decisionsupport.model.SensingDevice} to add
	 * @see			#hasSourceProperty
	 */
	public void addHasSource(com.mds.decisionsupport.model.SensingDevice hasSource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'hasSource' property
	 * @return		The anoymous {@link com.mds.decisionsupport.model.SensingDevice} created
	 * @see			#hasSourceProperty
	 */
	public com.mds.decisionsupport.model.SensingDevice addHasSource_asSensingDevice() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://ontology/mds#SensingDevice.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#hasSourceProperty
	 */
	public com.mds.decisionsupport.model.SensingDevice addHasSource_asSensingDevice(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'hasSource' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.mds.decisionsupport.model.SensingDevice} to remove
	 * @see			#hasSourceProperty
	 */
	public void removeHasSource(com.mds.decisionsupport.model.SensingDevice hasSource) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Gets the 'startDateOfMedicalItem' property value
	 * @return		{@link com.hp.hpl.jena.datatypes.xsd.XSDDateTime}
	 * @see			#startDateOfMedicalItemProperty
	 */
	public com.hp.hpl.jena.datatypes.xsd.XSDDateTime getStartDateOfMedicalItem() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Sets the 'startDateOfMedicalItem' property value
	 * @param		{@link com.hp.hpl.jena.datatypes.xsd.XSDDateTime}
	 * @see			#startDateOfMedicalItemProperty
	 */
	public void setStartDateOfMedicalItem(com.hp.hpl.jena.datatypes.xsd.XSDDateTime startDateOfMedicalItem) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Gets the 'hasEffectTime' property value
	 * @return		{@link com.hp.hpl.jena.datatypes.xsd.XSDDateTime}
	 * @see			#hasEffectTimeProperty
	 */
	public com.hp.hpl.jena.datatypes.xsd.XSDDateTime getHasEffectTime() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Sets the 'hasEffectTime' property value
	 * @param		{@link com.hp.hpl.jena.datatypes.xsd.XSDDateTime}
	 * @see			#hasEffectTimeProperty
	 */
	public void setHasEffectTime(com.hp.hpl.jena.datatypes.xsd.XSDDateTime hasEffectTime) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Get an Iterator the 'hasNomenclatureCode' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#hasNomenclatureCodeProperty
	 */
	public java.util.Iterator getHasNomenclatureCode() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'hasNomenclatureCode' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#hasNomenclatureCodeProperty
	 */
	public void addHasNomenclatureCode(com.ibm.adtech.jastor.Thing hasNomenclatureCode) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'hasNomenclatureCode' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#hasNomenclatureCodeProperty
	 */
	public com.ibm.adtech.jastor.Thing addHasNomenclatureCode() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#hasNomenclatureCodeProperty
	 */
	public com.ibm.adtech.jastor.Thing addHasNomenclatureCode(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'hasNomenclatureCode' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#hasNomenclatureCodeProperty
	 */
	public void removeHasNomenclatureCode(com.ibm.adtech.jastor.Thing hasNomenclatureCode) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'isPartOf' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.mds.decisionsupport.model.CompositionOfMedicalItems}
	 * @see			#isPartOfProperty
	 */
	public java.util.Iterator getIsPartOf() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'isPartOf' property
	 * @param		The {@link com.mds.decisionsupport.model.CompositionOfMedicalItems} to add
	 * @see			#isPartOfProperty
	 */
	public void addIsPartOf(com.mds.decisionsupport.model.CompositionOfMedicalItems isPartOf) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'isPartOf' property
	 * @return		The anoymous {@link com.mds.decisionsupport.model.CompositionOfMedicalItems} created
	 * @see			#isPartOfProperty
	 */
	public com.mds.decisionsupport.model.CompositionOfMedicalItems addIsPartOf() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://ontology/mds#CompositionOfMedicalItems.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#isPartOfProperty
	 */
	public com.mds.decisionsupport.model.CompositionOfMedicalItems addIsPartOf(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'isPartOf' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.mds.decisionsupport.model.CompositionOfMedicalItems} to remove
	 * @see			#isPartOfProperty
	 */
	public void removeIsPartOf(com.mds.decisionsupport.model.CompositionOfMedicalItems isPartOf) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'hasMedicalObject' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.mds.decisionsupport.model.MedicalItem}
	 * @see			#hasMedicalObjectProperty
	 */
	public java.util.Iterator getHasMedicalObject() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'hasMedicalObject' property
	 * @param		The {@link com.mds.decisionsupport.model.MedicalItem} to add
	 * @see			#hasMedicalObjectProperty
	 */
	public void addHasMedicalObject(com.mds.decisionsupport.model.MedicalItem hasMedicalObject) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'hasMedicalObject' property
	 * @return		The anoymous {@link com.mds.decisionsupport.model.MedicalItem} created
	 * @see			#hasMedicalObjectProperty
	 */
	public com.mds.decisionsupport.model.MedicalItem addHasMedicalObject() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://ontology/mds#MedicalItem.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#hasMedicalObjectProperty
	 */
	public com.mds.decisionsupport.model.MedicalItem addHasMedicalObject(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'hasMedicalObject' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.mds.decisionsupport.model.MedicalItem} to remove
	 * @see			#hasMedicalObjectProperty
	 */
	public void removeHasMedicalObject(com.mds.decisionsupport.model.MedicalItem hasMedicalObject) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Iterates through the 'hasContext' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.hp.hpl.jena.rdf.model.Literal}
	 * @see			#hasContextProperty
	 */
	public java.util.Iterator getHasContext() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'hasContext' property value
	 * @param		{@link com.hp.hpl.jena.rdf.model.Literal}, the value to add
	 * @see			#hasContextProperty
	 */
	public void addHasContext(com.hp.hpl.jena.rdf.model.Literal hasContext) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'hasContext' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link com.hp.hpl.jena.rdf.model.Literal}, the value to remove
	 * @see			#hasContextProperty
	 */
	public void removeHasContext(com.hp.hpl.jena.rdf.model.Literal hasContext) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Gets the 'commentOfMedicalItem' property value
	 * @return		{@link java.lang.String}
	 * @see			#commentOfMedicalItemProperty
	 */
	public java.lang.String getCommentOfMedicalItem() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Sets the 'commentOfMedicalItem' property value
	 * @param		{@link java.lang.String}
	 * @see			#commentOfMedicalItemProperty
	 */
	public void setCommentOfMedicalItem(java.lang.String commentOfMedicalItem) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Get an Iterator the 'hasAmount' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.mds.decisionsupport.model.Amount}
	 * @see			#hasAmountProperty
	 */
	public java.util.Iterator getHasAmount() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'hasAmount' property
	 * @param		The {@link com.mds.decisionsupport.model.Amount} to add
	 * @see			#hasAmountProperty
	 */
	public void addHasAmount(com.mds.decisionsupport.model.Amount hasAmount) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'hasAmount' property
	 * @return		The anoymous {@link com.mds.decisionsupport.model.Amount} created
	 * @see			#hasAmountProperty
	 */
	public com.mds.decisionsupport.model.Amount addHasAmount() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://ontology/mds#Amount.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#hasAmountProperty
	 */
	public com.mds.decisionsupport.model.Amount addHasAmount(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'hasAmount' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.mds.decisionsupport.model.Amount} to remove
	 * @see			#hasAmountProperty
	 */
	public void removeHasAmount(com.mds.decisionsupport.model.Amount hasAmount) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Gets the 'hasTimeStamp' property value
	 * @return		{@link com.hp.hpl.jena.datatypes.xsd.XSDDateTime}
	 * @see			#hasTimeStampProperty
	 */
	public com.hp.hpl.jena.datatypes.xsd.XSDDateTime getHasTimeStamp() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Sets the 'hasTimeStamp' property value
	 * @param		{@link com.hp.hpl.jena.datatypes.xsd.XSDDateTime}
	 * @see			#hasTimeStampProperty
	 */
	public void setHasTimeStamp(com.hp.hpl.jena.datatypes.xsd.XSDDateTime hasTimeStamp) throws com.ibm.adtech.jastor.JastorException;

}