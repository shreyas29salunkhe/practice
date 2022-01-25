package com.practice;
import java.io.*;


class SwapTwoNibbleInAByte
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.swapNibbles(N));
        }
    }
}// } Driver Code Ends


//User function Template for Java
class Solution{
    static int swapNibbles(int N) {
        //code here
        int a = N/16;
        int b = N%16;
        return a+16*b;
    }
}

