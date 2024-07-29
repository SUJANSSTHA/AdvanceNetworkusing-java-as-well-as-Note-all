import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
    public static void main(String[] args) throws IOException {
        try {
            // Register service on port 4999
        ServerSocket ss = new ServerSocket(4999);
        //Wait and accept a connection
        Socket cs = ss.accept();
        System.out.println("Clent Connected");;

        //Get a communication stram associated with the soket
        InputStreamReader in = new InputStreamReader(cs.getInputStream());
        BufferedReader bf = new BufferedReader(in);
        //Perform I/O
        String str = bf.readLine();
        System.out.println("From Client:"+str);

        PrintWriter outs = new PrintWriter(cs.getOutputStream());
        outs.println("How can I help you?");
        outs.flush();

        //Close strams and connection
        outs.close();
        in.close();
        cs.close();
        ss.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.err.println(e);
        }

    }
    
}
