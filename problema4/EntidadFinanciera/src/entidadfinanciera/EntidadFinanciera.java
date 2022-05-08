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
public class EntidadFinanciera {
    String nombreCliente;
    String nombreBanco;
    double valorCheque;
    double comision;
    
    public EntidadFinanciera(String nombreC, String nombreB) {
        nombreCliente = nombreC;
        nombreBanco = nombreB;
    }
    
    public EntidadFinanciera( double valorC, double valorComision) {
        
        valorCheque = valorC;
        comision = valorComision;
    }
    
    public void establecerNombreCliente(String c) {
        nombreCliente = c ;
    }
    
    public void establecerNombreBanco(String c) {
        nombreBanco = c;       
    }
    
    public void establecerValorCheque(double c) {
        valorCheque = c; 
    }
    
    public void establecerComision(double c) {
        comision = (valorCheque * 0.003);
    }
    
    
    public String obtenerNombreCliente() {
        return nombreCliente;
    }
    
    public String obtenerNombreBanco() {
        return nombreBanco;
    }
    
    public double obtenerValorCheque() {
        return valorCheque;
    }
    
    public double obtenerComision() {
        return comision;
    }

    
    
    @Override
    public String toString() {
        String cadena = String.format("Entidad Financiera \n"
                + "Nombre del cliente: %s\n"
                + "Nombre del banco: %s\n"
                + "Valor del cheque: %s\n"
                + "Comision: %s\n",
                obtenerNombreCliente(),
                obtenerNombreBanco(),
                obtenerValorCheque(),
                obtenerComision());
          
        return cadena;   
    }  
}

