package com.practice;

import java.util.HashSet;

public class CountUniqueSubstrings {
	static int getCount(String str)
	{
		int count = 0;
		HashSet<String> hs = new HashSet<String>();
		for(int i = 0; i < str.length(); i++)
		{
				for(int j = i+1; j <= str.length(); j++)
					{
						String value = str.substring(i , j);
						if(!hs.contains(value))
						{
							hs.add(value);
							count++;
						}
					}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="jaja";
		System.out.println(getCount(s));

	}

}
