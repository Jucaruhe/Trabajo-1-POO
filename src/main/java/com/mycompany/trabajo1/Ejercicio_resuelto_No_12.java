/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajo1;


public class Ejercicio_resuelto_No_12 {
    
    public static void main ( String [] args ) {
    
        double horas, pagoxhora, RF, salario_b, salario_n;
        
        horas=48;
        pagoxhora=5000;
        salario_b=horas*pagoxhora;
        RF= salario_b*12.5/100;
        salario_n=salario_b-RF;
    
        System.out.println("El salario bruto es: $" + (int)salario_b);
        System.out.println("La retención de la fuente es: $" + (int)RF);
        System.out.println("El salario neto es: $" + (int)salario_n );

    }
}