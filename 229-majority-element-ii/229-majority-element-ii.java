class Solution {
    public List<Integer> majorityElement(int[] arr) {
        int majorityCheck = arr.length/3;
        int n = arr.length;
        List<Integer> ls = new ArrayList<Integer>();
        if (arr.length == 1) {ls.add(arr[0]); return ls;}
        if (arr.length == 2) {
            ls.add(arr[0]);
            if (!ls.contains(arr[1])) ls.add(arr[1]);
            return ls;}
        for (int i = 0; i<n-1; i++) {
            int count = 1;
            for (int j = i+1; j<n; j++) {
                if (arr[j] == arr[i]) count++;
                
            }if ((count >n/3) && (!ls.contains(arr[i]))) {
                    ls.add(arr[i]);
                }
        }
        Collections.sort(ls);
        return ls;
    }
}