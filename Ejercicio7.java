/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7.pkg7;

import java.util.Scanner;

/**
 *
 * @author aparracorbacho
 */
public class Boletin77 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      System.out.println("Opcion 1 para calcular el area de un cuadrado");
      System.out.println("Opcion 2 para calcular el area de un triangulo");
      System.out.println("Opcion 3 para calcular el area de un circulo");
      
       System.out.println("Introduce la opción elegida");
       Scanner opcionTeclado = new Scanner(System.in);
       int opcion = opcionTeclado.nextInt();
       
       switch(opcion){
            
            case 1:
                System.out.println("Introduce el lado del cuadrado");
                Scanner ladoTeclado = new Scanner(System.in);
                float lado = ladoTeclado.nextFloat();
                System.out.println("El ara del cuadrado es: "+(lado*lado));
                break;
                                
            case 2: 
                System.out.println("Introduce la base del triangulo");
                Scanner baseTeclado = new Scanner(System.in);
                float base = baseTeclado.nextFloat();
                
                System.out.println("Introduce la altura del triguangulo");
                Scanner alturaTeclado = new Scanner(System.in);
                float altura = alturaTeclado.nextFloat();
                System.out.println("El ara del triangulo es: "+(base*altura)/2);
                break;
                
            case 3: 
                System.out.println("Introduce el radio");
                Scanner radioTeclado = new Scanner(System.in);
                float radio = radioTeclado.nextFloat();
                System.out.println("El ara del circulo es: "+3.14*Math.pow(radio,2));
                break;
            default: System.out.println("No es una opcion valida"); break;
            
        }
        
    }
    
}
