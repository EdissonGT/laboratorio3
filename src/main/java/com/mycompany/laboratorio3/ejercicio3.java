
package com.mycompany.laboratorio3;
import java.util.Scanner;
/**
 *
 * @author EDISSON
 */
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        float rodrigo, andrea, esteban, total;
        
        System.out.println("Ingrese los dolares que tiene Rodrigo");
        rodrigo = entrada.nextFloat();
        
        andrea = rodrigo/2;
        esteban = (rodrigo + andrea)/2;
        total = rodrigo+andrea+esteban;
        
        System.out.println("Rodrigo tiene "+ rodrigo + "$");
        System.out.println("Andrea tiene "+ andrea + "$");
        System.out.println("Esteban tiene "+ esteban + "$");
        System.out.println("El total entre los 3 es de: "+ total + "$");
    }
}
