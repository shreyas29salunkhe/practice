package com.practice;

import java.util.Scanner;

public class ReverseEachWordInString {
	static void reverseWords(String S)
	{
		String a[]=S.split("[.]");
		String x="";
		for(int i=0;i<a.length;i++)
		{
			x+=reverseStr(a[i]);
			if(i<a.length-1)
				x+=".";
		}
		System.out.println(x);
	}
	static String reverseStr(String t)
	{
		String rev="";
		for(int i=t.length()-1;i>=0;i--)
		{
			rev+=t.charAt(i);
		}
		return rev;
	}
	
	/**String reverseWords(String S)
    {
        String w = "", ans = "";
        for(char ch : S.toCharArray()){
             if(ch != '.')
                w = ch + w;
            else{
                ans += w+".";
                w = "";
            }
        }
        return ans+w;
    }**/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String S=sc.nextLine();
		reverseWords(S);
		sc.close();

	}

}
