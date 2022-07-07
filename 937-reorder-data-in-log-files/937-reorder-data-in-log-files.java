class Solution {
    public String[] reorderLogFiles(String[] logs) {
        Comparator<String> myComp = new Comparator<>() {
            @Override
            public int compare(String log1, String log2) {
                //split the id from the other part
                String[] split1 = log1.split(" ", 2);
                String[] split2 = log2.split(" ", 2);
                //check for the type of log
                boolean isDigit1 = Character.isDigit(split1[1].charAt(0));
                boolean isDigit2 = Character.isDigit(split2[1].charAt(0));
                //if both are letters
                if (!isDigit1 && !isDigit2) {
                    //both are letter
                    //compare the non identifier part
                    int cmp = split1[1].compareTo(split2[1]);
                    //if the non identifier part is different
                    if (cmp!=0) 
                        return cmp;
                    //if they are same then compare the identifiers
                    return split1[0].compareTo(split2[0]);
                }
                else if (!isDigit1 && isDigit2) {
                    //log1 is letter
                    //return -1 which says that the first one is "smaller" than the 2nd one
                    return -1;
                    
                } else if (isDigit1 && !isDigit2) {
                    //log2 is letter
                    return 1;
                    
                } else {
                    //both are digits
                    return 0;
                }
            }
        };
        Arrays.sort(logs, myComp);
        return logs;
    }
}