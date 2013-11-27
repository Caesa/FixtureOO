package proyecto.fixtureb;

import android.util.Log;

public abstract class Abstracta {
	public static String ronda;
	private static int cantequipos = ListaEquipos.getCantidad();
	private static int cantpartidos = ListaPartidos.getCantidad();

	public static String getRonda() {
		cantpartidos = ListaPartidos.getCantidad();
		cantequipos = ListaEquipos.getCantidad();
		Log.d("Emi","get ronda activado con cantequipos"+cantequipos+" y cantpartidos "+cantpartidos);
		if(cantpartidos==0){
			if(cantequipos==2){
				ronda="Final";
				Abstracta.setRonda(ronda);
			}
			if(cantequipos==4){
				ronda="Semifinal";
				Abstracta.setRonda(ronda);
			}
			if(cantequipos==8){
				ronda="Cuartos de final";
				Abstracta.setRonda(ronda);
			}
			if(cantequipos==16){
				ronda="Octavos de final";
				Abstracta.setRonda(ronda);
			}
			if(cantequipos==32){
				ronda="Dieciseisavos de final";
				Abstracta.setRonda(ronda);
			}
		}
		return ronda;
	}

	public static void setRonda(String ron) {
		Abstracta.ronda = ron;
	}
	public static String AntRonda() {
		return Abstracta.ronda;
	}
	
	public static String ProxRonda(String ronda){
		Log.d("Emi","ProxRonda activado");
		String devolver = "";
		cantpartidos = ListaPartidos.getCantidad();
		cantequipos = ListaEquipos.getCantidad();
		Log.d("Emi","ronda en proxronda es"+ronda+ "con cantequipos"+cantequipos);
		if(ronda.equals("Final")){
			devolver = "Termino";
		}else{
			if(cantequipos==2){
				Log.d("Emi","ronda en proxronda es"+ronda);
				if(ronda.equals("Semifinal")){
					devolver = "Final";
				}
			}
			if(cantequipos==4){
				if(ronda.equals("Cuartos de final")){
					devolver = "Semifinal";
				}
				if(ronda.equals("Semifinal")){
					devolver = "Final";
				}
			}
			if(cantequipos==8){
				if(ronda.equals("Octavos de final")){
					devolver = "Cuartos de final";
				}
				if(ronda.equals("Cuartos de final")){
					devolver = "Semifinal";
				}
				if(ronda.equals("Semifinal")){
					devolver = "Final";
				}
			}
			if(cantequipos==16){
				if(ronda.equals("Dieciseisavos de final")){
					devolver = "Octavos de final";
				}
				if(ronda.equals("Octavos de final")){
					devolver = "Cuartos de final";
				}
				if(ronda.equals("Cuartos de final")){
					devolver = "Semifinal";
				}
				if(ronda.equals("Semifinal")){
					devolver = "Final";
				}
			}
		
		}
		Log.d("Emi","ProxRonda activado devuelve"+devolver);
		return devolver;
	}

}
