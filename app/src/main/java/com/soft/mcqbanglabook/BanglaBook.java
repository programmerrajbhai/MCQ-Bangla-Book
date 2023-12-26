package com.soft.mcqbanglabook;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class BanglaBook extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bangla_book);


        Button shuva= findViewById(R.id.shuva);

        Button boipora= findViewById(R.id.boipora);
        Button fulerbibaho= findViewById(R.id.fulerbibaho);
        Button protupokar= findViewById(R.id.protupokar);
        Button libery= findViewById(R.id.libery);
        Button denapawna= findViewById(R.id.denapawna);
        Button pollisahitto= findViewById(R.id.pollisahitto);
        Button AmAirVepuQNA= findViewById(R.id.AmAirVepuQNA);
        Button ManusMuhammod= findViewById(R.id.ManusMuhammod);
        Button NimGas= findViewById(R.id.NimGas);
        Button Shikkamonosotto= findViewById(R.id.Shikkamonosotto);
        Button momotadi= findViewById(R.id.momotadi);
        Button AkattorErdinGuli= findViewById(R.id.AkattorErdinGuli);
        Button SahittorRup= findViewById(R.id.SahittorRup);
        Button ProbasBondhu= findViewById(R.id.ProbasBondhu);



        SahittorRup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BanglaBook.this,Sahittor_Rup.class));
            }
        });
        ProbasBondhu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BanglaBook.this,Probas_Bondhu.class));
            }
        });









        momotadi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BanglaBook.this,Momotadi.class));
            }
        });

        AkattorErdinGuli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BanglaBook.this,EkattorER_Dinguli.class));
            }
        });


        Shikkamonosotto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BanglaBook.this,ShikkaO_Monosotto.class));
            }
        });


        pollisahitto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BanglaBook.this,Pollisahitto.class));
            }
        });
        NimGas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BanglaBook.this,NimGas.class));
            }
        });




        ManusMuhammod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BanglaBook.this,ManusMohammad.class));
            }
        });

        AmAirVepuQNA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BanglaBook.this,AmAtirVepu.class));
            }
        });

        shuva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BanglaBook.this,MainActivity.class));
            }
        });
        denapawna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BanglaBook.this,DenaPawna.class));
            }
        });


        libery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BanglaBook.this,Libery.class));
            }
        });

        protupokar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BanglaBook.this,Protupokar.class));
            }
        });



        boipora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            startActivity(new Intent(BanglaBook.this,Boi_Pora.class));
            }
        });

        fulerbibaho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               startActivity(new Intent(BanglaBook.this,FulerBibago.class));
            }
        });


    }
}