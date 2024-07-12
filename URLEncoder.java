import java.net.*;

public class URLEncoder {
    public static void main(String[] args) throws Exception {
        String originalString = "My name is";
        String encodedString = "";
        try {
            encodedString = java.net.URLEncoder.encode(originalString, "UTF-8");
            System.out.println(encodedString);

        } catch (Exception e) {
            System.err.println(e);
        }
        String decodedString;
        try {
            decodedString = URLDecoder.decode(encodedString, "UTF-8");
            System.out.println(decodedString);
        } catch (Exception e) {
            System.err.println(e);
        }

    }
}
