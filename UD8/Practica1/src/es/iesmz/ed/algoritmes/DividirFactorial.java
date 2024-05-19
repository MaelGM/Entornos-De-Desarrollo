package es.iesmz.ed.algoritmes;

/**
 * Clase con el proposito de dividir factoriales.
 *
 * @version 1.0
 * @author Mael Grandguillot
 */
public class DividirFactorial {
    private final int numerador;
    private final int denominador;
    /**
     * Constructor de la clase DividirFactorial, al cual se le pasan dos números, el numerador y el
     * denominador
     *
     * @param numerador Hace referencia al numerados
     * @param denominador Hace referencia al denominador
     */
    public DividirFactorial(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    /**
     * En esta clase se comprueban los valores del denominador y del numerador, y dependiendo de cuál
     * es mayor, se llama a la función del cálculo de una manera u otra. Además, si ambos son iguales,
     * nos ahorramos el cálculo y devolvemos 1, ya que sería la division de dos números iguales.
     *
     * @return Resultado de la division.
     */
    public float divisio() {
        if (numerador > denominador) return calcularFactorial(numerador, denominador);
        else if (numerador < denominador) return 1 / calcularFactorial(denominador, numerador);
        else return 1;
    }

    /**
     * Esta será la clase encargada de calcular el factorial de un número, pero solo a mitad. A
     * esta clase le pasamos dos números. Uno de los números será el número del que calcularemos
     * el factorial, y el otro, será el punto en el que nos tendremos que parar a la hora de
     * calcular el factorial. EJ: 7, 3 (7 * 6 * 5 * 4)
     *
     * @param num Número del que calcularemos el factorial
     * @param min Número que marca el final del bucle y del calculo.
     * @return Resultado del factorial del número con límite EJ: 7, 3 (7 * 6 * 5 * 4)
     */
    private float calcularFactorial(int num, int min) {
        float res = 1;
        for (int i = num; i >= min+1; i--) {
            res *= i;
        }

        return res;
    }
}
