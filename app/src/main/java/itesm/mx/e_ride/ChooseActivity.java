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

public class ChooseActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_user;
    Button btn_driver;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btn_user=findViewById(R.id.btn_user);
        btn_driver=findViewById(R.id.btn_driver);

        btn_user.setOnClickListener(this);
        btn_driver.setOnClickListener(this);
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
        switch (v.getId()) {
            case R.id.btn_user:
                intent=new Intent(this,UserappointmentActivity.class);
                startActivity(intent);
                break;

            case R.id.btn_driver:
                intent=new Intent(this,DriverappointmentActivity.class);
                startActivity(intent);
                break;
        }
    }
}
