
package com.mycompany.trabajo1;

import java.util.Scanner;

public class Circulo {
    public static void main ( String [] args ) {
        
        Scanner entrada = new Scanner( System.in);
        
        float radio,area,circunferencia;
        System.out.println("Ponga el radio del circulo");
        radio = entrada.nextFloat();
        area=(float)(Math.PI*Math.pow(radio, 2));
        circunferencia=(float)(2*Math.PI*radio);
        
        System.out.println("El area y circunferencia del circulo con radio "+ radio +" es:");
        System.out.println(area +" y "+circunferencia);
    }
}
