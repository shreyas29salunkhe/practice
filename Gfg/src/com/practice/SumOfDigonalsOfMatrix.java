package com.practice;

public class SumOfDigonalsOfMatrix {
	static int digSum(int n,int a[][])
	{
		int sum=0;
		for(int i=0;i<n;i++)
		{
				sum+=a[i][i];	
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=3;
		int a[][]= {{1, 2 ,3} ,{4 ,5 ,6} ,{7 ,8 ,9}};
		
		System.out.println(digSum(n,a));
		

	}

}
