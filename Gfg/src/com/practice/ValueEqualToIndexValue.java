package com.practice;

public class ValueEqualToIndexValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 5;
		int Arr[] = {15, 2, 45, 12, 7};
		int in=1;
		for(int i=0;i<N;i++)
		{
			if(Arr[i]==in)
			{
				System.out.println(Arr[i]);
			}
			in++;
		}

	}

}
