

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
 * Implementations of this listener may be registered with instances of com.mds.decisionsupport.model.MedicalRecord to 
 * receive notification when properties changed, added or removed.
 * <br>
 */
public interface MedicalRecordListener extends com.ibm.adtech.jastor.ThingListener {


	/**
	 * Called when commentOfMedicalRecord has changed
	 * @param source the affected instance of com.mds.decisionsupport.model.MedicalRecord
	 */
	public void commentOfMedicalRecordChanged(com.mds.decisionsupport.model.MedicalRecord source);

	/**
	 * Called when a value of hasContacts has been added
	 * @param source the affected instance of com.mds.decisionsupport.model.MedicalRecord
	 * @param newValue the object representing the new value
	 */	
	public void hasContactsAdded(com.mds.decisionsupport.model.MedicalRecord source, com.mds.decisionsupport.model.Contact newValue);

	/**
	 * Called when a value of hasContacts has been removed
	 * @param source the affected instance of com.mds.decisionsupport.model.MedicalRecord
	 * @param oldValue the object representing the removed value
	 */
	public void hasContactsRemoved(com.mds.decisionsupport.model.MedicalRecord source, com.mds.decisionsupport.model.Contact oldValue);
		
	/**
	 * Called when hasStaticInformation has changed
	 * @param source the affected instance of com.mds.decisionsupport.model.MedicalRecord
	 */
	public void hasStaticInformationChanged(com.mds.decisionsupport.model.MedicalRecord source);

}