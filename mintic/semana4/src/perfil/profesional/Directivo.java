package perfil.profesional;

public class Directivo extends Persona {
	public String dependencia;
	

	public Directivo(String nombre, String apellido, String sexo, String edad, String dependencia) {
		super(nombre, apellido, sexo, edad);
		this.dependencia = dependencia;
	}


	@Override
	public String toString() {
		return "Directivo [dependencia=" + dependencia + ", nombre=" + nombre + ", apellido=" + apellido + ", sexo="
				+ sexo + ", edad=" + edad + "]";
	}
	
	
}
