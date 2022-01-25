package com.practice;

public class CountEvenOddInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[]= {1,2,3,4,5};
		int evenCount=0;
		int oddCount=0;
		for(int i:n)
		{
			if(i%2==0)
			{
				evenCount++;
			}
			else
			{
				oddCount++;
			}
		}
		System.out.println(oddCount+" "+evenCount);

	}

}
