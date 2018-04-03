package itesm.mx.e_ride;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by FernandoDavid on 01/03/2018.
 */

public class FeedbackActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn_rate;
    String strNombre = "Rate the trip";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        getSupportActionBar().setTitle(strNombre);

        btn_rate=findViewById(R.id.btn_rate);
        btn_rate.setOnClickListener(this);
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
        }

        return true;
    }


    @Override
    public void onClick(View v) {
        Intent intent=new Intent(this,ChooseActivity.class);
        startActivity(intent);
        Toast.makeText(this,"Rate Registered", Toast.LENGTH_LONG).show();
    }
}
