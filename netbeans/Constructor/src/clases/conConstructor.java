package clases;

import java.util.Scanner;

public class conConstructor {

    public conConstructor() {
        Scanner entrada = new Scanner(System.in);
        String nombre ;
        System.out.println("ingrese Nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Tu nombre: " + nombre);
    }
}
