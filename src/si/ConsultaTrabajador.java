/*
 * 
 * @(#) ConsultaTrabajador.java
 * 
 * Copyright (c) 2012 Software Solutions
 * Todos los derechos reservados.
 */
package si;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Vector;
/**
 *
 * @version 1.0 05/12/2012
 * 
 * @author Cruz Francisco Hernández Hernández.
 */
class ConsultaTrabajador {
    private Vector<Empleados> personalNuevo;
        
        public ConsultaTrabajador(){
            
            try {
                
                ObjectInputStream in = new ObjectInputStream (new FileInputStream ("ArchivoEmpleados.dat"));
                personalNuevo = (Vector<Empleados>) in.readObject();
                in.close();
                
            } catch (Exception e){
                e.printStackTrace();
                
            }
        }
        
        
        public Vector<Empleados> getPersonalNuevo(){
        return personalNuevo;
        
    }
}



