package seleccionfutbol;

public class Jugador extends SeleccionFutbol {
	private int numero;
	private int posicion;

	public Jugador(String nombre, String apellido, int id, int edad, int numero, int posicion) {
		super(nombre, apellido, id, edad);
		this.numero = numero;
		this.posicion = posicion;
	}

	@Override
	public void entrenar() {
		// TODO Auto-generated method stub
		System.out.println("estoy entrenando");
	}
}
