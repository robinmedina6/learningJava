package clases;

public class Atleta {
	
	//atributos
	private int numeroAtleta;
	private String nombre;
	private float tiempo;
	//metodos
	public Atleta(int numeroAtleta, String nombre, float tiempo) {
		this.numeroAtleta=numeroAtleta;
		this.nombre=nombre;
		this.tiempo=tiempo;
	}
	public float getTiempo() {
		return tiempo;
	}
	public String obtenerInformacion() {
		return "nro: " + numeroAtleta + "\nnombre: " + nombre + "\ntiempo: "+tiempo;
		
		
	}
}
