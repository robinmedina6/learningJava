package perfil.profesional;

public class Profesional extends JefeArea {
	public String cargo;

	public Profesional(String nombre, String apellido, String sexo, String edad, String area, String cargo) {
		super(nombre, apellido, sexo, edad, area);
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		return "Profesional [cargo=" + cargo + ", area=" + area + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", sexo=" + sexo + ", edad=" + edad + "]";
	}
	
}
