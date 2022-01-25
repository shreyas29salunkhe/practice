package com.practice;

public class RemainderWithMod7 {
	
	static int ismod7(String num){
        // code here
        java.math.BigInteger bi =new java.math.BigInteger(num);
        bi=bi.mod(java.math.BigInteger.valueOf(7));
        
        return bi.intValue();
    
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num="5";
		System.out.println(ismod7(num));

	}

}
