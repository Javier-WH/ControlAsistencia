package libraries;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    
    public static boolean isMatch(String regex, String text){
        Pattern pt = Pattern.compile(regex);
        Matcher match = pt.matcher(text);
        return match.matches();
    }
    
}
