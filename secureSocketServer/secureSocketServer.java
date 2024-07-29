import java.io.IOException;
import java.net.ServerSocket;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLSocket;

public class secureSocketServer {
    public static void main(String[] args) {
        try {
            SSLServerSocketFactory sslServerSocketFactory = (SSLServerSocketFactory) SSLServerSocketFactory.getDefault();
            SSLServerSocket sslServerSocket = (SSLServerSocket) sslServerSocketFactory.createServerSocket(1422);
            
            System.out.println("Server started. Waiting for client connection...");

            SSLSocket sslSocket = (SSLSocket) sslServerSocket.accept();
            System.out.println("Client accepted and connected: " + sslSocket);

            sslSocket.close();
            sslServerSocket.close();
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
