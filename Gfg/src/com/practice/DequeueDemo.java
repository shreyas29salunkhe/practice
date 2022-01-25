package com.practice;
import java.util.*;
public class DequeueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Deque<Integer> dq= new ArrayDeque<Integer>();
		dq.addLast(1);
		dq.addLast(2);
		dq.addLast(3);
		dq.addLast(4);
		dq.addFirst(21);
		System.out.println(dq.getFirst());
		System.out.println(dq);
		dq.removeLast();
		System.out.println(dq);
		

	}

}
