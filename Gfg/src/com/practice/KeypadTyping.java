package com.practice;

public class KeypadTyping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="geeksforgeeks";
		String x="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='a' && s.charAt(i)<='c')
			{
				x+='2';
			}
			else if(s.charAt(i)>='d' && s.charAt(i)<='f')
			{
				x+='3';
			}
			else if(s.charAt(i)>='g' && s.charAt(i)<='i')
			{
				x+='4';
			}
			else if(s.charAt(i)>='j' && s.charAt(i)<='l')
			{
				x+='5';
			}
			else if(s.charAt(i)>='m' && s.charAt(i)<='o')
			{
				x+='6';
			}
			else if(s.charAt(i)>='p' && s.charAt(i)<='s')
			{
				x+='7';
			}
			else if(s.charAt(i)>='t' && s.charAt(i)<='v')
			{
				x+='8';
			}
			else if(s.charAt(i)>='w' && s.charAt(i)<='z')
			{
				x+='9';
			}
		}
		System.out.println(x);

	}

}
