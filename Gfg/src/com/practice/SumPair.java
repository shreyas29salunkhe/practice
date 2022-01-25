package com.practice;



public class SumPair {

	 static void findPairs(long arr[],int n,long sum) 
	    {
	         //Your code here
		 boolean b=false;
         for(int i=0;i<n;i++)
		 {
			 for(int j=i+1;j<n;j++)
			 {
				 if(i!=j && arr[i]+arr[j]==sum)
					 
				 {
					 System.out.println(arr[i]+" "+arr[j]+" "+sum);
					b=true;
				 }
				
				
				
			 }
		 }
		 if(b==false)
		 System.out.println(-1);
		
	    }
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		int sum=8;
		long arr[]= {1,2,3,4,5,6,7};
		findPairs(arr, n, sum);

	}

}
