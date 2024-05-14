package calculadora;

public class OperacionesTDD {
    public static int suma(String s) {
        int suma = 0;
        if (s.equals("")) return suma;
        if (s.charAt(s.length()-1) == ',') return -1;
        if (s.contains("-")) {
            System.out.println("Número negativo no permitido");
            return -1;
        }

        for (String n: s.split(",")) {
            if (Integer.parseInt(n) <= 1000) suma += Integer.parseInt(n);
            else System.out.println("Número superior a 1000 ignorado");
        }
        return suma;
    }
}
