package com.collections.demo;

import java.util.HashSet;

class Z1 {
	int i, j;
	Z1(int i, int j){
		this.i=i;
		this.j=j;
	}
	@Override
	public int hashCode() {
		
		return Integer.toString(j).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		
		return (obj instanceof Z1 && j==((Z1)obj).j);
	}
}
public class C15 {

	public static void main(String[] args) {
		HashSet set1 = new HashSet();
		
		set1.add(new Z1(10,20));
		set1.add(new Z1(20,30));
		set1.add(new Z1(30,40));
		set1.add(new Z1(5,40));
		set1.add(new Z1(15,0));
		set1.add(new Z1(15,0));
		set1.add(new Z1(15,0));
		
		System.out.println(set1.size());

	}

}
