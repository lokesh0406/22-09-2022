package com.collections.demo;

import java.util.ArrayList;

public class C03 {

	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList();
		
		ar.add(10);
		ar.add(20);
		ar.add(30);
		
		ArrayList arr = new ArrayList();
		
		arr.add(10);
		arr.add(20);
		arr.add(40);
		
		ar.remove(0);
		
		ar.add(arr);
		
		System.out.println(ar);
		
		ar.retainAll(arr);
		System.out.println(ar);
		System.out.println(arr);
	}

}
