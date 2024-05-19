package es.iesmz.ed.algoritmes;

public class DividirFactorial {
    private final int numerador;
    private final int denominador;
    public DividirFactorial(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public float divisio() {
        if (numerador > denominador) return calcularFactorial(numerador, denominador);
        else if (numerador < denominador) return 1 / calcularFactorial(denominador, numerador);
        else return 1;
    }

    private float calcularFactorial(int max, int min) {
        float res = 1;
        for (int i = max; i >= min+1; i--) {
            res *= i;
        }

        return res;
    }
}
