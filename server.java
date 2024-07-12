import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(4999);
        Socket cs = ss.accept();
        System.out.println("client connected");
        InputStreamReader in = new InputStreamReader(cs.getInputStream());
        BufferedReader bf = new BufferedReader(in);
        String str = bf.readLine();
        System.out.println("From Client" + str);
        PrintWriter outs = new PrintWriter(cs.getOutputStream());
        outs.println("how can I help u ?");
        outs.flush();
        outs.close();
        in.close();
        ss.close();
        cs.close();
    }
}
