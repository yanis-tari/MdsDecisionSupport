package com.ibm.adtech.jastor;

import com.hp.hpl.jena.rdf.model.Literal;

public class JastorInvalidLiteralException extends JastorException {	
	
    Literal literal;
    public JastorInvalidLiteralException(
        Exception e,
        int errorCode,
        String errorDescription,
        Literal object) {
        super(e, errorCode, errorDescription);
        this.literal = object;
    }

    public JastorInvalidLiteralException(int errorCode, String errorDescription, Literal object) {
        super(errorCode, errorDescription);
        this.literal = object;
    }

    public JastorInvalidLiteralException(Exception e, String errorDescription, Literal object) {
        super(e, errorDescription);
        this.literal = object;
    }

    public JastorInvalidLiteralException(String errorDescription, Literal object) {
        super(errorDescription);
         this.literal = object;
    }

    public JastorInvalidLiteralException(Literal object) {
        super();
        this.literal = object;
    }
    
    public Literal getLiteral() {
        return literal;
    }
}
