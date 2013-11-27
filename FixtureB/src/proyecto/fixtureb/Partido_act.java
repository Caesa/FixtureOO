package proyecto.fixtureb;

import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Partido_act extends Activity {
	EditText puntequi1, puntequi2;
	TextView nombreeq1, nombreeq2, rondatorneo;
	int punteq1, punteq2, cantpartidos, cantequipos;
	String ganador, equipo1, equipo2, ronda;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_partido);
		cantpartidos = ListaPartidos.getCantidad();
		puntequi1 = (EditText) findViewById(R.id.txtPunteq1);
		puntequi2 = (EditText) findViewById(R.id.txtPunteq2);
		nombreeq1 = (TextView) findViewById(R.id.lblEquipo1);
		nombreeq2 = (TextView) findViewById(R.id.lblEquipo2);
		ronda = Abstracta.getRonda();
		equipo1 = ListaEquipos.GetEquipo1();
		equipo2 = ListaEquipos.GetEquipo2();
		nombreeq1.setText(equipo1);
		nombreeq2.setText(equipo2);
	}

	public void proxpartido(View view) {
		punteq1 = Integer.parseInt(puntequi1.getText().toString());
		punteq2 = Integer.parseInt(puntequi2.getText().toString());
		Partido part = new Partido(equipo1, equipo2, punteq1, punteq2);
		ganador = part.getResultadostring();
		ListaPartidos.addPartido(part);
		for (Partido parti : ListaPartidos.getPartidos()) {
			if (parti.isEquipo(equipo1)) {
				Equipo eq = ListaEquipos.buscarequipo(equipo1);
				if (eq != null) {
					eq.setPartjugados(eq.getPartjugados() + 1);
				}
			}
		}
		for (Partido parti : ListaPartidos.getPartidos()) {
			if (parti.isEquipo(equipo2)) {
				Equipo eq = ListaEquipos.buscarequipo(equipo2);
				if (eq != null) {
					eq.setPartjugados(eq.getPartjugados() + 1);
				}
			}
		}
		if (ganador.equals(equipo1)) {
			ListaEquipos.Remove(equipo2);
		} else {
			ListaEquipos.Remove(equipo1);
		}
		try {
			if (ListaEquipos.equipos.get(0).getPartjugados() == ListaEquipos.equipos
					.get(ListaEquipos.equipos.size() - 1).getPartjugados()) {
				String nuevaronda = Abstracta.ProxRonda(Abstracta.AntRonda());
				Abstracta.setRonda(nuevaronda);
				Log.d("Emi","if activado");
				Intent i = new Intent(this, Rondanueva.class);
				startActivity(i);
				this.finish();
			} else {
				Log.d("Emi","else activado");
				Intent i = new Intent(this, Partido_act.class);
				startActivity(i);
			}
		} catch (java.lang.ArrayIndexOutOfBoundsException e) {

			Toast.makeText(this.getApplicationContext(),
					"Son necesarios mas equipos", Toast.LENGTH_LONG).show();
		}

	}
}
