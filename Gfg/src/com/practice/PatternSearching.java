package com.practice;

public class PatternSearching {

	 static int search(String text, String pat) {
	        // code here
//		 boolean b=text.contains(pat);
//		 if(b==false)
//		 {
//			 return 0;
//		 }
//		 else
//		 {
//			 return 1;
//		 }
		 return (text.contains(pat)==false?0:1);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "geeksforgeeks";
		String pat = "geek";
		System.out.println(search(text, pat));
		

	}

}
