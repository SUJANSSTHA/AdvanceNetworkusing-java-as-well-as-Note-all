import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample {
    public static void main(String[] args) {
        try {
            // Get the InetAddress for a domain name
            InetAddress address = InetAddress.getByName("https://namunacollege.edu.np/");
            System.out.println("Host Name: " + address.getHostName());
            System.out.println("IP Address: " + address.getHostAddress());

            // Get the InetAddress for the local host
            InetAddress localAddress = InetAddress.getLocalHost();
            System.out.println("Local Host Name: " + localAddress.getHostName());
            System.out.println("Local IP Address: " + localAddress.getHostAddress());

            // Check if the address is reachable
            if (address.isReachable(5000)) { // 5-second timeout
                System.out.println("The address is reachable.");
            } else {
                System.out.println("The address is not reachable.");
            }

            // Get all IP addresses for a domain
            InetAddress[] addresses = InetAddress.getAllByName("https://namunacollege.edu.np/");
            System.out.println("All IP Addresses for https://namunacollege.edu.np/:");
            for (InetAddress addr : addresses) {
                System.out.println(addr.getHostAddress());
            }
        } catch (UnknownHostException e) {
            System.out.println("Host not found: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
