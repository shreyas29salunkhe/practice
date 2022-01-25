package com.practice;

import java.util.Scanner;

public class ChangeAllEvenBitsToZero {
	/**The number 0xAAAAAAAA is a 32 bit number with all even bits set as 1 and all odd bits as 0.
Set all even bits of x to 0 by doing bitwise and of x with 0xAAAAAAAA.

And, for some more info,
The number 0x55555555 is a 32 bit number with all odd bits set as 1 and all even bits as 0.**/
	static long convertEvenBitToZero(long n) {
        // code here
        return (n & 0xAAAAAAAA);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long t=sc.nextInt();
		
		System.out.println(convertEvenBitToZero(t));
		sc.close();

	}

}
