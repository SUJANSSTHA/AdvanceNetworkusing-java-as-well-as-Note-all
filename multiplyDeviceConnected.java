import java.net.*;

public class multiplyDeviceConnected {
    public static void main(String[] args) {
        try {
            // Creating a URL object for the specified URL
            URL obj = new URL("https://namunacollege.edu.np/");

            // Printing the protocol of the URL (e.g., https)
            System.out.println("Protocol: " + obj.getProtocol());

            // Printing the host name of the URL (e.g., namunacollege.edu.np)
            System.out.println("Host: " + obj.getHost());

            // Printing the file part of the URL (e.g., / if root, or /index.html, etc.)
            System.out.println("File: " + obj.getFile());
        } catch (MalformedURLException e) {
            // Handle the exception (print an error message, log it, etc.)
            System.err.println("Malformed URL: " + e.getMessage());
            e.printStackTrace(); // This prints the stack trace for debugging purposes
        }
    }
}
