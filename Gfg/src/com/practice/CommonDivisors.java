package com.practice;

import java.util.Scanner;

public class CommonDivisors {
	static long countDivisors(int a,int b)
	{
		long x=Math.max(a, b);
		long c=0;
		for(int i=1;i<x;i++)
		{
			if((a%i==0) && (b%i==0))
			{
				c++;
			}
		}
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println(countDivisors(a, b));
		sc.close();

	}

}
