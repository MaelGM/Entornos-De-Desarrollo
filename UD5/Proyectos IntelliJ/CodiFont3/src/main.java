import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Country spain = new Country(00001, "Espanya");

        State and = new State(00011, "Andalucia", spain);
        State gal = new State(00012, "Galicia", spain);
        State mad= new State(00013, "Madrid", spain);
        State mur = new State(00014, "Murcia", spain);

        Address d1 = new Address("c/Fondo", "Malaga", 29001, and);
        Address d2 = new Address("Plaza mayor", "Madrid", 29001, mad);

        Address_Book libDir = new Address_Book(101);

        Person eric = new Person("Eric", 645124782, "eric.direccion@gmail.com", libDir, d1);
        Person bruno = new Person("Bruno", 675892148, "bruno.direccion@gmail.com", libDir, d2);

        ArrayList<Person> listaPerson = new ArrayList<>();
        listaPerson.add(eric);

        Address d3 = new Address("c/Picasso", "Murcia", 29001, mur, bruno);
        Address d4 = new Address("Plaza Nueva", "Pontevedra", 29001, gal, eric);

        Address_Book libDir2 = new Address_Book(102, listaPerson);

        Person juan = new Person("Juan", 675835448, "juan.direccion@gmail.com", libDir2, d4);

        listaPerson.add(juan);
        listaPerson.add(bruno);
    }
}
