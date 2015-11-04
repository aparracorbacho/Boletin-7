/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author MotherFoquita
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        short num1, num2;
        System.out.println("Introduce un numero");
        Scanner num1Teclado = new Scanner(System.in);
        num1 = num1Teclado.nextShort();
        
        System.out.println("Introduce outro numero");
        Scanner num2Teclado = new Scanner(System.in);
        num2 = num2Teclado.nextShort();
        if (num1>=num2) {
            System.out.println("A resta dos numeros é "+(num1-num2));
        } else {
            System.out.println("A suma dos numeros é "+(num1+num2));
        }
    }
    
}
