package com.practice;

class Complete{
    
	   
    // Function for finding maximum and value pair
    public static int multiply (int arr[], int n) {
        //Complete the function
        int leftSum = 0;
        int rightSum = 0;
        
        int i = 0;
        int j = arr.length - 1;
        
        while(i < j)
        {
        leftSum += arr[i];
        rightSum += arr[j];
        
        i++;
        j--;
        }
        
        return leftSum * ( rightSum + ((n % 2 == 0) ? 0 : arr[n/2] ));
    }
    
    
}

public class MultiplyLeftAndRightArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complete ns=new Complete();

		int arr[] = {1, 2, 3, 4};
		System.out.println(ns.multiply(arr, arr.length));
	}

}
