package com.practice;

public class CheckIfNumberIsBalanced {
	static boolean isBalanced(String s)
	{
		int mid=s.length()/2;
		int sum1=0,sum2=0;
		for(int i=0;i<mid;i++)
		{
			sum1+=Character.getNumericValue(s.charAt(i));
		}
		for(int i=mid+1;i<s.length();i++)
		{
			sum2+=Character.getNumericValue(s.charAt(i));
		}
		if(sum1==sum2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="12345";
		System.out.println(isBalanced(s));
		

	}

}
