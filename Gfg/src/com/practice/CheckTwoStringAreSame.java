package com.practice;

import java.util.Arrays;

public class CheckTwoStringAreSame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="mightandmagic";
		String b="andmagicmigth";
		char ab[]=a.toCharArray();
		char bc[]=b.toCharArray();
		Arrays.sort(ab);
		Arrays.sort(bc);
		System.out.println(Arrays.equals(ab, bc)?1:0);
		

	}

}
