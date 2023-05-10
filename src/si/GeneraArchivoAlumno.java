/*
 * 
 * @(#) GeneraArchivoAlumno.java
 * 
 * Copyright (c) 2012 Software Solutions
 */
package si;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;


/**
 *
 * @author Ricardo Rangel Rangel
 */
public class GeneraArchivoAlumno {
    
    
    static Vector<Alumnos> alumnos = new Vector<Alumnos>();
    
    public static void main(String[]args){
    

        Alumnos objetoAlumno1 = new Alumnos("Pancho", "Salinas", 
                "Gortari", "32", 12, "Manzana", 1, "Indios Verdes", 
                343232342, "mklksmdc scmkds ko239", "50", 2012, 9, 10, 23, "Limpieza", "Matutino", 4, "seomite esto");
        alumnos.add(objetoAlumno1);
        
        Alumnos objetoAlumno2 = new Alumnos("Francisco", "Salina", 
                "Dof", "78", 14, "Manzan", 4, "Indios Verde", 
                4354353, "kfpk94k094 k34p3k4", "02", 2012, 10, 10, 4, "Maestro", "Vespertino", 5, "biolofía y filosofía");
        alumnos.add(objetoAlumno2);
        
        Alumnos objetoAlumno3 = new Alumnos("Dosd", "Petunio", 
                "Gortari", "78", 13, "Sal", 3, "Verde", 
                423423432, "krm903 340m3 43", "53", 2012, 9, 10, 3, "director", "ambos", 5, "se omite esto");
        alumnos.add(objetoAlumno3);
        
        
        try {
            
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ArchivoAlumnoa.dat"));
            out.writeObject(alumnos);
            out.close();
            
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("ArchivoAlumnoa.dat"));
            Vector<Alumnos> historialAlum = (Vector <Alumnos>) in.readObject();
            in.close();
            
            for (Alumnos e : historialAlum){
                System.out.println(e);
            }
            } catch (Exception e){
                e.printStackTrace();
        }
        
    }
     
}
