package itesm.mx.e_ride;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_logIn;
    Button btn_register;
    Button btn_FAQs;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        btn_logIn=findViewById(R.id.btn_LogIn);
        btn_register=findViewById(R.id.btn_Register);
        btn_FAQs=findViewById(R.id.btn_FAQs);

        btn_logIn.setOnClickListener(this);
        btn_register.setOnClickListener(this);
        btn_FAQs.setOnClickListener(this);
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
                intent = new Intent(this,FaqsActivity.class);
                startActivity(intent);
                break;
        }

        return true;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_LogIn:
                intent= new Intent(this,ChooseActivity.class);
                startActivity(intent);
                break;

            case R.id.btn_Register:
                intent=new Intent(this, RegisterActivity.class);
                startActivity(intent);
                break;

            case R.id.btn_FAQs:
                intent=new Intent(this,FaqsActivity.class);
                startActivity(intent);
                break;
        }
    }
}
