package com.example.myintentfilter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name,mail,sub,sclass,phone;
    Button btnNext;
    String pName,pMail,pSub,pClass;
    Double pPhone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.edtName);
        mail = findViewById(R.id.edtEmail);
        sub = findViewById(R.id.edtSub);
        sclass = findViewById(R.id.edtClass);
        phone= findViewById(R.id.edtPhone);
        btnNext = findViewById(R.id.send);



        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pName = name.getText().toString();
                pMail = mail.getText().toString();
                pSub= sub.getText().toString();
                pClass = sclass.getText().toString();
                pPhone = Double.parseDouble(phone.getText().toString());

                Intent dataIntent = new Intent(MainActivity.this,StudInfo.class);

                dataIntent.putExtra("name",pName);
                dataIntent.putExtra("mail",pMail);
                dataIntent.putExtra("subject",pSub);
                dataIntent.putExtra("class",pClass);
                dataIntent.putExtra("phone",pPhone);

                startActivity(dataIntent);
            }
        });
    }
        public void clr(View v) {
            name.setText("");
            sub.setText("");
            sclass.setText("");
            phone.setText("");
            mail.setText("");

        }

}