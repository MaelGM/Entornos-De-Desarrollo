import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordVerify {
    private static final String errorLenght = "La contrasenya ha de tenir almenys 8 caràcters";
    private static final String errorNumber = "La contrasenya ha de contenir almenys 2 números";
    private static final String errorUpperCase = "La contrasenya ha de contenir almenys una lletra majúscula";
    private static final String errorSpecialCaracter = "La contrasenya ha de contenir almenys un caràcter especial";

    public static EsContrasenyaCorrecta verify(String password) {
        List<String> mensajes = new ArrayList<>();
        if (password.length() < 8) mensajes.add(errorLenght);
        if (!Pattern.compile(".*[0-9].*[0-9].*").matcher(password).matches()) mensajes.add(errorNumber);
        if (!contieneX("[A-Z]",password)) mensajes.add(errorUpperCase);
        if (!contieneX("[^A-Za-z0-9]", password)) mensajes.add(errorSpecialCaracter);

        return new EsContrasenyaCorrecta(mensajes.isEmpty(), printErrors(mensajes));
    }

    private static String printErrors(List<String> errores){
        String cad = "";
        for (int i = 0; i < errores.size(); i++) {
            if (i != errores.size() -1) cad += errores.get(i) + "\n";
            else cad += errores.get(i);
        }
        return cad;
    }

    private static boolean contieneX(String X, String password){
        Pattern pattern = Pattern.compile(X);
        Matcher matcher = pattern.matcher(password);
        return matcher.find();
    }
}
