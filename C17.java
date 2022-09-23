package com.collections.demo;

import java.util.Set;
import java.util.TreeSet;

public class C17 {

	public static void main(String[] args) {
		

		Set set1 = new TreeSet();
		
		set1.add(40);
		
		set1.add(30);
		
		set1.add(10);
		
		set1.add(5);
		
		set1.add(20);
		
		System.out.println(set1);
		
		Set set2 = new TreeSet();
		
		set2.add(new StringBuffer("xyz"));
	
		
		set2.add(new StringBuffer("abc"));
		
		set2.add(new StringBuffer("stu"));
		
		set2.add(new StringBuffer("def"));
		
		set2.add(new StringBuffer("opq"));
		

		System.out.println(set2);

	}

}


