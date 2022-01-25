package com.practice;

import java.util.*;

public class RemoveDuplicatesFromString {
	static String removeDups(String S) {
	       // code here
	      
	       String a="";
	       int n=S.length();
	       for(int j=0;j<n;j++)
	       {
	           String temp= ""+S.charAt(j);
	           if(a.contains(temp))
	           {
	               continue;
	           }
	           else
	           {
	               a=a+S.charAt(j);
	           }
	           
	       }
	       return a;
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String t=sc.next();
		System.out.println(removeDups(t));
		sc.close();
		

	}

}
