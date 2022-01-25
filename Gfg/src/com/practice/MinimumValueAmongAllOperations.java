package com.practice;

import java.util.*;

public class MinimumValueAmongAllOperations {

	static void getMinVal(int a,int b)
	{
		try {
		ArrayList <Integer> al=new ArrayList<>();
		al.add(a+b);
		al.add(a-b);
		al.add(a*b);
		al.add(a/b);
		Collections.sort(al);
		
		System.out.println(al.get(0));
		}
		catch(Exception e)
		{
			System.out.println("");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			getMinVal(a, b);
		}
		sc.close();

	}

}
