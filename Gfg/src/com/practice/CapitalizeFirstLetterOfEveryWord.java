package com.practice;

import java.util.Scanner;

public class CapitalizeFirstLetterOfEveryWord {
	static String firstAlphabet(String S) {
		   String r="";
		   String []sr = S.split(" ");
		   for(int i=0;i<sr.length;i++){
		       r = r+sr[i].charAt(0);
		   }
		   return r;
		   }    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(firstAlphabet(str));
		sc.close();

	}

}
