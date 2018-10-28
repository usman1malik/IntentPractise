package com.malik.usman.intentpractise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button b1;
EditText e1,e2,e3,e4,e5,e6,e7,e8,e9;
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1= findViewById(R.id.btn1);
        b1.setOnClickListener(this);
        e1= findViewById(R.id.edt1);
    e2= findViewById(R.id.edt2);
    e3= findViewById(R.id.edt3);
    e4= findViewById(R.id.edt4);
    e5= findViewById(R.id.edt5);
    e6= findViewById(R.id.edt6);
    }

    @Override
    public void onClick(View v) {
        Intent intnt= new Intent(this,Main2Activity.class);
        intnt.putExtra("usman",e1.getText().toString());
        intnt.putExtra("u",e2.getText().toString());
        intnt.putExtra("us",e3.getText().toString());
        intnt.putExtra("usm",e4.getText().toString());
        intnt.putExtra("usma",e5.getText().toString());
        intnt.putExtra("usmanq",e6.getText().toString());
        startActivity(intnt);
    }
}
