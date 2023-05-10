/*
 * @(#) Seguridad.java
 * 
 * Copyright 8c) 2012 Software Solutions
 * Todos los derechos reservados
 */
package si;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Ricardo Rangel Rangel
 */
public class Seguridad extends Empleados implements Serializable{
    
    public Seguridad (String unNombre, String unPaterno, String unMaterno, 
            String unRfc, int unaEdad, String unaCalle, int unNum, String unaColonia, int unTelefono, 
            String unaAfiliacion, double unSueldo, int año, int mes, int dia, 
            String unaCedula, String unEmpleo, String unTurno, String unDepartamento, String unasMaterias)
            
        {
            super (unNombre, unPaterno, unMaterno, 
            unRfc, unaEdad, unaCalle, unNum, unaColonia, unTelefono, 
            unaAfiliacion, unSueldo, año, mes, dia, unaCedula, unEmpleo, unTurno, unDepartamento, unasMaterias );
        }
  
}