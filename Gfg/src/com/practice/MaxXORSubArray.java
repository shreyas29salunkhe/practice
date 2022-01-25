package com.practice;

public class MaxXORSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 2;
		int arr[] = {4,6}; 
		int ans=1,val=1;
		for(int i=0;i<N;i++)
		{
			val=1;
			for(int j=i+1;j<N;j++)
			{
				val=arr[i]^arr[j];
			}
			ans=Math.max(val, ans);
			
		}
		System.out.println(ans);
	}

}
