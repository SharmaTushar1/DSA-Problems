// { Driver Code Starts
//Initial Template for Java

import java.util.*;

public class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n = sc.nextInt();
            int A[] = new int[n];
            
            for (int i = 0;i < n;i++)
            {
                A[i] = sc.nextInt();
            }
            int key = sc.nextInt();
            
            System.out.println(new Solution().search(A, 0, n - 1, key));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    int search(int arr[], int start, int end, int target)
    {
        int mid = start+(end-start)/2;
        
        if (arr[mid] == target) return mid;
        
        if (start>=end) return -1;
        
        if (arr[mid]>=arr[start]) {
            if (target>=arr[start] && target<=arr[mid]) return search(arr, start, mid-1, target);
            else return search(arr,mid+1, end, target);
        } else if (arr[mid]<=target && target<=arr[end]) {
            return search(arr,mid+1, end, target);
        } else {
            return search(arr,start, mid-1, target);
        }
        
    }
}