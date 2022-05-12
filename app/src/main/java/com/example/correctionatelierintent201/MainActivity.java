package com.example.correctionatelierintent201;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    EditText e1, e2;
    ArrayList<Utilisateur> users=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = findViewById(R.id.elogin);
        e2 = findViewById(R.id.epass);
        
        users.add(new Utilisateur("login1","pass1","TAN1","THOMA1",new Date(99,2,3),R.drawable.image1));
        users.add(new Utilisateur("login2","pass2","TAN2","THOMA2",new Date(66,3,13),R.drawable.image2));
        users.add(new Utilisateur("login3","pass3","TAN3","THOMA3",new Date(100,5,2),R.drawable.image3));
        users.add(new Utilisateur("login4","pass4","TAN4","THOMA4",new Date(101,11,12),R.drawable.image4));
        users.add(new Utilisateur("login5","pass5","TAN5","THOMA5",new Date(98,9,5),R.drawable.image5));
        users.add(new Utilisateur("login6","pass6","TAN6","THOMA6",new Date(87,10,9),R.drawable.image6));
    }

    public void connexion(View view) {
        
        for(Utilisateur u : users){
            if(e1.getText().toString().equals(u.getLogin()) && e2.getText().toString().equals(u.getPassword())){
                Intent i = new Intent(MainActivity.this, DetailUtilisateur.class);
                i.putExtra("user", u);
                startActivity(i);
                return;
            }
        }

        Toast.makeText(this, "Echec authentification", Toast.LENGTH_SHORT).show();
    }
}