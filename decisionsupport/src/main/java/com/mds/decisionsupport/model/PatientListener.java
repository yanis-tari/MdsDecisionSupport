

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
 * Implementations of this listener may be registered with instances of com.mds.decisionsupport.model.Patient to 
 * receive notification when properties changed, added or removed.
 * <br>
 */
public interface PatientListener extends com.ibm.adtech.jastor.ThingListener {


	/**
	 * Called when lastName has changed
	 * @param source the affected instance of com.mds.decisionsupport.model.Patient
	 */
	public void lastNameChanged(com.mds.decisionsupport.model.Patient source);

	/**
	 * Called when birthDate has changed
	 * @param source the affected instance of com.mds.decisionsupport.model.Patient
	 */
	public void birthDateChanged(com.mds.decisionsupport.model.Patient source);

	/**
	 * Called when email has changed
	 * @param source the affected instance of com.mds.decisionsupport.model.Patient
	 */
	public void emailChanged(com.mds.decisionsupport.model.Patient source);

	/**
	 * Called when firstName has changed
	 * @param source the affected instance of com.mds.decisionsupport.model.Patient
	 */
	public void firstNameChanged(com.mds.decisionsupport.model.Patient source);

	/**
	 * Called when adress has changed
	 * @param source the affected instance of com.mds.decisionsupport.model.Patient
	 */
	public void adressChanged(com.mds.decisionsupport.model.Patient source);

	/**
	 * Called when phoneNumber has changed
	 * @param source the affected instance of com.mds.decisionsupport.model.Patient
	 */
	public void phoneNumberChanged(com.mds.decisionsupport.model.Patient source);

	/**
	 * Called when a value of medicalRecordOfPatient has been added
	 * @param source the affected instance of com.mds.decisionsupport.model.Patient
	 * @param newValue the object representing the new value
	 */	
	public void medicalRecordOfPatientAdded(com.mds.decisionsupport.model.Patient source, com.mds.decisionsupport.model.MedicalRecord newValue);

	/**
	 * Called when a value of medicalRecordOfPatient has been removed
	 * @param source the affected instance of com.mds.decisionsupport.model.Patient
	 * @param oldValue the object representing the removed value
	 */
	public void medicalRecordOfPatientRemoved(com.mds.decisionsupport.model.Patient source, com.mds.decisionsupport.model.MedicalRecord oldValue);
		
}