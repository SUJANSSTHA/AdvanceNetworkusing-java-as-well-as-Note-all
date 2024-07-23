import java.net.*;

public class adprint {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("namunacollege.edu.np");
            System.out.println("IP Address: " + address.getHostAddress());
        } catch (UnknownHostException e) {
            System.out.println("Could not find namunacollege.edu.np");
            e.printStackTrace();
        }
    }
}
