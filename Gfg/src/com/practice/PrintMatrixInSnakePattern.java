package com.practice;

import java.util.*;

public class PrintMatrixInSnakePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int N = 3; 
		int matrix[][] = {{45, 48, 54},{21, 89, 87},{70, 78, 15}};
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<matrix.length;i++)
		{
			if(i%2==0)
			{
				for(int j=0;j<matrix[0].length;j++)
				{
					al.add(matrix[i][j]);
				}
			}
			else
			{
				for(int j=matrix[0].length-1;j>=0;j--)
				{
					al.add(matrix[i][j]);
				}
			}
		}
		System.out.println(al);
		

	}

}
