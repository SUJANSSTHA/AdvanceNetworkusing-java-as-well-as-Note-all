import java.util.*;
import java.net.URL;
import java.net.URLConnection;
import java.net.*;

public class HttpHeaderDemo {
    public static void main(String[] args) throws Exception {
        try {
            URL u = new URL("http://www.javatpoint.com/java-networking");
            URLConnection uc = u.openConnection();
            if (uc.getContentEncoding() != null) {
                System.out.println("Content-encoding:" + uc.getContentEncoding());

            }
            if (uc.getDate() != 0) {
                System.out.println("Date:" + new Date(uc.getDate()));

            }
            if (uc.getLastModified() != 0) {
                System.out.println("Last modified" + new Date(uc.getLastModified()));

            }
            if (uc.getExpiration() != 0) {
                System.out.println("Experation daste:" + new Date(uc.getExpiration()));
            }
            if (uc.getContentLength() != -1) {
                System.out.println("Content-lenght" + uc.getContentLength());
            }
        } catch (MalformedURLException ex) {
            System.err.println("is not a RUL I  Understand");
        }
    }
}
