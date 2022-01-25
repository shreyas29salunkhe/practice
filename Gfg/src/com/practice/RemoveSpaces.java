package com.practice;

import java.util.Scanner;

public class RemoveSpaces {
	static String modify(String S)
    {
        // your code here
		return S.replace(" ", "");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String S=sc.nextLine();
		System.out.println(modify(S));
		sc.close();

	}

}
