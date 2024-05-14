public class Zapping {
    private static final int MAX_CANAL = 99;
    private static final int MIN_CANAL = 1;
    private static final int MAX_DISTANCIA_DE_CANAL = 50;


    public static int cambiarCanal(int origen, int destino) {
        int numClic = Math.abs(origen - destino);
        if (!isValido(origen) || !isValido(destino)) return -1;
        if (origen == destino) return 0;

        if (numClic >= MAX_DISTANCIA_DE_CANAL){
            if (destino > origen)
                numClic = calcularCanales(origen, destino);
            else
                numClic = calcularCanales(destino, origen);
        }
        return numClic;
    }

    private static int calcularCanales(int canal1, int canal2){
        return (MAX_CANAL+canal1) - canal2;
    }

    private static boolean isValido(int canal){
        if (canal >= MIN_CANAL && canal <= MAX_CANAL) return true;
        else return false;
    }
}
