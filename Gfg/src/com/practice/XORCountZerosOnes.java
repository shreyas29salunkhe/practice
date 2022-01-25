package com.practice;

import java.util.Scanner;

public class XORCountZerosOnes {

	 static int find_xor(int n)
	    {
	        // Code here
		 String s=Integer.toBinaryString(n);
		 //System.out.println("s= "+s);
		 int count0=0,count1=0;
		 int l=s.length();
		 //System.out.println("length "+l);
		 for(int i=0;i<l;i++)
		 {
			 if(s.charAt(i)=='0')
			 {
				 count0++;
				// System.out.println("count0= "+count0);
				
			 }
			 else
			 {
				 count1++;
				 //System.out.println("count1= "+count0);
			 }
		 }
		 //System.out.println(count0+" "+count1);
		 return count1^count0;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(find_xor(n));
		sc.close();
		
		

	}

}
