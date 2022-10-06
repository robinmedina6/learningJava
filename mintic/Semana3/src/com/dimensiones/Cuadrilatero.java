package com.dimensiones;

public class Cuadrilatero extends Dimensiones {
	public String tipoCuadrilatero;
	public void area() {
		System.out.println(this.base*altura);
	}
	public void imprimirTipo() {
			System.out.println("tipoTriangulo: " + tipoCuadrilatero);
	}
}
