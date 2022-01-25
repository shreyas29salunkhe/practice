package com.practice;

import java.util.Arrays;

public class CountTripletSum {
	 static long countTriplets(long arr[], int n,int sum)
	    {
	        Arrays.sort(arr);
	        long res = 0;
	        for(int i = 0;i< n-2;i++){
	            int j = i+1,k = n-1;
	            while(j < k){
	                int temp = (int)(arr[i] + arr[j] + arr[k]);
	                if(temp < sum){
	                    res += k-j;
	                    j++;
	                }else{
	                    k--;
	                }
	            }
	        }
	        return res;

	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		long arr[]={-2, 0, 1, 3};
		int sum=0;
		System.out.println(countTriplets(arr, n, sum));
		

	}

}
