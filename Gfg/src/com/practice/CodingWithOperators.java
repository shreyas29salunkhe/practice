package com.practice;

import java.util.Scanner;

public class CodingWithOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			long p=(long)Math.pow(a, b);
			long q=p^c;
			long r=p%c;
			System.out.println(p+"\n"+q+"\n"+r);
			
		}
		sc.close();

	}

}
