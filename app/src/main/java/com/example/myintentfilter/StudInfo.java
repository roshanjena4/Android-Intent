package com.example.myintentfilter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class StudInfo extends AppCompatActivity {

    TextView name, email, subj, clas, phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stud_info);

        name = findViewById(R.id.textname);
        email = findViewById(R.id.textmail);
        subj = findViewById(R.id.textsub);
        clas = findViewById(R.id.textclass);
        phone = findViewById(R.id.textphone);

        Intent fromIntent;
        fromIntent = getIntent();
        String name1 = fromIntent.getStringExtra("name");
        String eml = fromIntent.getStringExtra("mail");
        String sub = fromIntent.getStringExtra("subject");
        String cls = fromIntent.getStringExtra("class");
        Double no = fromIntent.getDoubleExtra("phone",0);

        name.setText(""+name1);
        email.setText(""+eml);
        subj.setText(""+sub);
        clas.setText(""+cls);
        phone.setText(""+no);

    }
}