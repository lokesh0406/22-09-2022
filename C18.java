package com.collections.demo;

import java.util.PriorityQueue;
import java.util.Stack;

class Student001 implements Comparable{
	int Student1_id;
	
	public Student001(int Student1_id) {
		
		this.Student1_id=Student1_id;
		
	}
	
	@Override
	public int compareTo(Object o) {
		
		return this.Student1_id - ((Student001)o).Student1_id;
	}
	
	@Override
	public String toString() {
		
		return "Student1_id = "+Student1_id;
	}
}

public class C18 {

	public static void main(String[] args) {
PriorityQueue pqueue = new PriorityQueue();
		
		pqueue.add(new Student001(1101));
		pqueue.add(new Student001(1001));
		pqueue.add(new Student001(1301));
		pqueue.add(new Student001(1201));
		
		System.out.println(pqueue);
		
		
		pqueue.add(9);
		pqueue.add(99);
		pqueue.add(19);
		pqueue.add(900);
		pqueue.add(29);
		pqueue.add(8);
		pqueue.add(87);
		
		pqueue.add(8);
		
		System.out.println(pqueue);
		
		System.out.println(pqueue.poll());
		
		System.out.println(pqueue);
		
		Stack stk = new Stack();
		
		stk.push("abc");
		
		
		stk.push("xyz");
		stk.push("zyv");
		stk.push(10);
		stk.push(30);
		stk.push(true);
		System.out.println(stk);
		
		stk.pop();
		System.out.println(stk);
		stk.pop();
		System.out.println(stk);
		stk.pop();
		System.out.println(stk);
		stk.pop();
		System.out.println(stk);

	}


	}
