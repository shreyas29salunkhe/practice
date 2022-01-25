package com.practice;

import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Scanner sc=new  Scanner (System.in);
		int testCases=sc.nextInt();
		while(testCases-->0)
		{
		//System.out.println("No of elements you want to store in array");
		int noOfElements=sc.nextInt();
		 //Initialize array     
        int [] arr = new int[noOfElements]; 
      //n determine the number of times an array should be rotated.  
        //System.out.println("How many times you want to rotate the array");
        int n = sc.nextInt();  
        for(int i=0;i<noOfElements;i++)
        {
        	arr[i]=sc.nextInt();
        }
          
           
        //Displays original array    
       // System.out.println("Original array: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");     
        }      
            
        //Rotate the given array by n times toward right    
        for(int i = 0; i <= n; i++){    
            int j, last;    
            //Stores the last element of array    
            last = arr[arr.length-1];    
            
            for(j = arr.length-1; j > 0; j--){    
                //Shift element of array by one    
                arr[j] = arr[j-1];    
            }    
            //Last element of array will be added to the start of array.    
            arr[0] = last;    
        }    
        
        System.out.println();    
            
        //Displays resulting array after rotation    
        //System.out.println("Array after right rotation: ");    
        for(int i = 0; i< arr.length; i++){    
            System.out.print(arr[i] + " ");    
        }    
		}
		sc.close();
		}
		catch(Exception e)
		{
			
		}
	}

}
