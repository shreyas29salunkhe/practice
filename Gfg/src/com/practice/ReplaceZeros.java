package com.practice;

public class ReplaceZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 1004;
		String x=Integer.toString(N);
		String z=x.replace('0', '5');
		System.out.println(z);
		int n=Integer.parseInt(z);
		System.out.println(n);

	}

}
