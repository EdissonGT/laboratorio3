/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.laboratorio3;
import java.util.Scanner;
/**
 *
 * @author EDISSON
 */
public class ejercicio5 {
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         
         float part, primerp, segundop, examenf, cfinal;
         
        System.out.println("Ingrese el porcentaje obtenido de Participacion sobre 10%:");
        part = entrada.nextFloat();
        System.out.println("Ingrese el porcentaje obtenido de Primer Parcial sobre 25%:");
        primerp = entrada.nextFloat();
        System.out.println("Ingrese el porcentaje obtenido del Segundo Parcial sobre 25%:");
        segundop = entrada.nextFloat();
        System.out.println("Ingrese el porcentaje obtenido del Examen Final sobre 40%:");
        examenf = entrada.nextFloat();
        
        cfinal = part + primerp + segundop + examenf;
        
        System.out.println("La calificacion Final es de: "+ cfinal + "%");
        
         }
}
