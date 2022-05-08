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
public class Ejecutor {
    public static void main(String[] args){
        Calificacion prom1 = new Calificacion("Kevin");
        Calificacion prom2 = new Calificacion("Miguel");
        
        prom1.establecerCalificacionM1(8);
        prom1.establecerCalificacionM2(10);
        prom1.establecerCalificacionM3(7.5);
        prom1.calculopromedioCalificaciones();
        System.out.printf("%s\n",prom1);
        
        prom2.establecerCalificacionM1(9);
        prom2.establecerCalificacionM2(7.25);
        prom2.establecerCalificacionM3(6.5);
        prom2.calculopromedioCalificaciones();
        System.out.printf("%s\n",prom2);
        
    }
}
