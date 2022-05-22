package com.example.number_to_picture;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_activity);
        TextView textView=findViewById(R.id.buttonid);
        Intent intent=getIntent();
        textView.setText(intent.getStringExtra("buttonid"));
        String uri = "@drawable/img"+intent.getStringExtra("buttonid");
        int imageResource = getResources().getIdentifier(uri, null, getPackageName());
        ImageView imageView=findViewById(R.id.imageView);
        Drawable res = getResources().getDrawable(imageResource);
        imageView.setImageDrawable(res);
    }



}
