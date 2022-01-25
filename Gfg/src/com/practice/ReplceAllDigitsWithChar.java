package com.practice;

import java.util.Scanner;

public class ReplceAllDigitsWithChar {
	
	static String replaceDigits(String s) {
		 int i ;
	        char[] c = s.toCharArray() ;
	        for( i = 1 ; i < c.length ; i += 2 )
	        {
	            c[i] = (char)(c[i-1]+Character.getNumericValue(c[i])) ;
	        }
	        return String.valueOf(c) ;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		System.out.println(replaceDigits(s));
		sc.close();

	}

}
