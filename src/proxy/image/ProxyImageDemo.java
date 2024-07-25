package proxy.image;

public class ProxyImageDemo {
    public static void main(String[] args) {
        Image image = new proxyImage("image.jpg");
        // Image will be loaded from disk only when display() is called
        image.display();
        // Image will not be loaded again, as it has been cached in the Proxy
        image.display();
    }
}
