package com.practice;

public class ReverseWordsInStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String S = "i.like.this.program.very.much";
	        String[] arrOfStr = S.split("[.]");
	 
	        for (String a : arrOfStr)
	            System.out.println(a);
	        
	        
	        String x="";
	        for(int i=arrOfStr.length-1;i>=0;i--)
	        {
	        	x+=arrOfStr[i];
	        	if(i>0)
	        		x+=".";
	        }
	        System.out.println(x);

	}

}
