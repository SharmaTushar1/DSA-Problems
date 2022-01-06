class Solution {
    public String restoreString(String s, int[] indices) {
        int n = indices.length;
        char[] arr = new char[n];
        char[] sArray = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i =0; i<n; i++) {
            arr[indices[i]] = sArray[i];
        }
        for (int i =0; i<n; i++) {
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}