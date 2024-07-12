import java.net.*;
import java.util.*;

public class CookieExample {
    public static void main(String[] args) throws Exception {
        CookieManager cookieManager = new CookieManager();
        CookieStore cookieStore = cookieManager.getCookieStore();
        // create cookies and URL
        HttpCookie cookieA = new HttpCookie("c1", "RAm");
        HttpCookie cookieB = new HttpCookie("c2", "Sita");
        HttpCookie cookieC = new HttpCookie("c3", "Hari");

        URI uri1 = URI.create("http://test1.com");
        URI uri2 = URI.create("http://test2.com");
        cookieStore.add(uri1, cookieA);
        cookieStore.add(uri2, cookieB);
        cookieStore.add(null, cookieC);
        // Read store all cookies
        List cookieList = cookieStore.getCookies();
        System.out.println("Cookie list in CookieStore:" + cookieList + "\n");
        // remove cookie of uri
        cookieStore.remove(uri2, cookieA);
        List remainingCookList = cookieStore.getCookies();
        System.out.println("Remaining Cookies:" + remainingCookList + "\n");
        // ! Remove all cookies
        cookieStore.removeAll();
        List EmptyCookieList = cookieStore.getCookies();
        System.out.println("Empty CookieStore:" + EmptyCookieList);
    }
}
