class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int start = 1;
        int end = Integer.MIN_VALUE;
        for (int pos: position) end = Math.max(pos, end);
        end--;
        int res = 0;
        while (start<=end) {
            int mid = start+(end-start)/2;
            System.out.println(end+" "+start+" "+mid);
            if (canPlace(position, mid, m)) {
                res = mid;
                start = mid+1;
            }
            else end = mid-1;
        }
        return res;
    }
    
    public boolean canPlace(int[] position, int distance, int m) {
        int cows = 1;
        int prev = position[0];
        for (int i = 0; i<position.length; i++) {
            if (position[i]-prev >= distance) {
                cows++;
                prev = position[i];
            }
        }
        System.out.println("Cows -> "+cows);
        return cows>=m;
    }
    
}