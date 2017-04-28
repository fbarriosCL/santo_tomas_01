package com.example.felipe.santotomas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    private TextView resultName, resultLastName, resultAge, resultEmail, resultCareer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        resultName          = (TextView) findViewById(R.id.result_name);
        resultLastName      = (TextView) findViewById(R.id.result_lastname);
        resultEmail         = (TextView) findViewById(R.id.result_email);
        resultAge           = (TextView) findViewById(R.id.result_age);
        resultCareer        = (TextView) findViewById(R.id.result_career);

        Bundle b            = new Bundle();
        b                   = getIntent().getExtras();
        String name         = b.getString("name");
        String lastname     = b.getString("lastname");
        String age          = b.getString("age");
        String email        = b.getString("email");
        String career       = b.getString("career");

        resultName.setText(name);
        resultLastName.setText(lastname);
        resultAge.setText(age);
        resultCareer.setText(career);
        resultEmail.setText(email);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_options, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        switch(id) {
            case R.id.menuHome:
                Intent intentHome = new Intent(ResultActivity.this, HomeActivity.class);
                startActivity(intentHome);
                break;
            case R.id.menuForm:
                Intent intentForm = new Intent(ResultActivity.this, FormActivity.class);
                startActivity(intentForm);
                break;
            case R.id.menuResult:
                Intent intentResult = new Intent(ResultActivity.this, ResultActivity.class);
                startActivity(intentResult);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
