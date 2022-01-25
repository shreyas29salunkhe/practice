package com.practice;

import java.util.Collections;
import java.util.Stack;

public class GetMinimumElementFromStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s=new Stack<>();
		s.push(89);
		s.push(55);
		
		s.push(32);
		s.push(18);
		
		s.push(6);
		s.push(9);
		System.out.println(s);
		s.pop();
		System.out.println(s);
		Collections.sort(s);
		System.out.println(s);
		System.out.println(s.get(0));
		

	}

}
