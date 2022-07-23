class Solution {
    public int minMeetingRooms(int[][] intervals) {
        //two arrays for start and end times
        int n=intervals.length;
        int[] start = new int[n];
        int[] end = new int[n];
        for (int i=0; i<n; i++) {
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }
        Arrays.sort(start);
        Arrays.sort(end);
        int rooms = 0;
        int curRooms = 0;
        int i = 0, j=0;
        while (i<n && j<n) {
            //increase if new meeting started while last room still occupied
            if (start[i]<end[j]) {
                curRooms++;
                i++;
            } else {//else a meeting ended
                curRooms--;
                j++;
            }
            rooms = Math.max(rooms, curRooms);
        }
        return rooms;
    }
}