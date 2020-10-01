package ejercicio_11;

import java.util.Scanner;

/**
 * 11. Recoger por teclado un número que introduzca el usuario y mostrar por
 * pantalla si se trata de un número primo o no.
 *
 */
public class Ejercicio_11 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.print("Introduzca un número: ");
        numero = teclado.nextInt();

        if (numero <= 1) {
            System.out.println("El " + numero + " no es primo.");
        } else {
            //Hacemos un casting para que nos devuelva un numero entero
            int raiz = (int) Math.sqrt(numero);
            int contador = 0;

            //Contamos el numero de divisibles
            for (int i = raiz; i > 1; i--) {
                if (numero % i == 0) {
                    contador++;
                }
            }

            /*Segun el numero de divisibles, sabemos si es primo o no
                 * Si es primo el contador sera 0
             */

            if (contador < 1) {
                System.out.println("El numero " + numero + " es primo.");
            } else {
                System.out.println("El numero " + numero + " no es primo.");
            }
        }

    }
}
