package com.practice;

import java.util.Scanner;

public class ConfusedPappu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			Scanner sc=new Scanner(System.in);			
			int testCases=sc.nextInt();
			while(testCases-->0) {
			String s,t="";			
			int a,b,i;
			sc.nextLine();
			s=sc.next();
			for(i=0;i<s.length();i++)
			{
			    if(s.charAt(i)=='6')
			    {
			        t=t+'9';			    	
			    }
			    else
			    {
			        t=t+s.charAt(i);
			    }
			}
			a=Integer.parseInt(s);
			b=Integer.parseInt(t);
			i=b-a;
			System.out.println(i);
			
			
			}
			sc.close();
		}
		catch(Exception e)
		{
				
		}

	}

}
