/*
 * @(#) ConsultaAlumno.java
 * 
 * Copyright (c) 2012 Software Solutions
 * Todos los derechos reservados.
 */
package si;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Vector;
/**
 *@version 1.0 05/12/12
 * 
 * @author Job Adolfo Salinas Hernández.
 */
class ConsultaAlumno {
    private Vector<Alumnos> historialAlum;
        
        public ConsultaAlumno() {
            
            try {
                
                ObjectInputStream in = new ObjectInputStream (new FileInputStream ("ArchivoAlumnoa.dat"));
                historialAlum = (Vector<Alumnos>) in.readObject();
                in.close();
                
            } catch (Exception e){
                e.printStackTrace();
                
            }
        }
        
        
        public Vector<Alumnos> getHistorialAlumn(){
        return historialAlum;
        
    }
}



