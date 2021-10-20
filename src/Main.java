import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String[] cities = {
                "Moscow",
                "Tokyo",
                "Basel",
                "Berlin",
                "Cairo",
                "London",
                "New York",
                "Madrid",
                "Liverpool",
                "Milan",
                "Rotterdam",
                "Chicago",
                "Moscow",
                "Sevastopol",
                "Paris",
                "Beijing",
                "Tokyo",
                "Odessa",
                "Minsk",
                "Mexico"
        };

        HashMap<String, Integer> table = new HashMap<>();
        for (String x : cities) {
            table.put(x, table.getOrDefault(x,0)+1);
        }
        System.out.println(table);

        PhoneBook book = new PhoneBook();
        book.addContact("Andrei", "352354831");
        book.addContact("Dima","831230654");
        book.addContact("Rita","064353888");
        book.addContact("Lena","777392499");
        book.addContact("Egor","542097561");
        book.addContact("Sveta","113543788");
        book.addContact("Andrei","934523999");
        book.addContact("Lena","845388501");
        book.getContact("Andrei");
        book.getContact("Lena");
        book.getContact("Egor");
        book.getContact("Rita");
    }
}