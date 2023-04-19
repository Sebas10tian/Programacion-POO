/*
Crea una aplicación que nos pida un número por teclado y con una
función se lo pasamos por parámetro para que nos indique si es o no un
número primo, debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo.
Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo,
17 si es primo.
 */
package ejerciciosguia4;

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
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el número para verificar");
        int num = leer.nextInt();
        boolean esPrimo = numerosPrimos(num);
        if (esPrimo) {
            System.out.println("Es Primo");
        } else {
            System.out.println("No es Primo");
        }
    }

    private static boolean numerosPrimos(int num) {
        boolean esPrimo = false;
        int i = 2, aux;

        do {
            if (num % i == 0) {
                i = num;
                break;
            } else {
                if (i >= (Math.sqrt(num))) {
                    esPrimo = true;
                    i = num;
                    break;
                } else {
                    i++;
                }
            }
        } while (i < num);

        return (esPrimo);
    }

}
