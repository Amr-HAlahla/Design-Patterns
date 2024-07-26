package proxy.database;

public class RealDatabase implements Database {

    @Override
    public void executeQuery(String query) {
        System.out.println("Executing query " + query);
    }
}
