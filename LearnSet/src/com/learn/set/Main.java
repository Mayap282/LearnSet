package com.learn.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(1, "maya");
		Employee e2 = new Employee(1, "maya");
		Employee e3 = new Employee(2, "Kaddu");
		Employee e4 = new Employee(3, "Pooja");
		Employee e5 = new Employee(4, "Amit");
		HashSet<Employee> s = new HashSet<>();
		s.add(e1);
		s.add(e2);
		s.add(e3);
		
		Iterator<Employee> iterator = s.iterator(); 

	    for (Employee employee : s) {
			System.out.println(employee.id+" "+employee.name);
		}
		TreeSet<Employee> t = new TreeSet<>();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		Iterator<Employee> iterator1 = s.iterator(); 
		System.out.println("using Foreach");
	    for (Employee employee : t) {
			System.out.println(employee.id+" "+employee.name);
		}
		
		System.out.println("using iterate over collection");
		for (Iterator iterator2 = t.iterator(); iterator2.hasNext();) {
			Employee employee = (Employee) iterator2.next();
			System.out.println(employee.id+" "+employee.name);
			
		}
		
		LinkedHashSet<Employee>  lh = new LinkedHashSet<>();
		lh.add(e1);
		lh.add(e2);
		lh.add(e3);
		lh.add(e4);
		lh.add(e5);
		System.out.println("linkedHashset");
		for (Iterator iterator2 = lh.iterator(); iterator2.hasNext();) {
			Employee employee = (Employee) iterator2.next();
			System.out.println(employee.id+" "+employee.name);
		}
	}
	
}
