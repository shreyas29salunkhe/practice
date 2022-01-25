package com.practice;

import java.util.*;


public class KthSmallestElementInMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int mat[][] =     {{16, 28, 60, 64},
				            {22, 41, 63, 91},
				                   {27, 50, 87, 93},
				                   {36, 78, 87, 94 }};
		int k = 3;
		ArrayList <Integer> pq=new ArrayList<>();
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				pq.add(mat[i][j]);
			}
		}
		System.out.println(pq);
		Collections.sort(pq);
		System.out.println(pq);
		System.out.println(pq.get(k-1));
		

	}

}
