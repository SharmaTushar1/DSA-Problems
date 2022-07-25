class Solution {
    public String nextClosestTime(String time) {
        char[] result = time.toCharArray();
        char[] digits = new char[]{result[0], result[1], result[3], result[4]};
        Arrays.sort(digits);
        //findNext for HH:M_
        result[4] = findNext(result[4], '9', digits);
        if (result[4]>time.charAt(4)) return String.valueOf(result);
        //findNext for HH:_M
        result[3] = findNext(result[3], '5', digits);
        if (result[3]>time.charAt(3)) return String.valueOf(result);
        //findNext for H_:MM
        result[1] =result[0]=='2'?findNext(result[1], '3', digits):findNext(result[1], '9', digits);
        if (result[1]>time.charAt(1)) return String.valueOf(result);
        //findNext for _H:MM
        result[0] = findNext(result[0], '2', digits);
        return String.valueOf(result);
    }
    
    private char findNext(char current, char upperLimit, char[] digits) {
        if (current == upperLimit)
            return digits[0];
        //find the position of the next greater time
        int pos = Arrays.binarySearch(digits, current)+1;
        //possibly this one can either be greater than the upperLimit or the digits array have duplicates so
        while (pos<4 && (digits[pos]>upperLimit || digits[pos]==current))
            pos++;
        return pos==4?digits[0]:digits[pos];
    }
    
}