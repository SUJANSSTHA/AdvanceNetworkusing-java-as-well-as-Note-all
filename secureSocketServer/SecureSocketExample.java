import java.net.*;
import javax.net.ssl.*;

public class SecureSocketExample {
    public static void main(String[] args) {
        try {
            // Create SSL context
            SSLContext sslContext = SSLContext.getDefault();
            
            // Create SSLSocketFactory from SSLContext
            SSLSocketFactory sslSocketFactory = sslContext.getSocketFactory();
            
            // Create SSLSocket using the factory
            SSLSocket secureSocket = (SSLSocket) sslSocketFactory.createSocket();
            
            // Connect to the server
            secureSocket.connect(new InetSocketAddress("www.tufohss.edu.np", 443));
            
            // Print enabled cipher suites
            System.out.println("Enabled Cipher Suites: ");
            for (String cipherSuite : secureSocket.getEnabledCipherSuites()) {
                System.out.println(cipherSuite);
            }
            
            // Print supported cipher suites
            System.out.println("\nSupported Cipher Suites: ");
            for (String cipherSuite : secureSocket.getSupportedCipherSuites()) {
                System.out.println(cipherSuite);
            }
            
            // Close the socket
            secureSocket.close();
            
        } catch (Exception e) {
            // Handle exceptions
            e.printStackTrace();
        }
    }
}
