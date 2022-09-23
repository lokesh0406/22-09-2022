package com.collections.demo;

import java.util.HashSet;
import java.util.Iterator;

public class C14 {

	public static void main(String[] args) {
		
		HashSet set1 = new HashSet();
		
		set1.add("abc");
		set1.add("xyz");
		
		set1.add("cef");
		set1.add("sts");
		set1.add("KRS");
		
		set1.add("KTM");
		
		set1.add("MPT");
		
		
		set1.add("KTM");
		
		set1.add("MPT");
		set1.add(null);
		set1.add(true);
		set1.add(10);
		
		System.out.println(set1);
		
		Iterator items = set1.iterator();
		
		while(items.hasNext()) {
			System.out.println(items.next());
		}
		
		set1.stream().forEach(t-> System.out.println(t));
	
		
	}

}
