package com.practice;

public class WhileLoopPrintTable {
	static void printTable(int n)
	{
		int multiplier=10;
		while(multiplier>0)
		{
			int ans=n*multiplier;
			multiplier--;
			System.out.print(ans+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=18;
		printTable(n);
		

	}

}
