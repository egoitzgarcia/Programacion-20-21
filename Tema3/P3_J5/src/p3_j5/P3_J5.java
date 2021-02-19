/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3_j5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author egoitz
 */
public class P3_J5 {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here        
        Date test = null;
        Calendar calendario = Calendar.getInstance();
        String fecha = JOptionPane.showInputDialog("Introduce la fecha en formato dd-mm-yyyy");
        String pattern = "dd-MM-yyyy";
        SimpleDateFormat sd = new SimpleDateFormat (pattern);
        
        test = sd.parse(fecha);
        calendario.setTime(test);

        calendario.add(Calendar.DAY_OF_YEAR, 100);
        JOptionPane.showMessageDialog(null, "La fecha introducida sumada con 10 dias es " + calendario);
    }
    
}
