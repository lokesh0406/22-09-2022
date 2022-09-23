package com.collections.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class C04 extends ArrayList{
	
	public static void main(String args[]) {
		
		C04 list =new C04();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add("raja");
		list.add(true);
		list.add("abc");
		list.add("ZXY");
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		
        list.removeRange(0, 8);
        
        System.out.println(list);
        
        list.set(0, "loki");
        
       // Collections.sort(list);
        
        System.out.println(list);
        
        Comparator comp= Collections.reverseOrder();
        
        Collections.sort(list,comp);
        
        System.out.println(list);
        
        
        
        
        
		
		
	}

}
