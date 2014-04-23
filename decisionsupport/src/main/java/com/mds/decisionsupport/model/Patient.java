

package com.mds.decisionsupport.model;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for Patient^^http://www.w3.org/2001/XMLSchema#string ontology class<br>
 * Use the com.mds.decisionsupport.model.MdsFactory to create instances of this interface.
 * <p>(URI: http://ontology/mds#Patient)</p>
 * <br>
 * RDF Schema Standard Properties <br>
 * 	label : Patient^^http://www.w3.org/2001/XMLSchema#string <br>
 * <br>
 * <br>
 */
public interface Patient extends com.mds.decisionsupport.model.NaturalPerson, com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://ontology/mds#Patient");
	

	/**
	 * The Jena Property for medicalRecordOfPatient 
	 * <p>(URI: http://ontology/mds#medicalRecordOfPatient)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : medical record of patient <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property medicalRecordOfPatientProperty = ResourceFactory.createProperty("http://ontology/mds#medicalRecordOfPatient");



	/**
	 * Individual for URI: http://ontology/mds#Patient_1
	 */
	public static com.hp.hpl.jena.rdf.model.Resource Patient__1 = ResourceFactory.createResource("http://ontology/mds#Patient_1");



	/**
	 * Get an Iterator the 'medicalRecordOfPatient' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.mds.decisionsupport.model.MedicalRecord}
	 * @see			#medicalRecordOfPatientProperty
	 */
	public java.util.Iterator getMedicalRecordOfPatient() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'medicalRecordOfPatient' property
	 * @param		The {@link com.mds.decisionsupport.model.MedicalRecord} to add
	 * @see			#medicalRecordOfPatientProperty
	 */
	public void addMedicalRecordOfPatient(com.mds.decisionsupport.model.MedicalRecord medicalRecordOfPatient) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'medicalRecordOfPatient' property
	 * @return		The anoymous {@link com.mds.decisionsupport.model.MedicalRecord} created
	 * @see			#medicalRecordOfPatientProperty
	 */
	public com.mds.decisionsupport.model.MedicalRecord addMedicalRecordOfPatient() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://ontology/mds#MedicalRecord.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#medicalRecordOfPatientProperty
	 */
	public com.mds.decisionsupport.model.MedicalRecord addMedicalRecordOfPatient(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'medicalRecordOfPatient' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.mds.decisionsupport.model.MedicalRecord} to remove
	 * @see			#medicalRecordOfPatientProperty
	 */
	public void removeMedicalRecordOfPatient(com.mds.decisionsupport.model.MedicalRecord medicalRecordOfPatient) throws com.ibm.adtech.jastor.JastorException;
		
}