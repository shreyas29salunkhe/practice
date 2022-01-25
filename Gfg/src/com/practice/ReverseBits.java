package com.practice;

import java.util.Scanner;

public class ReverseBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		String s=Integer.toBinaryString(t);
		StringBuilder sb=new StringBuilder(s);
		String x=sb.reverse().toString();
		
		
		int decimal = Integer.parseInt(x,2);
		System.out.println(decimal);
		sc.close();

	}

}
