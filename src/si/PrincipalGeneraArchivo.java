/*
 * @(#)PrincipalGeneraArchivo.java
 * 
 * Copyright 2012 Sotware Solutions
 * Todos los derechos reservados.
 * 
 */
package si;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;


/**
 *@version 1.0 05/17/12
 * 
 * @author Job Adolfo Salinas Hernández.
 * 
 */


public class PrincipalGeneraArchivo {
    
    
    static Vector<Empleados> trabajadores = new Vector<Empleados>();
    
    public static void main(String[]args){
    

        Empleados objetoEmpleado1 = new Empleados("Pancho", "Salinas", 
                "Gortari", "hr8283r9", 12, "Manzana", 1, "Indios Verdes", 
                343232342, "mklksmdc scmkds ko239", 50, 2012, 9, 10, "se omite esto", "Limpieza", "Matutino", "seomite esto", "seomite esto");
        trabajadores.add(objetoEmpleado1);
        
        Empleados objetoEmpleado2 = new Empleados("Francisco", "Salina", 
                "Dof", "mfoe32r", 14, "Manzan", 4, "Indios Verde", 
                4354353, "kfpk94k094 k34p3k4", 02, 2012, 10, 10, "jr893ur82r", "Maestro", "Vespertino", "se omite esto", "biolofía y filosofía");
        trabajadores.add(objetoEmpleado2);
        
        Empleados objetoEmpleado3 = new Empleados("Dosd", "Petunio", 
                "Gortari", "9r032k49", 13, "Sal", 3, "Verde", 
                423423432, "krm903 340m3 43", 53, 2012, 9, 10, "jfijfcfw93di", "director", "ambos", "dirección", "se omite esto");
        trabajadores.add(objetoEmpleado3);
        
        
        try {
            
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ArchivoEmpleados.dat"));
            out.writeObject(trabajadores);
            out.close();
            
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("ArchivoEmpleados.dat"));
            Vector<Empleados> personalNuevo = (Vector <Empleados>) in.readObject();
            in.close();
            
            for (Empleados e : personalNuevo){
                System.out.println(e);
            }
            } catch (Exception e){
                e.printStackTrace();
        }
        
    }
     
}
