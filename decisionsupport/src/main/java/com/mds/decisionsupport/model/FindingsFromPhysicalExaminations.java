

package com.mds.decisionsupport.model;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for Findings from physical examinations^^http://www.w3.org/2001/XMLSchema#string ontology class<br>
 * Use the com.mds.decisionsupport.model.MdsFactory to create instances of this interface.
 * <p>(URI: http://ontology/mds#FindingsFromPhysicalExaminations)</p>
 * <br>
 * RDF Schema Standard Properties <br>
 * 	label : Findings from physical examinations^^http://www.w3.org/2001/XMLSchema#string <br>
 * <br>
 * <br>
 */
public interface FindingsFromPhysicalExaminations extends com.mds.decisionsupport.model.Objective, com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://ontology/mds#FindingsFromPhysicalExaminations");
	



}