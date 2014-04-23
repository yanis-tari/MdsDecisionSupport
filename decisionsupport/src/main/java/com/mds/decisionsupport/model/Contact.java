

package com.mds.decisionsupport.model;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for Contact^^http://www.w3.org/2001/XMLSchema#string ontology class<br>
 * Use the com.mds.decisionsupport.model.MdsFactory to create instances of this interface.
 * <p>(URI: http://ontology/mds#Contact)</p>
 * <br>
 * RDF Schema Standard Properties <br>
 * 	label : Contact^^http://www.w3.org/2001/XMLSchema#string <br>
 * <br>
 * <br>
 */
@SuppressWarnings({ "rawtypes" })
public interface Contact extends com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://ontology/mds#Contact");
	

	/**
	 * The Jena Property for endDateOfContact 
	 * <p>(URI: http://ontology/mds#endDateOfContact)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : end date of contact <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property endDateOfContactProperty = ResourceFactory.createProperty("http://ontology/mds#endDateOfContact");


	/**
	 * The Jena Property for startDateOfContact 
	 * <p>(URI: http://ontology/mds#startDateOfContact)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : start date of contact <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property startDateOfContactProperty = ResourceFactory.createProperty("http://ontology/mds#startDateOfContact");


	/**
	 * The Jena Property for hasMedicalRecordInvolved 
	 * <p>(URI: http://ontology/mds#hasMedicalRecordInvolved)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : has medical record involved <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property hasMedicalRecordInvolvedProperty = ResourceFactory.createProperty("http://ontology/mds#hasMedicalRecordInvolved");


	/**
	 * The Jena Property for PatientConcerned 
	 * <p>(URI: http://ontology/mds#PatientConcerned)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : Patient concerned^^http://www.w3.org/2001/XMLSchema#string <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property PatientConcernedProperty = ResourceFactory.createProperty("http://ontology/mds#PatientConcerned");


	/**
	 * The Jena Property for commentOfContact 
	 * <p>(URI: http://ontology/mds#commentOfContact)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : comment of contact <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property commentOfContactProperty = ResourceFactory.createProperty("http://ontology/mds#commentOfContact");


	/**
	 * The Jena Property for hasMedicalItems 
	 * <p>(URI: http://ontology/mds#hasMedicalItems)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : has medical items^^http://www.w3.org/2001/XMLSchema#string <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property hasMedicalItemsProperty = ResourceFactory.createProperty("http://ontology/mds#hasMedicalItems");


	/**
	 * The Jena Property for hasMedicalItemsComposition 
	 * <p>(URI: http://ontology/mds#hasMedicalItemsComposition)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : has composition of medical items  <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property hasMedicalItemsCompositionProperty = ResourceFactory.createProperty("http://ontology/mds#hasMedicalItemsComposition");


	/**
	 * The Jena Property for HealthcarePersonneConcerned 
	 * <p>(URI: http://ontology/mds#HealthcarePersonneConcerned)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : healthcare personnel concerned^^http://www.w3.org/2001/XMLSchema#string <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property HealthcarePersonneConcernedProperty = ResourceFactory.createProperty("http://ontology/mds#HealthcarePersonneConcerned");



	/**
	 * Individual for URI: http://ontology/mds#Contact_1
	 */
	public static com.hp.hpl.jena.rdf.model.Resource Contact__1 = ResourceFactory.createResource("http://ontology/mds#Contact_1");



	/**
	 * Gets the 'endDateOfContact' property value
	 * @return		{@link com.hp.hpl.jena.datatypes.xsd.XSDDateTime}
	 * @see			#endDateOfContactProperty
	 */
	public com.hp.hpl.jena.datatypes.xsd.XSDDateTime getEndDateOfContact() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Sets the 'endDateOfContact' property value
	 * @param		{@link com.hp.hpl.jena.datatypes.xsd.XSDDateTime}
	 * @see			#endDateOfContactProperty
	 */
	public void setEndDateOfContact(com.hp.hpl.jena.datatypes.xsd.XSDDateTime endDateOfContact) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Gets the 'startDateOfContact' property value
	 * @return		{@link com.hp.hpl.jena.datatypes.xsd.XSDDateTime}
	 * @see			#startDateOfContactProperty
	 */
	public com.hp.hpl.jena.datatypes.xsd.XSDDateTime getStartDateOfContact() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Sets the 'startDateOfContact' property value
	 * @param		{@link com.hp.hpl.jena.datatypes.xsd.XSDDateTime}
	 * @see			#startDateOfContactProperty
	 */
	public void setStartDateOfContact(com.hp.hpl.jena.datatypes.xsd.XSDDateTime startDateOfContact) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Get an Iterator the 'hasMedicalRecordInvolved' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.mds.decisionsupport.model.MedicalRecord}
	 * @see			#hasMedicalRecordInvolvedProperty
	 */
	public java.util.Iterator getHasMedicalRecordInvolved() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'hasMedicalRecordInvolved' property
	 * @param		The {@link com.mds.decisionsupport.model.MedicalRecord} to add
	 * @see			#hasMedicalRecordInvolvedProperty
	 */
	public void addHasMedicalRecordInvolved(com.mds.decisionsupport.model.MedicalRecord hasMedicalRecordInvolved) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'hasMedicalRecordInvolved' property
	 * @return		The anoymous {@link com.mds.decisionsupport.model.MedicalRecord} created
	 * @see			#hasMedicalRecordInvolvedProperty
	 */
	public com.mds.decisionsupport.model.MedicalRecord addHasMedicalRecordInvolved() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://ontology/mds#MedicalRecord.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#hasMedicalRecordInvolvedProperty
	 */
	public com.mds.decisionsupport.model.MedicalRecord addHasMedicalRecordInvolved(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'hasMedicalRecordInvolved' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.mds.decisionsupport.model.MedicalRecord} to remove
	 * @see			#hasMedicalRecordInvolvedProperty
	 */
	public void removeHasMedicalRecordInvolved(com.mds.decisionsupport.model.MedicalRecord hasMedicalRecordInvolved) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'PatientConcerned' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.mds.decisionsupport.model.Patient}
	 * @see			#PatientConcernedProperty
	 */
	public java.util.Iterator getPatientConcerned() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'PatientConcerned' property
	 * @param		The {@link com.mds.decisionsupport.model.Patient} to add
	 * @see			#PatientConcernedProperty
	 */
	public void addPatientConcerned(com.mds.decisionsupport.model.Patient PatientConcerned) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'PatientConcerned' property
	 * @return		The anoymous {@link com.mds.decisionsupport.model.Patient} created
	 * @see			#PatientConcernedProperty
	 */
	public com.mds.decisionsupport.model.Patient addPatientConcerned() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://ontology/mds#Patient.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#PatientConcernedProperty
	 */
	public com.mds.decisionsupport.model.Patient addPatientConcerned(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'PatientConcerned' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.mds.decisionsupport.model.Patient} to remove
	 * @see			#PatientConcernedProperty
	 */
	public void removePatientConcerned(com.mds.decisionsupport.model.Patient PatientConcerned) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Gets the 'commentOfContact' property value
	 * @return		{@link java.lang.String}
	 * @see			#commentOfContactProperty
	 */
	public java.lang.String getCommentOfContact() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Sets the 'commentOfContact' property value
	 * @param		{@link java.lang.String}
	 * @see			#commentOfContactProperty
	 */
	public void setCommentOfContact(java.lang.String commentOfContact) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Get an Iterator the 'hasMedicalItems' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.mds.decisionsupport.model.MedicalItem}
	 * @see			#hasMedicalItemsProperty
	 */
	public java.util.Iterator getHasMedicalItems() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'hasMedicalItems' property
	 * @param		The {@link com.mds.decisionsupport.model.MedicalItem} to add
	 * @see			#hasMedicalItemsProperty
	 */
	public void addHasMedicalItems(com.mds.decisionsupport.model.MedicalItem hasMedicalItems) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'hasMedicalItems' property
	 * @return		The anoymous {@link com.mds.decisionsupport.model.MedicalItem} created
	 * @see			#hasMedicalItemsProperty
	 */
	public com.mds.decisionsupport.model.MedicalItem addHasMedicalItems() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://ontology/mds#MedicalItem.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#hasMedicalItemsProperty
	 */
	public com.mds.decisionsupport.model.MedicalItem addHasMedicalItems(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'hasMedicalItems' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.mds.decisionsupport.model.MedicalItem} to remove
	 * @see			#hasMedicalItemsProperty
	 */
	public void removeHasMedicalItems(com.mds.decisionsupport.model.MedicalItem hasMedicalItems) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'hasMedicalItemsComposition' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.mds.decisionsupport.model.CompositionOfMedicalItems}
	 * @see			#hasMedicalItemsCompositionProperty
	 */
	public java.util.Iterator getHasMedicalItemsComposition() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'hasMedicalItemsComposition' property
	 * @param		The {@link com.mds.decisionsupport.model.CompositionOfMedicalItems} to add
	 * @see			#hasMedicalItemsCompositionProperty
	 */
	public void addHasMedicalItemsComposition(com.mds.decisionsupport.model.CompositionOfMedicalItems hasMedicalItemsComposition) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'hasMedicalItemsComposition' property
	 * @return		The anoymous {@link com.mds.decisionsupport.model.CompositionOfMedicalItems} created
	 * @see			#hasMedicalItemsCompositionProperty
	 */
	public com.mds.decisionsupport.model.CompositionOfMedicalItems addHasMedicalItemsComposition() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://ontology/mds#CompositionOfMedicalItems.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#hasMedicalItemsCompositionProperty
	 */
	public com.mds.decisionsupport.model.CompositionOfMedicalItems addHasMedicalItemsComposition(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'hasMedicalItemsComposition' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.mds.decisionsupport.model.CompositionOfMedicalItems} to remove
	 * @see			#hasMedicalItemsCompositionProperty
	 */
	public void removeHasMedicalItemsComposition(com.mds.decisionsupport.model.CompositionOfMedicalItems hasMedicalItemsComposition) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'HealthcarePersonneConcerned' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.mds.decisionsupport.model.HealthcarePersonnel}
	 * @see			#HealthcarePersonneConcernedProperty
	 */
	public java.util.Iterator getHealthcarePersonneConcerned() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'HealthcarePersonneConcerned' property
	 * @param		The {@link com.mds.decisionsupport.model.HealthcarePersonnel} to add
	 * @see			#HealthcarePersonneConcernedProperty
	 */
	public void addHealthcarePersonneConcerned(com.mds.decisionsupport.model.HealthcarePersonnel HealthcarePersonneConcerned) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'HealthcarePersonneConcerned' property
	 * @return		The anoymous {@link com.mds.decisionsupport.model.HealthcarePersonnel} created
	 * @see			#HealthcarePersonneConcernedProperty
	 */
	public com.mds.decisionsupport.model.HealthcarePersonnel addHealthcarePersonneConcerned() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://ontology/mds#HealthcarePersonnel.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#HealthcarePersonneConcernedProperty
	 */
	public com.mds.decisionsupport.model.HealthcarePersonnel addHealthcarePersonneConcerned(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'HealthcarePersonneConcerned' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.mds.decisionsupport.model.HealthcarePersonnel} to remove
	 * @see			#HealthcarePersonneConcernedProperty
	 */
	public void removeHealthcarePersonneConcerned(com.mds.decisionsupport.model.HealthcarePersonnel HealthcarePersonneConcerned) throws com.ibm.adtech.jastor.JastorException;
		
}