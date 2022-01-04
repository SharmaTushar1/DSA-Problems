class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        List<Integer> ls = new ArrayList<Integer>();
        int i = 0;
        int n = arr.length;
        while (i<n) {
            int correct = arr[i]-1;
            if (arr[i]!=arr[correct]) {
                int temp = arr[i];
                arr[i]=arr[correct];
                arr[correct] = temp;
            } else i++;
        }
        for (int j = 0; j<n; j++) {
            if (arr[j] !=j+1) ls.add(arr[j]);
        }
        return ls;
    }
}