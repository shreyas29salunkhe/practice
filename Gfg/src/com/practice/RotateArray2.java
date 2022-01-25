package com.practice;

import java.util.Scanner;

public class RotateArray2 {

	
		// TODO Auto-generated method stub
		void leftRotate(int arr[], int d, int n)
	    {
	        for (int i = 0; i < d; i++)
	            leftRotatebyOne(arr, n);
	    }
	 
	    void leftRotatebyOne(int arr[], int n)
	    {
	        int i, temp;
	        temp = arr[0];
	        for (i = 0; i < n - 1; i++)
	            arr[i] = arr[i + 1];
	        arr[n-1] = temp;
	    }
	 
	    /* utility function to print an array */
	    void printArray(int arr[], int n)
	    {
	        for (int i = 0; i < n; i++)
	            System.out.print(arr[i] + " ");
	    }
	 
	    // Driver program to test above functions
	    public static void main(String[] args)
	    {
	    	try {
	        RotateArray2 rotate = new RotateArray2();
	        Scanner sc=new  Scanner (System.in);
	        int testCases=sc.nextInt();
			while(testCases-->0)
			{
	        //System.out.println("No of elements you want to store in array");
	        int size=sc.nextInt();
	       
	        //System.out.println("How many times you want to rotate the array");
	        int rotations=sc.nextInt();
	        //System.out.println("Enter array elements");
	        int arr[] = new int[size];
	        for(int i=0;i<size;i++)
	        {
	        	arr[i]=sc.nextInt();
	        }
	        rotate.leftRotate(arr, rotations, size);
	        rotate.printArray(arr, size);
	        System.out.println();
			}
	        sc.close();
	    	}
	    	catch(Exception e)
	    	{
	    		
	    	}
	    }

	}


