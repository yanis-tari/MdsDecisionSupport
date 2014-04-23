

package com.mds.decisionsupport.model;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for Amount^^http://www.w3.org/2001/XMLSchema#string ontology class<br>
 * Use the com.mds.decisionsupport.model.MdsFactory to create instances of this interface.
 * <p>(URI: http://ontology/mds#Amount)</p>
 * <br>
 * RDF Schema Standard Properties <br>
 * 	label : Amount^^http://www.w3.org/2001/XMLSchema#string <br>
 * <br>
 * <br>
 */
public interface Amount extends com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://ontology/mds#Amount");
	

	/**
	 * The Jena Property for hasConfidence 
	 * <p>(URI: http://ontology/mds#hasConfidence)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : has confidence^^http://www.w3.org/2001/XMLSchema#string <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property hasConfidenceProperty = ResourceFactory.createProperty("http://ontology/mds#hasConfidence");


	/**
	 * The Jena Property for hasUnit 
	 * <p>(URI: http://ontology/mds#hasUnit)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : has unit^^http://www.w3.org/2001/XMLSchema#string <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property hasUnitProperty = ResourceFactory.createProperty("http://ontology/mds#hasUnit");


	/**
	 * The Jena Property for hasDatavalue 
	 * <p>(URI: http://ontology/mds#hasDatavalue)</p>
	 * <br>
	 * <br>
	 * RDF Schema Standard Properties <br>
	 * 	label : has data value^^http://www.w3.org/2001/XMLSchema#string <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property hasDatavalueProperty = ResourceFactory.createProperty("http://ontology/mds#hasDatavalue");



	/**
	 * Individual for URI: http://www.semanticweb.org/owl/owlapi/turtle#Amount_1
	 */
	public static com.hp.hpl.jena.rdf.model.Resource Amount__1 = ResourceFactory.createResource("http://www.semanticweb.org/owl/owlapi/turtle#Amount_1");



	/**
	 * Gets the 'hasConfidence' property value
	 * @return		{@link java.lang.Float}
	 * @see			#hasConfidenceProperty
	 */
	public java.lang.Float getHasConfidence() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Sets the 'hasConfidence' property value
	 * @param		{@link java.lang.Float}
	 * @see			#hasConfidenceProperty
	 */
	public void setHasConfidence(java.lang.Float hasConfidence) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Gets the 'hasUnit' property value
	 * @return		{@link java.lang.String}
	 * @see			#hasUnitProperty
	 */
	public java.lang.String getHasUnit() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Sets the 'hasUnit' property value
	 * @param		{@link java.lang.String}
	 * @see			#hasUnitProperty
	 */
	public void setHasUnit(java.lang.String hasUnit) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Gets the 'hasDatavalue' property value
	 * @return		{@link java.lang.String}
	 * @see			#hasDatavalueProperty
	 */
	public java.lang.String getHasDatavalue() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Sets the 'hasDatavalue' property value
	 * @param		{@link java.lang.String}
	 * @see			#hasDatavalueProperty
	 */
	public void setHasDatavalue(java.lang.String hasDatavalue) throws com.ibm.adtech.jastor.JastorException;

}