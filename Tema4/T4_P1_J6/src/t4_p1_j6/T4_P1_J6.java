/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t4_p1_j6;

import javax.swing.JOptionPane;

/**
 *
 * @author egoit
 */
public class T4_P1_J6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
            int contador = 0;
            String frase = JOptionPane.showInputDialog("Introduce una frase");
            char letra = JOptionPane.showInputDialog("Introduce la letra que quieres que sea comprobada").charAt(0);
            char[] letras = frase.toCharArray();

            for(int x=0;x<letras.length;x++)
            {
                if(letras[x]==letra)
                {
                    contador = contador + 1;
                }
            }

            JOptionPane.showMessageDialog(null, "La letra " + letra + " se repite " + contador + " veces.");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error");
        }
        
    }
    
}
