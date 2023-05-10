/*
 * @(#) AltaTrabajador.java
 * 
 * Copyright 2012 Software Solutions
 * Todos los derechos reservados
 */
package si;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;

/**
 * @version 1.0 03/12/12
 * 
 * @author Cruz Francisco Hernández Hernández
 */
class AltaTrabajador {    
    

    public AltaTrabajador(Empleados unNuevoTrabajador) {

        
        try {
        
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("ArchivoEmpleados.dat"));
        Vector<Empleados> personalNuevo2 = (Vector <Empleados>) in.readObject();
            in.close();
            
            personalNuevo2.add(unNuevoTrabajador);
            
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ArchivoEmpleados.dat"));
            out.writeObject(personalNuevo2);
            out.close();
            
        } catch (Exception e){
                e.printStackTrace();
            }
    
}
}

