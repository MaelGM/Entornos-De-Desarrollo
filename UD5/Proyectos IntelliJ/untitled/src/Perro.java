public class Perro implements Animal{
    @Override
    public void hacerSonido() {
        System.out.println("Guau");
    }
    @Override
    public void moverse() {
        System.out.println("El perro se ha movido 3 metros");
    }
}
