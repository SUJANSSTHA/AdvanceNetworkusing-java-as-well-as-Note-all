import java.io.*;
import java.net.*;

public class ArbitraryHederFieldDemo {

    public static void main(String[] args) {
        String url = "https://www.tufohss.edu.np/";
        try{
            URL u = new URL(url);
            HttpURLConnection huc = (HttpURLConnection)u.openConnection();
            for(int i = 1; i<=8;i++){
                String header = huc.getHeaderField(i);
                if(header==null)break;
                System.out.println(huc.getHeaderField(i)+":"+header);
            }
        }catch(MalformedURLException ex){
            System.err.println(url+"is not a URL I understand");
        }catch(IOException ex){
            System.err.println(ex);
        }
    }
}
