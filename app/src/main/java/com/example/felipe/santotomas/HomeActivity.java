package com.example.felipe.santotomas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
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
                Intent intentHome = new Intent(HomeActivity.this, HomeActivity.class);
                startActivity(intentHome);
                break;
            case R.id.menuForm:
                Intent intentForm = new Intent(HomeActivity.this, FormActivity.class);
                startActivity(intentForm);
                break;
            case R.id.menuResult:
                Intent intentResult = new Intent(HomeActivity.this, ResultActivity.class);
                startActivity(intentResult);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
