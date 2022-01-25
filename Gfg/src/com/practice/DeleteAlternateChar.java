package com.practice;

import java.util.Scanner;

public class DeleteAlternateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		String str=sc.next();
		char s[]=str.toCharArray();
		String n="";
		for(int i=0;i<s.length;i++)
		{
			if(i%2==0)
			{
				n+=s[i];
			}
		}
		System.out.println(n);
		sc.close();

	}

}
