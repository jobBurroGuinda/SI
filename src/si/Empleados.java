/*
 * 
 * @(#) Empleados.java
 * 
 * Copyright Software Solutions
 * Todos los derecho reservados
 */
package si;

import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 
 *@version 1.0 30/11/12
 * 
 * @author Paplo Sosa Velázquez
 */
public class Empleados implements Serializable {
    
    private String nombre;
    
    private String materno;
    
    private String paterno;
    
    private String rfc;
    
    private int edad;
    
    private String calle;
    
    private int num;
    
    private String colonia;
    
    private int telefono;
    
    private String afiliacion;
    
    private double sueldo;
    
    private Date fechaContratacion;
    
    private String cedula;
    
    private String empleo;
    
    private String turno;
    
    private String departamento;
    
    private String materias;
    
    
    public Empleados (String unNombre, String unPaterno, String unMaterno, 
            String unRfc, int unaEdad, String unaCalle, int unNum, String unaColonia, int unTelefono, 
            String unaAfiliacion, double unSueldo, int año, int mes, int dia, 
            String unaCedula, String unEmpleo, String unTurno, String unDepartamento, String unasMaterias){
        
        nombre = unNombre;
        
        paterno = unPaterno;
        
        materno = unMaterno;
        
        rfc = unRfc;
        
        edad = unaEdad;
        
        calle = unaCalle;
        
        num = unNum;
        
        colonia = unaColonia;
        
        telefono = unTelefono;
        
        afiliacion = unaAfiliacion;
        
        sueldo = unSueldo;
        
        GregorianCalendar calendario = new GregorianCalendar (año, mes-1, dia);
        Date fechaDeContratacion = calendario.getTime();
        fechaContratacion = fechaDeContratacion;
        
        cedula = unaCedula;
        
        empleo = unEmpleo;
        
        turno = unTurno;
        
        departamento = unDepartamento;
        
        materias = unasMaterias;
        
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
        
        public String getRfc(){
            return rfc;
        }
        
        public int getEdad(){
            return edad;
        }
        
        public String getCalle(){
            return calle;
        }
        
        public int getNum(){
            return num;
        }
        
        public String getColonia(){
            return colonia;
        }
        
        public int getTelefono(){
            return telefono;
        }
        
        public String getAfiliacion(){
            return afiliacion;
        }
        
        public double getSueldo(){
            return sueldo;
        }
        
        public Date getfechaContrato(){
            return fechaContratacion;
        }
        
        public String getCedula(){
            return cedula;
        }
        
        public String getEmpleo(){
            return empleo;
        }
        
        public String getDepartamento(){
            return departamento;
        }
        
        public String getTurno(){
            return turno;
        }
        
        public String getMaterias(){
            return materias;
        }

        
        
        
    @Override
        public String toString(){
            return "[Nombre: " + getNombre() + " " + getPaterno() + " " + getMaterno() +
                    "; RFC: " + getRfc() + "; empleo: " + getEmpleo() + "; edad: " + getEdad() + 
                    "; domicilio: calle= " + getCalle() + " #" + getNum() + 
                    ", colonia: " + getColonia() + "; teléfono: " + 
                    getTelefono() + "; Afiliación al IMSS o ISSSTE: " + getAfiliacion() + 
                    "; Sueldo: $" + getSueldo() + "; turno: " + getTurno() + ". Fecha de contratación: " 
                    + getfechaContrato() + 
                    ". En caso de contar con una cédula profesional: " + 
                    getCedula() + "; si se ejerce su profesión, su departamento es: "
                    + getDepartamento()+"; si es profesor, las materias que imparte son: " + getMaterias() + "]";
        }
    }
    
    

