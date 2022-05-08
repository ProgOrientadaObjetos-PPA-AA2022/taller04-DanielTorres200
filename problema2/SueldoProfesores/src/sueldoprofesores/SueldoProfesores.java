/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sueldoprofesores;

/**
 *
 * @author spart
 */
public class SueldoProfesores {
    String nombre;
    String apellido;
    double sueldoBasico;
    double sueldoTotal;
    String cedula;
    
    public SueldoProfesores(String nom, String apell) {
        nombre = nom;
        apellido = apell;
    }
    
    public SueldoProfesores(String nom, String apell, double sueldoB, double sueldoT, String ci) {
        nombre = nom;
        apellido = apell;
        sueldoBasico = sueldoB;
        sueldoTotal = sueldoT;
        cedula = ci;
    }
    
    public void establecerNombre(String c) {
        nombre = c ;
    }
    
    public void establecerApellido(String c) {
        apellido = c;       
    }
    
    public void establecerSueldoBasico(double c) {
        sueldoBasico = c; 
    }
    
    public void establecerSueldoTotal(double c) {
        sueldoTotal = sueldoBasico + ((sueldoBasico * 20)/100);
    }
    
    public void establecerCedula(String c) {
        cedula = c;
    }
    
    
    public String obtenerNombre() {
        return nombre;
    }
    
    public String obtenerApellido() {
        return apellido;
    }
    
    public double obtenerSueldoBasico() {
        return sueldoBasico;
    }
    
    public double obtenerSueldoTotal() {
        return sueldoTotal;
    }
    
    public String obtenerCedula() {
        return cedula;
    }
    
    
    @Override
    public String toString() {
        String cadena = String.format("Sueldo de profesores \n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Sueldo Basico: %s\n"
                + "SueldoTotal: %s\n"
                + "Cedula: %s\n",
                obtenerNombre(),
                obtenerApellido(),
                obtenerSueldoBasico(),
                obtenerSueldoTotal(),
                obtenerCedula());
          
        return cadena;   
    }  
}

