package com.practice;

import java.util.Scanner;

public class ArmstrongNumber {
	
	static String getResult(int n)
	{
		int x=n;
		int sum=0;
		while(x!=0)
		{
			int rem=x%10;
			sum+=(rem*rem*rem);
			x/=10;
		}
		if(sum==n)
		{
			return "YES";
		}
		else
		{
			return "NO";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(getResult(n));
		sc.close();
		

	}

}
