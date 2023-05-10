/*
 * 
 * @(#) CapitalHumano.java
 * 
 * Copyright (c) 2012 Software Soultions
 * Todos los derechos reservados
 */
package si;

import java.io.Serializable;
import java.util.Date;

/**
 *@version 1.0 30/11/12
 * 
 * @author Ricardo Rangel Rangel
 */
public class CapitalHumano extends Empleados implements Serializable{
    
    /* Esta clase heredará los atributos de la clase Empleados
     * También contendrá un dato propio de este clase
     */
    
    public CapitalHumano (String unNombre, String unPaterno, String unMaterno, 
            String unRfc, int unaEdad, String unaCalle, int unNum, String unaColonia, int unTelefono, 
            String unaAfiliacion, double unSueldo, int año, int mes, int dia, 
            String unaCedula, String unEmpleo, String unTurno, String unDepartamento, String unasMaterias)
            
        {
            super (unNombre, unPaterno, unMaterno, 
            unRfc, unaEdad, unaCalle, unNum, unaColonia, unTelefono, 
            unaAfiliacion, unSueldo, año, mes, dia, unaCedula, unEmpleo, unTurno, unDepartamento, unasMaterias );
        }
    
}
