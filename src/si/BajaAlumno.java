/*
 * @(#) BajaAlumno.java(
 * 
 * Copyright (c) 2012 Software Solutions
 * Todos los derechos reservados.
 */
package si;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *@version 1.0 03/12/12
 * 
 * @author Job Adolfo Salinas Hernández.
 */
class BajaAlumno {
    
    String gafete;
    boolean eliminacion = false;
    

    public BajaAlumno(String gafeteBusqueda) {
        
        gafete = gafeteBusqueda;
        
        
        try {
            
            ObjectInputStream in = new ObjectInputStream (new FileInputStream ("ArchivoAlumnoa.dat"));
            Vector<Alumnos> historialAlumNueA = (Vector <Alumnos>) in.readObject();
            in.close();
            
            for (Alumnos elementos : historialAlumNueA)
            {
                
                if(elementos.getGafete().equals(gafete)){
                    
                    historialAlumNueA.remove(elementos);
                    
                    
                    
                    JOptionPane.showMessageDialog(null, 
                            "Se ha eliminado correctamente el alumno con gafete: " 
                            + gafete + ", Exitosamente", "Confirmación",  
                            JOptionPane.OK_OPTION);
                            
                    
                    ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ArchivoAlumnoa.dat"));
            out.writeObject(historialAlumNueA);
            out.close();
            
            eliminacion = true;
            
            break;
                }
            }
            
            if(eliminacion == false) { 
                JOptionPane.showMessageDialog(null, "El alumno con gafete: "
                        + gafete + " No existe", "No existe",
                        JOptionPane.ERROR_MESSAGE);
            }
            }
            catch (Exception e){
                e.printStackTrace();
            }
                
                
                
                
        
    }
    
}
