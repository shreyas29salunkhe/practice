package com.practice;

import java.util.*;

public class QueueReverse {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new LinkedList<>();
		q.add(4);
		q.add(3);
		q.add(1);
		q.add(10);
		q.add(2);
		q.add(6);
		
		Collections.reverse((List<?>) q);
		Queue<Integer> p = new LinkedList<>();
		for(int i:q)
		{
			p.add(i);
		}
		System.out.println(p);
		//System.out.println(a);

	}

}
