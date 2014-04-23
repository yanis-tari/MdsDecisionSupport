

package com.mds.decisionsupport.model;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for Healthcare personnel^^http://www.w3.org/2001/XMLSchema#string ontology class<br>
 * Use the com.mds.decisionsupport.model.MdsFactory to create instances of this interface.
 * <p>(URI: http://ontology/mds#HealthcarePersonnel)</p>
 * <br>
 * RDF Schema Standard Properties <br>
 * 	label : Healthcare personnel^^http://www.w3.org/2001/XMLSchema#string <br>
 * <br>
 * <br>
 */
public interface HealthcarePersonnel extends com.mds.decisionsupport.model.NaturalPerson, com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://ontology/mds#HealthcarePersonnel");
	



}