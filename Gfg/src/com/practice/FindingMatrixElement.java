package com.practice;

import java.util.Scanner;

public class FindingMatrixElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Scanner sc=new Scanner(System.in);
		int i,j=0;
		System.out.println("Enter the size of matrix");
		int t=sc.nextInt();			 	
        int [][]a = new int[t][t];
        System.out.println("Enter the elements of matrix");
        for( i=0;i<t;i++)
        {
        	for( j=0;j<t;j++)
        	{
        	a[i][j]=sc.nextInt();
        
        	}
        }
        System.out.println("Enter which element to find");
        int target=sc.nextInt();
        for( i=0;i<t;i++)
        {
        	for( j=0;j<t;j++)
        	{
        		if(a[i][j]==target)
        		{
        			System.out.println("1");
        		}
        
        	}
        }
        System.out.println("0");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
        
	}

}
