import java.io.*;
import java.net.*;

public class ChatClient {
    public static void main(String[] args) throws Exception {
        try {
            Socket cs = new Socket("localhost", 49999);
            PrintWriter outs = new PrintWriter(cs.getOutputStream());
            outs.println("I want a location of your institution !!");

            InputStreamReader in = new InputStreamReader(cs.getInputStream());

            BufferedReader brr = new BufferedReader(in);
            String str = brr.readLine();
            System.out.println("From Server:" + str);
            outs.close();
            in.close();
            brr.close();
        } catch (Exception e) {
            System.err.println(e);
            // TODO: handle exception
        }
    }
}
