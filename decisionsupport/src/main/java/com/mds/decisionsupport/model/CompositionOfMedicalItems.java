

package com.mds.decisionsupport.model;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for Composition of medical items^^http://www.w3.org/2001/XMLSchema#string ontology class<br>
 * Use the com.mds.decisionsupport.model.MdsFactory to create instances of this interface.
 * <p>(URI: http://ontology/mds#CompositionOfMedicalItems)</p>
 * <br>
 * RDF Schema Standard Properties <br>
 * 	label : Composition of medical items^^http://www.w3.org/2001/XMLSchema#string <br>
 * <br>
 * <br>
 */
public interface CompositionOfMedicalItems extends com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://ontology/mds#CompositionOfMedicalItems");
	

	/**
	 * The Jena Property for hasMedicalItemsRegrouped 
	 * <p>(URI: http://ontology/mds#hasMedicalItemsRegrouped)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : has medical items regrouped <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property hasMedicalItemsRegroupedProperty = ResourceFactory.createProperty("http://ontology/mds#hasMedicalItemsRegrouped");




	/**
	 * Get an Iterator the 'hasMedicalItemsRegrouped' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.mds.decisionsupport.model.MedicalItem}
	 * @see			#hasMedicalItemsRegroupedProperty
	 */
	public java.util.Iterator getHasMedicalItemsRegrouped() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'hasMedicalItemsRegrouped' property
	 * @param		The {@link com.mds.decisionsupport.model.MedicalItem} to add
	 * @see			#hasMedicalItemsRegroupedProperty
	 */
	public void addHasMedicalItemsRegrouped(com.mds.decisionsupport.model.MedicalItem hasMedicalItemsRegrouped) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'hasMedicalItemsRegrouped' property
	 * @return		The anoymous {@link com.mds.decisionsupport.model.MedicalItem} created
	 * @see			#hasMedicalItemsRegroupedProperty
	 */
	public com.mds.decisionsupport.model.MedicalItem addHasMedicalItemsRegrouped() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://ontology/mds#MedicalItem.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#hasMedicalItemsRegroupedProperty
	 */
	public com.mds.decisionsupport.model.MedicalItem addHasMedicalItemsRegrouped(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'hasMedicalItemsRegrouped' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.mds.decisionsupport.model.MedicalItem} to remove
	 * @see			#hasMedicalItemsRegroupedProperty
	 */
	public void removeHasMedicalItemsRegrouped(com.mds.decisionsupport.model.MedicalItem hasMedicalItemsRegrouped) throws com.ibm.adtech.jastor.JastorException;
		
}