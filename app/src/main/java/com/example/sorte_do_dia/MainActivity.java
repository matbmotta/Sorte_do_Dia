package com.example.sorte_do_dia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textViewTitle;
    private Button buttonAction;
    private ArrayList<String> mensagens = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mensagens.add("Viva o amor");
        mensagens.add("Carpe diem");
        mensagens.add("Seja mais forte");
        mensagens.add("Busque seu sucesso");

        textViewTitle = findViewById(R.id.textView);
        buttonAction = findViewById(R.id.button);

        textViewTitle.setText("Sorte do Dia");
        buttonAction.setText("Sortear");

        buttonAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int numero = random.nextInt(mensagens.size());
                textViewTitle.setText(mensagens.get(numero));
            }
        });

    }
}