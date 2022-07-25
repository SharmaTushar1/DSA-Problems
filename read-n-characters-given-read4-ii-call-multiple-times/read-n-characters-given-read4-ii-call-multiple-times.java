/**
 * The read4 API is defined in the parent class Reader4.
 *     int read4(char[] buf4); 
 */

//take an example of "asdfghjkl" and queries[3,4,2]
//queries basically show the number of chars to read

public class Solution extends Reader4 {
    private char[] buf4 = new char[4];//this will be the destination not source
    //that means this will get filled
    private int total = 0; //total characters
    private int p = 0; //pointer
    /**
     * @param buf Destination buffer
     * @param n   Number of characters to read
     * @return    The number of actual characters read
     */
    public int read(char[] buf, int n) {
        for (int i=0; i<n; i++) {
            if (p==total) {
                total = read4(buf4);//the read4 will return the number of values we read.
                p=0;
                if (total==0) //we scanned 0 characters 
                    return i;
            }
            buf[i] = buf4[p];
            p++;
        }
        return n;
    }
}