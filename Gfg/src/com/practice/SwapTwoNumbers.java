package com.practice;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int temp=0;
		System.out.println("Enter 1st number");
		int num1=sc.nextInt();
		System.out.println("Enter 2nd number");
		int num2=sc.nextInt();
		System.out.println("Before Swapping "+"num1= "+num1+"\nnum2= "+num2);
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("After Swapping "+"num1= "+num1+"\nnum2= "+num2);
		sc.close();
	}

}
