package clases;

public class Persona {
//atributos
	String nombre;
	int edad;

	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		
	}
	
	public void MostrarDatos() {

		System.out.println("el nombre: "+nombre);
		System.out.println("la edad:  "+edad);
	}
}
