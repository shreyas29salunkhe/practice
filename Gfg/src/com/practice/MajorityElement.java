package com.practice;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
	
	
	static int majorityElement(int a[], int size)
    {
        // your code here
		Map<Integer,Integer> hm=new HashMap<>();
		for(int i=0;i<size;i++)
		{
			int count=1;
			if(!hm.containsKey(a[i]))
			{
				hm.put(a[i], count);
			}
			else
			{
				int t=hm.get(a[i]);
				t+=1;
				hm.replace(a[i], t);
			}
		}
		int ans=-1;
		for(Map.Entry<Integer, Integer>s:hm.entrySet())
		{
			int n=s.getValue();
			if(n>(size/2))
			{
				ans=s.getKey();
				break;
			}
		}
		return ans;
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int N = 5; 
		int A[] = {3,1,3,3,2};
		System.out.println(majorityElement(A, N));

	}

}
