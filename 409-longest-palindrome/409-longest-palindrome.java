class Solution {
    public int longestPalindrome(String s) {
        int[] arr = new int[123];
        for (int i = 0; i<s.length(); i++) {
            arr[s.charAt(i)]++;
        }
        int ans = 0;
        for (int v: arr) {
            ans += v/2*2; //one for each side
            if (ans%2 == 0 && v%2==1) ans++;
        }
        return ans;
    }
}