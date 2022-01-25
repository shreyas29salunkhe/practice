package com.practice;

import java.util.*;


public class PositiveNegativePair {

	static ArrayList<Integer>findPairs(int arr[], int n) 
    { 
    	// code here.
    	ArrayList<Integer>  al=new ArrayList<>();
    	Arrays.sort(arr);
    	for(int i=0;i<n-1;i++)
    	{
    		for(int j=i+1;j<n;j++)
    		{
    			if(Math.abs(arr[i])==arr[j])
    			{
    				al.add(arr[i]);
    				al.add(arr[j]);
    			}
    		}
    	}
    	return al;
    }
	public static ArrayList<Integer>findPairs2(int[] arr, int n) {
        ArrayList< Integer > results = new ArrayList<>();
        Set< Integer > set = new HashSet<>();
        for (int a : arr) {
            if (set.contains(-a)) {
                int x = Math.abs(a);
                results.add(-x);
                results.add(x);
            }
            set.add(a);
        }
        return results;       
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 8;
		int arr[] = {1,3,6,-2,-1,-3,2,7};
		ArrayList<Integer>  al=new ArrayList<>(findPairs(arr, n));
		System.out.println(al);
		ArrayList<Integer>  al2=new ArrayList<>(findPairs2(arr, n));
		System.out.println(al2);

	}

}
