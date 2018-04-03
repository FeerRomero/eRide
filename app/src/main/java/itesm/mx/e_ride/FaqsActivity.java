package itesm.mx.e_ride;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

/**
 * Created by FernandoDavid on 01/03/2018.
 */

public class FaqsActivity extends AppCompatActivity implements View.OnClickListener {


    Button btn_regresar;
    String strNombre="FAQ's";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faqs);
        getSupportActionBar().setTitle(strNombre);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btn_regresar = findViewById(R.id.btn_Regresar);

        btn_regresar.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.mymenu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item) {
        switch (item.getItemId()) {
            case R.id.first:
                Intent intent = new Intent(this,FaqsActivity.class);
                startActivity(intent);
                break;

            default:
                super.onBackPressed();
        }

        return true;
    }

    @Override
    public void onClick(View v) {
        //Intent intent=new Intent(this,MainActivity.class);
        //startActivity(intent);
        super.onBackPressed();
    }
}
