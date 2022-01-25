package com.practice;

import java.util.ArrayList;

public class SplitStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   ArrayList<String>hs=new ArrayList<>();
	   String S = "geeks01for02geeks03!!!";
       String s1="";
       String s2="";
       String s3="";
       for(int i=0;i<S.length();i++)
       {
    	   if(S.charAt(i)>='a' && S.charAt(i)<='z' ||S.charAt(i)>='A' && S.charAt(i)<='Z')
    	   {
    		   s1+=S.charAt(i);
    		   
    	   }
    	   else if(S.charAt(i)>='0' && S.charAt(i)<='9')
    	   {
    		   s2+=S.charAt(i);
    	   }
    	   else
    	   {
    		   s3+=S.charAt(i);
    	   }
       }
       hs.add(s1);
       hs.add(s2);
       hs.add(s3);
       System.out.println(hs);
       
       

	}

}
