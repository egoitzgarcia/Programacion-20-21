/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t4_p1_j3;

import javax.swing.JOptionPane;

/**
 *
 * @author egoit
 */
public class T4_P1_J3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        crearCadena();
        
    }
    
    @SuppressWarnings("empty-statement")
    public static void crearCadena () {
        
        String[] alfabeto = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "Ñ", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };
        String[]letras = new String[30];
        int numero = 0;
        int x =0;
        int contador = 0;
        do
        {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
            
            if(numero<=0)
            {
                if(numero>=26)
                {
                    letras[x] = alfabeto[numero];
                    contador = contador + 1;
                }
            }
            else
            {
                if(numero == -1)
                {
                    
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "El numero introducido no es valido");
                }
            }
            x = x + 1;
        }
        while(numero != -1);
        String[] cadena = null;
        for(int y=0;y<=contador;y++)
        {
            cadena[y] = letras[y];
        }
        
        for(int u=0;u<cadena.length;u++)
        {
            if(cadena[u] == null)
            {
                JOptionPane.showMessageDialog(null, cadena[u]);
            }
        }
    }
    
}
