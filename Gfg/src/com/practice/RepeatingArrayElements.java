package com.practice;

import java.util.Scanner;

public class RepeatingArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		 //System.out.println("Repeated Elements are :");
	        for (int i = 0; i <arr.length; i++)
	        {
	            for (int j = i + 1; j < arr.length; j++)
	            {
	                if (arr[i] == arr[j])
	                    System.out.print(arr[i] + " ");
	            }
	        }
	}

}
