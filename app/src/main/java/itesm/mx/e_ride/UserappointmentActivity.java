package itesm.mx.e_ride;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by FernandoDavid on 01/03/2018.
 */

public class UserappointmentActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_submit;
    EditText et_To;
    EditText et_From;
    EditText et_PickTime;
    EditText et_ArrivalTime;
    String strNombre = "Appointment";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userappointment);
        getSupportActionBar().setTitle(strNombre);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btn_submit=findViewById(R.id.btn_submitUser);
        et_To=findViewById(R.id.et_To);
        et_From=findViewById(R.id.et_From);
        et_PickTime=findViewById(R.id.et_PickTime);
        et_ArrivalTime=findViewById(R.id.et_ArrTime);

        btn_submit.setOnClickListener(this);
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
        Intent intent=new Intent(this, DetailsActivity.class);

        intent.putExtra("To",et_To.getText().toString());
        intent.putExtra("From",et_From.getText().toString());
        intent.putExtra("PickTime",et_PickTime.getText().toString());
        intent.putExtra("ArrTime",et_ArrivalTime.getText().toString());
        startActivity(intent);
    }
}
