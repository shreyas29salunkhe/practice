package com.practice;

import java.util.Scanner;

public class BridgeOfStones {
	
	 static void findJumps(long N, long X){
	        
	       int a=(int) (N/2+1);
	       int b=(int)X/2;
	       int c=a-b-1;
	       if(b>=c)
	       {
	    	   System.out.println(c);
	       }
	       else
	       {
	    	   System.out.println(b);
	       }
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int N=sc.nextInt();
			int X=sc.nextInt();
			findJumps(N, X);
		}
		sc.close();
	}

}
