
package com.mycompany.laboratorio3;
import java.util.Scanner;
/**
 *
 * @author EDISSON
 */
public class ejercicio4 {
     public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         
         int comision, cantidadcarro;
         float ventacarro, resultado, porcentaje, salariototal;
         
        System.out.println("Ingrese la cantidad de vehiculos vendidos");
        cantidadcarro = entrada.nextInt();
        System.out.println("Ingrese el monto total de los vehiculos vendidos");
        ventacarro = entrada.nextFloat();
        
        comision = 150 * cantidadcarro;
        porcentaje = (ventacarro * 5) / 100;
        salariototal = 1000 + comision + porcentaje;
        
        System.out.println("El salario total mensual es de: "+ salariototal);
     }
}
