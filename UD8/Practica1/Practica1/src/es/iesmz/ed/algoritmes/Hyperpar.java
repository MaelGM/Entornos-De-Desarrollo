package es.iesmz.ed.algoritmes;

public class Hyperpar {
    private final long num;

    public Hyperpar(long num) {
        this.num = num;
    }

    public boolean esHyperPar(){
        boolean isHyperPar = true;
        char[] numbers = String.valueOf(num).toCharArray();
        for (char number : numbers) {
            if (Integer.parseInt(String.valueOf(number)) % 2 != 0) isHyperPar = false;
        }

        return isHyperPar;
    }
}