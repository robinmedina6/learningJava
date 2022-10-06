/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Scanner;

public class Clase_Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Recursividad recursividad = new Recursividad();
        System.out.println("Ingrese el numero para calcular factorial: ");
        recursividad.Factorial(entrada.nextInt());
        
    }
}
