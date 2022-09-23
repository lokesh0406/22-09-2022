package com.collections.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C02 {

	public static void main(String args []) {
		
		List list1 = new ArrayList(10);
		

		list1.add(100);		
		list1.add(200);		
		list1.add(300);
		list1.add(100);		
		list1.add(200);		
		list1.add(300);
		list1.add(100);
		list1.add(10);
		list1.add(40);
		
		System.out.println(list1);
		
		List list2 = new ArrayList();
		
		list2.add(10);
		list2.add(20);
		list2.add(30);
		list2.add(100);
		list2.add(200);
		
		list1.add(list2);
		
		System.out.println(list1);
		
		list1.remove(3);
		
		System.out.println(list1);
		
		list1.remove(list2);
		
		list1.retainAll(list2);
		
		System.out.println(list1);
		System.out.println(list2);
	}
}
