package com.example.correctionatelierintent201;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.SimpleDateFormat;

public class DetailUtilisateur extends AppCompatActivity {

    ImageView im;
    TextView t1, t2,t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_utilisateur);

        Utilisateur user = (Utilisateur) getIntent().getExtras().get("user");

        im = findViewById(R.id.image);
        t1 = findViewById(R.id.tnom);
        t2 = findViewById(R.id.tprenom);
        t3 = findViewById(R.id.tdate);

        im.setImageResource(user.getImage());
        t1.setText("Nom : " + user.getNom());
        t2.setText("Prenom : " + user.getPrenom());
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yy");
        t3.setText("Date naissance : " + f.format(user.getDatenaissance()));
    }

    public void deconnecter(View view) {
        finish();
    }
}