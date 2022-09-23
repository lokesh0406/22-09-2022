package com.collections.demo;

import java.util.LinkedHashSet;

public class C16 {

	public static void main(String[] args) {
		

		LinkedHashSet lset = new LinkedHashSet();
		
		lset.add(10);
		lset.add(20);
		lset.add(30);
		lset.add(40);
		lset.add(50);
		lset.add(60);
		lset.add(70);
		lset.add(80);
		lset.add(null);
		lset.add("allow");
		
		System.out.println(lset);

	}

}
