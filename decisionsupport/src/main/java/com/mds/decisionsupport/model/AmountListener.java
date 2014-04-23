

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
 * Implementations of this listener may be registered with instances of com.mds.decisionsupport.model.Amount to 
 * receive notification when properties changed, added or removed.
 * <br>
 */
public interface AmountListener extends com.ibm.adtech.jastor.ThingListener {


	/**
	 * Called when hasConfidence has changed
	 * @param source the affected instance of com.mds.decisionsupport.model.Amount
	 */
	public void hasConfidenceChanged(com.mds.decisionsupport.model.Amount source);

	/**
	 * Called when hasUnit has changed
	 * @param source the affected instance of com.mds.decisionsupport.model.Amount
	 */
	public void hasUnitChanged(com.mds.decisionsupport.model.Amount source);

	/**
	 * Called when hasDatavalue has changed
	 * @param source the affected instance of com.mds.decisionsupport.model.Amount
	 */
	public void hasDatavalueChanged(com.mds.decisionsupport.model.Amount source);

}