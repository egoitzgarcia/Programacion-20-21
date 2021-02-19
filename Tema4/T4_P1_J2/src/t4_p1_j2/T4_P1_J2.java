/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t4_p1_j2;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author egoit
 */
public class T4_P1_J2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Numeros();
    }
    
    public static void Numeros (){
        
        int x = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño que desees para el array"));
        int total = 0;
        int[] numeros = new int[x];
        for(int y=0;y<numeros.length;y++)
        {
            numeros[y] = (int) Math.floor(Math.random()*9);
            
            total = total + numeros[y];
        }
        for(int z=0;z<numeros.length;z++)
        {
            JOptionPane.showMessageDialog(null, numeros[z]);
        }
        
        JOptionPane.showMessageDialog(null, "El total de la suma de los numeros del array " + total);
    }
    
}
