/*
 * @(#) BajaDeTrabajador.java
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
 *@version 1.0 05/12/12
 * 
 * @author Julio Santos Urbina
 */
class BajaDeTrabajadorC {
    
    
    String cedula;
    boolean eliminacion = false;
    

    public BajaDeTrabajadorC(String cedulaBusqueda) {
        
        cedula = cedulaBusqueda;
        
        
        try {
            
            ObjectInputStream in = new ObjectInputStream (new FileInputStream ("ArchivoEmpleados.dat"));
            Vector<Empleados> personalNuevoC = (Vector <Empleados>) in.readObject();
            in.close();
            
            for (Empleados elementoC : personalNuevoC)
            {
                
                if(elementoC.getCedula().equals(cedula)){
                    
                    personalNuevoC.remove(elementoC);
                    
                    
                    
                    JOptionPane.showMessageDialog(null, 
                            "Se ha eliminado correctamente el empleado con cédula: " 
                            + cedula + ", Exitosamente", "Confirmación",  
                            JOptionPane.OK_OPTION);
                            
                    
                    ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ArchivoEmpleados.dat"));
            out.writeObject(personalNuevoC);
            out.close();
            
            eliminacion = true;
            
            break;
                }
            }
            
            if(eliminacion == false) { 
                JOptionPane.showMessageDialog(null, "El empleado con: "
                        + cedula + " No existe", "No existe",
                        JOptionPane.ERROR_MESSAGE);
            }
            }
            catch (Exception e){
                e.printStackTrace();
            }
                
                
                
                
        
    }
    
}
