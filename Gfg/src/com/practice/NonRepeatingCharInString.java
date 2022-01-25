package com.practice;

public class NonRepeatingCharInString {
	static char getChar(String s)
	{
		
		for(int i=0;i<s.length();i++)
		{
			if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i)))
				return s.charAt(i);
		}
		return '$';
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello";
		System.out.println(getChar(s));

	}

}
