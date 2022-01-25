package com.practice;

import java.util.*;

public class AnagramOfStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "cddgk";
		String s1 = "gcd";
		ArrayList<Character> a=new ArrayList<>();
		ArrayList<Character> b=new ArrayList<>();
		ArrayList<Character> c=new ArrayList<>();
		for(int i=0;i<s.length();i++)
		{
			a.add(s.charAt(i));
		}
		for(int i=0;i<s1.length();i++)
		{
			b.add(s.charAt(i));
		}
		Collections.sort(a);
		Collections.sort(b);

		System.out.println(a);
		System.out.println(b);
		for(int i=0;i<s1.length();i++)
		{
			if(a.get(i)==b.get(i))
			{
				c.add(a.get(i));
			}
		}
		System.out.println(c);
		System.out.println(s.length()-c.size());
		
		
				

	}

}
