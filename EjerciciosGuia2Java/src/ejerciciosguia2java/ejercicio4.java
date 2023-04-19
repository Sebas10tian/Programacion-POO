/*
 * Dada una cantidad de grados centígrados se debe mostrar su
 * equivalente en grados Fahrenheit. La fórmula correspondiente es: 
 * F = 32 + (9 * C / 5).
 */
package ejerciciosguia2java;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese la temperatura en °C");
        int cent = leer.nextInt();
        double fahr = 32 + (9 * cent / 5);
        System.out.println(cent+" °C equivale a "+fahr+" °F");
    }
    
}
