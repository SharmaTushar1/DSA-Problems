class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int end = Integer.MIN_VALUE;
        for (int pos: position)
            end = Math.max(end, pos);
        end--;
        int start = 1;
        while (start<=end) {
            int mid = start+(end-start)/2;
            if (!isValid(mid, position, m))
                end = mid-1;
            else start = mid+1;
        }
        return end;
    }
    
    public boolean isValid(int dis, int[] position, int m) {
        int start = 0, end = 0;
        int count =1;
        for (; end<position.length; end++) {
            if (position[end]-position[start]>=dis) {
                count++;
                start = end;
            }
        }
        return count>=m;
    }
    
}