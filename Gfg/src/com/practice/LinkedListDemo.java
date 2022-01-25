package com.practice;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Scanner sc=new  Scanner (System.in);
		String a;
		System.out.println("Enter the number of testcases");
		int testCases=sc.nextInt();
		while(testCases-->0)
		{
			LinkedList<String> ll= new LinkedList<>();
			System.out.println("Enter the number of elements");
			int n=sc.nextInt();
			for(int i=0;i<n;i++)
			{
				a=sc.next();
				ll.add(a);
			}
			System.out.println(ll);
			System.out.println("Enter the index of the element you want to remove");
			int toremove=sc.nextInt();
			int removed=toremove-1;							
			ll.remove(removed);							
			System.out.println(ll);
		}
		
		sc.close();
		}
		
		catch(Exception e)
		{
			
		}
	}

}
