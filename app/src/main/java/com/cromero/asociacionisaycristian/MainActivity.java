package com.cromero.asociacionisaycristian;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //hola isa
        //hola cristian
    }

    public void imprimirNombre(){
        System.out.println("Isabel =D");

    }
}