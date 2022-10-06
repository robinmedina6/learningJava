package perfil.profesional;

public class Tecnologo  extends JefeArea{
	public String tarea;
	
	public Tecnologo(String nombre, String apellido, String sexo, String edad, String area, String tarea) {
		super(nombre, apellido, sexo, edad, area);
		this.tarea = tarea;
	}

	@Override
	public String toString() {
		return "Tecnologo [tarea=" + tarea + ", area=" + area + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", sexo=" + sexo + ", edad=" + edad + "]";
	}
	
}
