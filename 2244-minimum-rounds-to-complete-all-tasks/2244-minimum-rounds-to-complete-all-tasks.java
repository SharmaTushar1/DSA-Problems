class Solution {
    public int minimumRounds(int[] tasks) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int task: tasks) map.put(task, map.getOrDefault(task, 0)+1);
        
        int count = 0;
        for (int task: map.values()) {
            if (task==1) return -1;
            count+=(task+2)/3;
        }
        
        return count;
    }
}
/*
java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
  at line 18, Solution.minimumRounds
  at line 54, __DriverSolution__.__helper__
  at line 84, __Driver__.main
*/