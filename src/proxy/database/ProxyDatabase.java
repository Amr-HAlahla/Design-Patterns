package proxy.database;

public class ProxyDatabase implements Database {
    private RealDatabase realDatabase;

    public ProxyDatabase() {
        this.realDatabase = new RealDatabase();
    }

    @Override
    public void executeQuery(String query) {
        realDatabase.executeQuery(query);
    }
}
