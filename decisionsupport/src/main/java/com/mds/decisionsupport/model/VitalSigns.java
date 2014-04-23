

package com.mds.decisionsupport.model;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for Vital signs^^http://www.w3.org/2001/XMLSchema#string ontology class<br>
 * Use the com.mds.decisionsupport.model.MdsFactory to create instances of this interface.
 * <p>(URI: http://ontology/mds#VitalSigns)</p>
 * <br>
 * RDF Schema Standard Properties <br>
 * 	label : Vital signs^^http://www.w3.org/2001/XMLSchema#string <br>
 * <br>
 * <br>
 */
public interface VitalSigns extends com.mds.decisionsupport.model.Objective, com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://ontology/mds#VitalSigns");
	


	/**
	 * Individual for URI: http://www.semanticweb.org/owl/owlapi/turtle#VitalSign_1
	 */
	public static com.hp.hpl.jena.rdf.model.Resource VitalSign__1 = ResourceFactory.createResource("http://www.semanticweb.org/owl/owlapi/turtle#VitalSign_1");



}