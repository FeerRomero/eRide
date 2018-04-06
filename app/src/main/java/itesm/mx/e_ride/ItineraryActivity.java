package itesm.mx.e_ride;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

/**
 * Created by FernandoDavid on 01/03/2018.
 */

public class ItineraryActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn_next;
    String strNombre="Itinerary";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itinerary);
        getSupportActionBar().setTitle(strNombre);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.VerdeOscuro)));

        btn_next=findViewById(R.id.btn_nextDriver);
        btn_next.setOnClickListener(this);
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
        Intent intent=new Intent(this,TravelingActivity.class);
        startActivity(intent);
    }
}
