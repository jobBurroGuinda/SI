/*
 * @(#) BajaDeTrabajador.java
 * 
 * Copyright (c) 2012 Software Solutions
 * Todos los derechos reservados.
 * 
 */
package si;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Cruz Francisco Hernández Hernández
 */
class BajaDeTrabajador {
    
    String afiliacion;
    boolean eliminacion = false;
    

    public BajaDeTrabajador(String afiliacionBusqueda) {
        
        afiliacion = afiliacionBusqueda;
        
        
        try {
            
            ObjectInputStream in = new ObjectInputStream (new FileInputStream ("ArchivoEmpleados.dat"));
            Vector<Empleados> personalNuevoA = (Vector <Empleados>) in.readObject();
            in.close();
            
            for (Empleados elemento : personalNuevoA)
            {
                
                if(elemento.getAfiliacion().equals(afiliacion)){
                    
                    personalNuevoA.remove(elemento);
                    
                    
                    
                    JOptionPane.showMessageDialog(null, 
                            "Se ha eliminado correctamente el empleado con afiliación al IMSS o al ISSSTE: " 
                            + afiliacion + ", Exitosamente", "Confirmación",  
                            JOptionPane.OK_OPTION);
                            
                    
                    ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ArchivoEmpleados.dat"));
            out.writeObject(personalNuevoA);
            out.close();
            
            eliminacion = true;
            
            break;
                }
            }
            
            if(eliminacion == false) { 
                JOptionPane.showMessageDialog(null, "El empleado con afiliación: "
                        + afiliacion + " No existe", "O no lo escribió bien, revise que haya introducido correctamente la afiliación",
                        JOptionPane.ERROR_MESSAGE);
            }
            }
            catch (Exception e){
                e.printStackTrace();
            }
                
                
                
                
        
    }
    
}
