package com.practice;

import java.util.Scanner;

public class GeekMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			int arr[]=new int[a];
			int c=0;
			for(int i=0;i<a;i++)
			{
				arr[i]=sc.nextInt();
				if(arr[i]>b)
				{
					c++;
				}
				
			}
			System.out.println(c);
		}
		sc.close();

	}

}
