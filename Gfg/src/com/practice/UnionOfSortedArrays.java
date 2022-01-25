package com.practice;

import java.util.*;

public class UnionOfSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int arr1[] = {1, 2, 3, 4, 5};  
		int m = 3;
		int arr2 [] = {1, 2, 3};
		ArrayList<Integer> al=new ArrayList<>();
		TreeSet<Integer> set=new TreeSet<>();
        for(int x:arr1)
            set.add(x);
        for(int x:arr2)
           set.add(x);
        for(int x:set)
        	al.add(x);
        System.out.println(al);
	}

}
