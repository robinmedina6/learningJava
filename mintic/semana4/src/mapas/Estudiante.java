package mapas;

public class Estudiante extends Persona {
	private String curso;
	private String barrio;
	

	public Estudiante(String nombre, String apellido, String curso, String barrio) {
		super(nombre, apellido);
		this.curso = curso;
		this.barrio = barrio;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getBarrio() {
		return barrio;
	}
	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}
	
}
