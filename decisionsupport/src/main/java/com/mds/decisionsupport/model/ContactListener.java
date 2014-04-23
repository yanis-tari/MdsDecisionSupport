

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
 * Implementations of this listener may be registered with instances of com.mds.decisionsupport.model.Contact to 
 * receive notification when properties changed, added or removed.
 * <br>
 */
public interface ContactListener extends com.ibm.adtech.jastor.ThingListener {


	/**
	 * Called when endDateOfContact has changed
	 * @param source the affected instance of com.mds.decisionsupport.model.Contact
	 */
	public void endDateOfContactChanged(com.mds.decisionsupport.model.Contact source);

	/**
	 * Called when startDateOfContact has changed
	 * @param source the affected instance of com.mds.decisionsupport.model.Contact
	 */
	public void startDateOfContactChanged(com.mds.decisionsupport.model.Contact source);

	/**
	 * Called when a value of hasMedicalRecordInvolved has been added
	 * @param source the affected instance of com.mds.decisionsupport.model.Contact
	 * @param newValue the object representing the new value
	 */	
	public void hasMedicalRecordInvolvedAdded(com.mds.decisionsupport.model.Contact source, com.mds.decisionsupport.model.MedicalRecord newValue);

	/**
	 * Called when a value of hasMedicalRecordInvolved has been removed
	 * @param source the affected instance of com.mds.decisionsupport.model.Contact
	 * @param oldValue the object representing the removed value
	 */
	public void hasMedicalRecordInvolvedRemoved(com.mds.decisionsupport.model.Contact source, com.mds.decisionsupport.model.MedicalRecord oldValue);
		
	/**
	 * Called when a value of PatientConcerned has been added
	 * @param source the affected instance of com.mds.decisionsupport.model.Contact
	 * @param newValue the object representing the new value
	 */	
	public void PatientConcernedAdded(com.mds.decisionsupport.model.Contact source, com.mds.decisionsupport.model.Patient newValue);

	/**
	 * Called when a value of PatientConcerned has been removed
	 * @param source the affected instance of com.mds.decisionsupport.model.Contact
	 * @param oldValue the object representing the removed value
	 */
	public void PatientConcernedRemoved(com.mds.decisionsupport.model.Contact source, com.mds.decisionsupport.model.Patient oldValue);
		
	/**
	 * Called when commentOfContact has changed
	 * @param source the affected instance of com.mds.decisionsupport.model.Contact
	 */
	public void commentOfContactChanged(com.mds.decisionsupport.model.Contact source);

	/**
	 * Called when a value of hasMedicalItems has been added
	 * @param source the affected instance of com.mds.decisionsupport.model.Contact
	 * @param newValue the object representing the new value
	 */	
	public void hasMedicalItemsAdded(com.mds.decisionsupport.model.Contact source, com.mds.decisionsupport.model.MedicalItem newValue);

	/**
	 * Called when a value of hasMedicalItems has been removed
	 * @param source the affected instance of com.mds.decisionsupport.model.Contact
	 * @param oldValue the object representing the removed value
	 */
	public void hasMedicalItemsRemoved(com.mds.decisionsupport.model.Contact source, com.mds.decisionsupport.model.MedicalItem oldValue);
		
	/**
	 * Called when a value of hasMedicalItemsComposition has been added
	 * @param source the affected instance of com.mds.decisionsupport.model.Contact
	 * @param newValue the object representing the new value
	 */	
	public void hasMedicalItemsCompositionAdded(com.mds.decisionsupport.model.Contact source, com.mds.decisionsupport.model.CompositionOfMedicalItems newValue);

	/**
	 * Called when a value of hasMedicalItemsComposition has been removed
	 * @param source the affected instance of com.mds.decisionsupport.model.Contact
	 * @param oldValue the object representing the removed value
	 */
	public void hasMedicalItemsCompositionRemoved(com.mds.decisionsupport.model.Contact source, com.mds.decisionsupport.model.CompositionOfMedicalItems oldValue);
		
	/**
	 * Called when a value of HealthcarePersonneConcerned has been added
	 * @param source the affected instance of com.mds.decisionsupport.model.Contact
	 * @param newValue the object representing the new value
	 */	
	public void HealthcarePersonneConcernedAdded(com.mds.decisionsupport.model.Contact source, com.mds.decisionsupport.model.HealthcarePersonnel newValue);

	/**
	 * Called when a value of HealthcarePersonneConcerned has been removed
	 * @param source the affected instance of com.mds.decisionsupport.model.Contact
	 * @param oldValue the object representing the removed value
	 */
	public void HealthcarePersonneConcernedRemoved(com.mds.decisionsupport.model.Contact source, com.mds.decisionsupport.model.HealthcarePersonnel oldValue);
		
}