package proxy.internet;

public class RealInternetAccess implements OfficeInternetAccess {
    private String userName;

    public RealInternetAccess(String userName) {
        this.userName = userName;
    }

    @Override
    public void grantInternetAccess() {
        System.out.println("Internet Access Granted for user " + userName);
    }
}
