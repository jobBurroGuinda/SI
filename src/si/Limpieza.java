/*
 * 
 * Limpieza.java
 * 
 * Copyright (c) 2012 Software Solutions
 */
package si;

import java.io.Serializable;
import java.util.Date;

/**
 *@version 1.0 30/11/12
 * 
 * @author Julio Santos Urbina
 */
public class Limpieza extends Empleados implements Serializable{
    
    public Limpieza (String unNombre, String unPaterno, String unMaterno, 
            String unRfc, int unaEdad, String unaCalle, int unNum, String unaColonia, int unTelefono, 
            String unaAfiliacion, double unSueldo, int año, int mes, int dia, 
            String unaCedula, String unEmpleo, String unTurno, String unDepartamento, String unasMaterias)
            
        {
            super (unNombre, unPaterno, unMaterno, 
            unRfc, unaEdad, unaCalle, unNum, unaColonia, unTelefono, 
            unaAfiliacion, unSueldo, año, mes, dia, unaCedula, unEmpleo, unTurno, unDepartamento, unasMaterias );
        }
  
}
