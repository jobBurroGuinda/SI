/*
 * @(#) Materias.java
 * 
 * Copyright (c) 2012 Software Solutions
 * Todos los derechos reservados
 * 
 */
package si;

import java.io.Serializable;

/**
 *@version 1.0 30/11/12
 * @author Job Adolfo Salinas Henrández
 */
public class Materias implements Serializable {
    
    private String nombre;
    
    private int calificacion;
    
    private int semestre;
       
    
    public Materias (String unNom, int unaCalificacion, int unSemestre){
        
        nombre = unNom;
        calificacion = unaCalificacion;
        semestre = unSemestre;
    }
    
    
    public String getNombre(){
        return nombre;
    }
    
    public int getCalificacion(){
        return calificacion;
    }
    
    public int getSemestre(){
        return semestre;
    }
    
   
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

































































