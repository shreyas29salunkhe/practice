package com.practice;

import java.util.Scanner;

public class ReplaceByX {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
			String s1=sc.next();
			String s2=sc.next();
			String x=s1.replaceAll(s2, "X");
			
			for(int i=0;i<x.length();i++)
			{
				if(x.contains("XX"))
				{
					x=x.replace("XX", "X");
				}
				else
				{
					break;
				}
			}
			System.out.println(x);
			System.out.println();
			t--;
			
		}
		sc.close();

	}

}
