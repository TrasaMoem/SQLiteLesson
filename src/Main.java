import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
            Main.open();
//            Main.insert();
        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println(counter + ". Please enter cat type: ");
            String type = sc.next();
            sc.nextLine();
            Main.insert_type(type);
        }
//            Main.select();
            Main.close();
    }
    static Connection co;
    static int counter = 1;
    static void open() {
        try {
            Class.forName("org.sqlite.JDBC");
            co = DriverManager.getConnection("jdbc:sqlite:My_cats.db");
            System.out.println("Connected");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    static void insert_type(String type) {
        try {
            String query = "INSERT INTO types (id, type) VALUES ('" + counter + "', '" + type + "')";
            Statement state = co.createStatement();
            state.executeUpdate(query);
            System.out.println("Row added");
            state.close();
            counter++;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    static void select() {
        try {
//            Statement statement = co.createStatement();
//            String query = "SELECT name, phone FROM users ORDER BY name";
//            ResultSet rs = statement.executeQuery (query);
//            while(rs.next()) {
//                String name = rs.getString("name");
//                long phone = rs.getLong("phone");
//                System.out.println("Name: " + name + ", Phone number: " + phone);
//            }
//            rs.close();
//            statement.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    static void insert() {
        try {
//            Scanner scan = new Scanner(System.in);
//            System.out.println("ENTER USER NAME PLEASE: ");
//            String name = scan.nextLine();
//            System.out.println("ENTER NUMBER OF THE PHONE: ");
//            String phone = scan.nextLine();
//            String query = "INSERT INTO users (name, phone) " +
//                    "VALUES ('" + name + "', '" + phone + "') ";
//            Statement statement = co.createStatement();
//            statement.executeUpdate(query);
//            System.out.println("Rows added");
//            statement.close();
            String query = "CREATE TABLE types (id int, type verchar(100));";
            Statement state = co.createStatement();
            state.executeUpdate(query);
            System.out.println("Rows added");
            state.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    static void close() throws SQLException {
        co.close();
    }
}