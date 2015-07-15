package rony.cl.palabra;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {

    TextView TV_largo;
    EditText ET_ingreso;

    public static final int RECURSO_DEL_CODIGO = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TV_largo = (TextView) findViewById(R.id.TV_largo);
        ET_ingreso = (EditText) findViewById(R.id.ET_ingreso);
    }


    public void PrecionarOnClick(View v) {

        Intent i = new Intent(this, SegundaVistaActivity.class);
        i.putExtra("Ingresa", ET_ingreso.getText().toString());
        startActivityForResult(i, RECURSO_DEL_CODIGO);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == RESULT_OK && requestCode == RECURSO_DEL_CODIGO) {
            if (data.hasExtra("retorno")) {
                TV_largo.setText(data.getExtras().getString("retorno"));

            }

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}