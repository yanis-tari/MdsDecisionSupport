package com.ibm.adtech.jastor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


import com.hp.hpl.jena.rdf.listeners.StatementListener;
import com.hp.hpl.jena.rdf.model.Statement;


public class JastorModelListener extends StatementListener {
	
	private Map map = new HashMap();

	public void addThing(Thing thing) {
		List list = (List)map.get(thing.resource().toString());
		if (list == null) {
			list = new ArrayList();
			map.put(thing.resource().toString(),list);
		}
		list.add(thing);
	}
	
	public void addedStatement(Statement s) {
		List list = (List)map.get(s.getSubject().toString());
		if (list == null)
			return;
		Iterator it = list.iterator();
		while (it.hasNext()) {
			ThingImpl thing = (ThingImpl)it.next();
			thing.addedStatement(s);
		}
	}
	
	public void removedStatement(Statement s) {
		List list = (List)map.get(s.getSubject().toString());
		if (list == null)
			return;
		Iterator it = list.iterator();
		while (it.hasNext()) {
			ThingImpl thing = (ThingImpl)it.next();
			thing.removedStatement(s);
		}
	}

}
