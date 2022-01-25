package com.practice;

import java.util.Scanner;

public class DisariumNumber {
	
	static int getResult(int N)
	{
		int x=N;
		int sum=0;
		
		int l=Integer.toString(N).length();
		while(x>0)
		{
			
			sum+=Math.pow((x%10),l--);
			
			x/=10;
		}
		return (sum==N)?1:0;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		
		System.out.println(getResult(N));
		sc.close();

	}

}
