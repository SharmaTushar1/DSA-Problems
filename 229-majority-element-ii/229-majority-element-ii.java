class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num: nums) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> set: map.entrySet()) {
            if (set.getValue()>(nums.length)/3)
                list.add(set.getKey());
        }
        return list;
    }
}