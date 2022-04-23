public class Codec {

    public String helper;
    public String encode(String longUrl) {
        helper = longUrl;
        double rand = Math.random()*9999;
        return "http://tinyurl.com/"+rand;    
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return helper;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));