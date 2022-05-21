class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        int n = encodedText.length();
        int cols = n/rows;
        //All the words start from first column so we need to iterate the col only
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<cols; i++) {
            for (int j = i; j<n; j+=cols+1) {
                sb.append(encodedText.charAt(j));
            }
        }
        return sb.toString().stripTrailing();
    }
}