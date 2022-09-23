package com.collections.demo;

import java.util.ArrayList;
import java.util.Iterator;

public class C10 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
        list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		
		System.out.println(list);
		
		Iterator read = list.iterator();
		
		while(read.hasNext())
		{
			Integer read1 =(Integer)read.next();
			
			if(read1 == 30) {
				read.remove();
			}
		}
           System.out.println("After remove"+list);	

	}

}
