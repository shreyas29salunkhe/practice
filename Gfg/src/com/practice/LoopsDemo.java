package com.practice;

import java.util.*;



public class LoopsDemo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		
		ArrayList <Integer> al=new ArrayList<>();
        int evenSum=0,oddSum=0;
        for(int i=1;i<=N;i++)
        {
            if(i%2==0)
            {
                evenSum+=i;
            }
            else 
            {
                oddSum+=i;
            }
        }
        al.add(evenSum);
        al.add(oddSum);
        
		System.out.println(al.get(0)+" "+al.get(1));
		sc.close();
		
		
		

	}

}
