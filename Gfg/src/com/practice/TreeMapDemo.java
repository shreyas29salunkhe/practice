package com.practice;

import java.util.*;
import java.util.Map.Entry;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,Integer> hm=new TreeMap<>();
		hm.put(1, 123);
		hm.put(2, 124);
		hm.put(3, 125);
		hm.put(4, 126);
		hm.put(5, 127);
		if(hm.containsKey(5))
		{
			System.out.println(hm.get(5));
		}
		else
		{
			System.out.println("-1");
		}
		System.out.println(hm.size());
		System.out.println(hm.remove(3, 125));
		System.out.println(hm);
		TreeMap<Integer, Integer> sorted
        = new TreeMap<>(hm);
		
		  for (Entry<Integer, Integer> entry :
	             sorted.entrySet())
	            System.out.print(
	                                entry.getValue()+" ");
		
		

	}

}
