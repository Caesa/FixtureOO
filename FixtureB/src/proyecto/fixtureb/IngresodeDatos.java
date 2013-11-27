package proyecto.fixtureb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class IngresodeDatos extends Activity {
	TextView lblEquiponum;
	EditText txtNomeq;
	int cantequipos = 0;
	int equiposcreados = 1;
	String nombreeq;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ingresodedatos);
		Bundle extras = getIntent().getExtras();
		cantequipos = extras.getInt("cantequipos");
		txtNomeq = (EditText) findViewById(R.id.txtNomeq);
		lblEquiponum = (TextView) findViewById(R.id.lblEquiponro);
		lblEquiponum.setText("Equipo "+equiposcreados);
	}
	
	public void terminaringrdedatos(View view){
		nombreeq = txtNomeq.getText().toString();
		ListaEquipos.addEquipo(new Equipo(nombreeq));
		equiposcreados = equiposcreados + 1;
		if (ListaEquipos.getCantidad()<cantequipos){
			txtNomeq.setText("");
			lblEquiponum.setText("Equipo "+equiposcreados);
		}
		if(ListaEquipos.getCantidad()==cantequipos){
			Intent i = new Intent(this, Rondanueva.class);
			startActivity(i);
		}
	}
}