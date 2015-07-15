package rony.cl.webvew;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    WebView Wb_muestra;
    EditText Et_ingreso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Wb_muestra =(WebView)findViewById(R.id.Wb_muestra);
        Et_ingreso =(EditText)findViewById(R.id.Et_ingereso);


    }


   public void BotonOnClick (View v){
       if(Et_ingreso.getText().toString().length()==0) {
           Toast.makeText(this,"ingrese una palabra",Toast.LENGTH_LONG).show();
       }else{
       WebSettings conf = Wb_muestra.getSettings();
       conf.setJavaScriptEnabled(true);
       Wb_muestra.loadUrl("https://www.google.com/search?q=" + Et_ingreso.getText().toString());

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
