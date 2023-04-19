/*
 * Diseñe una función que pida el nombre y la edad de N personas e
 * imprima los datos de las personas ingresadas por teclado e indique si
 * son mayores o menores de edad. Después de cada persona, el programa
 * debe preguntarle al usuario si quiere seguir mostrando personas y
 * frenar cuando el usuario ingrese la palabra “No”.
 */
package ejerciciosguia4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String opt;
        String esc;

        do {
            esc = datos();
            System.out.println(esc);
            System.out.println("Desde continuar? (si/no)");
            opt = leer.nextLine();

        } while (!opt.equalsIgnoreCase("no"));
        System.out.println("Salio del programa");

    }

    /**
     *
     * @return
     */
    public static String datos() {
        String escribir;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la persona");
        String nombre = leer.nextLine();
        System.out.println("Ingrese la edad de la persona");
        int edad = leer.nextInt();
        if (edad <= 18) {
            escribir = nombre + " es Menor de edad";
        } else {
            escribir = nombre + " es Mayor de edad";
        }
        return escribir;
    }
}
