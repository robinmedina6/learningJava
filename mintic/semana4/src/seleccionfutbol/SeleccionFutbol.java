package seleccionfutbol;

public class SeleccionFutbol {
	protected String nombre;
	protected String apellido;
	public int id;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public SeleccionFutbol(String nombre, String apellido, int id, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.id = id;
		this.edad = edad;
	}
	
	public int edad;
	
	public void viajar() {
		System.out.println("estoy viajando");
	}
	public void concentrar() {
		System.out.println("estoy concentrado");
	}
	public void entrenar() {
		System.out.println("estoy entrenando");
	}
	public void jugarPartido() {
		System.out.println("estoy en el partido");
	}
}
