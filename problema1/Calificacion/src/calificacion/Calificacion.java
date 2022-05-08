/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calificacion;

/**
 *
 * @author spart
 */
public class Calificacion {
    String nombreEstudiante;
    double calificacionM1;
    double calificacionM2;
    double calificacionM3;
    double promedioCalificaciones;
    
    public Calificacion(String nomEstudiante) {
        nombreEstudiante = nomEstudiante;
    }
    
    public Calificacion(String nomEstudiante, double notaM1, double notaM2, double notaM3, double totalPromedio) {
        nombreEstudiante = nomEstudiante;
        calificacionM1 = notaM1;
        calificacionM2 = notaM2;
        calificacionM3 = notaM3;
        promedioCalificaciones = totalPromedio;
    }
    
    public void establecerNombreEstudiante(String c) {
        nombreEstudiante = c ;
    }
    
    public void establecerCalificacionM1(double c) {
        calificacionM1 = c;       
    }
    
    public void establecerCalificacionM2(double c) {
        calificacionM2 = c; 
    }
    
    public void establecerCalificacionM3(double c) {
        calificacionM3 = c;
    }
    
    public void calculopromedioCalificaciones() {
        promedioCalificaciones = (calificacionM1 + calificacionM2 + calificacionM3)/3;
    }
    
    
    public String obtenerNombreEstudiante() {
        return nombreEstudiante;
    }
    
    public double obtenerCalificacionM1() {
        return calificacionM1;
    }
    
    public double obtenerCalificacionM2() {
        return calificacionM2;
    }
    
    public double obtenerCalificacionM3() {
        return calificacionM3;
    }
    
    public double obtenerPromedioCalificaciones() {
        return promedioCalificaciones;
    }
    
    
    @Override
    public String toString() {
        String cadena = String.format("Calificaciones \n"
                + "Estudiante: %s\n"
                + "Calificacion materia 1: %s\n"
                + "Calificacion materia 2: %s\n"
                + "Calificacion materia 3: %s\n"
                + "Promedio Total: %s\n",
                obtenerNombreEstudiante(),
                obtenerCalificacionM1(),
                obtenerCalificacionM2(),
                obtenerCalificacionM3(),
                obtenerPromedioCalificaciones());
        
        
        return cadena;   
    }  
}
