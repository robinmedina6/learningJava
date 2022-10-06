package clases;

public class Persona {
//atributos
	String nombre;
	int edad;
	String dni;

	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		
	}
	
	public Persona(String dni) {
		this.dni=dni;
	}
	
	public void correr() {
		System.out.println("Soy "+ nombre +" tengo "+ edad+ " años y estoy corriendo una maraton");
		
	}
	public void correr(int km) {
		System.out.println("he corrido " + km +"kilometris");
		
	}
}
