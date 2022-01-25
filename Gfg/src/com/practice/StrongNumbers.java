package com.practice;

import java.util.Scanner;

public class StrongNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int n=t;
		int sum=0;
		while(n!=0)
		{
			int rem=n%10;
			int fact=1;
			for(int i=1;i<=rem;i++)
			{
				fact*=i;
			}
			sum+=fact; 
			n/=10;
			
		}
		System.out.println((sum==t)?"1":"0");
		sc.close();
		

	}

}
