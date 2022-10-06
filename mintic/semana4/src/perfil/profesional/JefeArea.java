package perfil.profesional;

public class JefeArea extends Persona {
	public String area;

	public JefeArea(String nombre, String apellido, String sexo, String edad, String area) {
		super(nombre, apellido, sexo, edad);
		this.area = area;
	}

	@Override
	public String toString() {
		return "JefeArea [area=" + area + ", nombre=" + nombre + ", apellido=" + apellido + ", sexo=" + sexo + ", edad="
				+ edad + "]";
	}
	
	
}
