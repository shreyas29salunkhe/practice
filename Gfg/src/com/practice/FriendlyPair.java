package com.practice;

public class FriendlyPair {
	static int isAmicable(int A , int B) {
        // code here
        int s1=0,s2=0;
        for(int i=1;i<A;i++)
        {
            if(A%i==0)
            s1+=i;
        }
        System.out.println(s1);
        for(int i=1;i<B;i++)
        {
            if(B%i==0)
            s2+=i;
        }
        System.out.println(s2);
        if(s1==B && s2==A)
        	return 1;
        else
        	return 0; 
    }
	public static void main(String[] args) {
		int A=220;
		int B=284;
		System.out.println(isAmicable(A, B));
	}

}
