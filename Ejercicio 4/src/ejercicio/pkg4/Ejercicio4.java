/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg4;

import java.util.Scanner;

/**
 *
 * @author aparracorbacho
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float peso1, peso2;
        System.out.println("Introduce el nombre de la primera persona");
        Scanner nome1Teclado = new Scanner(System.in);
        String nome1 = nome1Teclado.next();
        
        System.out.println("Introduce o peso da primeira persoa");
        Scanner peso1Teclado = new Scanner(System.in);
        peso1 = peso1Teclado.nextFloat();
        
        System.out.println("Introduce el nombre de la segunda persona");
        Scanner nome2Teclado = new Scanner(System.in);
        String nome2 = nome2Teclado.next();
        
        System.out.println("Introduce o peso da primeira persoa");
        Scanner peso2Teclado = new Scanner(System.in);
        peso2 = peso2Teclado.nextFloat();
        
        if (peso1>peso2) {
            System.out.println(nome1 +" Es quien más pesa y la diferencia es de "+(peso1-peso2) + "kg");
        } else if (peso1<peso2) {
            System.out.println(nome2 +" Es quien más pesa y la diferencia es de "+(peso2-peso1) + "kg");
        } else { 
            System.out.println("Pesan lo mismo");
        }
    
}
}
