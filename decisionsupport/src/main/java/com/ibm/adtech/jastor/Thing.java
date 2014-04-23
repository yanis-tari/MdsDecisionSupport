package com.ibm.adtech.jastor;

import java.util.List;

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.vocabulary.RDFS;

/**
 * Thing is the base ontology class of all other ontology classes.
 * 
 */
public interface Thing {
    
	public static final Resource TYPE = RDFS.Resource;
    
	public String uri();
    
	public Resource resource();
    
	public Model model();
	
	@SuppressWarnings("rawtypes")
	public List listStatements();
	
	public void removeStatements();
	
	public void clearCache();
    
    void registerListener(ThingListener listener);
    
    void unregisterListener(ThingListener listener);
    
    public boolean isRDFType(Resource type);
	
}