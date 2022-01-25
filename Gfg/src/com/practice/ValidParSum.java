package com.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ValidParSum {
	static long getSumCount(int a[],int n)
	{
		long count=0;
		Arrays.sort(a);
		for(int i=n-1;i>=0;i--){

		int beg=0;
		int end=i-1;
		if(a[i]>0){
		while(beg<=end)
		{
			int mid=(beg+end)/2;
			if(a[mid]>-1*a[i])
			{
				end=mid-1;
			}
			else
			{
				beg=mid+1;
			}
		}
		count+=i-(end+1);
		}

		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int n=sc.nextInt();
		int a[]=new int[t];
		for(int i=0;i<t;i++)
		{
			a[i]=sc.nextInt();
			
		}
		System.out.println(getSumCount(a, n));
		sc.close();

	}

}
