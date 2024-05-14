import java.util.List;

public class Profesor extends Persona{
    private String nombre;
    private String numeroDeTelefono;
    private int edad;
    private List<Prestamo> prestamos;

    public Profesor(String numeroDeTelefono, String nombre, int edad, List<Prestamo> prestamos) {
        super(numeroDeTelefono);
        this.nombre = nombre;
        this.edad = edad;
        this.prestamos = prestamos;
    }

    public void printInformacionPersona1() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Teléfono: " + numeroDeTelefono);
    }

    public void printInformacionPrestamos() {
        prestamos.forEach(System.out::println);
    }

    public void printTodaLaInformacion() {
        printInformacionPersona1();
        printInformacionPrestamos();
    }
}
