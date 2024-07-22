package networkProgarmming;

// * Check the two url is same or not ?
//* are http://www.ibiblio.org and http://www.metalab.unc.edu the same ?
import java.net.*;

public class test {
    public static void main(String[] args) {
        try {
            URL ibiblio = new URL("http://www.ibiblio.org/");
            URL metalab = new URL("http://metalab.unc.edu/");
            if (ibiblio.equals(metalab)) {
                System.out.println(ibiblio + "is the same as " + metalab);
            } else {
                System.out.println(ibiblio + "is not the same as " + metalab);
            }
        } catch (MalformedURLException ex) {
            System.err.println(ex);
            // TODO: handle exception

        }
    }
}
