class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits.length()==0) 
            return ans;
        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        StringBuilder sb = new StringBuilder();
        helper(map, sb, ans, digits, 0);
        return ans;
    }
    //23
    //"abc"->['a','b','c']
    public void helper(HashMap<Character, String> phone, StringBuilder sb, List<String> ans, String digits, int index) {
        if (index==digits.length()) {
            ans.add(sb.toString());
            return;
        }
        String curLetters = phone.get(digits.charAt(index));
        for (char letter: curLetters.toCharArray()) {
            sb.append(letter);
            helper(phone, sb, ans, digits, index+1);
            sb.deleteCharAt(sb.length()-1);            
        }
    }
    
}