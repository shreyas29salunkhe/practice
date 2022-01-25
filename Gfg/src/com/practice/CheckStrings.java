package com.practice;

public class CheckStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="geeks";
		boolean flag=true;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(0)!=s.charAt(i))
			{
				flag =false;
				break;
			}
		}
		System.out.println(flag);

	}

}
