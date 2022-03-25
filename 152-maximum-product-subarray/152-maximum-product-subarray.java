class Solution {
    public int maxProduct(int[] nums) {
        int maxProduct = nums[0];
        int product = nums[0];
        for (int i = 0; i<nums.length; i++) {
            product = 1;
            // System.out.println(product);
            for (int j = i; j<nums.length; j++) {
                product *= nums[j];
                maxProduct = product>maxProduct?product:maxProduct;
            }
            // System.out.println(product);
        }
        return maxProduct;
    }
}