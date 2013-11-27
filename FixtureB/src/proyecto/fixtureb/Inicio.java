package proyecto.fixtureb;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

public class Inicio extends Activity {
	int cantequip = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_inicio);
		Button btnCrear = (Button) findViewById(R.id.btnCanteqselec);		
		ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.Cantdeequipos, android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		Spinner cmbxCantequip = (Spinner) findViewById(R.id.spnCantdeeq);
		cmbxCantequip.setAdapter(adapter);
		cmbxCantequip.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parentView, View selectedItemView,
					int position, long id) {
				// TODO Auto-generated method stub
				cantequip = Integer.parseInt(parentView.getItemAtPosition(position).toString());
				Toast.makeText(parentView.getContext(), "Seleccionaste "+cantequip+" equipos.", Toast.LENGTH_LONG).show();
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.inicio, menu);
		return true;
	}
	
	public void IngresarDatos(View view) {
		Intent i = new Intent(this, IngresodeDatos.class);
		i.putExtra("cantequipos", cantequip);
		startActivity(i);
	}

}
