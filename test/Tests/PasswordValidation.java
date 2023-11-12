package Tests;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Pattern;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import org.junit.Test;
import static org.junit.Assert.*;


public class PasswordValidation {
    String user = "Xaver";
    String password = "J@vier123456";
    String year = "2016";
    String mont = "2";
    int days = 29;
    
    @Test
    public void specialCharacterTest(){
       String errorMesage =  "La contraseña debe cuplir los siguientes requisitos: "
               + "1. debe tener al menos un caracter especial "
               + "2. debe tener al menos una mayuscula "
               + "3. debe tener al menos una mayuscula "
               + "4. debe tener al menos 8 caracteres de largo"
               + "5. no puede tener espacios";
       boolean response = utils.verifyPasswordFormat.isValidFormat(password);
        // Assert (Afirmar)
        assertTrue(errorMesage, response);
    }
    
    
    @Test
    public void ecriptTest(){
        String sercretKey = "pruebas";
        try {
            System.out.println("Clave: "+ password);
            String encripterPassword = libraries.Encript.encriptar(password, sercretKey);
            System.out.println("Clave encriptada: "+ encripterPassword);
            String unfoldPassword = libraries.Encript.desencriptar(encripterPassword, sercretKey);
            System.out.println("Clave des-encriptada: "+ unfoldPassword);
            // Assert (Afirmar)
            assertEquals(password, unfoldPassword);
            
        } catch (UnsupportedEncodingException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            
        }
   
    }
    
    @Test
    public void conectionStringTest(){
        String conectionString = env.Enviroment.getContectionString();
        String regex = "^(?=.*jdbc:mysql:)(?=.*useSSL=false)(?!.*jdbc:mysql:.*jdbc:mysql:)(?!.*useSSL=false.*useSSL=false).*$";
        Pattern pattern = Pattern.compile(regex);
 
        // Assert (Afirmar)
        assertTrue("La cadena de conexión es incorrecta ",pattern.matcher(conectionString).matches());
        System.out.println("Cadena de conexión: " + conectionString);
    }
    
    @Test
    public void daysOfMonth(){
        int daysOfMoth = libraries.CreateDaysOfMonth.crateDaysMonth(year, mont);
        // Assert (Afirmar)
        assertEquals("Para el año " + year + " y el mes " + mont + " se esperaba " + days + " pero se obtuvo " + daysOfMoth, days, daysOfMoth);
        System.out.println("Para el año " + year + " y el mes " + mont + " se esperaba " + days + " y obtuvo " + daysOfMoth);
    }
    
    
    
    
    
   /*
    @Test
    public void miMetodoDePrueba() {
        // Arrange (Preparar)
        int a = 5;
        int b = 10;

        // Act (Actuar)
        int resultado = a + b;

        // Assert (Afirmar)
        assertEquals(15, resultado);
    }
*/
}