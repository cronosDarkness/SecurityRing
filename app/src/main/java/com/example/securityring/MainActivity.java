package com.example.securityring;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity
{
    ImageButton perfil, configuracion, control;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        perfil.findViewById(R.id.perfil);
        configuracion.findViewById(R.id.configuracion);
        control.findViewById(R.id.control);
    }
}
