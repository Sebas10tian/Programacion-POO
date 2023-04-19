/*
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el
usuario, validando que el primer número múltiplo del segundo e imprima si el
primer número es múltiplo del segundo, sino informe que no lo son.
 */
package ejerciciosguia4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ejerciciosguia4_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 números");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        EsMultiplo(num1, num2);
    }

    public static void EsMultiplo(int A, int B) {
        if (A % B == 0) {
            System.out.println("Es Multiplo");
        } else {
            System.out.println("No es Multiplo");
        }

    }
}
