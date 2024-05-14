import es.iesmz.prueba.Coche;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    static Coche c1 = new Coche("Fiat","Panda","Negro");

    public static void main(String[] args) {
        int menu;
        System.out.println(menu());

        do {
            System.out.println("\n-----------------------------------------------------------------------");
            System.out.print("\nQue quieres hacer?: ");
            menu = validaInt();
            switch (menu) {
                case 1 -> c1.imprime();
                case 2 -> c1.pinta();
                case 3 -> setMarca();
                case 4 -> setModelo();
                case 5 -> setColor();
                case 6 -> acelerar();
                case 7 -> frenar();
                case 8 -> System.out.println(menu());
                case 9 -> c1.para();
                case 10 -> System.out.println("Has salido del vehiculo");
                default -> System.out.println("Accion inexistente");
            }
        }while(menu != 10);
    }

    public static void setMarca(){
        System.out.print("Que marca quieres?: ");
        String marca = sc.next();
        c1.setMarca(marca);
    }

    public static void setModelo(){
        System.out.print("Que modelo deseas?: ");
        String modelo = sc.next();
        c1.setModelo(modelo);
    }

    public static void setColor(){
        System.out.print("De que color quieres el coche?: ");
        String color = sc.next();
        c1.setColor(color);
    }

    public static void acelerar(){
        System.out.print("Cuanto quieres acelerar(km/h)?: ");
        int acelerar = sc.nextInt();
        c1.acelera(acelerar);
    }

    public static void frenar(){
        System.out.print("Cuanto quieres frenar(km/h)?: ");
        int frenar = sc.nextInt();
        c1.frena(frenar);
    }

    // Menu
    private static String menu() {
        return """
                --------------------UNIDAD 2--------------
                --------------------TASCA 4--------------------
                1: Imprimir dades del cotxe
                2: Pintar el cotxe
                3: Establir Marca (demanant per teclat)
                4: Establir Model (demanant per teclat)
                5: Establir Color (demanant per teclat)
                6: Accelear (Demanant la velocitat per teclat)
                7: Frenar (Demanant la velocitat per teclat)
                8: Menu
                9: Parar
                10: Salir del vehiculo""";
    }


    // Función para comprobar que sea un numero entero
    public static int validaInt() {
        int num;
        while (!sc.hasNextInt()) {
            System.out.println("Eso no es un numero!");
            sc.next(); // IMPORTANTE!
        }
        num = sc.nextInt();
        return num;
    }
}


