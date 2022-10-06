/*
* creado por robinson
* creado el dia de hoy
*/
package inversorpalabras;

import java.util.Scanner;

public class InversorPalabras {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la Palabra: ");
        String cadInicial = entrada.nextLine(), cadInversa = "";
        int i = cadInicial.length();
        while (i > 0) {
            cadInversa += cadInicial.substring(i - 1, i);
            i--;
        }
        System.out.println("nueva cadena: " + cadInversa);
    }

}
