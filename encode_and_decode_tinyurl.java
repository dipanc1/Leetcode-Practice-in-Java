import java.util.HashMap;
import java.util.Map;

class Codec {

    Map<String, String> map = new HashMap<>();
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String encodedUrl = String.valueOf(longUrl.hashCode());

        map.put(encodedUrl, longUrl);

        return encodedUrl;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));

public class encode_and_decode_tinyurl {
    public static void main(String[] args) {
        Codec c = new Codec();
        System.out.println(c.encode("www.google.com"));
        c.decode("-702889725");
    }
}
