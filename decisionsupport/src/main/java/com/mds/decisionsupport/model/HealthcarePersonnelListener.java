

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
 * Implementations of this listener may be registered with instances of com.mds.decisionsupport.model.HealthcarePersonnel to 
 * receive notification when properties changed, added or removed.
 * <br>
 */
public interface HealthcarePersonnelListener extends com.ibm.adtech.jastor.ThingListener {


	/**
	 * Called when lastName has changed
	 * @param source the affected instance of com.mds.decisionsupport.model.HealthcarePersonnel
	 */
	public void lastNameChanged(com.mds.decisionsupport.model.HealthcarePersonnel source);

	/**
	 * Called when birthDate has changed
	 * @param source the affected instance of com.mds.decisionsupport.model.HealthcarePersonnel
	 */
	public void birthDateChanged(com.mds.decisionsupport.model.HealthcarePersonnel source);

	/**
	 * Called when email has changed
	 * @param source the affected instance of com.mds.decisionsupport.model.HealthcarePersonnel
	 */
	public void emailChanged(com.mds.decisionsupport.model.HealthcarePersonnel source);

	/**
	 * Called when firstName has changed
	 * @param source the affected instance of com.mds.decisionsupport.model.HealthcarePersonnel
	 */
	public void firstNameChanged(com.mds.decisionsupport.model.HealthcarePersonnel source);

	/**
	 * Called when adress has changed
	 * @param source the affected instance of com.mds.decisionsupport.model.HealthcarePersonnel
	 */
	public void adressChanged(com.mds.decisionsupport.model.HealthcarePersonnel source);

	/**
	 * Called when phoneNumber has changed
	 * @param source the affected instance of com.mds.decisionsupport.model.HealthcarePersonnel
	 */
	public void phoneNumberChanged(com.mds.decisionsupport.model.HealthcarePersonnel source);

}