/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t5_p1_j1;

import java.util.ArrayList;
import java.util.Objects;
import javax.swing.JOptionPane;

/**
 *
 * @author egoit
 */
public class T5_P1_J1 {

    /**
     * @param args the command line arguments
     */
    static ArrayList <Double> reales = new ArrayList();
    public static void main(String[] args) {
        // TODO code application logic here
        llenarArrayList();
        int opcion = 0;
        JOptionPane.showMessageDialog(null, "Elija una opcion: "
                + "\n1.-Visuaizar mayor maximo y minimo"
                + "\n2.-Solicitar un numero, bucarlo y mostrar unmensaje indicando si se ha encontrado o no"
                + "\n3.-Solictar un numero, buscarlo y borrarlo y mostrar un mensaje de error en caso de no encontar el numero"
                + "\n4.-Convertir el arrayList en un Array"
                + "\n5.-Si no esta vacio, mostrar el numero de elementos que contiene"
                + "\n6.-Insertar un nuevo elento por el final"
                + "\n7.-Insertar un nuevo elemento en la posicion indicada por el usuario"
                + "\n8.-Borrar un elemento de una posicion concreta"
                + "\n9.-Calcula la suma y la media aritmetica de los valores contenidos"
                + "\n10.-Finalizar");
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Opcion:(1-7)"));
            switch(opcion)
            {
                case 1:
                    buscarMayorMenor();
                    break;
                case 2:
                    buscarNumero();
                    break;
                case 3:
                    buscarYborrar();
                    break;
                case 4:
                    pasaraArray();
                    break;
                case 5:
                    mostrarSitiene();
                    break;
                case 6:
                    insertarFinal();
                    break;
                case 7:
                    insertarEnposicion();
                    break;
                case 8:
                    borrarDeposicion();
                    break;
                case 9:
                    sumaYmedia();
                    break;    
            }
    }
    
    public static void llenarArrayList() {
        
        ArrayList <Double> reales = new ArrayList();
        Double numero = null;
        String respuesta = "";
        
        do
        {
            numero = Double.parseDouble(JOptionPane.showInputDialog("Introduzca un numero"));
            reales.add(numero);
            respuesta = JOptionPane.showInputDialog("Desea introducir mas numeros");
        }
        while(!"no".equals(respuesta));
    }
    
    public static void buscarMayorMenor() {
        
        Double mayor= 0.0;
        Double menor = 0.0;
        Double temporal1 = 0.0;
        Double temporal2 = 0.0;
        
        temporal1 = reales.get(1);
        temporal2 = reales.get(1);
        
        for(int x=0;x<reales.size();x++)
        {
            if(temporal1<x)
            {
                temporal1 = reales.get(x);
            }
        }
        
        for(int x=0;x<reales.size();x++)
        {
            if(temporal2>x)
            {
                temporal2 = reales.get(x);
            }
        }
        
        mayor = temporal1;
        menor = temporal2;
        
        JOptionPane.showMessageDialog(null, "el numero mayor es " + mayor + " y el menor es " + menor);
    }
    
    public static void buscarNumero() {
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero que quiere buscar"));
        Double temp = null;
        
        temp = temp + numero;
        for(int x=0;x<reales.size();x++)
        {           
            if(temp == reales.get(x))
            {
                JOptionPane.showMessageDialog(null, "El numero buscado ha sido encontrado");
            } 
            else 
            {
                JOptionPane.showMessageDialog(null, "El numero buscado no ha sido encontrado");
            }
        }   
    }
    
    public static void buscarYborrar() {
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero que quiere buscar"));
        Double temp = 0.0;
        
        temp = temp + numero;
        for(int x=0;x<reales.size();x++)
        {
            if(Objects.equals(temp, reales.get(x)))
            {
                reales.remove(x);
            } 
            else 
            {
               JOptionPane.showMessageDialog(null, "El numero buscado ha sido encontrado");
            }
        }
    }
    
    public static void pasaraArray() {
        
        Double[] array;
        array = reales.toArray(new Double[reales.size()]);
    }
    
    public static void mostrarSitiene() {
        
        if(reales != null)
        {
            for(int x=0;x<reales.size();x++)
            {
                JOptionPane.showMessageDialog(null, reales.get(x));
            }
        }
    }
    
    public static void insertarFinal() {
       
        Double añadir = Double.parseDouble(JOptionPane.showInputDialog("Introduce el numero a introducir en el arrayList"));
        reales.add(añadir);
        
        for(int x=0;x<reales.size();x++)
        {
            JOptionPane.showMessageDialog(null, reales.get(x));
        }
    }
    
    public static void insertarEnposicion() {
        
        int posicion = Integer.parseInt(JOptionPane.showInputDialog("Inserta la posicion en la que quieras insertar el numero"));
        Double añadir = Double.parseDouble(JOptionPane.showInputDialog("Introduce el numero a introducir en el arrayList"));
        reales.add(posicion, añadir);
        
        for(int x=0;x<reales.size();x++)
        {
            JOptionPane.showMessageDialog(null, reales.get(x));
        }
    }
    
    public static void borrarDeposicion() {
        
        int posicion = Integer.parseInt(JOptionPane.showInputDialog("Inserta la posicion en la que quieras borrar el numero"));       
        reales.remove(posicion);
    }
    
    public static void sumaYmedia() {
        
        Double total = null;
        Double media = null;
        int n = 0;
        for(int x=0;x<reales.size();x++)
        {
            total = total + x;
            n = n +1;
        }
        
        media = total/n;
        
        JOptionPane.showMessageDialog(null, "La suma de los valores es " + total + " y la media es " + media);
    }
}