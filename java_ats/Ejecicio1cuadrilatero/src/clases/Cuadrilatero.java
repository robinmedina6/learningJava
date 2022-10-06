package clases;

public class Cuadrilatero {
//atributos
	private float lado1;
	private float lado2;

	// Metodos

	// metodo constructor 1 Cuadrilatero
	public Cuadrilatero(float lado1, float lado2) {
		this.lado1 = lado1;
		this.lado2 = lado2;

	}

	// metodo constructor 2 cuadrilatero (cuadrado)
	public Cuadrilatero(float lado1) {
		this.lado1= this.lado2= lado1;
	}

	public float getPerimetro() {
		return 2*(this.lado1+this.lado2);
	}
	public float getArea() {
		return  (lado1*lado2);
		
	}
}
