package com.practice;

public class BinarySearchDemo {

	
	static int binarysearch(int arr[], int n, int k){
        // code here
        int first=0,last=arr.length-1;
        
         int mid = (first + last)/2;  
			   while( first <= last )
			   {  
			      if ( arr[mid] < k )
			      {  
			        first = mid + 1;     
			      }else if ( arr[mid] == k )
			      {  
			        return mid;  
			        
			      }else
			      {  
			         last = mid - 1;  
			      }  
			      mid = (first + last)/2;  
			   }  
	    
	      return -1;
	   
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 5;
		int arr[] = {1, 2, 3, 4, 5}; 
		int K = 4;
		System.out.println(binarysearch(arr, N, K));

	}

}
