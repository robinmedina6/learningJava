package com.fruta;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingrese el nombre: ");
		String nombre = entrada.nextLine();
		String color = entrada.nextLine();
		double peso = entrada.nextDouble();
		Fruta fruta1 = new Fruta(nombre, color, peso);
		fruta1.precioFruta(peso);		fruta1.datosFruta();
	}
}
