package com.practice;

import java.util.Scanner;

public class UpperCaseConversion {
	static void convertToUpper(String s)
	{
		String a[]=s.split(" ");
		String r="";
		for(int i=0;i<a.length;i++)
		{
			r+=conUp(a[i]);
		}
		System.out.println(r);
		
	}
	static String conUp(String c)
	{
		return Character.toUpperCase(c.charAt(0)) + c.substring(1)+" ";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		convertToUpper(s);
		sc.close();

	}

}
