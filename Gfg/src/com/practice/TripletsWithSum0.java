package com.practice;

import java.util.Arrays;

public class TripletsWithSum0 {
	
	static boolean findTriplets(int arr[] , int n)
    {
        //add code here.
		
		
		Arrays.sort(arr);
		
		for(int i=0;i<n-2;i++)
		{
			int j=i+1,k=n-1;
			while(j<k)
			{
				int sum=(arr[i]+arr[j]+arr[k]);
				if(sum==0)
				{
					return true;
				}
				else if(sum>0)
				{
					k--;
				}
				else if(sum<0)
				{
					j++;
				}
			}
		}
		return false;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		int arr[] = {60 ,-65, 5, -21, 8, 93};	
		System.out.println(findTriplets(arr, n));

	}

}
