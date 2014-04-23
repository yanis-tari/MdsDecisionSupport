package com.ibm.adtech.jastor;

import com.hp.hpl.jena.rdf.model.RDFNode;


public class JastorInvalidRDFNodeException extends JastorException {	
	
    RDFNode object;
	public JastorInvalidRDFNodeException(
		Exception e,
		int errorCode,
		String errorDescription,
        RDFNode object) {
		super(e, errorCode, errorDescription);
        this.object = object;
	}

	public JastorInvalidRDFNodeException(int errorCode, String errorDescription, RDFNode object) {
		super(errorCode, errorDescription);
        this.object = object;
	}

	public JastorInvalidRDFNodeException(Exception e, String errorDescription, RDFNode object) {
		super(e, errorDescription);
        this.object = object;
	}

	public JastorInvalidRDFNodeException(String errorDescription, RDFNode object) {
		super(errorDescription);
         this.object = object;
	}

	public JastorInvalidRDFNodeException(RDFNode object) {
		super();
        this.object = object;
	}
    
    public RDFNode getRDFNode () {
        return object;
    }
}
