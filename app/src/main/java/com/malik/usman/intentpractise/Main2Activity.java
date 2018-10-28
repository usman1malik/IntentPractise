package com.malik.usman.intentpractise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
TextView t1,t2,t3,t4,t5,t6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t1=findViewById(R.id.txt1);
        t2=findViewById(R.id.txt2);
        t3=findViewById(R.id.txt3);
        t4=findViewById(R.id.txt4);
        t5=findViewById(R.id.txt5);
        t6=findViewById(R.id.txt6);



        String e1=getIntent().getStringExtra("usman");

        String e2=getIntent().getStringExtra("u");

        String e3=getIntent().getStringExtra("us");

        String e4=getIntent().getStringExtra("usm");

        String e5=getIntent().getStringExtra("usma");

        String e6=getIntent().getStringExtra("usmanq");

        t1.setText(e1);
        t2.setText(e2);
        t3.setText(e3);
        t4.setText(e4);
        t5.setText(e5);
        t6.setText(e6);
        Toast.makeText(this, "SuccessFully Register  '' "+e1, Toast.LENGTH_SHORT).show();

    }
}
