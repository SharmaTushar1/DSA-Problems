//link - https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        
        int max = candies[0];
        int n = candies.length;
        ArrayList<Boolean> list=new ArrayList<Boolean>(n);
        for (int i =1; i<n; i++) {
            max = Math.max(max, candies[i]);
        }
        for (int i =0; i<n; i++) {
            list.add(candies[i]+extraCandies>=max);
        } 
        return list;        
    }
}
