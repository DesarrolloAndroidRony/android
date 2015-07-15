package rony.cl.segundo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class Resutados extends Activity {

    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resutados);

        Bundle b = getIntent().getExtras();
        if (b != null) {
            int num1 = b.getInt("num1");
            int num2 = b.getInt("num2");

            int suma = num1 + num2;
            resultado = (TextView) findViewById(R.id.ED_Resultado);
            resultado.setText(String.valueOf(suma));
        }

    }
        public void VolverOnClick (View view){

        super.onBackPressed();

    }
 }
