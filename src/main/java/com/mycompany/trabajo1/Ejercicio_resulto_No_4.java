/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajo1;


import java . util . Scanner ;

public class Ejercicio_resulto_No_4 {
    
    public static void main ( String [] args ) {
    
        float J , A , ANA, M;
        Scanner entrada = new Scanner( System.in);
        System.out.println("¿ cuantos años tiene Juan?");
        J=entrada.nextFloat();
        A=J*2/3;
        ANA=J*4/3;
        M=ANA+A+J;
        System.out.println("Las edades son:");
        System.out.println("Alberto tiene "+(int)A+" años");
        System.out.println("Juan tiene "+(int)J+" años");
        System.out.println("Ana tiene "+(int)ANA+" años ");
        System.out.println("La Mamá de Juan tiene "+ (int)M +" años ");
    }
}