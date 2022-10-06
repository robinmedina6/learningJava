package seleccionfutbol;

public class DirectorTecnico extends SeleccionFutbol {
	private int Experiencia;

	public DirectorTecnico(String nombre, String apellido, int id, int edad, int experiencia) {
		super(nombre, apellido, id, edad);
		Experiencia = experiencia;
	}
	
	@Override
	public void entrenar() {
		// TODO Auto-generated method stub
		System.out.println("Les indico como entrenar a los jugadores");
	}
	
}
