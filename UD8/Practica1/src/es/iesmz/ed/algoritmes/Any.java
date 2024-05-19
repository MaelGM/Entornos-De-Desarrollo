package es.iesmz.ed.algoritmes;

import java.util.ArrayList;

public class Any {
    private final long number;
    
    public Any(long number) {
        this.number = number;
    }

    public int digitsDiferents() {
        String strNumber = String.valueOf(number);
        ArrayList<Character> digitos = new ArrayList<>();
        for (int i = 0; i < strNumber.length(); i++) {
            if (!digitos.contains(strNumber.charAt(i))) digitos.add(strNumber.charAt(i));
        }

        return digitos.size();
    }
}
