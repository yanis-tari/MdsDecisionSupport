

package com.ibm.adtech.jastor;

import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import com.hp.hpl.jena.rdf.listeners.StatementListener;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.vocabulary.RDF;


public class ThingImpl extends StatementListener implements Thing  {
	
    protected String _typeUri;
	protected Resource _resource;
    protected Model _model;
    
    
    protected ThingImpl() { 
    }
    
    public ThingImpl(Resource resource, Model model) throws JastorException {
		if (model == null)
			throw new JastorException("The model parameter must not be null.");
		this._model = model;
		this._resource = resource;
    }
        
	public String uri() {
		return _resource.getURI();
	}
    
    public Model model() {
        return _model;
    }
    
    public Resource resource() {
        return _resource;
    }
    
    @SuppressWarnings({ "rawtypes" })
	public List listStatements() {
        return new ArrayList();
    }
    
    @SuppressWarnings("unchecked")
	public void removeStatements() {
        _model.remove(listStatements());
    }
    
    public void clearCache() {
        
    }

	public void registerListener(ThingListener listener) {
        // Nothing to do since there are no properties on a thing object
    }
	
	public void unregisterListener(ThingListener listener) {
		// Nothing to do since there are no properties on a thing object	
	}
	
	public boolean isRDFType(Resource type) {
	    return _model.contains(_resource,RDF.type,type);
	}
	
	@SuppressWarnings("unchecked")
	public String toString () {
    	Model m = ModelFactory.createDefaultModel();
    	m.add(listStatements());
        Writer w = new StringWriter();
        m.write(w);
        return w.toString();
    }
	
	public boolean equals(Object obj) {
        if(super.equals(obj)) return true;
        // This equals test might not be sufficient for the entire hierarchy
        if (obj instanceof Thing) {
            Thing other = (Thing)obj;
            if (other.resource().equals(this.resource())) {
                return true;
            }
        }
        return false;
    }
	
	

}
