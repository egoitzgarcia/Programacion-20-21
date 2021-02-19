/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3_j4;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author egoitz
 */
public class P3_J4 {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        Date test1 = null;
        Date test2 = null;
        String fecha1 = JOptionPane.showInputDialog("Introduce la fecha en formato dd-mm-yyyy");
        String pattern = "dd-MM-yyyy";
        SimpleDateFormat sd = new SimpleDateFormat (pattern);
        test1 = sd.parse(fecha1);
        
        String fecha2 = JOptionPane.showInputDialog("Introduce la fecha en formato dd-mm-yyyy");
        test2 = sd.parse(fecha2);
        
        int dias = fecha2.compareTo(fecha1);
        JOptionPane.showMessageDialog(null, "La cantidad de dias entre la primera fecha y la segunda es de " + dias);
    }
    
}
