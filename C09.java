package com.collections.demo;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class C09 {

	public static void main(String[] args) {
		
		ArrayList list1 = new ArrayList();
		
        list1.add(10);
		list1.add(true);
		list1.add("value1");
		list1.add(10.5F);
      
		System.out.println(list1);
		
		Vector v1 = new Vector();

		v1.addElement(10);
		v1.addElement(20);
		v1.addElement(30);
		v1.addElement(40);
		v1.addElement(50);
		
		System.out.println(v1);
		
		Enumeration read = v1.elements();
		
		while(read.hasMoreElements())
		{
			System.out.println(read.nextElement());
		}
        
	}

}
