package com.example.number_to_picture;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
        b1=findViewById(R.id.button1);
        b1.setOnClickListener(this);
        b2=findViewById(R.id.button2);
        b2.setOnClickListener(this);
        b3=findViewById(R.id.button3);
        b3.setOnClickListener(this);
        b4=findViewById(R.id.button4);
        b4.setOnClickListener(this);
        b5=findViewById(R.id.button5);
        b5.setOnClickListener(this);
        b6=findViewById(R.id.button6);
        b6.setOnClickListener(this);
        b7=findViewById(R.id.button7);
        b7.setOnClickListener(this);
        b8=findViewById(R.id.button8);
        b8.setOnClickListener(this);
        b9=findViewById(R.id.button9);
        b9.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Button b=findViewById(view.getId());
        String number=b.getText().toString();
        Intent intent=new Intent(MainActivity.this,MainActivity2.class);
        intent.putExtra("buttonid",number);
        startActivity(intent);
    }
}