

package com.mds.decisionsupport.model;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for Physician^^http://www.w3.org/2001/XMLSchema#string ontology class<br>
 * Use the com.mds.decisionsupport.model.MdsFactory to create instances of this interface.
 * <p>(URI: http://ontology/mds#Physician)</p>
 * <br>
 * RDF Schema Standard Properties <br>
 * 	label : Physician^^http://www.w3.org/2001/XMLSchema#string <br>
 * <br>
 * <br>
 */
public interface Physician extends com.mds.decisionsupport.model.HealthcarePersonnel, com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://ontology/mds#Physician");
	


	/**
	 * Individual for URI: http://ontology/mds#Physician_1
	 */
	public static com.hp.hpl.jena.rdf.model.Resource Physician__1 = ResourceFactory.createResource("http://ontology/mds#Physician_1");



}