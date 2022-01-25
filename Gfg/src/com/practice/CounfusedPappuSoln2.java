package com.practice;

import java.util.Scanner;

class CounfusedPappuSoln2 {
public static void main (String[] args) {
	try {
		Scanner sc=new Scanner(System.in);
		int originalString,modifiedString,result;
		int testCases=sc.nextInt();
		while(testCases-->0) {
		//sc.nextLine();
		String str=sc.next();
		String str2="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='6')
			{
				str2=str.replace('6', '9');
			}						
		}
		originalString=Integer.parseInt(str);
		modifiedString=Integer.parseInt(str2);
		result=modifiedString-originalString;
		System.out.println(result);
		}
		sc.close();
	}
	catch(Exception e)
	{
		
	}
}

}
