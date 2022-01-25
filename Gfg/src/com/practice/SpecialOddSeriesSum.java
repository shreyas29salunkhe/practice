package com.practice;

import java.util.Scanner;

public class SpecialOddSeriesSum {
	static int calSum(int t)
	{
		int sum=0;
		for(int i=1;i<=t;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j%i!=0)
					sum+=j;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		System.out.println(calSum(t));
		sc.close();

	}

}
