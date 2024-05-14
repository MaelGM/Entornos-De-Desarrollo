public class Divisible3 {
    private static final int[] divisibles = {3,6,9};

    public static String revisarDivision(int num){
        String respuesta = "NO";

        //if (getSumaNumeros(crearNumero(num)) % 3 == 0) respuesta = "SI";
        if (isDivisible(getSumaNumeros(crearNumero(num)))) respuesta = "SI";
        return respuesta;
    }

    private static boolean isDivisible(int num){
        if (num == 3 || num == 6 || num == 9) return true;
        else return false;
    }

    private static String crearNumero(int num){
        String cadenaCompleta = "";
        for (int i = 1; i <= num; i++) {
            cadenaCompleta += String.valueOf(i);
        }
        return cadenaCompleta;
    }

    private static int getSumaNumeros(String cadenaCompleta){
        int suma = 0;
        for (int i = 0; i < cadenaCompleta.length(); i++) {
            suma += Integer.parseInt(String.valueOf(cadenaCompleta.charAt(i)));
        }
        if (suma >= 10) return getSumaNumeros(String.valueOf(suma));
        return suma;
    }
}
