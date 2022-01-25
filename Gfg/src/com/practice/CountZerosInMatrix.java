package com.practice;

public class CountZerosInMatrix {
	static int countZeros(int A[][],int N)
	{
		int count=0;
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
				if(A[i][j]==0)
				{
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]A = {{0, 0, 0},
			     {0, 0, 1},
			     {0, 1, 1}};
		int N=3;
		System.out.println(countZeros(A, N));
		

	}

}
