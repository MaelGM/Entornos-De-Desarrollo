public class Main {
    public static void main(String[] args) {
        MZFecha F1 = new MZFecha();
        F1.setFecha(1,1,2000);
        F1.imprime();

        // Si es bisiesto
        if(F1.esBisiesto(2000)){
            System.out.println("ES BISIESTO");
        }else{
            System.out.println("NO ES BISIESTO");
        }

        // 2000-1970 = 30 --> 30*365 + 1 = 10951
        System.out.println("Dias desde el 1970 de la fecha 1: "+F1.diasdesdeInicio());

        System.out.println();

        MZFecha F2 = new MZFecha();
        F2.setFecha(1,1,2100);
        F2.imprime();

        // No es bisiesto
        if(F1.esBisiesto(2100)){
            System.out.println("ES BISIESTO");
        }else{
            System.out.println("NO ES BISIESTO");
        }

        // 2100 - 1970 = 130 ---> 130*365 + 1 = 47451
        System.out.println("Dias desde el 1970 de la fecha 2:"+F2.diasdesdeInicio());

        // 365 * 100 = 36500
        System.out.println("Diferencia de dias entre el 1/1/2000 y el 1/1/2100: "+F1.diferenciaDias(F2));
    }
}
