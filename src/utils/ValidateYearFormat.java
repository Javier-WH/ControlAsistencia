
package utils;



public class ValidateYearFormat {
    
    public static boolean isValidYear(String year) {
    // Verificar si el año tiene 4 dígitos
    if (year.length() != 4) {
        return false;
    }

    try {
        // Intentar convertir el año a un número entero
        int numericYear = Integer.parseInt(year);

        // Verificar si el año está dentro del rango válido (por ejemplo, 1900-2100)
        if (numericYear >= 1900 && numericYear <= 2100) {
            return true;
        }
    } catch (NumberFormatException e) {
        return false;
    }

    return false;
}
    
    
    
}
