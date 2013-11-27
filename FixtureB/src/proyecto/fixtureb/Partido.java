package proyecto.fixtureb;

public class Partido {
	
	private String equipo1;
	private String equipo2;
	private int golesEquipo1;
	private int golesEquipo2;
	
	
	
	public Partido(String equipo1, String equipo2, int golesEquipo1, int golesEquipo2) {
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
		this.golesEquipo1 = golesEquipo1;
		this.golesEquipo2 = golesEquipo2;
	}

	public String getEquipo1() {
		return equipo1;
	}
	public void setEquipo1(String equipo1) {
		this.equipo1 = equipo1;
	}
	public String getEquipo2() {
		return equipo2;
	}
	public void setEquipo2(String equipo2) {
		this.equipo2 = equipo2;
	}
	public int getGolesEquipo1() {
		return golesEquipo1;
	}
	public void setGolesEquipo1(int golesEquipo1) {
		this.golesEquipo1 = golesEquipo1;
	}
	public int getGolesEquipo2() {
		return golesEquipo2;
	}
	public void setGolesEquipo2(int golesEquipo2) {
		this.golesEquipo2 = golesEquipo2;
	}
	
	 /**
	  * Si el equipo 1 gana, pone 1, si el equipo 2 gana, pone 2, empate 0;
	  * @return
	  */
	public String getResultadostring(){
		if (golesEquipo1>golesEquipo2){
			return equipo1;
		}else if (golesEquipo1<golesEquipo2){
			return equipo2;
		}
		return "a";
	}
	
	 /**
	  * Si el equipo 1 gana, pone 1, si el equipo 2 gana, pone 2, empate 0;
	  * @return
	  */
//	public int getResultado(){
//		if (golesEquipo1>golesEquipo2){
//			return golesEquipo1;
//		}else if (golesEquipo1<golesEquipo2){
//			return golesEquipo2;
//		}
//		return 2;
//		return golesEquipo1, golesEquipo2;
//	}
	
	/**
	 * Si el equipo que buscamos es el 1 retorna 1
	 * , si es el 2 retorna 2
	 * Si no no existe.
	 */
	public int numEquipo(String equipoFind){
		if (equipo1.equals(equipoFind)){
			return 1;
		}else if (equipo2.equals(equipoFind)){
			return 2;
		}
		return 0;
	}
	
	/**
	 * Si el equipo que buscamos es el 1 retorna 1
	 * , si es el 2 retorna 2
	 * Si no no existe.
	 */
	public boolean isEquipo(String equipoFind){
		if (equipo1.equals(equipoFind)){
			return true;
		}else if (equipo2.equals(equipoFind)){
			return true;
		}
		return false;
	}
	
	/**
	 * Retorna si un equipo gano
	 * 
	 */
//	public boolean isGanador(String equipoFind){
//		int gano = this.getResultado();
//		if (gano == 1 && equipo1.equals(equipoFind)) return true;
//			if (gano == 2 && equipo2.equals(equipoFind)) return true;
//			
//		return false;
//	}
}
