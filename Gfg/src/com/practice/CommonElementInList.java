package com.practice;

import java.util.*;

public class CommonElementInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		ArrayList <Integer> v1=new ArrayList<>();
		ArrayList <Integer> v2=new ArrayList<>();
		ArrayList <Integer> al3=new ArrayList<>();
		for(int i=0;i<t;i++)
		{
			v1.add(sc.nextInt());
		}
		int n=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			v2.add(sc.nextInt());
		}
		Collections.sort(v1);
		Collections.sort(v2);
		int i=0,j=0;
		while(i<v1.size() && j<v2.size())
		{
			int a=v1.get(i);
			int b=v2.get(j);
			if(a==b)
			{
				al3.add(a);
				i++;
				j++;
				
			}
			else if(a<b)
			{
				i++;
			}
			else 
			{
				j++;
			}
					
		}
		Collections.sort(al3);
		System.out.println(al3);
		sc.close();

	}

}
