package division;

import java.util.Scanner;

/**
 *
 * @author robin_vfh49pm
 */
public class ClaseDivision {

    public static void main(String[] args) {

        try {
            //codigo

            int valor1, valor2, resultado;
            Scanner entrada = new Scanner(System.in);

            System.out.println("Dame el primer numero");
            valor1 = entrada.nextInt();

            System.out.println("Dame el segundo Valor");
            valor2 = entrada.nextInt();

            resultado = valor1 / valor2;

            System.out.println("Division es igual a: " + resultado);

        } catch (Exception e) {
            //comportamiento si error
            System.out.println("Error !!!!" + e);
        } finally{
            System.out.println("Operacion concluida");
        }
                
    }
}
