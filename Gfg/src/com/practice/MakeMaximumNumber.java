package com.practice;

import java.util.ArrayList;
import java.util.Collections;

public class MakeMaximumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String N = "38293367";
		ArrayList <Integer> al=new ArrayList<>();
		for(int i=0;i<N.length();i++)
		{
			al.add(Character.getNumericValue(N.charAt(i)));
		}
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		for(int i=al.size()-1;i>=0;i--)
		{
			System.out.print(al.get(i)+"");
		}
		

	}

}
