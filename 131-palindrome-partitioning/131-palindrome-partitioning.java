class Solution {
    public List<List<String>> partition(String s) {
        
        List<List<String>> ans = new ArrayList<>();
        List<String> res = new ArrayList<String>();
        
        function(s, ans, res, 0);
        
        return ans;

    }

    public void function(String s, List<List<String>> ans, List<String> res,  int index) {
        
        if (index == s.length()) {
            ans.add(new ArrayList(res));
            return;
        }
        
        for (int i = index; i<s.length(); i++) {
            if (isPalindrome(s, index, i)) {

                // System.out.println("ewf");

                res.add(s.substring(index, i+1));
                function(s, ans, res, i+1);
                res.remove(res.size()-1);
            }
        }
        
    }
    
    boolean isPalindrome(String s, int index, int i) {
        while (index<=i) {
            if (s.charAt(index)!=s.charAt(i)) return false;
            index++;
            i--;
        }
        return true;
    }
    

}