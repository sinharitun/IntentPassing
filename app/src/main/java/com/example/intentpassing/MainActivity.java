package com.example.intentpassing;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

//import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    Button btnProject, btnSkills;

    Intent proIntent, skillIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btnProject=findViewById(R.id.btnProject);
        btnSkills=findViewById(R.id.btnskills);

        btnProject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                proIntent= new Intent(MainActivity.this, projectActivity.class);
                startActivity(proIntent);
            }
        });
        btnSkills.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Log.d("MainActivity", "Skills button clicked");
                skillIntent= new Intent(MainActivity.this, SkillActivity.class);
                startActivity(skillIntent);
            }
        });


    }
}