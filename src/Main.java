import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Main.open();
//            Main.insert();
//        for (int i = 0; i < 3; i++) {
//            Scanner sc = new Scanner(System.in);
//            System.out.println(counter + ". Please enter cat type: ");
//            String type = sc.next();
//            sc.nextLine();
//            Main.insert_type(type);
//        }
//            Main.select();
//        Statement state1 = co.createStatement();
//        String query1 = "SELECT count() FROM types";
//        ResultSet rs = state1.executeQuery(query1);
//        int counterByQuery = rs.getInt("count()");
//        int counterInt = 0;
//            while(counterInt<types.length) {
//                try {
//                    String query = "INSERT INTO types (id, type) VALUES ('" + (counterByQuery+1) + "', '"
//                            + types[counterInt] + "')";
//                    Statement state = co.createStatement();
//                    state.executeUpdate(query);
//                    state.close();
//                    counterInt++; counterByQuery++;
//                } catch (Exception e) {
//                    System.out.println(e.getMessage());
//                    counterInt++; counterByQuery++;
//                }
//            }
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter id to delete: ");
        int idDelete = scan.nextInt();
//        deleteType(idDelete);
        System.out.println("Enter id to update: ");
        int id1 = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter new type: ");
        String newType = scan.next();
        updateType(id1,newType);
    }
    static Connection co;
    static int counter = 1;

    static String[] types = new String[] {"Абиссинская кошка",
            "Австралийский мист",
            "Американская жесткошерстная",
            "Американская короткошерстная",
            "Американский бобтейл",
            "Американский кёрл",
            "Балинезийская кошка",
            "Бенгальская кошка",
            "Бирманская кошка",
            "Бомбейская кошка",
            "Бразильская короткошёрстная",
            "Британская длинношерстная",
            "Британская короткошерстная",
            "Бурманская кошка",
            "Бурмилла кошка",
            "Гавана",
            "Гималайская кошка",
            "Девон-рекс",
            "Донской сфинкс",
            "Европейская короткошерстная",
            "Египетская мау",
            "Канадский сфинкс",
            "Кимрик",
            "Корат",
            "Корниш-рекс",
            "Курильский бобтейл",
            "Лаперм",
            "Манчкин",
            "Мейн-ку́н",
            "Меконгский бобтейл",
            "Мэнкс кошка",
            "Наполеон",
            "Немецкий рекс",
            "Нибелунг",
            "Норвежская лесная кошка",
            "Ориентальная кошка",
            "Оцикет",
            "Персидская кошка",
            "Петерболд",
            "Пиксибоб",
            "Рагамаффин",
            "Русская голубая кошка",
            "Рэгдолл",
            "Саванна",
            "Селкирк-рекс",
            "Сиамская кошка",
            "Сибирская кошка",
            "Сингапурская кошка",
            "Скоттиш-фолд",
            "Сноу-шу",
            "Сомалийская кошка",
            "Тайская кошка",
            "Тойгер",
            "Тонкинская кошка",
            "Турецкая ангорская кошка",
            "Турецкий ван",
            "Украинский левкой",
            "Чаузи",
            "Шартрез",
            "Экзотическая короткошерстная",
            "Японский бобтейл"
    };
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
    static void deleteType(int id) {
        try {
            String query2 = "DELETE FROM types WHERE id = " + id;
            Statement st2 = co.createStatement();
            st2.executeUpdate(query2);
            System.out.println("Type " + id + " has been deleted");
            Main.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    static void updateType(int id, String newType) {
        try {
            String query3 = "UPDATE types SET type = '"+newType+"' WHERE id = '"+id+"'";
            Statement state3 = co.createStatement();
            state3.executeUpdate(query3);
            System.out.println("Id " + id + " was updated, new type is: " + newType);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    static void select() {
//        try {
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
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
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