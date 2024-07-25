import java.net.*;
public class hostName {
    public static void main(String[] args) {
        InetAddress ia;
        try {
            ia = InetAddress.getByName("104.21.79.8");
            System.out.println(ia.getCanonicalHostName());
        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
}
