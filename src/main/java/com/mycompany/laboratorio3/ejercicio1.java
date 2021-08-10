package com.mycompany.laboratorio3;

import java.util.Scanner;

public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        //declaramos las variables
        float nota1, nota2, nota3, resultado;

        //Pedimos las 3 notas
        System.out.println("Ingrese Nota 1");
        nota1 = entrada.nextFloat();
        System.out.println("Ingrese Nota 2");
        nota2 = entrada.nextFloat();
        System.out.println("Ingrese Nota 3");
        nota3 = entrada.nextFloat();
        
        resultado = nota1 + nota2 + nota3;
        
        
        System.out.println("El resultado de la suma de las 3 notas es: "+ resultado);
    }

}
