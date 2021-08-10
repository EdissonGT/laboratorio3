
package com.mycompany.laboratorio3;

import java.util.Scanner;

/**
 *
 * @author EDISSON
 */
public class ejercicio7 {
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         
        int hor, Dias, dias2, Semana, hora;
         
        System.out.println("Ingrese el Numero de Horas");
        hor = entrada.nextInt();
        
        Dias = hor / 24;
        Semana = Dias / 7;
        dias2 = (Dias-(Semana*7));
        hora = hor - (((Semana *7)*24)+(dias2*24));
        
        System.out.println("Hay "+Semana+" Semanas con "+ dias2+" Dias y "+ hora + " horas.");
}
    }
