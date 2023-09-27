import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
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
        int counter1 = 0;
            while(counter1<types.length) {
                try {
                    String query = "INSERT INTO types (id, type) VALUES ('" + (counter1+1) + "', '"
                            + types[counter1] + "')";
                    Statement state = co.createStatement();
                    state.executeUpdate(query);
                    state.close();
                    counter1++;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    counter1++;
                }

            }
        Main.close();
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