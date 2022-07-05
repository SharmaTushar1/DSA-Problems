// { Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;


class Array {

	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		  
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements to the array
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling trappingWater() function
		    System.out.println(obj.trappingWater(arr, n));
		}
	}
}

// } Driver Code Ends


class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 
        int[] leftPrefix = new int[n];
        int[] rightPrefix = new int[n];
        leftPrefix[0] = arr[0];
        rightPrefix[n-1] = arr[n-1];
        for (int i = 1; i<n; i++) {
            leftPrefix[i] = Math.max(leftPrefix[i-1], arr[i]);
        }
        for (int i = n-2; i>=0; i--) {
            rightPrefix[i] = Math.max(rightPrefix[i+1], arr[i]);
        }
        long water =  0;
        for (int i = 0; i<n; i++) {
            water += Math.min(leftPrefix[i], rightPrefix[i])-arr[i];
        }
        return water;
    } 
}


