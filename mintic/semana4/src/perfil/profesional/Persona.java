package perfil.profesional;

public class Persona {
public String nombre;
public String apellido;
public String sexo;
public String edad;

public Persona(String nombre, String apellido, String sexo, String edad) {
	super();
	this.nombre = nombre;
	this.apellido = apellido;
	this.sexo = sexo;
	this.edad = edad;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

@Override
public String toString() {
	return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", sexo=" + sexo + ", edad=" + edad + "]";
}

}
