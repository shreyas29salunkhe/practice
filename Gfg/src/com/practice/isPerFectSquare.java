package com.practice;

import java.util.Scanner;

public class isPerFectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=(int) Math.sqrt(num1);
		int num3=num2*num2;
		if(num3==num1)
		{
			System.out.println("It is perfect square");
		}
		else {
			System.out.println("Try again");
		}
		//System.out.println(num2);
		sc.close();
	}

}
