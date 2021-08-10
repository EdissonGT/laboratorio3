
package com.mycompany.laboratorio3;
import java.util.Scanner;

/**
 *
 * @author EDISSON
 */
public class ejercicio6 {
        public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         
        int a, b;
       
        System.out.println("Ingrese el valor de a");
        a = entrada.nextInt();
        System.out.println("Ingrese el valor de b");
        b = entrada.nextInt();
        
        
        double ael = Math.pow(a, 2);
        double bel = Math.pow(b, 2);
        System.out.println(ael + "+" +("2("+"("+a+")"+"("+b+")"+")")+"+"+bel);
        
        double suma;
        
        suma = ael+(2*a*b)+bel;
        System.out.println("El resultado es: "+ suma);
        
        
         }
}
