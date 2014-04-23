

package com.mds.decisionsupport.model;

/*
import com.hp.hpl.jena.datatypes.xsd.*;
import com.hp.hpl.jena.datatypes.xsd.impl.*;
import com.hp.hpl.jena.rdf.model.*;
import com.ibm.adtech.jastor.*;
import java.util.*;
import java.math.*;
*/


/**
 * Implementations of this listener may be registered with instances of com.mds.decisionsupport.model.CompositionOfMedicalItems to 
 * receive notification when properties changed, added or removed.
 * <br>
 */
public interface CompositionOfMedicalItemsListener extends com.ibm.adtech.jastor.ThingListener {


	/**
	 * Called when a value of hasMedicalItemsRegrouped has been added
	 * @param source the affected instance of com.mds.decisionsupport.model.CompositionOfMedicalItems
	 * @param newValue the object representing the new value
	 */	
	public void hasMedicalItemsRegroupedAdded(com.mds.decisionsupport.model.CompositionOfMedicalItems source, com.mds.decisionsupport.model.MedicalItem newValue);

	/**
	 * Called when a value of hasMedicalItemsRegrouped has been removed
	 * @param source the affected instance of com.mds.decisionsupport.model.CompositionOfMedicalItems
	 * @param oldValue the object representing the removed value
	 */
	public void hasMedicalItemsRegroupedRemoved(com.mds.decisionsupport.model.CompositionOfMedicalItems source, com.mds.decisionsupport.model.MedicalItem oldValue);
		
}