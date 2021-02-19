/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t4_p1_j5;

import javax.swing.JOptionPane;

/**
 *
 * @author egoit
 */
public class T4_P1_J5 {

    /**
     * @param args the command line arguments
     */
    static int[][] datos = new int[11][30];
    public static void main(String[] args) {
        // TODO code application logic here
        
        try
        {
           insertarDatos();
           mostrarDatos();
        }
        catch(Exception e)
        {
            
        }
    }
    
    public static void insertarDatos() {
        String respuesta = "";
        int litrosD = 0;
        int mes = 0;
        int dia = 0;
        int x = 0;
       
        do
        {
            
            mes = Integer.parseInt(JOptionPane.showInputDialog("Introduce el mes"));
            dia = Integer.parseInt(JOptionPane.showInputDialog("introduce el dia"));
            litrosD = Integer.parseInt(JOptionPane.showInputDialog("introduce los litros que cayeron"));
            
            datos[mes][dia] = litrosD;
                     
            respuesta = JOptionPane.showInputDialog("Desea seguir introduciendo datos?");
            x++;
        }
        while("si".equals(respuesta));
    }
    
    public static void mostrarDatos() {
        int h = 0; 
        for(int y=0;y<=11;y++)
        {
            int suma = 0;
            for(int z=0;z<=30;z++)
            {       
               
               suma = suma + datos[y][z];
               h = h + 1;
               if(h == 30)
               {
                   JOptionPane.showMessageDialog(null, "El total de litros del mes " + y + " es: " + suma);
               } else {
               }
            }
        }
        
    }
    
}
