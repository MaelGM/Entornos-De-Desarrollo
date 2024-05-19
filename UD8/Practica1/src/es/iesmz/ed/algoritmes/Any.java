package es.iesmz.ed.algoritmes;

import java.util.ArrayList;
/**
 * Esta clase es usada para comprobar la cantidad de digitos repetidos en un número (año).
 *
 * @version 1.0
 * @author Mael Grandguillot
 */
public class Any {
    private final long any;

    /**
     * Constructor de la clase Any, al cual le pasamos el número que comprobaremos.
     *
     * @param number Numero (año) a comprobar
     */
    public Any(long number) {
        this.any = number;
    }

    /**
     * Método encargado de contar la cantidad de dígitos diferentes que tiene un número (año), recorriéndolo digito por
     * dígito y almacenándolo en caso de que este dígito no se haya almacenado ya.
     *
     * @return Devolvemos la cantidad de dígitos diferentes del número que tenemos registrado.
     */
    public int digitsDiferents() {
        String strAny = String.valueOf(any);
        ArrayList<Character> digitos = new ArrayList<>();
        for (int i = 0; i < strAny.length(); i++) {
            if (!digitos.contains(strAny.charAt(i))) digitos.add(strAny.charAt(i));
        }

        return digitos.size();
    }
}
