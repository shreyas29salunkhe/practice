package com.practice;

public class OnesComplement2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=5;
		String str=Integer.toBinaryString(N);
		String x="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='0')
			{
				x+='1';
			}
			else if(str.charAt(i)=='1')
			{
				x+='0';
			}
		}
		//System.out.println(str);
		//System.out.println(x);
		int d=Integer.parseInt(x,2);
		System.out.println(d);
		

	}

}
