package com.practice;

import java.util.Scanner;

public class RootsOfQuadraticEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double secondRoot = 0, firstRoot = 0;
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the value of a ::");
	      int A = sc.nextInt();

	      System.out.println("Enter the value of b ::");
	      int B = sc.nextInt();

	      System.out.println("Enter the value of c ::");
	      int C = sc.nextInt();

	      double determinant = (B*B)-(4*A*C);
	      double sqrt = Math.sqrt(determinant);
	      double a[]=new double[2];
	      if(determinant>0){
	         a[0] = (-B + sqrt)/(2*A);
	         a[1] = (-A - sqrt)/(2*A);
	         System.out.println("Roots are :: "+ a[0] +" and "+a[1]);
	      }else if(determinant == 0){
	    	  System.out.println("-1");
	         //System.out.println("Root is :: "+(-B + sqrt)/(2*A));
	      }

	}

}
