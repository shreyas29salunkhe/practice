package com.practice;

public class MinimumNumberToFormSumEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int N = 9;
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int sum=0;
		for(int i=0;i<N;i++)
			
		{
			sum+=arr[i];
			
		}
		System.out.println((sum%2==0)?2:1);

	}

}
