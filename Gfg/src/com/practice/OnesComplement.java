package com.practice;

import java.util.Scanner;

public class OnesComplement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String str=sc.next();
		String x="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='0')
			{
				x+='1';
			}
			else if(str.charAt(i)=='1')
			{
				x+='0';
			}
		}
		System.out.println(x);
		sc.close();
		
		

	}

}
