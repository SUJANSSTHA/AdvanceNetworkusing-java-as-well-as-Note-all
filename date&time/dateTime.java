import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class dateTime{
public static void main(String[] args) {
    // System.out.println();
    int port = 8010;
    try(ServerSocket serverSocket = new ServerSocket(port)){
        System.out.println("Server is listening on port"+ port);
        while (true) {
            Socket socket = serverSocket.accept();
            System.out.println("New client connected");
            ClientHandle clienthandle = new ClientHandle(socket);
            Thread thread = new Thread(clienthandle);
            thread.start();

        }
    }catch(IOException ex){
        System.out.println("Server exception:": ex.getMessage());
        ex.printStackTrace();
    }
}    
}
/**
 *  ClientHandle
 */
public class  ClientHandle Runnable{
    
}