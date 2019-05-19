package com.example.practica5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

import java.security.AccessController;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        public void pasomenuPrincipal(View v){
            Intent intent = new Intent (v.getContext(), menuPrincipal.class);
        startActivityForResult(intent, 0);     

    }
    public void pasoregistro(View v){
        Intent intent = new Intent (v.getContext(), menuPrincipal.class);
        startActivityForResult(intent, 0);

    }
}
