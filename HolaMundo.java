
package holamundo;
import javax.swing.JOptionPane;
public class HolaMundo {

    public static void main(String[] args) {
             String nombreapellido=JOptionPane.showInputDialog(""
        + "Introduce tu nombreapellido");
        
       
       JOptionPane.showMessageDialog(null,"Bien, " 
                     + "tu nombreapellido es" +nombreapellido);

    }
    
}
