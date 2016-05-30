
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class LeerContactos {
    static String ruta="E:/agendaJava.txt";
    
    static File archivo = new File(ruta);
    
    static Scanner lector;

    
    static int numFila = 0;
    static Vector agenda = new Vector();
    static Contacto c;
    public static Vector recorrer (){
        
        try {
            lector= new Scanner(archivo);
             while (lector.hasNext())
                 {
           
                    String linea = lector.nextLine();    
                    String [] array = linea.split(",");
                    Contacto c = new Contacto(array[0], array[1],array[2]);
                    agenda.add(c);
                    numFila++;
                 }     
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LeerContactos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return agenda;
       
    }
}
