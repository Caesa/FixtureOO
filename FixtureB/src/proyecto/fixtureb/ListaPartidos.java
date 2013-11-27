package proyecto.fixtureb;

import java.util.ArrayList;

public abstract class ListaPartidos {
	
	public static ArrayList<Partido> partidos = new ArrayList<Partido>();

	public static ArrayList<Partido> getPartidos() {
		return partidos;
	}

	public static void addPartido(Partido partido) {
		ListaPartidos.partidos.add(partido);
	}
	
	public static int partidosPorEquipo(String equipo){
		int cantPartidos=0;
		for (Partido part:partidos){
			if (part.isEquipo(equipo)){
				Equipo eq = ListaEquipos.buscarequipo(equipo);
				if(eq!=null){
					eq.setPartjugados(eq.getPartjugados()+1);
				}
			}
		}
		return cantPartidos;
	}
	
	public static int getCantidad(){
		return partidos.size();
	}
	
	
}
