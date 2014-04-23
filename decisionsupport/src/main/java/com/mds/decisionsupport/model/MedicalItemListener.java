

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
 * Implementations of this listener may be registered with instances of com.mds.decisionsupport.model.MedicalItem to 
 * receive notification when properties changed, added or removed.
 * <br>
 */
public interface MedicalItemListener extends com.ibm.adtech.jastor.ThingListener {


	/**
	 * Called when a value of hasGeographicalLocation has been added
	 * @param source the affected instance of com.mds.decisionsupport.model.MedicalItem
	 * @param newValue the object representing the new value
	 */	
	public void hasGeographicalLocationAdded(com.mds.decisionsupport.model.MedicalItem source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of hasGeographicalLocation has been removed
	 * @param source the affected instance of com.mds.decisionsupport.model.MedicalItem
	 * @param oldValue the object representing the removed value
	 */
	public void hasGeographicalLocationRemoved(com.mds.decisionsupport.model.MedicalItem source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when endDateOfMedicalItem has changed
	 * @param source the affected instance of com.mds.decisionsupport.model.MedicalItem
	 */
	public void endDateOfMedicalItemChanged(com.mds.decisionsupport.model.MedicalItem source);

	/**
	 * Called when a value of hasSource has been added
	 * @param source the affected instance of com.mds.decisionsupport.model.MedicalItem
	 * @param newValue the object representing the new value
	 */	
	public void hasSourceAdded(com.mds.decisionsupport.model.MedicalItem source, com.mds.decisionsupport.model.NaturalPerson newValue);

	/**
	 * Called when a value of hasSource has been removed
	 * @param source the affected instance of com.mds.decisionsupport.model.MedicalItem
	 * @param oldValue the object representing the removed value
	 */
	public void hasSourceRemoved(com.mds.decisionsupport.model.MedicalItem source, com.mds.decisionsupport.model.NaturalPerson oldValue);
		
	/**
	 * Called when a value of hasSource has been added
	 * @param source the affected instance of com.mds.decisionsupport.model.MedicalItem
	 * @param newValue the object representing the new value
	 */	
	public void hasSourceAdded(com.mds.decisionsupport.model.MedicalItem source, com.mds.decisionsupport.model.SensingDevice newValue);

	/**
	 * Called when a value of hasSource has been removed
	 * @param source the affected instance of com.mds.decisionsupport.model.MedicalItem
	 * @param oldValue the object representing the removed value
	 */
	public void hasSourceRemoved(com.mds.decisionsupport.model.MedicalItem source, com.mds.decisionsupport.model.SensingDevice oldValue);
		
	/**
	 * Called when startDateOfMedicalItem has changed
	 * @param source the affected instance of com.mds.decisionsupport.model.MedicalItem
	 */
	public void startDateOfMedicalItemChanged(com.mds.decisionsupport.model.MedicalItem source);

	/**
	 * Called when hasEffectTime has changed
	 * @param source the affected instance of com.mds.decisionsupport.model.MedicalItem
	 */
	public void hasEffectTimeChanged(com.mds.decisionsupport.model.MedicalItem source);

	/**
	 * Called when a value of hasNomenclatureCode has been added
	 * @param source the affected instance of com.mds.decisionsupport.model.MedicalItem
	 * @param newValue the object representing the new value
	 */	
	public void hasNomenclatureCodeAdded(com.mds.decisionsupport.model.MedicalItem source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of hasNomenclatureCode has been removed
	 * @param source the affected instance of com.mds.decisionsupport.model.MedicalItem
	 * @param oldValue the object representing the removed value
	 */
	public void hasNomenclatureCodeRemoved(com.mds.decisionsupport.model.MedicalItem source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of isPartOf has been added
	 * @param source the affected instance of com.mds.decisionsupport.model.MedicalItem
	 * @param newValue the object representing the new value
	 */	
	public void isPartOfAdded(com.mds.decisionsupport.model.MedicalItem source, com.mds.decisionsupport.model.CompositionOfMedicalItems newValue);

	/**
	 * Called when a value of isPartOf has been removed
	 * @param source the affected instance of com.mds.decisionsupport.model.MedicalItem
	 * @param oldValue the object representing the removed value
	 */
	public void isPartOfRemoved(com.mds.decisionsupport.model.MedicalItem source, com.mds.decisionsupport.model.CompositionOfMedicalItems oldValue);
		
	/**
	 * Called when a value of hasMedicalObject has been added
	 * @param source the affected instance of com.mds.decisionsupport.model.MedicalItem
	 * @param newValue the object representing the new value
	 */	
	public void hasMedicalObjectAdded(com.mds.decisionsupport.model.MedicalItem source, com.mds.decisionsupport.model.MedicalItem newValue);

	/**
	 * Called when a value of hasMedicalObject has been removed
	 * @param source the affected instance of com.mds.decisionsupport.model.MedicalItem
	 * @param oldValue the object representing the removed value
	 */
	public void hasMedicalObjectRemoved(com.mds.decisionsupport.model.MedicalItem source, com.mds.decisionsupport.model.MedicalItem oldValue);
		
	/**
	 * Called when a value of hasContext has been added
	 * @param source the affected instance of com.mds.decisionsupport.model.MedicalItem
	 * @param newValue the object representing the new value
	 */	
	public void hasContextAdded(com.mds.decisionsupport.model.MedicalItem source, com.hp.hpl.jena.rdf.model.Literal newValue);

	/**
	 * Called when a value of hasContext has been removed
	 * @param source the affected instance of com.mds.decisionsupport.model.MedicalItem
	 * @param oldValue the object representing the removed value
	 */	
	public void hasContextRemoved(com.mds.decisionsupport.model.MedicalItem source, com.hp.hpl.jena.rdf.model.Literal oldValue);

	/**
	 * Called when commentOfMedicalItem has changed
	 * @param source the affected instance of com.mds.decisionsupport.model.MedicalItem
	 */
	public void commentOfMedicalItemChanged(com.mds.decisionsupport.model.MedicalItem source);

	/**
	 * Called when a value of hasAmount has been added
	 * @param source the affected instance of com.mds.decisionsupport.model.MedicalItem
	 * @param newValue the object representing the new value
	 */	
	public void hasAmountAdded(com.mds.decisionsupport.model.MedicalItem source, com.mds.decisionsupport.model.Amount newValue);

	/**
	 * Called when a value of hasAmount has been removed
	 * @param source the affected instance of com.mds.decisionsupport.model.MedicalItem
	 * @param oldValue the object representing the removed value
	 */
	public void hasAmountRemoved(com.mds.decisionsupport.model.MedicalItem source, com.mds.decisionsupport.model.Amount oldValue);
		
	/**
	 * Called when hasTimeStamp has changed
	 * @param source the affected instance of com.mds.decisionsupport.model.MedicalItem
	 */
	public void hasTimeStampChanged(com.mds.decisionsupport.model.MedicalItem source);

}