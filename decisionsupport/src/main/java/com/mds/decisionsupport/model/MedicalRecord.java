

package com.mds.decisionsupport.model;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for Medical record^^http://www.w3.org/2001/XMLSchema#string ontology class<br>
 * Use the com.mds.decisionsupport.model.MdsFactory to create instances of this interface.
 * <p>(URI: http://ontology/mds#MedicalRecord)</p>
 * <br>
 * RDF Schema Standard Properties <br>
 * 	label : Medical record^^http://www.w3.org/2001/XMLSchema#string <br>
 * <br>
 * <br>
 */
public interface MedicalRecord extends com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://ontology/mds#MedicalRecord");
	

	/**
	 * The Jena Property for commentOfMedicalRecord 
	 * <p>(URI: http://ontology/mds#commentOfMedicalRecord)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : comment of Medical Record <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property commentOfMedicalRecordProperty = ResourceFactory.createProperty("http://ontology/mds#commentOfMedicalRecord");


	/**
	 * The Jena Property for hasContacts 
	 * <p>(URI: http://ontology/mds#hasContacts)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : has contacts <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property hasContactsProperty = ResourceFactory.createProperty("http://ontology/mds#hasContacts");


	/**
	 * The Jena Property for hasStaticInformation 
	 * <p>(URI: http://ontology/mds#hasStaticInformation)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : has static information^^http://www.w3.org/2001/XMLSchema#string <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property hasStaticInformationProperty = ResourceFactory.createProperty("http://ontology/mds#hasStaticInformation");



	/**
	 * Individual for URI: http://www.semanticweb.org/owl/owlapi/turtle#MedicalRecord_1
	 */
	public static com.hp.hpl.jena.rdf.model.Resource MedicalRecord__1 = ResourceFactory.createResource("http://www.semanticweb.org/owl/owlapi/turtle#MedicalRecord_1");



	/**
	 * Gets the 'commentOfMedicalRecord' property value
	 * @return		{@link java.lang.String}
	 * @see			#commentOfMedicalRecordProperty
	 */
	public java.lang.String getCommentOfMedicalRecord() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Sets the 'commentOfMedicalRecord' property value
	 * @param		{@link java.lang.String}
	 * @see			#commentOfMedicalRecordProperty
	 */
	public void setCommentOfMedicalRecord(java.lang.String commentOfMedicalRecord) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Get an Iterator the 'hasContacts' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.mds.decisionsupport.model.Contact}
	 * @see			#hasContactsProperty
	 */
	public java.util.Iterator getHasContacts() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'hasContacts' property
	 * @param		The {@link com.mds.decisionsupport.model.Contact} to add
	 * @see			#hasContactsProperty
	 */
	public void addHasContacts(com.mds.decisionsupport.model.Contact hasContacts) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'hasContacts' property
	 * @return		The anoymous {@link com.mds.decisionsupport.model.Contact} created
	 * @see			#hasContactsProperty
	 */
	public com.mds.decisionsupport.model.Contact addHasContacts() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://ontology/mds#Contact.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#hasContactsProperty
	 */
	public com.mds.decisionsupport.model.Contact addHasContacts(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'hasContacts' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.mds.decisionsupport.model.Contact} to remove
	 * @see			#hasContactsProperty
	 */
	public void removeHasContacts(com.mds.decisionsupport.model.Contact hasContacts) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Gets the 'hasStaticInformation' property value
	 * @return		{@link com.mds.decisionsupport.model.Patient}
	 * @see			#hasStaticInformationProperty
	 */
	public com.mds.decisionsupport.model.Patient getHasStaticInformation() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Sets the 'hasStaticInformation' property value
	 * @param		{@link com.mds.decisionsupport.model.Patient}
	 * @see			#hasStaticInformationProperty
	 */
	public void setHasStaticInformation(com.mds.decisionsupport.model.Patient hasStaticInformation) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Sets the 'hasStaticInformation' property value to an anonymous node
	 * @return		{@link com.mds.decisionsupport.model.Patient}, the created value
	 * @see			#hasStaticInformationProperty
	 */	
	public com.mds.decisionsupport.model.Patient setHasStaticInformation() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Sets the 'hasStaticInformation' property value to the given resource
	 * The resource argument should have rdf:type http://ontology/mds#Patient.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		{@link com.hp.hpl.jena.rdf.model.Resource} must not be be null.
	 * @return		{@link com.mds.decisionsupport.model.Patient}, the newly created value
	 * @see			#hasStaticInformationProperty
	 */
	public com.mds.decisionsupport.model.Patient setHasStaticInformation(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
}