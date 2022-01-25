package com.practice;

import java.util.Arrays;

public class MinimizeTheProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3; 
		long a[] = {6, 1, 9, 5, 4};
		
		long b[] = {3, 4, 8, 2, 4};
		Arrays.sort(a);
		Arrays.sort(b);
		long sum1=0,sum2=0;
		long i=n-1,j=0;
		while(i>=0 && j<n)
		{
			sum1+=a[(int)i]*b[(int)j];
			i--;
			j++;
		}
		System.out.println(sum1);

	}

}
