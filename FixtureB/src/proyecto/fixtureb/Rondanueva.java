package proyecto.fixtureb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Rondanueva extends Activity {
	TextView lblRonda;
	private String ronda = "";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d("Emi", "NuevaRonda activado");
		setContentView(R.layout.activity_comenzoronda);
		Button btnSiguiente = (Button) findViewById(R.id.btnPasarapartido);
		lblRonda = (TextView) findViewById(R.id.lblRondanueva);
		ronda = Abstracta.getRonda();
		Log.d("Emi", "ronda en la rondanueva es " + ronda);
		
		if (ronda.equals("Termino")) {
			lblRonda.setText("Campeón: "+ ListaEquipos.equipos.get(0).getNombre());
			btnSiguiente.setText("Volver al menú principal");
		} else {
			lblRonda.setText(ronda);
		}
	}

	public void comenzarcampeonato(View view) {
		if(ronda.equals("Termino")){
			Intent i = new Intent(this, Inicio.class);
			ListaEquipos.equipos.clear();
			ListaPartidos.partidos.clear();
			startActivity(i);
		}else{
			Intent i = new Intent(this, Partido_act.class);
			startActivity(i);			
		}
	}
	
}
