

package com.mds.decisionsupport.model;

import com.ibm.adtech.jastor.*;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.Statement;
import com.hp.hpl.jena.rdf.model.StmtIterator;
import com.hp.hpl.jena.vocabulary.RDF;

/**
 * Factory for instantiating objects for ontology classes in the Mds ontology.  The
 * get methods leave the model unchanged and return a Java view of the object in the model.  The create methods
 * may add certain baseline properties to the model such as rdf:type and any properties with hasValue restrictions.
 * <p>(URI: http://ontology/Mds)</p>
 * <br>
 * <br>
 * <br>
 */

@SuppressWarnings({ "rawtypes", "unchecked" })
public class MdsFactory extends com.ibm.adtech.jastor.ThingFactory { 



	/**
	 * Create a new instance of NaturalPerson.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the NaturalPerson
	 * @param model the Jena Model.
	 */
	public static NaturalPerson createNaturalPerson(Resource resource, Model model) throws JastorException {
		return com.mds.decisionsupport.model.NaturalPersonImpl.createNaturalPerson(resource,model);
	}
	
	/**
	 * Create a new instance of NaturalPerson.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the NaturalPerson
	 * @param model the Jena Model.
	 */
	public static NaturalPerson createNaturalPerson(String uri, Model model) throws JastorException {
		NaturalPerson obj = com.mds.decisionsupport.model.NaturalPersonImpl.createNaturalPerson(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of NaturalPerson.  Leaves the model unchanged.
	 * @param uri The uri of the NaturalPerson
	 * @param model the Jena Model.
	 */
	public static NaturalPerson getNaturalPerson(String uri, Model model) throws JastorException {
		return getNaturalPerson(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of NaturalPerson.  Leaves the model unchanged.
	 * @param resource The resource of the NaturalPerson
	 * @param model the Jena Model.
	 */
	public static NaturalPerson getNaturalPerson(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + com.mds.decisionsupport.model.NaturalPerson.class.hashCode()) + resource.toString();
		com.mds.decisionsupport.model.NaturalPersonImpl obj = (com.mds.decisionsupport.model.NaturalPersonImpl)objects.get(code);
		if (obj == null) {
			obj = com.mds.decisionsupport.model.NaturalPersonImpl.getNaturalPerson(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of NaturalPerson for every resource in the model with rdf:Type http://ontology/mds#NaturalPerson
	 * @param model the Jena Model
	 * @return a List of NaturalPerson
	 */
	public static java.util.List getAllNaturalPerson(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,NaturalPerson.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getNaturalPerson(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of CompositionOfMedicalItems.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the CompositionOfMedicalItems
	 * @param model the Jena Model.
	 */
	public static CompositionOfMedicalItems createCompositionOfMedicalItems(Resource resource, Model model) throws JastorException {
		return com.mds.decisionsupport.model.CompositionOfMedicalItemsImpl.createCompositionOfMedicalItems(resource,model);
	}
	
	/**
	 * Create a new instance of CompositionOfMedicalItems.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the CompositionOfMedicalItems
	 * @param model the Jena Model.
	 */
	public static CompositionOfMedicalItems createCompositionOfMedicalItems(String uri, Model model) throws JastorException {
		CompositionOfMedicalItems obj = com.mds.decisionsupport.model.CompositionOfMedicalItemsImpl.createCompositionOfMedicalItems(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of CompositionOfMedicalItems.  Leaves the model unchanged.
	 * @param uri The uri of the CompositionOfMedicalItems
	 * @param model the Jena Model.
	 */
	public static CompositionOfMedicalItems getCompositionOfMedicalItems(String uri, Model model) throws JastorException {
		return getCompositionOfMedicalItems(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of CompositionOfMedicalItems.  Leaves the model unchanged.
	 * @param resource The resource of the CompositionOfMedicalItems
	 * @param model the Jena Model.
	 */
	public static CompositionOfMedicalItems getCompositionOfMedicalItems(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + com.mds.decisionsupport.model.CompositionOfMedicalItems.class.hashCode()) + resource.toString();
		com.mds.decisionsupport.model.CompositionOfMedicalItemsImpl obj = (com.mds.decisionsupport.model.CompositionOfMedicalItemsImpl)objects.get(code);
		if (obj == null) {
			obj = com.mds.decisionsupport.model.CompositionOfMedicalItemsImpl.getCompositionOfMedicalItems(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of CompositionOfMedicalItems for every resource in the model with rdf:Type http://ontology/mds#CompositionOfMedicalItems
	 * @param model the Jena Model
	 * @return a List of CompositionOfMedicalItems
	 */
	public static java.util.List getAllCompositionOfMedicalItems(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,CompositionOfMedicalItems.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getCompositionOfMedicalItems(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of Objective.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Objective
	 * @param model the Jena Model.
	 */
	public static Objective createObjective(Resource resource, Model model) throws JastorException {
		return com.mds.decisionsupport.model.ObjectiveImpl.createObjective(resource,model);
	}
	
	/**
	 * Create a new instance of Objective.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Objective
	 * @param model the Jena Model.
	 */
	public static Objective createObjective(String uri, Model model) throws JastorException {
		Objective obj = com.mds.decisionsupport.model.ObjectiveImpl.createObjective(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of Objective.  Leaves the model unchanged.
	 * @param uri The uri of the Objective
	 * @param model the Jena Model.
	 */
	public static Objective getObjective(String uri, Model model) throws JastorException {
		return getObjective(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of Objective.  Leaves the model unchanged.
	 * @param resource The resource of the Objective
	 * @param model the Jena Model.
	 */
	public static Objective getObjective(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + com.mds.decisionsupport.model.Objective.class.hashCode()) + resource.toString();
		com.mds.decisionsupport.model.ObjectiveImpl obj = (com.mds.decisionsupport.model.ObjectiveImpl)objects.get(code);
		if (obj == null) {
			obj = com.mds.decisionsupport.model.ObjectiveImpl.getObjective(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Objective for every resource in the model with rdf:Type http://ontology/mds#Objective
	 * @param model the Jena Model
	 * @return a List of Objective
	 */
	public static java.util.List getAllObjective(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,Objective.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getObjective(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of Plan.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Plan
	 * @param model the Jena Model.
	 */
	public static Plan createPlan(Resource resource, Model model) throws JastorException {
		return com.mds.decisionsupport.model.PlanImpl.createPlan(resource,model);
	}
	
	/**
	 * Create a new instance of Plan.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Plan
	 * @param model the Jena Model.
	 */
	public static Plan createPlan(String uri, Model model) throws JastorException {
		Plan obj = com.mds.decisionsupport.model.PlanImpl.createPlan(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of Plan.  Leaves the model unchanged.
	 * @param uri The uri of the Plan
	 * @param model the Jena Model.
	 */
	public static Plan getPlan(String uri, Model model) throws JastorException {
		return getPlan(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of Plan.  Leaves the model unchanged.
	 * @param resource The resource of the Plan
	 * @param model the Jena Model.
	 */
	public static Plan getPlan(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + com.mds.decisionsupport.model.Plan.class.hashCode()) + resource.toString();
		com.mds.decisionsupport.model.PlanImpl obj = (com.mds.decisionsupport.model.PlanImpl)objects.get(code);
		if (obj == null) {
			obj = com.mds.decisionsupport.model.PlanImpl.getPlan(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Plan for every resource in the model with rdf:Type http://ontology/mds#Plan
	 * @param model the Jena Model
	 * @return a List of Plan
	 */
	public static java.util.List getAllPlan(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,Plan.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getPlan(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of Physician.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Physician
	 * @param model the Jena Model.
	 */
	public static Physician createPhysician(Resource resource, Model model) throws JastorException {
		return com.mds.decisionsupport.model.PhysicianImpl.createPhysician(resource,model);
	}
	
	/**
	 * Create a new instance of Physician.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Physician
	 * @param model the Jena Model.
	 */
	public static Physician createPhysician(String uri, Model model) throws JastorException {
		Physician obj = com.mds.decisionsupport.model.PhysicianImpl.createPhysician(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of Physician.  Leaves the model unchanged.
	 * @param uri The uri of the Physician
	 * @param model the Jena Model.
	 */
	public static Physician getPhysician(String uri, Model model) throws JastorException {
		return getPhysician(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of Physician.  Leaves the model unchanged.
	 * @param resource The resource of the Physician
	 * @param model the Jena Model.
	 */
	public static Physician getPhysician(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + com.mds.decisionsupport.model.Physician.class.hashCode()) + resource.toString();
		com.mds.decisionsupport.model.PhysicianImpl obj = (com.mds.decisionsupport.model.PhysicianImpl)objects.get(code);
		if (obj == null) {
			obj = com.mds.decisionsupport.model.PhysicianImpl.getPhysician(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Physician for every resource in the model with rdf:Type http://ontology/mds#Physician
	 * @param model the Jena Model
	 * @return a List of Physician
	 */
	public static java.util.List getAllPhysician(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,Physician.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getPhysician(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of MedicalRecord.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the MedicalRecord
	 * @param model the Jena Model.
	 */
	public static MedicalRecord createMedicalRecord(Resource resource, Model model) throws JastorException {
		return com.mds.decisionsupport.model.MedicalRecordImpl.createMedicalRecord(resource,model);
	}
	
	/**
	 * Create a new instance of MedicalRecord.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the MedicalRecord
	 * @param model the Jena Model.
	 */
	public static MedicalRecord createMedicalRecord(String uri, Model model) throws JastorException {
		MedicalRecord obj = com.mds.decisionsupport.model.MedicalRecordImpl.createMedicalRecord(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of MedicalRecord.  Leaves the model unchanged.
	 * @param uri The uri of the MedicalRecord
	 * @param model the Jena Model.
	 */
	public static MedicalRecord getMedicalRecord(String uri, Model model) throws JastorException {
		return getMedicalRecord(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of MedicalRecord.  Leaves the model unchanged.
	 * @param resource The resource of the MedicalRecord
	 * @param model the Jena Model.
	 */
	public static MedicalRecord getMedicalRecord(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + com.mds.decisionsupport.model.MedicalRecord.class.hashCode()) + resource.toString();
		com.mds.decisionsupport.model.MedicalRecordImpl obj = (com.mds.decisionsupport.model.MedicalRecordImpl)objects.get(code);
		if (obj == null) {
			obj = com.mds.decisionsupport.model.MedicalRecordImpl.getMedicalRecord(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of MedicalRecord for every resource in the model with rdf:Type http://ontology/mds#MedicalRecord
	 * @param model the Jena Model
	 * @return a List of MedicalRecord
	 */
	public static java.util.List getAllMedicalRecord(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,MedicalRecord.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getMedicalRecord(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of SensingDevice.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the SensingDevice
	 * @param model the Jena Model.
	 */
	public static SensingDevice createSensingDevice(Resource resource, Model model) throws JastorException {
		return com.mds.decisionsupport.model.SensingDeviceImpl.createSensingDevice(resource,model);
	}
	
	/**
	 * Create a new instance of SensingDevice.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the SensingDevice
	 * @param model the Jena Model.
	 */
	public static SensingDevice createSensingDevice(String uri, Model model) throws JastorException {
		SensingDevice obj = com.mds.decisionsupport.model.SensingDeviceImpl.createSensingDevice(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of SensingDevice.  Leaves the model unchanged.
	 * @param uri The uri of the SensingDevice
	 * @param model the Jena Model.
	 */
	public static SensingDevice getSensingDevice(String uri, Model model) throws JastorException {
		return getSensingDevice(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of SensingDevice.  Leaves the model unchanged.
	 * @param resource The resource of the SensingDevice
	 * @param model the Jena Model.
	 */
	public static SensingDevice getSensingDevice(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + com.mds.decisionsupport.model.SensingDevice.class.hashCode()) + resource.toString();
		com.mds.decisionsupport.model.SensingDeviceImpl obj = (com.mds.decisionsupport.model.SensingDeviceImpl)objects.get(code);
		if (obj == null) {
			obj = com.mds.decisionsupport.model.SensingDeviceImpl.getSensingDevice(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of SensingDevice for every resource in the model with rdf:Type http://ontology/mds#SensingDevice
	 * @param model the Jena Model
	 * @return a List of SensingDevice
	 */
	public static java.util.List getAllSensingDevice(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,SensingDevice.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getSensingDevice(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of Contact.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Contact
	 * @param model the Jena Model.
	 */
	public static Contact createContact(Resource resource, Model model) throws JastorException {
		return com.mds.decisionsupport.model.ContactImpl.createContact(resource,model);
	}
	
	/**
	 * Create a new instance of Contact.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Contact
	 * @param model the Jena Model.
	 */
	public static Contact createContact(String uri, Model model) throws JastorException {
		Contact obj = com.mds.decisionsupport.model.ContactImpl.createContact(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of Contact.  Leaves the model unchanged.
	 * @param uri The uri of the Contact
	 * @param model the Jena Model.
	 */
	public static Contact getContact(String uri, Model model) throws JastorException {
		return getContact(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of Contact.  Leaves the model unchanged.
	 * @param resource The resource of the Contact
	 * @param model the Jena Model.
	 */
	public static Contact getContact(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + com.mds.decisionsupport.model.Contact.class.hashCode()) + resource.toString();
		com.mds.decisionsupport.model.ContactImpl obj = (com.mds.decisionsupport.model.ContactImpl)objects.get(code);
		if (obj == null) {
			obj = com.mds.decisionsupport.model.ContactImpl.getContact(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Contact for every resource in the model with rdf:Type http://ontology/mds#Contact
	 * @param model the Jena Model
	 * @return a List of Contact
	 */
	public static java.util.List getAllContact(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,Contact.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getContact(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of Assessment.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Assessment
	 * @param model the Jena Model.
	 */
	public static Assessment createAssessment(Resource resource, Model model) throws JastorException {
		return com.mds.decisionsupport.model.AssessmentImpl.createAssessment(resource,model);
	}
	
	/**
	 * Create a new instance of Assessment.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Assessment
	 * @param model the Jena Model.
	 */
	public static Assessment createAssessment(String uri, Model model) throws JastorException {
		Assessment obj = com.mds.decisionsupport.model.AssessmentImpl.createAssessment(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of Assessment.  Leaves the model unchanged.
	 * @param uri The uri of the Assessment
	 * @param model the Jena Model.
	 */
	public static Assessment getAssessment(String uri, Model model) throws JastorException {
		return getAssessment(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of Assessment.  Leaves the model unchanged.
	 * @param resource The resource of the Assessment
	 * @param model the Jena Model.
	 */
	public static Assessment getAssessment(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + com.mds.decisionsupport.model.Assessment.class.hashCode()) + resource.toString();
		com.mds.decisionsupport.model.AssessmentImpl obj = (com.mds.decisionsupport.model.AssessmentImpl)objects.get(code);
		if (obj == null) {
			obj = com.mds.decisionsupport.model.AssessmentImpl.getAssessment(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Assessment for every resource in the model with rdf:Type http://ontology/mds#Assessment
	 * @param model the Jena Model
	 * @return a List of Assessment
	 */
	public static java.util.List getAllAssessment(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,Assessment.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getAssessment(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of VitalSigns.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the VitalSigns
	 * @param model the Jena Model.
	 */
	public static VitalSigns createVitalSigns(Resource resource, Model model) throws JastorException {
		return com.mds.decisionsupport.model.VitalSignsImpl.createVitalSigns(resource,model);
	}
	
	/**
	 * Create a new instance of VitalSigns.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the VitalSigns
	 * @param model the Jena Model.
	 */
	public static VitalSigns createVitalSigns(String uri, Model model) throws JastorException {
		VitalSigns obj = com.mds.decisionsupport.model.VitalSignsImpl.createVitalSigns(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of VitalSigns.  Leaves the model unchanged.
	 * @param uri The uri of the VitalSigns
	 * @param model the Jena Model.
	 */
	public static VitalSigns getVitalSigns(String uri, Model model) throws JastorException {
		return getVitalSigns(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of VitalSigns.  Leaves the model unchanged.
	 * @param resource The resource of the VitalSigns
	 * @param model the Jena Model.
	 */
	public static VitalSigns getVitalSigns(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + com.mds.decisionsupport.model.VitalSigns.class.hashCode()) + resource.toString();
		com.mds.decisionsupport.model.VitalSignsImpl obj = (com.mds.decisionsupport.model.VitalSignsImpl)objects.get(code);
		if (obj == null) {
			obj = com.mds.decisionsupport.model.VitalSignsImpl.getVitalSigns(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of VitalSigns for every resource in the model with rdf:Type http://ontology/mds#VitalSigns
	 * @param model the Jena Model
	 * @return a List of VitalSigns
	 */
	public static java.util.List getAllVitalSigns(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,VitalSigns.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getVitalSigns(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of FindingsFromPhysicalExaminations.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the FindingsFromPhysicalExaminations
	 * @param model the Jena Model.
	 */
	public static FindingsFromPhysicalExaminations createFindingsFromPhysicalExaminations(Resource resource, Model model) throws JastorException {
		return com.mds.decisionsupport.model.FindingsFromPhysicalExaminationsImpl.createFindingsFromPhysicalExaminations(resource,model);
	}
	
	/**
	 * Create a new instance of FindingsFromPhysicalExaminations.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the FindingsFromPhysicalExaminations
	 * @param model the Jena Model.
	 */
	public static FindingsFromPhysicalExaminations createFindingsFromPhysicalExaminations(String uri, Model model) throws JastorException {
		FindingsFromPhysicalExaminations obj = com.mds.decisionsupport.model.FindingsFromPhysicalExaminationsImpl.createFindingsFromPhysicalExaminations(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of FindingsFromPhysicalExaminations.  Leaves the model unchanged.
	 * @param uri The uri of the FindingsFromPhysicalExaminations
	 * @param model the Jena Model.
	 */
	public static FindingsFromPhysicalExaminations getFindingsFromPhysicalExaminations(String uri, Model model) throws JastorException {
		return getFindingsFromPhysicalExaminations(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of FindingsFromPhysicalExaminations.  Leaves the model unchanged.
	 * @param resource The resource of the FindingsFromPhysicalExaminations
	 * @param model the Jena Model.
	 */
	public static FindingsFromPhysicalExaminations getFindingsFromPhysicalExaminations(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + com.mds.decisionsupport.model.FindingsFromPhysicalExaminations.class.hashCode()) + resource.toString();
		com.mds.decisionsupport.model.FindingsFromPhysicalExaminationsImpl obj = (com.mds.decisionsupport.model.FindingsFromPhysicalExaminationsImpl)objects.get(code);
		if (obj == null) {
			obj = com.mds.decisionsupport.model.FindingsFromPhysicalExaminationsImpl.getFindingsFromPhysicalExaminations(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of FindingsFromPhysicalExaminations for every resource in the model with rdf:Type http://ontology/mds#FindingsFromPhysicalExaminations
	 * @param model the Jena Model
	 * @return a List of FindingsFromPhysicalExaminations
	 */
	public static java.util.List getAllFindingsFromPhysicalExaminations(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,FindingsFromPhysicalExaminations.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getFindingsFromPhysicalExaminations(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of Subjective.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Subjective
	 * @param model the Jena Model.
	 */
	public static Subjective createSubjective(Resource resource, Model model) throws JastorException {
		return com.mds.decisionsupport.model.SubjectiveImpl.createSubjective(resource,model);
	}
	
	/**
	 * Create a new instance of Subjective.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Subjective
	 * @param model the Jena Model.
	 */
	public static Subjective createSubjective(String uri, Model model) throws JastorException {
		Subjective obj = com.mds.decisionsupport.model.SubjectiveImpl.createSubjective(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of Subjective.  Leaves the model unchanged.
	 * @param uri The uri of the Subjective
	 * @param model the Jena Model.
	 */
	public static Subjective getSubjective(String uri, Model model) throws JastorException {
		return getSubjective(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of Subjective.  Leaves the model unchanged.
	 * @param resource The resource of the Subjective
	 * @param model the Jena Model.
	 */
	public static Subjective getSubjective(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + com.mds.decisionsupport.model.Subjective.class.hashCode()) + resource.toString();
		com.mds.decisionsupport.model.SubjectiveImpl obj = (com.mds.decisionsupport.model.SubjectiveImpl)objects.get(code);
		if (obj == null) {
			obj = com.mds.decisionsupport.model.SubjectiveImpl.getSubjective(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Subjective for every resource in the model with rdf:Type http://ontology/mds#Subjective
	 * @param model the Jena Model
	 * @return a List of Subjective
	 */
	public static java.util.List getAllSubjective(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,Subjective.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getSubjective(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of MedicalItem.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the MedicalItem
	 * @param model the Jena Model.
	 */
	public static MedicalItem createMedicalItem(Resource resource, Model model) throws JastorException {
		return com.mds.decisionsupport.model.MedicalItemImpl.createMedicalItem(resource,model);
	}
	
	/**
	 * Create a new instance of MedicalItem.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the MedicalItem
	 * @param model the Jena Model.
	 */
	public static MedicalItem createMedicalItem(String uri, Model model) throws JastorException {
		MedicalItem obj = com.mds.decisionsupport.model.MedicalItemImpl.createMedicalItem(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of MedicalItem.  Leaves the model unchanged.
	 * @param uri The uri of the MedicalItem
	 * @param model the Jena Model.
	 */
	public static MedicalItem getMedicalItem(String uri, Model model) throws JastorException {
		return getMedicalItem(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of MedicalItem.  Leaves the model unchanged.
	 * @param resource The resource of the MedicalItem
	 * @param model the Jena Model.
	 */
	public static MedicalItem getMedicalItem(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + com.mds.decisionsupport.model.MedicalItem.class.hashCode()) + resource.toString();
		com.mds.decisionsupport.model.MedicalItemImpl obj = (com.mds.decisionsupport.model.MedicalItemImpl)objects.get(code);
		if (obj == null) {
			obj = com.mds.decisionsupport.model.MedicalItemImpl.getMedicalItem(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of MedicalItem for every resource in the model with rdf:Type http://ontology/mds#MedicalItem
	 * @param model the Jena Model
	 * @return a List of MedicalItem
	 */
	public static java.util.List getAllMedicalItem(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,MedicalItem.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getMedicalItem(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of ResultsFromLaboratory.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the ResultsFromLaboratory
	 * @param model the Jena Model.
	 */
	public static ResultsFromLaboratory createResultsFromLaboratory(Resource resource, Model model) throws JastorException {
		return com.mds.decisionsupport.model.ResultsFromLaboratoryImpl.createResultsFromLaboratory(resource,model);
	}
	
	/**
	 * Create a new instance of ResultsFromLaboratory.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the ResultsFromLaboratory
	 * @param model the Jena Model.
	 */
	public static ResultsFromLaboratory createResultsFromLaboratory(String uri, Model model) throws JastorException {
		ResultsFromLaboratory obj = com.mds.decisionsupport.model.ResultsFromLaboratoryImpl.createResultsFromLaboratory(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of ResultsFromLaboratory.  Leaves the model unchanged.
	 * @param uri The uri of the ResultsFromLaboratory
	 * @param model the Jena Model.
	 */
	public static ResultsFromLaboratory getResultsFromLaboratory(String uri, Model model) throws JastorException {
		return getResultsFromLaboratory(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of ResultsFromLaboratory.  Leaves the model unchanged.
	 * @param resource The resource of the ResultsFromLaboratory
	 * @param model the Jena Model.
	 */
	public static ResultsFromLaboratory getResultsFromLaboratory(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + com.mds.decisionsupport.model.ResultsFromLaboratory.class.hashCode()) + resource.toString();
		com.mds.decisionsupport.model.ResultsFromLaboratoryImpl obj = (com.mds.decisionsupport.model.ResultsFromLaboratoryImpl)objects.get(code);
		if (obj == null) {
			obj = com.mds.decisionsupport.model.ResultsFromLaboratoryImpl.getResultsFromLaboratory(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of ResultsFromLaboratory for every resource in the model with rdf:Type http://ontology/mds#ResultsFromLaboratory
	 * @param model the Jena Model
	 * @return a List of ResultsFromLaboratory
	 */
	public static java.util.List getAllResultsFromLaboratory(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,ResultsFromLaboratory.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getResultsFromLaboratory(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of Amount.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Amount
	 * @param model the Jena Model.
	 */
	public static Amount createAmount(Resource resource, Model model) throws JastorException {
		return com.mds.decisionsupport.model.AmountImpl.createAmount(resource,model);
	}
	
	/**
	 * Create a new instance of Amount.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Amount
	 * @param model the Jena Model.
	 */
	public static Amount createAmount(String uri, Model model) throws JastorException {
		Amount obj = com.mds.decisionsupport.model.AmountImpl.createAmount(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of Amount.  Leaves the model unchanged.
	 * @param uri The uri of the Amount
	 * @param model the Jena Model.
	 */
	public static Amount getAmount(String uri, Model model) throws JastorException {
		return getAmount(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of Amount.  Leaves the model unchanged.
	 * @param resource The resource of the Amount
	 * @param model the Jena Model.
	 */
	public static Amount getAmount(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + com.mds.decisionsupport.model.Amount.class.hashCode()) + resource.toString();
		com.mds.decisionsupport.model.AmountImpl obj = (com.mds.decisionsupport.model.AmountImpl)objects.get(code);
		if (obj == null) {
			obj = com.mds.decisionsupport.model.AmountImpl.getAmount(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Amount for every resource in the model with rdf:Type http://ontology/mds#Amount
	 * @param model the Jena Model
	 * @return a List of Amount
	 */
	public static java.util.List getAllAmount(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,Amount.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getAmount(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of Patient.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Patient
	 * @param model the Jena Model.
	 */
	public static Patient createPatient(Resource resource, Model model) throws JastorException {
		return com.mds.decisionsupport.model.PatientImpl.createPatient(resource,model);
	}
	
	/**
	 * Create a new instance of Patient.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Patient
	 * @param model the Jena Model.
	 */
	public static Patient createPatient(String uri, Model model) throws JastorException {
		Patient obj = com.mds.decisionsupport.model.PatientImpl.createPatient(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of Patient.  Leaves the model unchanged.
	 * @param uri The uri of the Patient
	 * @param model the Jena Model.
	 */
	public static Patient getPatient(String uri, Model model) throws JastorException {
		return getPatient(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of Patient.  Leaves the model unchanged.
	 * @param resource The resource of the Patient
	 * @param model the Jena Model.
	 */
	public static Patient getPatient(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + com.mds.decisionsupport.model.Patient.class.hashCode()) + resource.toString();
		com.mds.decisionsupport.model.PatientImpl obj = (com.mds.decisionsupport.model.PatientImpl)objects.get(code);
		if (obj == null) {
			obj = com.mds.decisionsupport.model.PatientImpl.getPatient(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Patient for every resource in the model with rdf:Type http://ontology/mds#Patient
	 * @param model the Jena Model
	 * @return a List of Patient
	 */
	public static java.util.List getAllPatient(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,Patient.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getPatient(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of Nurse.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Nurse
	 * @param model the Jena Model.
	 */
	public static Nurse createNurse(Resource resource, Model model) throws JastorException {
		return com.mds.decisionsupport.model.NurseImpl.createNurse(resource,model);
	}
	
	/**
	 * Create a new instance of Nurse.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Nurse
	 * @param model the Jena Model.
	 */
	public static Nurse createNurse(String uri, Model model) throws JastorException {
		Nurse obj = com.mds.decisionsupport.model.NurseImpl.createNurse(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of Nurse.  Leaves the model unchanged.
	 * @param uri The uri of the Nurse
	 * @param model the Jena Model.
	 */
	public static Nurse getNurse(String uri, Model model) throws JastorException {
		return getNurse(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of Nurse.  Leaves the model unchanged.
	 * @param resource The resource of the Nurse
	 * @param model the Jena Model.
	 */
	public static Nurse getNurse(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + com.mds.decisionsupport.model.Nurse.class.hashCode()) + resource.toString();
		com.mds.decisionsupport.model.NurseImpl obj = (com.mds.decisionsupport.model.NurseImpl)objects.get(code);
		if (obj == null) {
			obj = com.mds.decisionsupport.model.NurseImpl.getNurse(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Nurse for every resource in the model with rdf:Type http://ontology/mds#Nurse
	 * @param model the Jena Model
	 * @return a List of Nurse
	 */
	public static java.util.List getAllNurse(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,Nurse.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getNurse(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of Measurement.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Measurement
	 * @param model the Jena Model.
	 */
	public static Measurement createMeasurement(Resource resource, Model model) throws JastorException {
		return com.mds.decisionsupport.model.MeasurementImpl.createMeasurement(resource,model);
	}
	
	/**
	 * Create a new instance of Measurement.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Measurement
	 * @param model the Jena Model.
	 */
	public static Measurement createMeasurement(String uri, Model model) throws JastorException {
		Measurement obj = com.mds.decisionsupport.model.MeasurementImpl.createMeasurement(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of Measurement.  Leaves the model unchanged.
	 * @param uri The uri of the Measurement
	 * @param model the Jena Model.
	 */
	public static Measurement getMeasurement(String uri, Model model) throws JastorException {
		return getMeasurement(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of Measurement.  Leaves the model unchanged.
	 * @param resource The resource of the Measurement
	 * @param model the Jena Model.
	 */
	public static Measurement getMeasurement(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + com.mds.decisionsupport.model.Measurement.class.hashCode()) + resource.toString();
		com.mds.decisionsupport.model.MeasurementImpl obj = (com.mds.decisionsupport.model.MeasurementImpl)objects.get(code);
		if (obj == null) {
			obj = com.mds.decisionsupport.model.MeasurementImpl.getMeasurement(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Measurement for every resource in the model with rdf:Type http://ontology/mds#Measurement
	 * @param model the Jena Model
	 * @return a List of Measurement
	 */
	public static java.util.List getAllMeasurement(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,Measurement.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getMeasurement(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of HealthcarePersonnel.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the HealthcarePersonnel
	 * @param model the Jena Model.
	 */
	public static HealthcarePersonnel createHealthcarePersonnel(Resource resource, Model model) throws JastorException {
		return com.mds.decisionsupport.model.HealthcarePersonnelImpl.createHealthcarePersonnel(resource,model);
	}
	
	/**
	 * Create a new instance of HealthcarePersonnel.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the HealthcarePersonnel
	 * @param model the Jena Model.
	 */
	public static HealthcarePersonnel createHealthcarePersonnel(String uri, Model model) throws JastorException {
		HealthcarePersonnel obj = com.mds.decisionsupport.model.HealthcarePersonnelImpl.createHealthcarePersonnel(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of HealthcarePersonnel.  Leaves the model unchanged.
	 * @param uri The uri of the HealthcarePersonnel
	 * @param model the Jena Model.
	 */
	public static HealthcarePersonnel getHealthcarePersonnel(String uri, Model model) throws JastorException {
		return getHealthcarePersonnel(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of HealthcarePersonnel.  Leaves the model unchanged.
	 * @param resource The resource of the HealthcarePersonnel
	 * @param model the Jena Model.
	 */
	public static HealthcarePersonnel getHealthcarePersonnel(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + com.mds.decisionsupport.model.HealthcarePersonnel.class.hashCode()) + resource.toString();
		com.mds.decisionsupport.model.HealthcarePersonnelImpl obj = (com.mds.decisionsupport.model.HealthcarePersonnelImpl)objects.get(code);
		if (obj == null) {
			obj = com.mds.decisionsupport.model.HealthcarePersonnelImpl.getHealthcarePersonnel(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of HealthcarePersonnel for every resource in the model with rdf:Type http://ontology/mds#HealthcarePersonnel
	 * @param model the Jena Model
	 * @return a List of HealthcarePersonnel
	 */
	public static java.util.List getAllHealthcarePersonnel(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,HealthcarePersonnel.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getHealthcarePersonnel(stmt.getSubject(),model));
		}
		return list;
	}
	
	
	/**
	 * Returns an instance of an interface for the given Resource.  The return instance is guaranteed to 
	 * implement the most specific interface in *some* hierarchy in which the Resource participates.  The behavior
	 * is unspecified for resources with RDF types from different hierarchies.
	 * @return an instance of Thing
	 */
	public static Thing getThing(com.hp.hpl.jena.rdf.model.Resource res, com.hp.hpl.jena.rdf.model.Model model) throws JastorException {
		if (res.hasProperty(RDF.type,model.getResource("http://ontology/mds#Measurement"))) {
			return getMeasurement(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://ontology/mds#Nurse"))) {
			return getNurse(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://ontology/mds#Patient"))) {
			return getPatient(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://ontology/mds#Amount"))) {
			return getAmount(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://ontology/mds#ResultsFromLaboratory"))) {
			return getResultsFromLaboratory(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://ontology/mds#Subjective"))) {
			return getSubjective(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://ontology/mds#FindingsFromPhysicalExaminations"))) {
			return getFindingsFromPhysicalExaminations(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://ontology/mds#VitalSigns"))) {
			return getVitalSigns(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://ontology/mds#Objective"))) {
			return getObjective(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://ontology/mds#Assessment"))) {
			return getAssessment(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://ontology/mds#Contact"))) {
			return getContact(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://ontology/mds#SensingDevice"))) {
			return getSensingDevice(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://ontology/mds#MedicalRecord"))) {
			return getMedicalRecord(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://ontology/mds#Physician"))) {
			return getPhysician(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://ontology/mds#HealthcarePersonnel"))) {
			return getHealthcarePersonnel(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://ontology/mds#NaturalPerson"))) {
			return getNaturalPerson(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://ontology/mds#Plan"))) {
			return getPlan(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://ontology/mds#MedicalItem"))) {
			return getMedicalItem(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://ontology/mds#CompositionOfMedicalItems"))) {
			return getCompositionOfMedicalItems(res,model);
		}
		return new ThingImpl(res,model);
	}
	
	/**
	 * Returns an instance of an interface for the given Resource URI.  The return instance is guaranteed to 
	 * implement the most specific interface in *some* hierarchy in which the Resource participates.  The behavior
	 * is unspecified for resources with RDF types from different hierarchies.
	 * @return an instance of Thing
	 */
	public static Thing getThing(String uri, com.hp.hpl.jena.rdf.model.Model model) throws JastorException {
		return getThing(model.getResource(uri),model);
	}

	/**
	 * Return a list of compatible interfaces for the given type.  Searches through all ontology classes
	 * in the Mds ontology.  The list is sorted according to the topological sort
	 * of the class hierarchy
	 * @return a List of type java.lang.Class
	 */
	public static java.util.List listCompatibleInterfaces (com.hp.hpl.jena.rdf.model.Resource type) {
		java.util.List types = new java.util.ArrayList();
		if (type.equals(com.mds.decisionsupport.model.Measurement.TYPE)) {
			types.add(com.mds.decisionsupport.model.Measurement.class);
		}
		if (type.equals(com.mds.decisionsupport.model.Nurse.TYPE)) {
			types.add(com.mds.decisionsupport.model.Nurse.class);
		}
		if (type.equals(com.mds.decisionsupport.model.Patient.TYPE)) {
			types.add(com.mds.decisionsupport.model.Patient.class);
		}
		if (type.equals(com.mds.decisionsupport.model.Amount.TYPE)) {
			types.add(com.mds.decisionsupport.model.Amount.class);
		}
		if (type.equals(com.mds.decisionsupport.model.ResultsFromLaboratory.TYPE)) {
			types.add(com.mds.decisionsupport.model.ResultsFromLaboratory.class);
		}
		if (type.equals(com.mds.decisionsupport.model.Subjective.TYPE)) {
			types.add(com.mds.decisionsupport.model.Subjective.class);
		}
		if (type.equals(com.mds.decisionsupport.model.FindingsFromPhysicalExaminations.TYPE)) {
			types.add(com.mds.decisionsupport.model.FindingsFromPhysicalExaminations.class);
		}
		if (type.equals(com.mds.decisionsupport.model.VitalSigns.TYPE)) {
			types.add(com.mds.decisionsupport.model.VitalSigns.class);
		}
		if (type.equals(com.mds.decisionsupport.model.Objective.TYPE)) {
			types.add(com.mds.decisionsupport.model.Objective.class);
		}
		if (type.equals(com.mds.decisionsupport.model.Assessment.TYPE)) {
			types.add(com.mds.decisionsupport.model.Assessment.class);
		}
		if (type.equals(com.mds.decisionsupport.model.Contact.TYPE)) {
			types.add(com.mds.decisionsupport.model.Contact.class);
		}
		if (type.equals(com.mds.decisionsupport.model.SensingDevice.TYPE)) {
			types.add(com.mds.decisionsupport.model.SensingDevice.class);
		}
		if (type.equals(com.mds.decisionsupport.model.MedicalRecord.TYPE)) {
			types.add(com.mds.decisionsupport.model.MedicalRecord.class);
		}
		if (type.equals(com.mds.decisionsupport.model.Physician.TYPE)) {
			types.add(com.mds.decisionsupport.model.Physician.class);
		}
		if (type.equals(com.mds.decisionsupport.model.HealthcarePersonnel.TYPE)) {
			types.add(com.mds.decisionsupport.model.HealthcarePersonnel.class);
		}
		if (type.equals(com.mds.decisionsupport.model.NaturalPerson.TYPE)) {
			types.add(com.mds.decisionsupport.model.NaturalPerson.class);
		}
		if (type.equals(com.mds.decisionsupport.model.Plan.TYPE)) {
			types.add(com.mds.decisionsupport.model.Plan.class);
		}
		if (type.equals(com.mds.decisionsupport.model.MedicalItem.TYPE)) {
			types.add(com.mds.decisionsupport.model.MedicalItem.class);
		}
		if (type.equals(com.mds.decisionsupport.model.CompositionOfMedicalItems.TYPE)) {
			types.add(com.mds.decisionsupport.model.CompositionOfMedicalItems.class);
		}
		return types;
	}
}