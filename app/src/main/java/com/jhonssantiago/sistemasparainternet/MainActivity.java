
package com.jhonssantiago.sistemasparainternet;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) { //mostra menu
        getMenuInflater().inflate(R.menu.menu_toolbar, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent it = null;
        switch (item.getItemId()){
            case R.id.primeiro_p:
                it = new Intent(getApplicationContext(), PrimeiroPeriodoActivity.class);
                startActivity(it);
                return true;

            case R.id.segundo_p:
                it = new Intent(getApplicationContext(), SegundoPeriodoActivity.class);
                startActivity(it);
                return true;

            case R.id.terceiro_p:
                it = new Intent(getApplicationContext(), TerceiroPeriodoActivity.class);
                startActivity(it);
                return true;

            case R.id.quarto_p:
                it = new Intent(getApplicationContext(), QuartoPeriodoActivity.class);
                startActivity(it);
                return true;

            case R.id.quinto_p:
                it = new Intent(getApplicationContext(), QuintoPeriodoActivity.class);
                startActivity(it);
                return true;

            case R.id.sexto_p:
                it = new Intent(getApplicationContext(), SextoPeriodoActivity.class);
                startActivity(it);
                return true;

            case android.R.id.home:
                finish();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        } //switch

    }
}