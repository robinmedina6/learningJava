package com.club;

import java.util.Scanner;

public class Socio {
	private String nombre;
	private int antiguedad;
	public Socio(Scanner entrada) {
		System.out.println("Nombre socio: ");
		this.nombre=entrada.nextLine();

		System.out.println("Antiguedad: ");
		this.antiguedad=entrada.nextInt();
		entrada.nextLine();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getAntiguedad() {
		return antiguedad;
	}
	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
}
