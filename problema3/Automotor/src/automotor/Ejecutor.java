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
public class Ejecutor {
    public static void main(String[] args){
        Automotor vehiculo1 = new Automotor("1140336942", "Toyota");
        Automotor vehiculo2 = new Automotor("1160663831", "Ford");
        
        vehiculo1.establecerAnioFabricacion(2005);
        vehiculo1.establecerValorVehiculo(35000);
        vehiculo1.calcularValorMatricula(0);
        System.out.printf("%s\n",vehiculo1);
        
        
        vehiculo2.establecerAnioFabricacion(2008);
        vehiculo2.establecerValorVehiculo(55000);
        vehiculo2.calcularValorMatricula(0);
        System.out.printf("%s\n",vehiculo2);

    }
}

