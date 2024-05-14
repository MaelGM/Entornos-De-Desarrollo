import java.util.ArrayList;

public class Address_Book {
    private int code;
    private ArrayList<Person> persons;

    public Address_Book(int code, ArrayList<Person> persons) {
        this.code = code;
        this.persons = persons;
    }

    public Address_Book(int code) {
        this.code = code;
        this.persons = new ArrayList<>();
    }
}
