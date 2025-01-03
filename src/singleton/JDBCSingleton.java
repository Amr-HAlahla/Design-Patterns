package singleton;

import java.sql.*;

class JDBCSingleton {
    private static JDBCSingleton jdbc;

    private JDBCSingleton() {
    }

    public static JDBCSingleton getInstance() {
        if (jdbc == null) {
            jdbc = new JDBCSingleton();
        }
        return jdbc;
    }

    private static Connection getConnection() throws ClassNotFoundException, SQLException {
        Connection connection = null;
        Class.forName("com.mysql.jdbc.Driver"); // load the JDBC Driver class at runtime into the JVM.
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/DB_Name", "userName", "Password");
        return connection;
    }

    public int insert(String name, String pass) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        int recordCounter = 0;
        try {
            c = getConnection();
            ps = c.prepareStatement("insert into userdata(uname, upassword)values (?, ?)");
            ps.setString(1, name);
            ps.setString(2, pass);
            recordCounter = ps.executeUpdate();
            /* executeUpdate: used for executing SQL statements that update the database. This includes:
             * INSERT, UPDATE, DELETE and DDL like `CREATE TABLE` & `ALTER TABLE`.
             * */
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ps != null)
                ps.close();
            if (c != null)
                c.close();
        }
        return recordCounter;
    }

    public void view(String name) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            c = getConnection();
            ps = c.prepareStatement("select * from userdata where uname=?");
            ps.setString(1, name);
            rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println("Name = " + rs.getString(2) + ", Password = " + rs.getString(3));
                /*
                 * 1- Columns of ResultSet are indexed starting from 1 not 0.
                 * 2- columns 2 & 3 chosen to get the name & pass, since the column 1 is reserved for the index (position in the table).
                 * Another syntax can be used :
                 * System.out.println("Name = " + rs.getString("uname") + ", Password = " + rs.getString("upassword"));
                 * */

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ps != null) {
                ps.close();
            }
            if (c != null) {
                c.close();
            }
        }
    }

    public int update(String name, String password) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        int recordCounter = 0;

        try {
            c = getConnection();
            ps = c.prepareStatement(" update userdata set upassword=? where uname='" + name + "' ");
            ps.setString(1, password);
            recordCounter = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ps != null) {
                ps.close();
            }
            if (c != null) {
                c.close();
            }
        }
        return recordCounter;
    }

    public int delete(int userid) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        int recordCounter = 0;
        try {
            c = getConnection();
            ps = c.prepareStatement("delete from userdata where uid='" + userid + "'");
            recordCounter = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ps != null) {
                ps.close();
            }
            if (c != null) {
                c.close();
            }
        }
        return recordCounter;
    }
}