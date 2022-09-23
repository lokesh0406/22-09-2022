package com.collections.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
/*
class A implements Comparable {
	int i;
	
	A(int i){
		this.i=i;
		
	}
	
	@Override
	public String toString() {
		return "i="+i;
		
	}
	@Override
	public int compareTo(Object ref) {
		A obj1 =(A)ref;
		return this.i -obj1.i;
	}*/
		
	class A{
		Integer i;
		
		A(Integer i){
			this.i=i;
		}
		
		@Override
			public String toString() {
				// TODO Auto-generated method stub
				return " i  = "+this.i;
			}

	
}

public class C08 {

	public static void main(String[] args) {
		
    List<A> list1 = new ArrayList<A>();
    
    list1.add(new A(20));
	list1.add(new A(10));
	list1.add(new A(30));
	list1.add(new A(50));
	
	System.out.println(list1);
	
	//List<A> arr1 = list1.stream().sorted((t1,t2)-> t2.i.compareTo(t1.i)).collect(Collectors.toList());
	
	List<A> arr1 = list1.stream().sorted((t1,t2)-> t1.i.compareTo(t2.i)).collect(Collectors.toList());
	
    arr1.stream().forEach(System.out::print);
    
	}

}
