/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajo1;

import java.util.Scanner;


public class Ejercicio_14 {
    public static void main ( String [] args ) {
        
        Scanner entrada = new Scanner( System.in);
        double numero,cuadrado,cubo;
        System.out.println("Digite el número");
        numero = entrada.nextDouble();
        cuadrado=Math.pow(numero, 2);
        cubo=Math.pow(numero, 3);
        
        
        System.out.println("La potencia cuadrada y cubica de "+numero+" es:");
        System.out.println((int)cuadrado +" y "+(int)cubo);
    }
}