/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3_j7;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author egoit
 */
public class P3_J7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String fecha1 = JOptionPane.showInputDialog("Introduce la primera fecha");
        String fecha2 = JOptionPane.showInputDialog("Introduce la segunda fecha");
        
        String pattern = "dd-MM-yyyy";
        DateTimeFormatter sd = DateTimeFormatter.ofPattern(pattern);
        
        LocalDate primera = LocalDate.parse(fecha1, sd);
        LocalDate segunda = LocalDate.parse(fecha2, sd);
        
    }
    
}
