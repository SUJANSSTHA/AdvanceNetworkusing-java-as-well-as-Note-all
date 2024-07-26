There you Find all the Advance Java Note.
**Testing Reachability**
==>  The InetAddress class has two isReachable() methods that test whether a particular node is reachability form the current hsot (i.e., whether a network connection can be made).

-->Connections can be blocked for many reasons, including firewalls, proxy servers, misbehaving routers, and broken cables, or simply because the remote host is not turned on when you try to connect.

-->public boolean isReachable(int timeout) throus IOExecuption
-->public boolean isReachable(NetworkInterface interface, int ttl, int timeout)throws IOExeception


--> The two testing reachability methods attempt to sue traceroute(more specifically, ICMP echo requests) to find out if the specified address is reachable.
--> If the host responds within tiemout milliseconds, the methods return true; otherwise, they return false. an IOExeception will be thown if there's a network error. The second variant also lets you specify the local network interface the cocnnection is made form adn the "time-to-live(the maximum number of network hpps the connection will attempt before being discarded). 


#Socket Options
Socket options specify how the native sockets on which the serverSocket class relies send and reseive data.

For server sockets, Java supports three options:
- SO_TIMEOUT
- SO_RESUSEADDE
- SO_RCBUF

It also allows you to set performance preferences for the socket's packets.

SO_TIMEOUT
SO_TIME IS THE AMOUTN OF TIME, IN milliseconds, that accept() waits for an incoming connection before throwing a java.io..InterruptedIOException.

NOTE: if SO_TIMEOUT is 0, accept() will never time out. The default is to never time out.



SO_RESUSEADDE


iT DETERMINES whether a new socket will be allowed to bind to a previously used port while there might still be data traversing the network addressed to the old socket.

As you probibly expect, there are two methods to get and set this option:

public boolean getReuseAddress()thorws SocketExecption
public void setReuseAddress(boolean on )throws SocketExecption.


------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

IMPORTANT FOR MCQ
SECURE SOCKET PACKAGE
1. JAVAX.NET.SSL
2. JAVA.NET
3. JAVA.SECURITY.CERT
4. CON.SUN.NET.SSL


-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
The SSLServerSocket class has the same three methods for determining which cipher suites are supported and enabled as SSLSocket does :

(a) public abstract String[] getSupportedCipherSuites() 
- tells which combination of algorithms is available on a given socket
(b) public abstract String[] getEnabledCipherSuites()
   - tells which suites this socket is willing to use
(c) public abstract void setEnabled CipherSuites (String[] suites)
      - change the suites the client attempts to use
   
