package com.example.toolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("My Toolbar");
        }


        toolbar.setSubtitle("SubToolbar");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        new MenuInflater(this).inflate(R.menu.opt_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemID = item.getItemId();
        if (itemID == R.id.new_folder){
            Toast.makeText(this, "Create New File", Toast.LENGTH_SHORT).show();
        }
        else if (itemID == R.id.open_folder) {
            Toast.makeText(this, "Open File", Toast.LENGTH_SHORT).show();
        } else if (itemID == android.R.id.home) {
            Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Save File", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}