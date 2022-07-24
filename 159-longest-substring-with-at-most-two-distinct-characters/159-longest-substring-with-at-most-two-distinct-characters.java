class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
  int maxLen = 0;
  int start = 0, end=0;
  HashMap<Character, Integer> map = new HashMap<>();
  while (end<s.length()) {
    //put the value in the hashmap.
    //We will put the character and index and whenever the same character is found we will just replace the index.
    //We just want the latest index so we can overwrite when we encounter the same character.
    map.put(s.charAt(end), end);
    //character limit exceeded.
    if (map.size()>2) {
      //grab the minimum index
      int index = Collections.min(map.values());//this was the tricky part for me. I'm bad at java.
      map.remove(s.charAt(index));//remove that character
      start = index+1;//move start to the next character
    }
    end++;
    maxLen = Math.max(maxLen, end-start);
  }
  return maxLen;
}
}