package com.practice;

import java.util.Scanner;

public class CheckPerfectNumber {

	static boolean isPerfect(int num)
	{
		int sum=0;
		int x=num/2;
		for(int i=1;i<=x;i++)
		{
			if(num%i==0)
			{
				sum+=i;
			}
		}
		return (num==sum)?true:false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(isPerfect(num));
		sc.close();

	}

}
