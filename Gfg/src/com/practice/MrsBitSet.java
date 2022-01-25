package com.practice;

import java.util.Scanner;

public class MrsBitSet {
	
	static void getCount(long a)
	{
		String s=Long.toBinaryString(a);
		int o=0,z=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='1')
			{
				o++;
			}
			else if(s.charAt(i)=='0')
			{
				z++;
			}
		}
		System.out.println(o+" "+z);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			long a=sc.nextLong();
			getCount(a);
			
		}
		sc.close();

	}

}
