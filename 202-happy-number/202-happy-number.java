class Solution {
    public boolean isHappy(int n) {
        
        int slow = n;
        int fast = n;
        
        do {
            slow = sumFinder(slow);
            fast = sumFinder(sumFinder(fast));
        } while (slow!=fast);
        
        if (slow == 1) return true;
        
        return false;
        
    }
    
    public int sumFinder(int n) {
        int sum = 0;
        int num;
        while (n!=0) {
            num = n%10;
            sum += num*num;
            n /= 10;
        }
        return sum;
    }
    
}