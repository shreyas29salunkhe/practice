package com.practice;



public class RemoveCharcterFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string1 = "computer";
		String string2 = "cat";
		String x="";
		for(int i=0;i<string1.length();i++)
		{
			if(!(string2.contains(String.valueOf(string1.charAt(i)))))
			{
				x+=String.valueOf(string1.charAt(i));
			}
		}
		System.out.println(x);
		
	       

	}

}
