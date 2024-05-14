package es.iesmz.ed.algoritmes;

/**
 * Esta clase es usada para comprobar si todos los dígitos de un número son par.
 *
 * @version 1.0
 * @author Mael Grandguillot
 */
public class Hyperpar {
    private final long num;

    /**
     * Constructor de la clase Hyperpar.
     *
     * @param num Numero a comprobar
     */
    public Hyperpar(long num) {
        this.num = num;
    }

    /**
     * Método que comprueba si el número es Hyperpar,<br> fragmentándolo y comprobando digito por digito
     *
     * @return Devuelve 'true' en caso de que si lo sea, y false en el contrario.
     */
    public boolean esHyperPar(){
        boolean isHyperPar = true;
        char[] numbers = String.valueOf(num).toCharArray();
        for (char number : numbers) {
            if (Integer.parseInt(String.valueOf(number)) % 2 != 0) isHyperPar = false;
        }

        return isHyperPar;
    }
}