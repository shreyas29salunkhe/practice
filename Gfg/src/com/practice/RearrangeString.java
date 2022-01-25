package com.practice;

import java.util.*;

public class RearrangeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = "AC2BEW3";
		int sum=0;
		
		ArrayList<Character> al=new ArrayList<>();
		for(int i=0;i<S.length();i++)
		{
			if(S.charAt(i)>='0' && S.charAt(i)<='9')
			{
				int a=S.charAt(i)-'0';
				sum+=a;
				
			}
			else
			{
				al.add(S.charAt(i));
			}
		}
		Collections.sort(al);
		
		//System.out.println(al+""+s);
		String h="";
		
		for (char i:al)
		{
			h+=i;
		}
		h+=sum;
		System.out.print(h);

	}

}
