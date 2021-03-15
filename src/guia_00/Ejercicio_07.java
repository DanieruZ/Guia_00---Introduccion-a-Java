package guia_00;

import java.io.PrintStream;
import java.util.Scanner;

/****************************************************************
 *
 * 7. Programa Java que declare una variable C de tipo entero y asignarle un valor. A
 *	  continuación show un mensaje indicando si el valor de C es positivo o negativo,
 *	  si es par o impar, si es múltiplo de 5, si es múltiplo de 10 y si es mayor o menor que
 *	  100.
 *
 ***************************************************************/

public class Ejercicio_07 {

    public static PrintStream show = System.out;
    public static Scanner scan = new Scanner(System.in);

    public static void resolverEjercicio_07() {
        scan.reset();

        int C = (int) (Math.random() * 500 - 250);

        show.println("  -------------------");
        show.println(" |   Ejercicio 07.   |");
        show.println("  -------------------");
        show.println("\n");

        if(C == 0) {
            show.println("El valor de 'C' es: 0, es un numero neutro, es par y multiplo de todos los numeros.");

        }else {
            String numSigno = (C > 0) ? "positivo" : "negativo";
            String numParidad = (C % 2 == 0) ? "par" : "impar";
            String numMultiplo5 = (C % 5 == 0) ? "multiplo de 5" : "no es multiplo de 5";
            String numMultiplo10 = (C % 10 == 0) ? "multiplo de 10" : "no es multiplo de 10";

            show.printf("El valor de 'C' es: %s, es un numero %s, %s, %s y %s.\n",C,numSigno,numParidad,numMultiplo5,numMultiplo10);
        }
    }
}
