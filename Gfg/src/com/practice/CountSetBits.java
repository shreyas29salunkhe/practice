package com.practice;

import java.util.Scanner;

public class CountSetBits {
	public static int countSetBits(int n){
		   
	       // Your code here
	       int count = 0;
	       for(int i = 1; i <= n; i++)
	       {
	           String b =  Integer.toBinaryString(i);
	           
	           for (int j = 0; j < b.length(); j++) 
	               if (b.charAt(j) == 49)
	                   count++;
	           
	       }
	       return count;
	   }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		
		System.out.println(countSetBits(t));
		sc.close();
		

	}

}
