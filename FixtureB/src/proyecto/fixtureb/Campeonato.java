package proyecto.fixtureb;

public class Campeonato {
	String nombre, ronda;
	int cantidadequipos;
	
	public Campeonato(String nombre, int cantidadequipos, String ronda) {
		this.nombre = nombre;
		this.cantidadequipos = cantidadequipos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidadequipos() {
		return cantidadequipos;
	}

	public void setCantidadequipos(int cantidadequipos) {
		this.cantidadequipos = cantidadequipos;
	}
	
	public String getRonda() {
		return ronda;
	}

	public void setRonda() {
		this.ronda = Abstracta.getRonda();
	}
	
	
}
