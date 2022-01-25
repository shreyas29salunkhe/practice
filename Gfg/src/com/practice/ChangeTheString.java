package com.practice;

public class ChangeTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abCD";
		if(Character.isUpperCase(s.charAt(0)))
		{
			
			System.out.println(s.toUpperCase());
			
		}
		else if(Character.isLowerCase(s.charAt(0)))
		{
			
			System.out.println(s.toLowerCase());
			
		}
		
		

	}

}
