package proyecto.fixtureb;

public class Equipo {

	private String nombre;
	private int partjugados;
	
	public Equipo(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPartjugados() {
		return partjugados;
	}

	public void setPartjugados(int partjugados) {
		this.partjugados = partjugados;
	}
	
	
}
