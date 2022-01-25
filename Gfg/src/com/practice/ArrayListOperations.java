package com.practice;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<>();
		al.add("15");
		al.add("45");
		al.add("45");
		al.add("45");
		al.add("25");
		System.out.println(al);
		
		if(al.contains("45"))
		{
			
			System.out.println(Collections.frequency(al, "45"));
			
		}
		else
		{
			System.out.println("NO");
		}
		
		

	}

}
