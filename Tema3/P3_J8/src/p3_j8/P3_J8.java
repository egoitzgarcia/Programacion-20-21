/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3_j8;

import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author egoit
 */
public class P3_J8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String pattern = "dd-MM-yyyy";
        DateTimeFormatter sd = DateTimeFormatter.ofPattern(pattern);
        String fecha1 = JOptionPane.showInputDialog("Introduce la fecha de nacimiento");
        
        LocalDate nacimiento = LocalDate.parse(fecha1, sd);
        LocalDate actual = LocalDate.now();
        
        Period edad = Period.between(nacimiento, actual);
        JOptionPane.showMessageDialog(null, "La edad es de " + edad.getYears());
    }
    
}
