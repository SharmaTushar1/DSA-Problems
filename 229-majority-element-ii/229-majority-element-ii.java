class Solution {
    public List<Integer> majorityElement(int[] arr) {
        int element1 = -1;
        int element2 = -1;
        int count1 = 0;
        int count2 = 0;
        int n = arr.length;
        for (int i = 0; i<n; i++) {
            if (arr[i] == element1) count1++;
            else if (arr[i] == element2) count2++;
            else if (count1 ==0) {
                element1 = arr[i];
                count1++;
            }
            else if (count2 ==0) {
                element2 = arr[i];
                count2++;
            }
            else {
                count1--;
                count2--;
            }
        }
        List<Integer> ls = new ArrayList<Integer>();
        int c1 = 0;
        int c2 = 0;
        for (int i = 0; i<n; i++) {
            if (arr[i]==element1) c1++;
            else if (arr[i]==element2) c2++;
        }
        if (c1>n/3) ls.add(element1);
        if (c2>n/3) ls.add(element2);
        return ls;
    }
}