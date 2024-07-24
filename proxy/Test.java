package proxy;

public class Test {
    public static void main(String[] args) {
        ProxyImage proxyImage=new ProxyImage("proxy.png");

        // Image will be loaded from disk only when display() is called    
        proxyImage.display();

        // Image will not be loaded again, as it has been cached in the Proxy
        proxyImage.display();
    }
}
