/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;

import java.util.Scanner;


/**
 *
 * @author alumno
 */
public class JavaApplication21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
       
       
       System.out.print("Ingrese el primer numero: ");
       int num1 = input.nextInt();
       System.out.print("Ingrese el segundo numero:");
       int num2 = input.nextInt();
       double producto = input.nextDouble();
       
       for (int p=0; p<=num2; p++){
       producto = producto + num1;
   }
       System.out.println("El producto es: "+producto);
   }
    }
    


