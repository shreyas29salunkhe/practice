package com.practice;

import java.util.Scanner;

public class BitwiseOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		System.out.println((a^a)+"\n"+(c^b)+"\n"+(a&b)+"\n"+(c|(a^a))+"\n"+(~(c^b)));
		sc.close();
		

	}

}
