/*
 * Escribir un programa que pida una frase y la muestre toda en mayúsculas
 * y después toda en minúsculas.
 * Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package ejerciciosguia2java;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author Usuario
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String nombre = leer.nextLine();
        System.out.println("En Mayúsculas: "+ nombre.toUpperCase());
        System.out.println("En Minúsculas: "+ nombre.toLowerCase());        
    }
    
}
