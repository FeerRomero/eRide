package itesm.mx.e_ride;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by FernandoDavid on 01/03/2018.
 */

public class DetailsActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn_next;
    TextView tv_Cotorreo;
    String strTo;
    String strFrom;
    String strPickTime;
    String strArrTime;
    String strNombre="Details";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        getSupportActionBar().setTitle(strNombre);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btn_next=findViewById(R.id.btn_nextUser);
        btn_next.setOnClickListener(this);
        tv_Cotorreo=findViewById(R.id.tv_dispMsg);

        Intent intent=getIntent();
        if(intent.getExtras()!=null)
        {
            Log.d("NO ESTA NULL EL INTENT","No esta null");
            strPickTime=intent.getStringExtra("PickTime");
            strFrom=intent.getStringExtra("From");
            //Log.d("PickTime",strPickTime);
            //Log.d("From",strFrom);
        }

        String string = String.format(getString(R.string.cotorreo),strPickTime,strFrom);
        tv_Cotorreo.setText(string);
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
        Intent intent=new Intent(this, TravelingActivity.class);
        startActivity(intent);
    }
}
