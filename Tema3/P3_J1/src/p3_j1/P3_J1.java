/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3_j1;

import javax.swing.JOptionPane;

/**
 *
 * @author egoitz
 */
public class P3_J1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String frase = JOptionPane.showInputDialog("Introduce una frase");
        
        StringBuilder sb = new StringBuilder(frase);
        
        for(int x=0;x<sb.length();x++)
        {
            JOptionPane.showMessageDialog(null, sb.charAt(x));
           
        }
    }
    
}
