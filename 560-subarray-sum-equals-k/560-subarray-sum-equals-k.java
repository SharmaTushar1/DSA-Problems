class Solution {
    public int subarraySum(int[] arr, int k) {
        int n=arr.length;
        int ans = 0, sum=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int a: arr) {
            sum+=a;
            if (map.containsKey(sum-k)) {
                ans+=map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum,0)+1);
        }
        System.out.println(map);
        return ans;
    }
}