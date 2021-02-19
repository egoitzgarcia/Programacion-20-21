/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t4_p1_j1;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author egoit
 */
public class T4_P1_J1 {

    /**
     * @param args the command line arguments
     */
    static Double[] numeros = new Double[10];
    public static void main(String[] args) {
        // TODO code application logic here
        insertarNumeros();
        leerNumeros();
    }
    
    public static void insertarNumeros (){
        for(int x=0;x<numeros.length;x++)
        {
           Double numero = Double.parseDouble(JOptionPane.showInputDialog("Introduce un numero"));
           numeros[x] = numero;
        }
        
    }
    
    public static void leerNumeros () {
        
        for(int x=0;x<numeros.length;x++)
        {
            JOptionPane.showMessageDialog(null, numeros[x]);
        }
        
        Double mayor = numeros[0];
        Double menor = numeros[0];
        
        for(int x=0;x<numeros.length;x++)
        {
            if(numeros[x]>mayor)
            {
                mayor = numeros[x];
            }
            if(numeros[x]<menor)
            {
                menor = numeros[x];
            }
        }
        
        JOptionPane.showMessageDialog(null, "El numero mas alto es " + mayor + " y el mas bajo es " + menor);
    }
}
