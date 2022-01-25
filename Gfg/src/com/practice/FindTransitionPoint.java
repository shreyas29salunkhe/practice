package com.practice;

public class FindTransitionPoint {
	
	static int transitionPoint(int arr[], int n) {
        // code here
		
	        // code here
	        int i = 0;
	        while(i < n)
	            {
	                if(arr[i] == 1){
	                break;
	            }
	            else
	            {
	                i++;
	            }
	        }
	        if(i == n)
	        {
	        return -1;
	        }
	        return i;
	    
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 5;
		int arr[] = {0,0,0,0,1};
		System.out.println(transitionPoint(arr, N));
	}

}
