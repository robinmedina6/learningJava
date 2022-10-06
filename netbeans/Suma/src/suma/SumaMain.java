package suma;

import java.util.Scanner;

public class SumaMain {

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dame el primer valor: ");
        int numUno = entrada.nextInt();

        System.out.println("Dame el Segundo valor: ");
        int numDos = entrada.nextInt();

        Suma valores = new Suma(numUno, numDos);
        valores.Imprimir();
    }
}
