/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t4_p1_j7;

import java.util.Arrays;
import javax.swing.JOptionPane;
/**
 *
 * @author egoit
 */
public class T4_P1_J7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Double[] dineros = {0.01, 0.02, 0.05, 0.10, 0.20, 0.50, 1.0, 2.0, 5.0, 10.0, 20.0, 50.0, 100.0};
        
        int[] contadores = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        
        
        Double costo = Math.random()*1-200;
        Double pago = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el pago"));
        
        Double vueltas = costo - pago;
        Double devolvido = vueltas;
        
        for(int x=12;x<dineros.length;x--)
        {
           if(vueltas>dineros[x])
           {
               vueltas = vueltas - dineros[x];
               contadores[x] = contadores[x] + 1;
               
           }
        }
        
        for(int x=0;x<dineros.length;x++)
        {
            JOptionPane.showMessageDialog(null, dineros[x] + contadores[x]);
        }
    }
    
}
