package single.ton;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCSingletonDemo {
    static int count = 1;
    static int choice;

    public static void main(String[] args) throws IOException {
        JDBCSingleton jdbc = JDBCSingleton.getInstance();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        do {
            System.out.println("DATABASE OPERATIONS");
            System.out.println(" --------------------- ");
            System.out.println(" 1. Insertion ");
            System.out.println(" 2. View      ");
            System.out.println(" 3. Delete    ");
            System.out.println(" 4. Update    ");
            System.out.println(" 5. Exit      ");

            System.out.println("\nPlease Enter the choice what you want to perform in the database: ");
            choice = Integer.parseInt(br.readLine());

            switch (choice) {
                case 1: {
                    System.out.println("Enter the username you want to insert into the DB: ");
                    String username = br.readLine();
                    System.out.println("Enter the password for that user: ");
                    String password = br.readLine();
                    try {
                        int result = jdbc.insert(username, password);
                        if (result > 0) {
                            System.out.println("Insertion done !\n" + (count++) + " users has been inserted into the DB.");
                        } else {
                            System.out.println("Insertion failed!");
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    System.out.println("Please enter any key to continue ..");
                    System.in.read();
                }
                break;
                case 2: {
                    System.out.println("Enter the user name: ");
                    String username = br.readLine();

                    try {
                        jdbc.view(username);

                    } catch (SQLException e) {
                        System.out.println(e.getMessage());
                    }
                    System.out.println("Please enter any key to continue ..");
                    System.in.read();
                }
                break;
                case 3: {
                    System.out.println("Enter the user id you want to delete: ");
                    int userid = Integer.parseInt(br.readLine());

                    try {
                        int result = jdbc.delete(userid);
                        if (result > 0) {
                            System.out.println("User has been deleted successfully!");
                        } else {
                            System.out.println("Deletion failed!");
                        }
                    } catch (SQLException e) {
                        System.out.println(e.getMessage());
                    }
                    System.out.println("Please enter any key to continue ..");
                    System.in.read();
                }
                break;
                case 4: {
                    System.out.println("Enter username you want to update: ");
                    String username = br.readLine();
                    System.out.println("Enter the password of that user: ");
                    String password = br.readLine();

                    try {
                        int result = jdbc.update(username, password);
                        if (result > 0) {
                            System.out.println("Update done successfully!");
                        } else {
                            System.out.println("Update user failed!");
                        }
                    } catch (SQLException e) {
                        System.out.println(e.getMessage());
                    }
                    System.out.println("Please enter any key to continue ..");
                    System.in.read();
                }
                break;
                default: {
                    System.out.println("Invalid Option!");
                    return;
                }
            }
        } while (choice != 5);
    }
}
