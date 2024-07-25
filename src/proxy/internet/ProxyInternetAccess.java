package proxy.internet;

public class ProxyInternetAccess implements OfficeInternetAccess {
    private String userName;
    private RealInternetAccess realInternetAccess;

    public ProxyInternetAccess(String userName) {
        this.userName = userName;
    }

    @Override
    public void grantInternetAccess() {
        if (getUserRank(userName) >= 5) {
            if (realInternetAccess == null) {
                realInternetAccess = new RealInternetAccess(userName);
            }
            realInternetAccess.grantInternetAccess();
        } else {
            System.out.println("No internet access granted.");
        }
    }

    public int getUserRank(String userName) {
        // get the rank from the database for the user with that name!.
        int sum = 0;
        // Sum the ASCII values of each character in the userName
        for (char c : userName.toCharArray()) {
            sum += (int) c;
        }

        // Return the sum modulo 10
        return sum % 10;
    }
}
