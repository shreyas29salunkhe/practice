package com.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class KthLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 5, K = 2;
		int arr[] = {12, 5, 787, 1, 23};
		Arrays.sort(arr);
		ArrayList <Integer> al=new ArrayList<>();
		
		for(int i=arr.length-1;i>K;i--)
		{
			al.add(arr[i]);
		}
		//System.out.println(al);
		  int[] Arr = al.stream().mapToInt(i -> i).toArray();
		  
	        for (int x : Arr)
	            System.out.print(x + " ");
	        
	     /**
	      * int[] a=new int[k];
       int j=0;
       Arrays.sort(arr);
       for(int i=n-1; i>=n-k; i--){
           a[j]=arr[i];
           j++;
       }
       return a;**/
	        
	        /**ArrayList<Integer> a=new ArrayList<Integer>();
       Arrays.sort(arr);
       int i=1,z=0;
       while(z<k)
      { 
          a.add(arr[n-i]);
          i=i+1;
          z=z+1;
          
      }
      return a;**/
	}

}
