package com.example.practica5;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class menuPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void pasochats(View v) {
        Intent intent = new Intent(v.getContext(), menuPrincipal.class);
        startActivityForResult(intent, 0);

    }

    public void pasobuscarViaje(View v) {
        Intent intent = new Intent(v.getContext(), menuPrincipal.class);
        startActivityForResult(intent, 0);

    }

    public void pasopublicarViaje(View v) {
        Intent intent = new Intent(v.getContext(), menuPrincipal.class);
        startActivityForResult(intent, 0);

    }

    public void pasomaterialDesign(View v) {
        Intent intent = new Intent(v.getContext(), menuPrincipal.class);
        startActivityForResult(intent, 0);

    }
 }


