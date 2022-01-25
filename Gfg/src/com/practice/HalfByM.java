package com.practice;

import java.util.Scanner;

public class HalfByM {
	
	static int mthHalf(int N, int M){
	       int ans = N;
	      for(int i = 1; i < M;i++){ 
	          ans /=2;
	      }
	      
	      return ans;
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int m=sc.nextInt();
		System.out.println(mthHalf(n, m));
		sc.close();

	}

}
