package com.example.resume11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class add_details extends AppCompatActivity {

    EditText first,last,profile,mobail,email,location,education,skill,vollu;
    Button save,btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_details);

        first=findViewById(R.id.first);
        last=findViewById(R.id.last);
        profile=findViewById(R.id.profile);
        mobail=findViewById(R.id.mobail);
        email=findViewById(R.id.email);
        location=findViewById(R.id.location);
        education=findViewById(R.id.education);
        skill=findViewById(R.id.skill);
        vollu=findViewById(R.id.vollu);
        btn=findViewById(R.id.btn);
        save=findViewById(R.id.btn_save);


        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String First=first.getText().toString();
                String Last=last.getText().toString();
                String Profile=profile.getText().toString();
                String Mobail=mobail.getText().toString();
                String Email=email.getText().toString();
                String Location=location.getText().toString();
                String Education=education.getText().toString();
                String Skill=skill.getText().toString();
                String Vollu=vollu.getText().toString();
                String Btn=btn.getText().toString();


                Intent intent=new Intent(add_details.this, two.class);
                intent.putExtra("first",First);
                intent.putExtra("last",Last);
                intent.putExtra("profile",Profile);
                intent.putExtra("mobail",Mobail);
                intent.putExtra("email",Email);
                intent.putExtra("location",Location);
                intent.putExtra("education",Education);
                intent.putExtra("skill",Skill);
                intent.putExtra("vollu",Vollu);


            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(add_details.this,one.class);
                startActivity(intent);

            }
        });


    }
}