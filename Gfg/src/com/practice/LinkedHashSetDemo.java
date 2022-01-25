package com.practice;


import java.util.*;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LinkedHashSet<Integer> ls = new LinkedHashSet<Integer>(); 
        ls.add(20);
        ls.add(30);
        
        ls.add(120);
        ls.add(50);
        ls.add(40);
        System.out.println(ls);
        TreeSet<Integer> tS = new TreeSet<Integer>( ls );
        System.out.println(tS);
        ls.remove(20);
        if(ls.contains(30))
        {
        	System.out.println(1);
        }
        else 
        {
        	System.out.println(-1);
        }
        System.out.println(ls.size());

	}

}
