package com.practice;

import java.util.Scanner;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Stack<Integer> s=new Stack<>();
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			s.add(sc.nextInt());
		}
		System.out.println(s);
		int mid=s.size()/2;
		if(mid%2==0)
			s.remove(mid+1);
		else
			s.remove(mid);
		System.out.println(s);
		sc.close();

	}

}
