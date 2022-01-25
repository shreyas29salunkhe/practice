package com.practice;

import java.util.*;

public class CaseSpecificSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=12;
		String str="defRTSersUXI";
//		Queue<Character> lower = new PriorityQueue<>();
//        Queue<Character> upper = new PriorityQueue<>();
//        
//        for(int i = 0; i < str.length(); ++i) {
//            
//            if(Character.isLowerCase(str.charAt(i)))
//                lower.add(str.charAt(i));
//            else
//                upper.add(str.charAt(i));
//        }
//        
//        String ans = "";
//        
//        for(int i = 0; i < str.length(); ++i) {
//            char c = str.charAt(i);
//            
//            if(Character.isLowerCase(c))
//                ans += lower.remove();
//            else
//                ans += upper.remove();
//        }
//        
	       Queue<Character> lower = new PriorityQueue<>();
	        Queue<Character> upper = new PriorityQueue<>();
	        
	        for(int i = 0; i < str.length(); ++i) {
	            
	            if(Character.isLowerCase(str.charAt(i)))
	                lower.add(str.charAt(i));
	            else
	                upper.add(str.charAt(i));
	        }
	        
	        String ans = "";
	        
	        for(int i = 0; i < str.length(); ++i) {
	            char c = str.charAt(i);
	            
	            if(Character.isLowerCase(c))
	                ans += lower.remove();
	            else
	                ans += upper.remove();
	        }
	        
	        System.out.println(ans);
		

	}

}
