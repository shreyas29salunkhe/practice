package com.practice;

public class OddSeriesSum {
	static long sumOfTheSeries(long n){
        // code here
        long sum=n*(n+1)*(2*n+1)/6;
        return sum;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n=2;
		System.out.println(sumOfTheSeries(n));

	}

}
