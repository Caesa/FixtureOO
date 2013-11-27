package proyecto.fixtureb;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class ListaEquipos {
	
	public static ArrayList<Equipo> equipos = new ArrayList<Equipo>();

	public static ArrayList<Equipo> getEquipos() {
		return equipos;
	}

	public static void addEquipo(Equipo equipo) {
		ListaEquipos.equipos.add(equipo);
	}
	public static int getCantidad(){
		return equipos.size();
	}
	public static Equipo buscarequipo(String equipo){
		for (Equipo eq:equipos){
			if (eq.getNombre().equals(equipo)){
				return eq;
			}
		}
		return null;
	}
	
	public static String getNombreEquipo(int position){
		Equipo eq = equipos.get(position);
		return eq.getNombre();
	}
	
	
	public static void Remove(String equipo){
		
		for(int i=0; i<equipos.size();i++){
			Equipo eq = equipos.get(i);
			if(eq.getNombre().equals(equipo)){
				equipos.remove(i);
				equipos.trimToSize();
			}
		}
	}
	
	public static int GetPosition(Equipo eq){
		int position = 0;
		for(Equipo equipo:equipos){
			if(equipo.equals(eq)){
				return position;
			}
			position = position+1;
		}
		return 999;
	}
	
	public static String GetEquipo1(){
		for (Equipo eq:equipos){
			if (ListaPartidos.getCantidad()==0){
				Equipo equi1 = equipos.get(0);
				return equi1.getNombre();
			}else{
				for (int i=1; i<equipos.size(); i++){
					Equipo equipo1 = equipos.get(i);
					if(equipo1.getPartjugados()<eq.getPartjugados()){
						return equipo1.getNombre();
					}
				}
			}
		}
		Equipo equipo1 = equipos.get(0);
		return equipo1.getNombre();
	}
	
	public static String GetEquipo2(){
		for (Equipo eq:equipos){
			if (ListaPartidos.getCantidad()==0){
				Equipo equi2 = equipos.get(1);
				return equi2.getNombre();
			}else{
				for (int i=1; i<equipos.size(); i++){
					Equipo equipo1 = equipos.get(i);
					if(equipo1.getPartjugados()<eq.getPartjugados()){
					Equipo equipo2 = equipos.get(i+1);
					return equipo2.getNombre();
				}
				}
			}
		}
		Equipo equipo1 = equipos.get(1);
		return equipo1.getNombre();
	}

}
