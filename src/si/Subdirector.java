/*
 * @(#) Subdirector.java
 * 
 * Copyright 2012 Software Solutions
 * Todos los derechos reservados
 */
package si;

import java.io.Serializable;
import java.util.Date;

/**
 *@version 1.0 30/11/12
 * @author usuario
 */
public class Subdirector extends Empleados implements Serializable{
    
    /* La ejecución de este proyecto se reserva para la interfaz gráfica
     * 
     */
    public Subdirector (String unNombre, String unPaterno, String unMaterno, 
            String unRfc, int unaEdad, String unaCalle, int unNum, String unaColonia, int unTelefono, 
            String unaAfiliacion, double unSueldo, int año, int mes, int dia, 
            String unaCedula, String unEmpleo, String unTurno, String unDepartamento, String unasMaterias)
            
        {
            super (unNombre, unPaterno, unMaterno, 
            unRfc, unaEdad, unaCalle, unNum, unaColonia, unTelefono, 
            unaAfiliacion, unSueldo, año, mes, dia, unaCedula, unEmpleo, unTurno, unDepartamento, unasMaterias );
        }
    
    
    public double getCedula(double unaCedula){
        cedula = unaCedula;
        return cedula;
    }
    public String getTurno(String unTurno){
        turno = unTurno;
        return turno;
    }
    
    
    private double cedula;
    public String turno;
}
