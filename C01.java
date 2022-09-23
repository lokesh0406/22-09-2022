package com.collections.demo;

import java.util.ArrayList;
import java.util.Arrays;

public class C01 {

	public static void main(String[] args) {
	
		int[] arr = new int[4];
		
		arr[0]=1;
		arr[1]=10;
		arr[2]=20;
		
		System.out.println("Arrays"+Arrays.binarySearch(arr, 10));
		
		ArrayList list1 = new ArrayList();
		
		list1.add("hello");
		list1.add("true");
		list1.add('a');
		list1.add(new Object());
	    list1.add(10.0f);
	    list1.add(200);
	    list1.add(30);
	    list1.add(20);
	    list1.add(30);
	    list1.add(100);
	    list1.add(200);
	    list1.add(10);
	    list1.add("hello");
         
	    System.out.println("Collection :"+list1);
	    

	}

}
