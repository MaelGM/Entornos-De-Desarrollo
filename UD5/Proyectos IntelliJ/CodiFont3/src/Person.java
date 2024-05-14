public class Person {
    private String name;
    private int phoneNumber;
    private String emailAdress;
    private Address_Book addressBook;
    private Address address;

    public Person(String name, int phoneNumber, String emailAdress, Address_Book addressBook, Address address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAdress = emailAdress;
        this.addressBook = addressBook;
        this.address = address;
    }

    public static void purchaseParkingPass(){
        // ToDo
    }
}
