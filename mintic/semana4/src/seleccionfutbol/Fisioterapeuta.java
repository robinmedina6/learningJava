package seleccionfutbol;

public class Fisioterapeuta extends SeleccionFutbol{
	private String especialidad;

	public Fisioterapeuta(String nombre, String apellido, int id, int edad, String especialidad) {
		super(nombre, apellido, id, edad);
		this.especialidad = especialidad;
	}

	@Override
	public void entrenar() {
		// TODO Auto-generated method stub
		System.out.println("estoy Entrenando a los jugadores como fisioterapeuta");
	}
}
