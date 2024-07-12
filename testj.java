// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.net.*;
// // import java.*;
// public class testj {
//     public static void main(String[] args) throws Exception{
//         URL url = new URL("https://namunacollege.edu.np/about-us/");
// BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
// String line;
// while((line = br.readLine())!=null){
//     System.out.println(line);
// }

//     }
// }

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.io.IOException;

public class testj {
    public static void main(String[] args) {
        try {
            // Create a URL object with the desired web page URL
            URL url = new URL("https://namunacollege.edu.np/about-us/");

            // Open a stream to the URL and create a BufferedReader to read the input stream
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));

            String line;
            // Read each line from the BufferedReader and print it
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            // Close the BufferedReader
            br.close();
        } catch (IOException e) {
            // Handle exceptions
            System.out.println("Error fetching the content: " + e.getMessage());
        }
    }
}
