package utils;
import java.util.regex.Pattern;

public class verifyPasswordFormat {
    
    public static boolean isValidFormat(String password) {
    // Verificar longitud mínima
    if (password.length() < 8) {
        return false;
    }

    // Verificar mayúsculas, minúsculas y caracteres especiales
    String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[@#$%^&+=])(?!.*\\s).*$";

    // Compilar la regex en un patrón
    Pattern pattern = Pattern.compile(regex);

    // Verificar si la contraseña coincide con el patrón
    return pattern.matcher(password).matches();
}
}
