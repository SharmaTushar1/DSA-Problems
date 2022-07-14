class Solution {
    public int[] prisonAfterNDays(int[] cells, int n) {
        //so basically, the values will get repeated after some time and instead of doing the bruteforce n times we can just find when the values are repeating and we can just mod the n and then return the nth next day
        //for that we'll use a hashset
        HashSet<String> set = new HashSet<>();
        int count = 0;
        for (int i = 0; i<n; i++) {
            int[] nextDay = findNext(cells);
            String key = Arrays.toString(nextDay);
            if (!set.contains(key)) {
                set.add(key);
                count++;
            } else {
                //values are getting repeated so we can break
                break;
            }
            cells = nextDay;
        }
        n %= count;
        for (int i = 0; i<n; i++) {
            cells = findNext(cells);
        }
        return cells;
    }
    
    //function to find the next cell 
    public int[] findNext(int[] cells) {
        int[] temp = new int[cells.length];
        for (int i = 1; i<cells.length-1; i++) {
            temp[i] = cells[i-1]==cells[i+1]?1:0;
        }
        return temp;
    }
    
}