
package env;

import java.awt.Dimension;
import java.awt.Toolkit;


public class getHardwareConf {
    
    public static Dimension getScreenSise(){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        return screenSize;
    }
}
