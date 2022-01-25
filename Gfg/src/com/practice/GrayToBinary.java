package com.practice;

import java.util.Scanner;

public class GrayToBinary {
	/**Its simple. Take the number, and shift it right by one bit.
	 *  Whatever result you get, take its XOR with original number 
	 *  and keep going on with it till n goes down to 1.
	 * The reason being, at each iteration at the binary level we
	 *  first take XOR of a particular bit and shift it to get XOR
	 *   of this bit and next bit, while all other numbers mostly
	 *    stay unaffected. Try running it by taking an example and going bit by bit**/
	static int convertInt(int n)
	{
		 int res = 0;
	        while(n>0){
	            res = res^n;
	            n = n>>1;
	        }
	      return res;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(convertInt(n));
		sc.close();
		
	}

}
