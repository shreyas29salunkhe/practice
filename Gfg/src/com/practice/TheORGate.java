package com.practice;

public class TheORGate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,1,1,0};
		int N=4;
		int ans=arr[0];
		for(int i=0;i<N;i++)
		{
			ans|=arr[i];
		}
		System.out.println(ans);

	}

}
