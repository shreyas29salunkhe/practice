package com.practice;

import java.util.*;



public class DetectCapitalUse {
	static boolean detectCapitalUse(String word)
	{
		if(word.equals(word.toLowerCase())) {
            return true;
        }
		else if(word.equals(word.toUpperCase())) 
		{
            return true;
        } else if(word.charAt(0) == Character.toUpperCase(word.charAt(0)) && word.substring(1).equals(word.substring(1).toLowerCase()))  
        {
            return true;
        }
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String word=sc.next();
		System.out.println(detectCapitalUse(word));
		
		
		sc.close();

	}

}
