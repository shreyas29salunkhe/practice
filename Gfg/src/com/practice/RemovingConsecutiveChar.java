package com.practice;

public class RemovingConsecutiveChar {

	 public static String removeConsecutiveCharacter(String S){
	       int n = S.length();
	        
	        int i;
	        String res = "";
	        
	        char[] ch = S.toCharArray();
	        
	        for(i=0;i<n;i++){
	            if(i!=n-1 && ch[i] != ch[i+1])
	                res += ch[i];
	        }
	        res += ch[i-1];
	        return res;
	    }
	 public static void main(String[] args) {
		String S="aabb";
		// TODO Auto-generated method stub
		System.out.println(removeConsecutiveCharacter(S));

	}

}
