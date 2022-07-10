class Solution {
    public int snakesAndLadders(int[][] board) {
        //convert into 1d array
        int n = board.length;
        int[] arr = new int[n*n];
        //since we start from bottom right position
        int i = n-1, j = 0, index = 0, inc=1; //this inc will give direction whether to go right or left initially it's right i.e. +1
        while (index<n*n) {
            arr[index++] = board[i][j];
            //when we are at the right most position in a row
            if (inc == 1 && j==n-1) {
                //decrement the row i.e. go up and change the direction to going left i.e. decreasing the col values i.e. -1
                inc = -1;
                i--;
            } else if (inc ==-1 && j==0) {
                //same case when we are going on left direction
                inc = 1;
                i--;
            } else {
                j+=inc;
            }
        }
        //have a visited array so you don't visit the unnecessart values 
        boolean[] visited = new boolean[n*n];
        Queue<Integer> q = new LinkedList<>();
        int start = arr[0]>-1?arr[0]-1:0;//-1 because the array is 0 indexed
        q.offer(start);
        visited[start] = true;
        int step = 0;//ans
        while (!q.isEmpty()) {
            int size = q.size();
            for (int k =0; k<size; k++) {
                int cur = q.poll();
                if (cur==n*n-1) 
                    return step;
                for (int next = cur+1; next<=Math.min(n*n-1, cur+6); next++) {
                    int dest = arr[next]>-1?arr[next]-1:next;
                    if (!visited[dest]) {
                        visited[dest] = true;
                        q.offer(dest);
                    }
                }
            }
            step++;
        }
        return -1;
    }
}