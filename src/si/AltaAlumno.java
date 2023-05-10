/*
 * @(#) AltaAlumno.java
 * 
 * Copyright 2012 Software Solutions
 * Todos los derechos reservados
 * 
 */
package si;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;
/**
 *@version 1.0 03//12/12
 * 
 * @author Pablo Sosa Velázquez.
 */
class AltaAlumno {

    public AltaAlumno(Alumnos unNuevoAlumno) {
        
        
        try {
        
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("ArchivoAlumnoa.dat"));
        Vector<Alumnos> historialAlumNue = (Vector <Alumnos>) in.readObject();
            in.close();
            
            historialAlumNue.add(unNuevoAlumno);
            
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ArchivoAlumnoa.dat"));
            out.writeObject(historialAlumNue);
            out.close();
            
        } catch (Exception e){
                e.printStackTrace();
            }
    }
    
}
