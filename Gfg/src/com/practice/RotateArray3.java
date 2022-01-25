package com.practice;

import java.util.Scanner;

public class RotateArray3 {
	static void rotateArray(int k,int nums[])
	{
		int rotatingPoint=k;
		int outputArray[]=new int[nums.length];
		int i=0;
		while(rotatingPoint<nums.length)
		{
			outputArray[i]=nums[rotatingPoint];
			i++;
			rotatingPoint++;
		}
		rotatingPoint=0;
		while(rotatingPoint<k)
		{
			outputArray[i]=nums[rotatingPoint];
			i++;
			rotatingPoint++;
		}
		for(int j=0;j<outputArray.length;j++)
		{
			System.out.print(outputArray[j]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		int arraySize=sc.nextInt();
		int n=sc.nextInt();
		
		int array[]=new int[arraySize];
		for(int i=0;i<array.length;i++)
		{
			array[i]=sc.nextInt();
		}
		rotateArray(n, array);
		}
		sc.close();

	}

}
