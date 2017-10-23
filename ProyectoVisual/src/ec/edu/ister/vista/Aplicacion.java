package ec.edu.ister.vista;

import ec.edu.ister.modelo.Cuenta;
import ec.edu.ister.modelo.Persona;
import javax.swing.JOptionPane;

/**
 * @Estructura de datos
 * @Instituto Rumiñahui
 * @author SSolis
 */
public class Aplicacion {
    public static void main(String[] args) {
        String id1=JOptionPane.showInputDialog(null,"Ingrese ID");
        Cuenta cuenta1= new Cuenta(id1);
        Cuenta cuenta2 = new Cuenta(JOptionPane.showInputDialog(null,"Ingrese ID"));
    }

    
}
