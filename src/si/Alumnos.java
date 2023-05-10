/*
 * @(#) Alumnos.java
 * 
 * Copyright 2012 Software Solutions
 * Todos los derechos reservados
 */
package si;

import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *@version 1.0 30/11/12
 * 
 * @author Job Adolfo Salinas Hernández
 */
public class Alumnos implements Serializable {
    
    private String nombre;
    
    private String materno;
    
    private String paterno;
    
    private String gafete;
    
    private String grupo;
    
    private int edad;
    
    private String calle;
    
    private int num;
    
    private String colonia;
    
    private int telefono;
    
    private String matricula;
    
    private int semestre;
    
    private String turno;
    
    private Date fechaInscripcion;
    
    private String materias;
    
    private int numBeca;
    
    private String origenBeca;
    
    
    public Alumnos (String unNombre, String unPaterno, String unMaterno, 
            String unGafete, int unaEdad, String unaCalle, int unNum, String unaColonia, int unTelefono, 
            String unGrupo, String unaMatricula, int año, int mes, int dia, 
            int unSemestre, String unTurno, String unasMaterias, int unNumBeca, String unOrigenBeca){
        
        nombre = unNombre;
        
        paterno = unPaterno;
        
        materno = unMaterno;
        
        gafete = unGafete;
        
        edad = unaEdad;
        
        calle = unaCalle;
        
        num = unNum;
        
        colonia = unaColonia;
        
        telefono = unTelefono;
        
        grupo = unGrupo;
        
        matricula = unaMatricula;
        
        semestre = unSemestre;
        
        turno = unTurno;
        
        materias = unasMaterias;
        
        GregorianCalendar calendario1 = new GregorianCalendar (año, mes-1, dia);
        Date fechaDeInscripcion = calendario1.getTime();
        fechaInscripcion = fechaDeInscripcion;
        
        numBeca = unNumBeca;
        
        origenBeca = unOrigenBeca;
        
    }
    
    
    public String getNombre(){
            return nombre;
        }
        
        public String getPaterno(){
            return paterno;
        }
        
        public String getMaterno(){
                return materno;
        }
        
        public String getGafete(){
            return gafete;
        }
        
        public int getEdad(){
            return edad;
        }
        
        public String getCall(){
            return calle;
        }
        
        public int getNume(){
            return num;
        }
        
        public String getCol(){
            return colonia;
        }
        
        public int getTelefono(){
            return telefono;
        }
        
        public String getGrupo(){
            return grupo;
        }
        
        public String getMatricula(){
            return matricula;
        }
        
        public int getSemestre(){
            return semestre;
        }
        
        public String getTurno(){
            return turno;
        }
        
        public Date getfechaInscripcion(){
            return fechaInscripcion;
        }
        
        public int getNumBeca(){
            return numBeca;
        }
        
        public String getOrigenBeca(){
            return origenBeca;
        }
        
        
    @Override
        public String toString(){
            return "[nombre: " + getNombre() + " " + getPaterno()+ " " + getMaterno() +
                    "; gafete: " + getGafete() + "; edad: " + getEdad() + 
                    "; domicilio: Calle= " + getCall() + " #" + getNume() + ", colonia= " + getCol() + "; teléfono: " + 
                    getTelefono() + "; Semestre: " + getSemestre() + "°" +  
                    ", Grupo: " + getGrupo() + "; turno: "+ getTurno()+ 
                    ". Fecha de inscripción: " + getfechaInscripcion() +
                    ". Si cuenta con una beca, este es el número de su beca:  "
                    + getNumBeca() + ", obtuvo su beca en: " + getOrigenBeca() + "]";
}
}
