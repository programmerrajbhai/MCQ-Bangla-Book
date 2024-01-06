package com.soft.mcqbanglabook;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class BanglaBook extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bangla_book);


        TextView shuva= findViewById(R.id.shuva);
        TextView boipora= findViewById(R.id.boipora);
        TextView fulerbibaho= findViewById(R.id.fulerbibaho);
        TextView protupokar= findViewById(R.id.protupokar);
        TextView libery= findViewById(R.id.libery);
        TextView denapawna= findViewById(R.id.denapawna);
        TextView pollisahitto= findViewById(R.id.pollisahitto);
        TextView AmAirVepuQNA= findViewById(R.id.AmAirVepuQNA);
        TextView ManusMuhammod= findViewById(R.id.ManusMuhammod);
        TextView NimGas= findViewById(R.id.NimGas);
        TextView Shikkamonosotto= findViewById(R.id.Shikkamonosotto);
        TextView momotadi= findViewById(R.id.momotadi);
        TextView AkattorErdinGuli= findViewById(R.id.AkattorErdinGuli);
        TextView SahittorRup= findViewById(R.id.SahittorRup);
        TextView ProbasBondhu= findViewById(R.id.ProbasBondhu);
        TextView jibonsongit= findViewById(R.id.jibonsongit);
        TextView seidinaimat= findViewById(R.id.seidinaimat);
        TextView amrporichoy= findViewById(R.id.amrporichoy);
        TextView TomakePawerJonno= findViewById(R.id.TomakePawerJonno);
        TextView kopotakkho= findViewById(R.id.kopotakkho);
        TextView polliJononi= findViewById(R.id.polliJononi);




        polliJononi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BanglaBook.this, PolliJononi.class));
            }
        });


        kopotakkho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BanglaBook.this, KopotakkhoNod.class));
            }
        });

        TomakePawerJonno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BanglaBook.this, TmakePawerJonno.class));
            }
        });

        amrporichoy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BanglaBook.this, AmrPoricoy.class));
            }
        });

        seidinaimat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BanglaBook.this, Sei_DinAimat.class));
            }
        });
        jibonsongit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BanglaBook.this,jibonSongit.class));
            }
        });
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