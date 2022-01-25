package com.practice;

import java.util.Arrays;

public class AnagramOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "geeksforgeeks";
		String b = "forgeeksgeeks";
		char c[]=a.toCharArray();
		char d[]=b.toCharArray();
		Arrays.sort(c);
		Arrays.sort(d);
		System.out.println(Arrays.equals(c, d)?"YES":"NO");

	}

}
