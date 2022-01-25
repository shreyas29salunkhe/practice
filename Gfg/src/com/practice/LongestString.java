package com.practice;

import java.util.*;

public class LongestString {
	static String longest(String names[], int n)
	   {
	         int max = 0;
	       for (int j = 1; j < n; j++) {
	           if (names[j].length() > names[max].length()) {
	               max = j;
	           }
	       }
	       return names[max];
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		String names[] = new String[n];
		for(int i=0;i<n;i++)
		{
			names[i]=sc.next();
		}
		
		System.out.println(longest(names, n));
		sc.close();
		
	}

}
