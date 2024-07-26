package proxy.database;

public class DatabaseDemo {
    public static void main(String[] args) {
        Database database = new ProxyDatabase();
        database.executeQuery("SELECT * FROM users");
        database.executeQuery("UPDATE users SET name='Amr Halahla' WHERE id=1");
    }
}
