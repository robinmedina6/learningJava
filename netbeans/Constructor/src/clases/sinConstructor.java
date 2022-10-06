package clases;

import java.util.Scanner;

public class sinConstructor {

    private Scanner entrada = new Scanner(System.in);
    String nombre = "";

    public void PedirNombre() {
        System.out.println("cual es tu nombre: ");
        nombre = entrada.nextLine();
    }

    public void imprimirNombre() {
        System.out.println("tu nombre: " + nombre);
    }
}
