

package com.mds.decisionsupport.model;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for Natural person^^http://www.w3.org/2001/XMLSchema#string ontology class<br>
 * Use the com.mds.decisionsupport.model.MdsFactory to create instances of this interface.
 * <p>(URI: http://ontology/mds#NaturalPerson)</p>
 * <br>
 * RDF Schema Standard Properties <br>
 * 	label : Natural person^^http://www.w3.org/2001/XMLSchema#string <br>
 * <br>
 * <br>
 */
public interface NaturalPerson extends com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://ontology/mds#NaturalPerson");
	

	/**
	 * The Jena Property for lastName 
	 * <p>(URI: http://ontology/mds#lastName)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : Last name^^http://www.w3.org/2001/XMLSchema#string <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property lastNameProperty = ResourceFactory.createProperty("http://ontology/mds#lastName");


	/**
	 * The Jena Property for birthDate 
	 * <p>(URI: http://ontology/mds#birthDate)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property birthDateProperty = ResourceFactory.createProperty("http://ontology/mds#birthDate");


	/**
	 * The Jena Property for email 
	 * <p>(URI: http://ontology/mds#email)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : Email^^http://www.w3.org/2001/XMLSchema#string <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property emailProperty = ResourceFactory.createProperty("http://ontology/mds#email");


	/**
	 * The Jena Property for firstName 
	 * <p>(URI: http://ontology/mds#firstName)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : First name^^http://www.w3.org/2001/XMLSchema#string <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property firstNameProperty = ResourceFactory.createProperty("http://ontology/mds#firstName");


	/**
	 * The Jena Property for adress 
	 * <p>(URI: http://ontology/mds#adress)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : Adress^^http://www.w3.org/2001/XMLSchema#string <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property adressProperty = ResourceFactory.createProperty("http://ontology/mds#adress");


	/**
	 * The Jena Property for phoneNumber 
	 * <p>(URI: http://ontology/mds#phoneNumber)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : Phone number^^http://www.w3.org/2001/XMLSchema#string <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property phoneNumberProperty = ResourceFactory.createProperty("http://ontology/mds#phoneNumber");




	/**
	 * Gets the 'lastName' property value
	 * @return		{@link java.lang.String}
	 * @see			#lastNameProperty
	 */
	public java.lang.String getLastName() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Sets the 'lastName' property value
	 * @param		{@link java.lang.String}
	 * @see			#lastNameProperty
	 */
	public void setLastName(java.lang.String lastName) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Gets the 'birthDate' property value
	 * @return		{@link com.hp.hpl.jena.datatypes.xsd.XSDDateTime}
	 * @see			#birthDateProperty
	 */
	public com.hp.hpl.jena.datatypes.xsd.XSDDateTime getBirthDate() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Sets the 'birthDate' property value
	 * @param		{@link com.hp.hpl.jena.datatypes.xsd.XSDDateTime}
	 * @see			#birthDateProperty
	 */
	public void setBirthDate(com.hp.hpl.jena.datatypes.xsd.XSDDateTime birthDate) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Gets the 'email' property value
	 * @return		{@link java.lang.String}
	 * @see			#emailProperty
	 */
	public java.lang.String getEmail() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Sets the 'email' property value
	 * @param		{@link java.lang.String}
	 * @see			#emailProperty
	 */
	public void setEmail(java.lang.String email) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Gets the 'firstName' property value
	 * @return		{@link java.lang.String}
	 * @see			#firstNameProperty
	 */
	public java.lang.String getFirstName() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Sets the 'firstName' property value
	 * @param		{@link java.lang.String}
	 * @see			#firstNameProperty
	 */
	public void setFirstName(java.lang.String firstName) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Gets the 'adress' property value
	 * @return		{@link java.math.BigInteger}
	 * @see			#adressProperty
	 */
	public java.math.BigInteger getAdress() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Sets the 'adress' property value
	 * @param		{@link java.math.BigInteger}
	 * @see			#adressProperty
	 */
	public void setAdress(java.math.BigInteger adress) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Gets the 'phoneNumber' property value
	 * @return		{@link java.lang.String}
	 * @see			#phoneNumberProperty
	 */
	public java.lang.String getPhoneNumber() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Sets the 'phoneNumber' property value
	 * @param		{@link java.lang.String}
	 * @see			#phoneNumberProperty
	 */
	public void setPhoneNumber(java.lang.String phoneNumber) throws com.ibm.adtech.jastor.JastorException;

}