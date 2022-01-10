class Solution {
    public int numberOfSteps(int num) {
        return function(num,0);
    }
    
    public int function(int num, int count) {
        if (num==0) return 0;
        if (num/2 == 0) {
            count = count + 1;
            return count;
        }
        if (num%2==0) {
            return function (num/2, count+1);
        }
        return function(num-1,count+1);
    }
    
}