package com.practice;

import java.util.ArrayList;

public class RemoveDuplicatesFromString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Character>hs=new ArrayList<>();
		String str="geeksforgeeks";
		for(int i=0;i<str.length();i++)
		{
			if(!(hs.contains(str.charAt(i))))
			{
				hs.add(str.charAt(i));
			}
		}
		String d="";
		for(char i:hs)
			d+=i;
		System.out.println(d);
		
		
		

	}

}
