/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg3;

import java.util.Scanner;

/**
 *
 * @author MotherFoquita
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float num1;
        System.out.println("Introduce un numero");
        Scanner num1Teclado = new Scanner(System.in);
        num1 = num1Teclado.nextShort();
        if (num1>0) {
        System.out.println("+");
        } else if (num1<0) {
        System.out.println("-");
        } else {
        System.out.println("0");    
        }
    }
    
}
