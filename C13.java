package com.collections.demo;

import java.util.LinkedList;

public class C13 {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		list.add("java");
        list.add("angular");
		
		list.add("raj");
		list.add("java 17");
		
		list.add("java SE");
		
		
		System.out.println(list);
		
		System.out.println(list.get(3));
		
		list.poll();
		
		System.out.println(list);
		list.poll();
		
		System.out.println(list);
		list.poll();
		
		//list.removeFirst();
		System.out.println(list);
		//list.removeLast();
		
		System.out.println(list);
		
		System.out.println(list.peek());
		System.out.println(list.peek());
		
		System.out.println(list);
		
	}

}
