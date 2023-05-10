/*
 * 
 * @(#) EstudiantesBecados.java
 * 
 * Copyright (c) 2012 Software Solutions
 *  Todos los derechos reservados
 */
package si;

import java.io.Serializable;

/**
 * @version 1.0 30/11/12
 * 
 * @author Ricardo Rangel Rangel
 */


public class EstudiantesBecados extends Alumnos implements Serializable {

    public EstudiantesBecados(String unNombre, String unPaterno, 
            String unMaterno, String unGafete, int unaEdad, String unaCalle, int unNume, String unaColonia, 
            int unTelefono, String unGrupo, String unaMatricula, int año, 
            int mes, int dia, int unSemestre, String unTurno, String unasMaterias, int unNumBeca, String unOrigenBeca) {
        
        super(unNombre, unPaterno, unMaterno, unGafete, unaEdad, unaCalle, unNume, unaColonia, 
                unTelefono, unGrupo, unaMatricula, año, mes, dia, unSemestre, 
                unTurno, unasMaterias, unNumBeca, unOrigenBeca);
    }
    
    
    
    
}
