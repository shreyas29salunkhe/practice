package com.practice;

import java.util.Scanner;

public class MaximumMoney {
	static int maxiMizeMoney(int N,int K)
	{
		int e=0;
		for(int i=0;i<=N;i++)
		{
			if(i%2!=0)
			{
				e+=K;
			}
		}
		return e;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		System.out.println(maxiMizeMoney(N, K));
		sc.close();

	}

}
