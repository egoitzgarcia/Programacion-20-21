/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3_j6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author egoit
 */
public class P3_J6 {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        
        Date test = null;
        String fecha = JOptionPane.showInputDialog("Introduce la fecha en formato dd-mm-yyyy");
        String pattern = "dd-MM-yyyy";
        SimpleDateFormat sd = new SimpleDateFormat (pattern);
        
        test = sd.parse(fecha);
        
        
    }
    
}
