package rony.cl.palabra;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class SegundaVistaActivity extends Activity {

    TextView TV_aqui;

    @Override
    public void finish() {
        Intent data = new Intent();

        data.putExtra("retorno", "El Largo De La Palabra Es: " + TV_aqui.getText().toString().length());
        setResult(RESULT_OK,data);

        super.finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_vista);
        TV_aqui = (TextView) findViewById(R.id.TV_aqui);

        Bundle b = getIntent().getExtras();
            if(b!=null) {
            String Ingresa = b.getString("Ingresa");
            TV_aqui.setText(Ingresa);
            }
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_segunda_vista, menu);
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
