package com.practice;

import java.util.*;

public class ReturnTwoPrimeNumbers {
	
	static List<Integer> primeDivision(int N){
        // code here
		LinkedList<Integer> ll=new LinkedList<>();
		for(int i=1;i<N;i++)
		{
			int prime=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					prime++;
				}
				if(prime>2)
				{
					break;
				}
			}
			if(prime==2)
			{
				ll.add(i);
			}
		}
		for(int i=0;i<ll.size();i++)
		{
			int f=ll.get(i);
			int l=N-f;
			for(int j=(ll.size()/2)-1;j<ll.size();j++)
			{
				if(l==ll.get(j))
				{
					ll.clear();
					ll.add(f);
					ll.add(l);
					return ll;
				}
			}
			
		}
		return ll;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		List<Integer> ans = new ArrayList<Integer>();
        ans =primeDivision(N);
        System.out.println(ans.get(0) + " " + ans.get(1));
		

	}

}
