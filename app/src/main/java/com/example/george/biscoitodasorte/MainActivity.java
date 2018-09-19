package com.example.george.biscoitodasorte;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int num;
    Random r;
    ArrayList<String> frases = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        frases.add(0, "A vida trará coisas boas se tiveres paciência.");
        frases.add(1,"Demonstre amor e alegria em todas as oportunidades e verás\n" +
                "que a paz nasce dentro de você.");
        frases.add(2,"Não compense na ira o que lhe falta na razão.");
        frases.add(3,"Defeitos e virtudes são apenas dois lados da mesma moeda.");
        frases.add(4,"A maior de todas as torres começa no solo.");
        frases.add(5,"Não há que ser forte. Há que ser flexível.");
        frases.add(6,"Gente todo dia arruma os cabelos, por que não o coração?");
        frases.add(7,"Há três coisas que jamais voltam; a flecha lançada, a palavra dita e a oportunidade perdida.");
        frases.add(8,"A juventude não é uma época da vida, é um estado de espírito.");
        frases.add(9,"Podemos escolher o que semear, mas somos obrigados a colher o que plantamos");

    }

    public void lucky(View view){
        TextView tv1 = (TextView)findViewById(R.id.output);
        r = new Random();
        num = r.nextInt(10);
        tv1.setText(frases.get(num));
    }
}
