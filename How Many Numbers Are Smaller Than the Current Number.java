//Good problem link - https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/submissions/

//Brute force approach

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int count =  0;
        int ans[] = new int[n];
        for (int i =0; i<n; i++) {
            for (int j =0; j<n; j++) {
                if (nums[i]!=nums[j] && nums[j]<nums[i]){
                    count++;
                }
            }
            ans[i] = count;
            count = 0;
        }
        return ans;
    }
}

//Optimized approach O(n)

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int res[] = new int[n];
        int count[] = new int[101];
        for (int i =0; i<n; i++) {
            count[nums[i]]++; //number of elements 
        }
        for (int i =1; i<101; i++) {
            count[i] += count[i-1];//add the prev value to the count[i]
        }
        for (int i =0; i<n; i++) {
            if (nums[i] == 0) res[i] = 0;//if the element is 0 then res[i] will be 0
            else {
                res[i] = count[nums[i]-1];
            }
        }
        return res;
    }
}
