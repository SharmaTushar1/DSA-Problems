class Solution {
    final int MOD = 1000000007;
    public int numFactoredBinaryTrees(int[] arr) {
        Arrays.sort(arr);
        HashMap<Integer, Long> map = new HashMap<>();
        long ans = 1L;
        map.put(arr[0], 1L);
        for (int i=1; i<arr.length; i++) {
            map.put(arr[i], 1L);
            for (int j=0; j<i; j++) {
                if (arr[i]%arr[j]==0) {
                    if (map.containsKey(arr[i]/arr[j]))
                        map.put(arr[i], map.get(arr[i])+map.get(arr[j])*map.get(arr[i]/arr[j])%MOD);
                }
            }
            ans=(ans+map.get(arr[i]))%MOD;
        }
        return (int)ans;
    }
}