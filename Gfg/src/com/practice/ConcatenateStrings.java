package com.practice;

import java.util.Scanner;

public class ConcatenateStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		String s=s1+s2;
		String rev="";
				
		for(int i = s.length() - 1; i >= 0; i--)
		{
			char ch=s.charAt(i);
			rev+=ch;
		}
		System.out.println(rev);
		sc.close();
		

	}

}
