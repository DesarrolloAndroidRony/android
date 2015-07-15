package rony.cl.segundo;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends Activity{

    EditText ED_num1,ED_num2 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ED_num1 = (EditText) findViewById(R.id.ED_num1);
        ED_num2 = (EditText) findViewById(R.id.ED_num2);
    }


    public void OperarOnClick(View v){
        int num1 = Integer.parseInt((ED_num1.getText().toString()));
        int num2 = Integer.parseInt((ED_num2.getText().toString()));

        Intent i = new Intent(this, Resutados.class);
        i.putExtra("num1",num1);
        i.putExtra("num2",num2);

        startActivity(i);
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
        if (id == R.id.action_Info_app) {
            Toast.makeText(this,"ingresa dos numeros y luego toca el boton operar ",Toast.LENGTH_LONG).show();
        }

        if (id == R.id.action_Delete_datos) {
            ED_num1.setText("");
            ED_num2.setText("");
        }
        return super.onOptionsItemSelected(item);
    }
}
