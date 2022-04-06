class Solution {
    public int threeSumMulti(int[] nums, int target) {
        long[] c = new long[101]; //this is like a hash map and since the max value of nums[i] is till 100 this is 101
        for (int i = 0; i<nums.length; i++) {
            c[nums[i]]++;//count the number of times a number is repeating
        }
        long res = 0;
        //I'm not even traversing the arrays I'm just going throgh the max limits of the array
        //and checking if it's present in the hash array that we created above
        for (int i = 0; i<=100; i++) {
            for (int j = i; j<=100; j++) {
                int k = target-i-j;
                if (k>100 || k<0) continue;
                //these res+= are just formulas for the cases see lee215 discuss comment
                if (i == j && j == k) 
                    res += c[i]*(c[i]-1)*(c[i]-2)/6;
                else if (i==j && j!=k) res+= c[i]*(c[i]-1)/2*c[k];
                else if (j<k) res+=c[i]*c[j]*c[k];
            }
        }
        
        return (int)(res%(1e9+7));
    }
}