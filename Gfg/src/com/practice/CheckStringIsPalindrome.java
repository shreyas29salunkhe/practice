package com.practice;

public class CheckStringIsPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "race car";
		String x=s.replace(" ", "");
		char a[]=x.toCharArray();
		for(char aa:a)
		{
			System.out.print(aa+" ");
		}
		System.out.println();
		char r[]=new char[a.length];
		int j=a.length;
		 for (int i = 0; i < a.length; i++)
		 {
	            r[j - 1] = a[i];
	            j = j - 1;
	        }

		for(char aa:r)
		{
			System.out.print(aa+" ");
		}
		boolean f=true;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=r[i])
			{
				f=false;
				break;
			}
		}
		if(f==true)
		{
			System.out.println(true);
		}
		else 
		{
			System.out.println(false);
		}

	}

}
