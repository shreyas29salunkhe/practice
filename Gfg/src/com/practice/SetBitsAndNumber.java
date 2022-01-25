package com.practice;

import java.util.Scanner;

public class SetBitsAndNumber {
	
	static int getCount(int N)
	{
		String s=Integer.toBinaryString(N);
		int o=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='1')
			{
				o++;
			}
		}
		return N*o;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		System.out.println(getCount(N));
		sc.close();
	}

}
