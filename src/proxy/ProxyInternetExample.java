package proxy;

interface OfficeInternetAccess {
    public void grantInternetAccess();
}

class RealInternetAccess implements OfficeInternetAccess {
    private String userName;

    public RealInternetAccess(String userName) {
        this.userName = userName;
    }

    @Override
    public void grantInternetAccess() {
        System.out.println("Internet Access Granted for user " + userName);
    }
}

class ProxyInternetAccess implements OfficeInternetAccess {
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

public class ProxyInternetExample {
    public static void main(String[] args) {
        ProxyInternetAccess access = new ProxyInternetAccess("Amr");
        access.grantInternetAccess();
    }
}
