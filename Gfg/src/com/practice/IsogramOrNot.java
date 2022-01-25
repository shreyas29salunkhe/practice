package com.practice;

import java.util.*;

public class IsogramOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		String S = "geeks";
		ArrayList<Character> al=new ArrayList<>();
		HashSet<Character> hs=new HashSet<>();
		for(int i=0;i<S.length();i++)
		{
			al.add(S.charAt(i));
			hs.add(S.charAt(i));
		}
		System.out.println(al.size()==hs.size()?1:0);

	}

}
