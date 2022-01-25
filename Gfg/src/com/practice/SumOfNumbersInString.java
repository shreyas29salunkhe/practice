package com.practice;

import java.util.Scanner;

public class SumOfNumbersInString {
	static long findSum(String str)
	{
		long sum=0;
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				String temp="";
				while((i<str.length())&& Character.isDigit(str.charAt(i)))
				{
					temp=temp+str.charAt(i);
					i++;
				}
				sum=sum+Integer.parseInt(temp);
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		System.out.println(findSum(str));
		sc.close();
	}

}
