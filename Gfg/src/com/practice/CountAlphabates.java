package com.practice;

import java.util.Scanner;

public class CountAlphabates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Scanner sc=new Scanner(System.in);
		int testCases=sc.nextInt();
		while(testCases-->0) {
			int count=0;
			sc.nextLine();
			String str=sc.next();
			
			for (int i = 0; i < str.length(); i++) {
				   if (Character.isLetter(str.charAt(i)))
				   count++;
				}
			System.out.println(count);
			
		}
		sc.close();
		}
		catch(Exception e)
		{
			
		}
	}

}
