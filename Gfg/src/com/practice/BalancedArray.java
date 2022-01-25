package com.practice;

public class BalancedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner(System.in);
		int n=4;
		int arr[]= {1,5,3,2};
		int mid=arr.length/2;
		int sum=0;
		int sum2=0;
		for(int i=0;i<mid;i++)
		{
			sum+=arr[i];
		}
		for(int i=mid;i<arr.length;i++)
		{
			sum2+=arr[i];
		}
		System.out.println(sum);
		System.out.println(sum2);
		System.out.println(Math.abs(sum2-sum));

	}

}
