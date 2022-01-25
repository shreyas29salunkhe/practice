package com.practice;

import java.util.Scanner;

public class ForkJava {

	 static void forkJava(int N){
	        
	        // Your code here
		if(N%3==0 && N%5==0)
		   {
		        System.out.println("Fork Java");
		   }
		   
		else if(N%3==0)
	    {
	        System.out.println("Fork");
	    }
		else if(N%5==0)
	    {
	        System.out.println("Java");
	    }
	    
	        
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			forkJava(sc.nextInt());
		}

		sc.close();
	}

}
