package com.practice;

import java.util.ArrayList;

public class FactorOrMultiple {
	static int factorOrMultiple(int N,int X,int A[]) {
        // code here
		ArrayList<Integer> al=new ArrayList<>();
		for(int i=0;i<N;i++)
		{
			if(A[i]%X==0)
			{
				al.add(A[i]);
			}
		}
		if(al.size()==0)
		{
			return 0;
		}
		else
		{
			int res=0;
			for(int i=0;i<al.size();i++)
			{
				res|=al.get(i);
			}
			return res;
		}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 3 ;
		int X = 8;
		int A[] = {1,2,3};
		System.out.println(factorOrMultiple(N, X, A));

	}

}
