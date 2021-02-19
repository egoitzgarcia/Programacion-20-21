/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t4_p1_j4;

import javax.swing.JOptionPane;

/**
 *
 * @author egoit
 */
public class T4_P1_J4 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        
        try
        {
            String introducido = "";
            String[] meses = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
            String respuesta = "";
            int x = 0;
            do
            {
                introducido = JOptionPane.showInputDialog("");
                if(introducido == null ? meses[x] == null : introducido.equals(meses[x]))
                {
                    JOptionPane.showMessageDialog(null, "El mes introducido es correcto");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "El mes introducido es incorrecto");
                }
                respuesta = JOptionPane.showInputDialog("Desea introducir otro mes?");
                x++;
            }
            while("si".equals(respuesta));
        }
        catch(Exception e)
        {
            
        }
    }    
}
