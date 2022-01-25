package com.practice;

import java.util.*;

public class MultiplicationTable {
	static ArrayList<Integer> getTable(int N){
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=1;i<11;i++)
        {
        	al.add(i*N);
        }
        return al;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		ArrayList<Integer> a=getTable(N);
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		sc.close();
		

	}

}
