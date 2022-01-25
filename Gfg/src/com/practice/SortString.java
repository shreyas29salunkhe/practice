package com.practice;

import java.util.*;

public class SortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			String b = sc.next();		
			char d[]=b.toCharArray();
			Arrays.sort(d);
			for(int i=0;i<d.length;i++)
			{
				System.out.print(d[i]+"");
			}
			System.out.println();
		}
		sc.close();
		

	}

}
