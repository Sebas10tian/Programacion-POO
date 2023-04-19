/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia2java;

import java.util.Scanner;

/**
Escribir un programa que pida dos números enteros por teclado y calcule
la suma de los dos. El programa deberá después mostrar el resultado de
la suma
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese el primer sumando");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo sumando");
        int num2 = leer.nextInt();
        
        int suma= num1 + num2;
        System.out.println("El resultado de la suma es: "+suma);
        
        
        
    }
    
}
