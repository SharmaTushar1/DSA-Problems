class Solution {
    public int maxDistToClosest(int[] seats) {
        int ans = -1;
        int n = seats.length;
        //build the left array
        int[] left = new int[n];
        Arrays.fill(left, n);
        for (int i=0; i<n; i++) {
            if (i==0) {
                if (seats[i]==0) {
                    continue;
                } else {
                    left[i]=0;
                }
                continue;
            }
            if (seats[i]==1)
                left[i]=0;
            else {
                if (left[i-1]==n)
                    continue;
                else 
                    left[i] = left[i-1]+1;
            }
        }
        // build the right prefix array
        int[] right = new int[n];
        Arrays.fill(right, n);
        for (int i=n-1; i>=0; i--) {
            if (i==n-1) {
                if (seats[i]==0) {
                    continue;
                } else {
                    right[i]=0;
                }
                continue;
            }
            if (seats[i]==1)
                right[i]=0;
            else {
                if (right[i+1]==n)
                    continue;
                else 
                    right[i] = right[i+1]+1;
            }
        }
        for (int i=0; i<n; i++) {
            if (Math.min(left[i], right[i])>ans) {
                ans = Math.min(left[i], right[i]);
            }
        }
        
        System.out.println(Arrays.toString(right));
        return ans;
    }
}