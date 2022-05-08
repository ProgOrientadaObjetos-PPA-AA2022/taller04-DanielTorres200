/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidadfinanciera;

/**
 *
 * @author spart
 */
public class Ejecutor {
    public static void main(String[] args){
        EntidadFinanciera vehiculo1 = new EntidadFinanciera("Freddy", "Banco de Loja");
        EntidadFinanciera vehiculo2 = new EntidadFinanciera("Jessica", "Banco del Pacifico");
        
        vehiculo1.establecerValorCheque(1200);
        vehiculo1.establecerComision(0);
        System.out.printf("%s\n",vehiculo1);
        
        vehiculo1.establecerValorCheque(1200);
        vehiculo1.establecerComision(0);
        System.out.printf("%s\n",vehiculo1);

    }
}
