package com.practice;

public class BinaryNumberIsPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long N=5;
		String x=Integer.toBinaryString((int) N);
		String r="";
		for(int i=x.length()-1;i>=0;i--)
		{
			r+=x.charAt(i);
		}
		System.out.println(x.equals(r)?1:0);
		

	}

}
