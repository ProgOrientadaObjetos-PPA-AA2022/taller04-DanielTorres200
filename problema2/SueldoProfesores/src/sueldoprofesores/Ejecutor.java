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
public class Ejecutor {
    public static void main(String[] args){
        SueldoProfesores sueldo1 = new SueldoProfesores("Daniel", "Torres");
        SueldoProfesores sueldo2 = new SueldoProfesores("Byron", "Castillo");
        
        sueldo1.establecerSueldoBasico(800);
        sueldo1.establecerSueldoTotal(0);
        sueldo1.establecerCedula("1150234658");
        System.out.printf("%s\n",sueldo1);
        
        sueldo2.establecerSueldoBasico(800);
        sueldo2.establecerSueldoTotal(0);
        sueldo2.establecerCedula("1150234658");
        System.out.printf("%s\n",sueldo2);
    }
}

