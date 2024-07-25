package proxy.internet;

public class ProxyInternetDemo {
    public static void main(String[] args) {
        OfficeInternetAccess access = new ProxyInternetAccess("Amr");
        access.grantInternetAccess();
    }
}
