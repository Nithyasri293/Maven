package com.test3;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EncapsulationSetAndGet extends Encapsulation {
	
	public static void main(String[] args) {
		Encapsulation e=new Encapsulation();
		e.setUserName("nithya29bns@gmail.com");
		e.setPassword(1258963);
		e.setName("Nithyasri");
		
		Encapsulation e1=new Encapsulation();
		e1.setUserName("nithya29@gmail.com");
		e1.setPassword(125896333);
		e1.setName("Nithyasri.B");
		
		List<Encapsulation> l=new ArrayList<>();
		l.add(e);
		l.add(e1);
		
		for (int i = 0; i < l.size(); i++) {
			System.out.println("USERNAME:"+l.get(i).getUserName());
			System.out.println("PASSWORD:"+l.get(i).getPassword());
		}
		
		Set<Encapsulation> s=new LinkedHashSet<Encapsulation>();
		s.add(e);
		s.add(e1);
		
		for (Encapsulation encapsulation : s) {
			System.out.println("NAME:"+encapsulation.getName());
		
			
		}
		Map<Integer, Encapsulation> m=new LinkedHashMap<Integer, Encapsulation>();
		m.put(0, e);
		m.put(1, e1);
		
		Set<Entry<Integer, Encapsulation>> entrySet = m.entrySet();
		for (Entry<Integer, Encapsulation> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue().getUserName());
			System.out.println(entry.getValue().getPassword());
			
		}
		
	}

}
