package com.example.felipe.santotomas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {

    private EditText etEmail, etName, etLastName, etAge, etCareer;
    private String email, name, last_name, age, career;
    private Button btnClean, btnSend;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        etName      = (EditText) findViewById(R.id.name);
        etEmail     = (EditText) findViewById(R.id.email);
        etLastName  = (EditText) findViewById(R.id.lastname);
        etAge       = (EditText) findViewById(R.id.age);
        etCareer    = (EditText) findViewById(R.id.career);
        btnClean    = (Button) findViewById(R.id.buttom_clean);
        btnSend     = (Button) findViewById(R.id.button_send);

        btnSend.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                name      = etName.getText().toString();
                last_name = etLastName.getText().toString();
                email     = etEmail.getText().toString();
                age       = etAge.getText().toString();
                career    = etCareer.getText().toString();

                Intent intent = new Intent(FormActivity.this, ResultActivity.class);
                intent.putExtra("name", name);
                intent.putExtra("lastname", last_name);
                intent.putExtra("carrer", career);
                intent.putExtra("age", age);
                intent.putExtra("email", email);
                Toast.makeText(getApplicationContext(), name, Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });
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
                Intent intentHome = new Intent(FormActivity.this, HomeActivity.class);
                startActivity(intentHome);
                break;
            case R.id.menuForm:
                Intent intentForm = new Intent(FormActivity.this, FormActivity.class);
                startActivity(intentForm);
                break;
            case R.id.menuResult:
                Intent intentResult = new Intent(FormActivity.this, ResultActivity.class);
                startActivity(intentResult);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}
