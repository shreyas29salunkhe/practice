package com.practice;

import java.util.Arrays;

public class TripletSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1, 4, 45, 6, 10, 8};
		int n=a.length;
		int x=13;
		Arrays.sort(a);
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		int count=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				for(int k=i+2;k<n;k++)
				{
					if(a[i]+a[j]+a[k]==x)
						count++;
				}
			}
		}
		//Submitted Soln
		/**Arrays.sort(A);
	    int[] map = new int[100000];
	    for (int i = 0; i < N; i++)
	        map[A[i]] = i+1;
	        
	    for (int i = 0; i < N-1; i++)
	    {
	        for (int j = i+1; j < N; j++)
	        {
	            int K = X - (A[i] + A[j]);
	            if (0 <= K && 0 < map[ K ])
	                if (map[K] != i+1 && map[K] != j+1)
	                    return true;
	        }
	    }
	    return false;**/
		System.out.println("\n\n"+count);
	}

}
