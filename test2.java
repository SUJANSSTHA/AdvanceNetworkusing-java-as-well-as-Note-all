import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class test2 {
    public static void main(String[] args) throws UnknownHostException {
        String url = "www.tufohss.edu.np";
        byte addr[] = { 127, 0, 0, 1 };
        InetAddress ip1 = Inet4Address.getByName(url); // [110, 34, 19, -64]
        InetAddress ip2 = InetAddress.getByAddress(addr); // 110.34.19.192

        // getAddress() method
        System.out.println("Address : " + Arrays.toString(ip1.getAddress())); // Address : [110, 34,19, -64]

        // equals() method
        System.out.println("ip1 == ip2 : " + ip1.equals(ip2)); // ip1 == ip2 : false
    }

}
