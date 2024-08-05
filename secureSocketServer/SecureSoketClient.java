import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.net.ssl.SSLSocketFactory;

public class SecureSoketClient {
    public static void main(String[] args) {
        try {
            Socket cs = ((SSLSocketFactory) SSLSocketFactory.getDefault()).createSocket("127.0.0.1", 1422);
            System.out.println("Server Connected: " + cs);

            PrintWriter outs = new PrintWriter(cs.getOutputStream());
            outs.println("I want your name.");
            outs.flush();

            // Get an input file handle from the socket and read the input
            InputStreamReader in = new InputStreamReader(cs.getInputStream());
            BufferedReader bf = new BufferedReader(in);

            // Perform IO
            String str = bf.readLine();
            System.out.println("From Server: " + str);

            in.close();
            outs.close();
            cs.close();

            cs.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
