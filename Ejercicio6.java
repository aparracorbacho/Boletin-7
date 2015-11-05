/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7_6;

import java.util.Scanner;

/**
 *
 * @author aparracorbacho
 */
public class Boletin7_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float num1;
        System.out.println("Introduce el numero de unidades vendidas");
        Scanner num1Teclado = new Scanner(System.in);
        num1 = num1Teclado.nextFloat();
        
        System.out.println("Introduce el nombre del articulo");
        Scanner nome1Teclado = new Scanner(System.in);
        String nome1 = nome1Teclado.next();
        
        if (num1<=100){
            System.out.println(nome1 +" Es un articulo de bajo consumo");
        } else if (num1>100 && num1<=500) {
            System.out.println(nome1 +" Es un articulo de consumo medio");
        } else if (num1>500 && num1<1000) {
            System.out.println(nome1 +" Es un articulo de consumo alto");
        } else {
            System.out.println(nome1 +" Es un articulo de primera necesidad");
        }
    }
    
}
