package com.example.resume11;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class two extends AppCompatActivity {


    TextView first,last,profile,mobail,email,location,education,skill,vollu;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.two);

      first=findViewById(R.id.first);
        last=findViewById(R.id.last);
        profile=findViewById(R.id.profile);
        mobail=findViewById(R.id.mobail);
        email=findViewById(R.id.email);
        location=findViewById(R.id.location);
        education=findViewById(R.id.education);
        skill=findViewById(R.id.skill);
        vollu=findViewById(R.id.vollu);



        String First=getIntent().getStringExtra("first");
        String Last=getIntent().getStringExtra("last");
        String Profile=getIntent().getStringExtra("profile");
        String Mobail=getIntent().getStringExtra("mobail");
        String Email=getIntent().getStringExtra("email");
        String Location=getIntent().getStringExtra("location");
        String Education=getIntent().getStringExtra("education");
        String Skill=getIntent().getStringExtra("skill");
        String Vollu=getIntent().getStringExtra("vollu");


        first.setText(""+First);
        last.setText(""+Last);
        profile.setText(""+Profile);
        mobail.setText(""+Mobail);
        email.setText(""+Email);
        location.setText(""+Location);
        education.setText(""+Education);
        skill.setText(""+Skill);
        vollu.setText(""+Vollu);


    }
}