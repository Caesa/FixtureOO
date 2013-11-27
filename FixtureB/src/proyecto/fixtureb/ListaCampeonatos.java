package proyecto.fixtureb;

import java.util.ArrayList;

public abstract class ListaCampeonatos {
	private static ArrayList<Campeonato> campeonatos = new ArrayList<Campeonato>();

	public static ArrayList<Campeonato> getCampeonatos() {
		return campeonatos;
	}

	public static void addCampeonato(Campeonato campeonato) {
		ListaCampeonatos.campeonatos.add(campeonato);
	}
	
//	public static int partidosPorEquipo(String equipo){
//		int cantPartidos=0;
//		for (Partido part.campeonatos){
//			if (part.isEquipo(equipo)) cantPartidos ++;
//		}
//		return cantPartidos;
//	}
	public static void getRonda (String ronda){
		int cantequipos, cantpartidos;
		cantequipos = ListaEquipos.getCantidad();
		cantpartidos = ListaPartidos.getCantidad();
		if(cantpartidos>cantequipos/2){
			
		}
	}

}
