package com.practice;

import java.util.Scanner;

public class ChangeBits {
	static int[] changeBits(int N)
	{
		String s=Integer.toBinaryString(N);
		
		String a=s.replace("0", "1");
		
		int d=Integer.parseInt(a,2);  
		
		int arr[] = {Math.abs(d-N),d};
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=changeBits(n);
		
		System.out.println(a[0]+" "+a[1]);
		sc.close();
		
		

	}

}
