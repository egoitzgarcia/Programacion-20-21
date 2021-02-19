/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3_j3;

import javax.swing.JOptionPane;

/**
 *
 * @author egoitz
 */
public class P3_J3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String frase = JOptionPane.showInputDialog("Introduce una frase");
        char caracter  = JOptionPane.showInputDialog("Introduce el caracter que se quiere saber cuantas veces ha aparecido").charAt(0);
        StringBuilder sb = new StringBuilder(frase);
        int contador = 0;
        contar(frase, caracter, contador, sb);
    }
    
    public static void contar (String frase, char caracter, int contador, StringBuilder sb){
        for(int x=0;x<sb.length();x++)
        {
            if(sb.charAt(x) == caracter)
            {
                contador = contador + 1;
            }
           
        }
        JOptionPane.showMessageDialog(null, "El caracter " + caracter + " se repite un total de " + contador + " veces");
    }
    
}
