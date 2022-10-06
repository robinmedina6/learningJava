package politicos;

public abstract class Politico extends Persona {
	public String regionRepresentada;
	public String camara;

	public String getRegionRepresentada() {
		return regionRepresentada;
	}

	public void setRegionRepresentada(String regionRepresentada) {
		this.regionRepresentada = regionRepresentada;
	}

	public String getCamara() {
		return camara;
	}

	public void setCamara(String camara) {
		this.camara = camara;
	}

	public Politico(String nombre, String apellido, String regionRepresentada, String camara) {
		super(nombre, apellido);
		this.regionRepresentada = regionRepresentada;
		this.camara = camara;
	}

}
