package com.practice;

import java.util.*;

public class Array1D2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<Integer>();
		int arr[][] = {{1,2,3}, {4,5,6}, {7, 8,9}} ;
		
		int i,j;
		int N=3;
		int sum=0;
		for(i=0;i<N;i++)
	     { 
	      for(j=0;j<N;j++)
	      { 
			 if(i==j) //this condition checks for diagonal
			 {
				 sum  += arr[i][j];
			 }
		}
	 }
		al.add(sum);
		
	 
	     //System.out.printf("SUM of DIAGONAL elements of the matrix = "+sum) ;
	     
	     int brr[] = {3, 6, 9};
	     Arrays.sort(brr);
	     al.add(brr[brr.length-1]);
	     //System.out.println(al);
	     Object[] objects = al.toArray();
	     
	        // Printing array of objects
	        for (Object obj : objects)
	            System.out.print(obj + " ");

	}

}
