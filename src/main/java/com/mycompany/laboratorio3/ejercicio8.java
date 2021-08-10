package com.mycompany.laboratorio3;
import java.util.Scanner;

public class ejercicio8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c, x1, x2;
        System.out.println("Ingrese el valor de a: ");
        a = scan.nextInt();
        System.out.println("Ingrese el valor de b: ");
        b = scan.nextInt();
        System.out.println("Ingrese el valor de c: ");
        c = scan.nextInt();

        System.out.println("Para la forma: ax^2 + bx + c = 0");

        double b2 = Math.pow(b, 2);
        double op1;
        double m4ac, total, total2, multia;
        m4ac = (4 * a * c);
        op1 = b2 - m4ac;

        double resultado = Math.sqrt(op1);
        System.out.println("La raiz es: " + resultado);
        multia = a * 2;
        total = (-(b) + (resultado)) / multia;

        System.out.println("El valor para X1 es:  " + total);
        total2 = (-(b) - (resultado)) / multia;
        System.out.println("El valor para X2 es:  " + total2);
    }

}
