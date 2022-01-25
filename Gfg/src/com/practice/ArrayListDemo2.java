package com.practice;

import java.util.*;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int Q=sc.nextInt();
		
		ArrayList <Integer> al=new ArrayList<>();
		
		for(int i=0;i<N;i++)
		{
			al.add(sc.nextInt());
		}
		
		if(Q==1)
		{
			
			int a=sc.nextInt();
			int b=sc.nextInt();
			al.add(a, b);
			System.out.println(al);
		}
		else if(Q==2)
		{
			int x=sc.nextInt();
			
			ArrayList<Integer> res = new ArrayList<Integer>();
            
            
            
            res.add(al.lastIndexOf(x)); 
            
            System.out.println(res);
		}
		
		sc.close();
		

	}

}
