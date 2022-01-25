package com.practice;

import java.util.Scanner;

public class SumOfFloor {
	static int sumofproduct(int n)
	{
	    int ans = 0;
	 
	    // Iterating x from 1 to n
	    for (int x = 1; x <= n; x++)
	    {
	        // Finding y = n/x.
	        int y = n / x;
	 
	        // Adding product of x and
	        // y to answer.
	        ans += (y * x);
	        System.out.println(ans);
	    }
	 
	    return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	
		System.out.println(sumofproduct(n));
		sc.close();

	}

}
