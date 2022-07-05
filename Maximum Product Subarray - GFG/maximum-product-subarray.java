// { Driver Code Starts
import java.io.*;
import java.util.*;

  public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            System.out.println(new Solution().maxProduct(arr, n));
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        long max = 1, min = 1, result = arr[0];
        for (int i = 0; i<n; i++) {
            long temp = max;
            max = Math.max(arr[i], (Math.max(max*arr[i], min*arr[i])));
            min = Math.min(arr[i], Math.min(temp*arr[i], min*arr[i]));
            result = Math.max(max, result);
        }
        return result;
    }
}