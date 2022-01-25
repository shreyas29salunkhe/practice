package com.practice;

import java.util.Scanner;

public class CountCamelCaseCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(Character.isUpperCase(str.charAt(i)))
			{
				count++;
			}
		}

		System.out.println(count);
		sc.close();
	}

}
