package com.example.dartsglobal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Singles extends AppCompatActivity {
    private EditText single,score;
    private Button b1,b2,b3;
    private String dS,disS;
    private int t,t2,total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singles);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        single = (EditText) findViewById(R.id.editSingle);
        score = (EditText) findViewById(R.id.editScore);

        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);

        dS="1";
        disS="0";

        displaySingle();
        displayScore();

        t = Integer.parseInt(single.getText().toString());
        t2 = Integer.parseInt(score.getText().toString());
        total =0;
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    t2 = t * 1;
                    total = t2 + total;
                    disS = String.valueOf(total);
                    t = t + 1;
                    dS = String.valueOf(t);
                    displaySingle();
                    displayScore();
                    if(t >20){
                        Toast.makeText(Singles.this, "Your Score Was "+disS, Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(Singles.this, Home.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                    }
                }
            });
            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    t2 = t * 2;
                    total = t2 + total;
                    disS = String.valueOf(total);
                    t = t + 1;
                    dS = String.valueOf(t);
                    displaySingle();
                    displayScore();
                    if(t >20){
                        Toast.makeText(Singles.this, "Your Score Was "+disS, Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(Singles.this, Home.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                    }
                }
            });
            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    t2 = t * 3;
                    total = t2 + total;
                    disS = String.valueOf(total);
                    t = t + 1;
                    dS = String.valueOf(t);
                    displaySingle();
                    displayScore();
                    if(t >20){
                        Toast.makeText(Singles.this, "Your Score Was "+disS, Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(Singles.this, Home.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                    }
                }
            });


    }

    private void displaySingle() {
        single.setText(dS);
    }
    private void displayScore() {
        score.setText(disS);
    }
}