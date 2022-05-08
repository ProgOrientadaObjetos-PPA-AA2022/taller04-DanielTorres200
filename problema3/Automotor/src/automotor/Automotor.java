/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automotor;

/**
 *
 * @author spart
 */
public class Automotor {
    String cedulaDuenio;
    String marcaVehiculo;
    double anioFabricacion;
    double valorVehiculo;
    double valorMatricula;
    
    public Automotor(String ciDuenio, String marca) {
        cedulaDuenio = ciDuenio;
        marcaVehiculo = marca;
    }
    
    public Automotor( double anio, double valorV, double valorM) {
        
        anioFabricacion = anio;
        valorVehiculo = valorV;
        valorMatricula = valorM;
    }
    
    public void establecerCedulaDuenio(String c) {
         cedulaDuenio = c ;
    }
    
    public void establecerMarcaVehiculo(String c) {
        marcaVehiculo = c;       
    }
    
    public void establecerAnioFabricacion(double c) {
        anioFabricacion = c; 
    }
    
    public void establecerValorVehiculo(double c) {
        valorVehiculo = c;
    }
    
    public void calcularValorMatricula(double c) {
        valorMatricula = (valorVehiculo * 0.002) * (2022 - anioFabricacion);
    }
    
    
    public String obtenerCedulaDuenio() {
        return cedulaDuenio;
    }
    
    public String obtenerMarcaVehiculo() {
        return marcaVehiculo;
    }
    
    public double obtenerAnioFabricacion() {
        return anioFabricacion;
    }
    
    public double obtenerValorVehiculo() {
        return valorVehiculo;
    }
    
    public double obtenerValorMatricula() {
        return valorMatricula;
    }
    
    
    @Override
    public String toString() {
        String cadena = String.format("Automotor \n"
                + "Cedula del Dueño: %s\n"
                + "Marca de Vehiculo: %s\n"
                + "Año de fabricacion: %s\n"
                + "Valor del Vehiculo: %s\n"
                + "Valor de la Matricula: %s\n",
                obtenerCedulaDuenio(),
                obtenerMarcaVehiculo(),
                obtenerAnioFabricacion(),
                obtenerValorVehiculo(),
                obtenerValorMatricula());
          
        return cadena;   
    }  
}