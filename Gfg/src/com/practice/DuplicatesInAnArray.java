package com.practice;

import java.util.Scanner;

public class DuplicatesInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Scanner sc = new Scanner(System.in);
		int testCases=sc.nextInt();
		while(testCases-->0)
		{
		int array[]=new int[10];
		for(int i=0;i<10;i++)
		{
			array[i]=sc.nextInt();
		}
		int mid = (array.length / 2);
		if (array[mid] == array[mid + 1]) {
		System.out.println(array[mid]);
		}
		else {
		System.out.println(array[mid-1]);
		}
		}
		sc.close();
		}
		catch(Exception e)
		{
			
		}
	}

}
