package com.example.teachingpoint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SubDetailsActivity extends AppCompatActivity {


    ImageView imageView;
    TextView textView, textView1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub_details);
        imageView=findViewById(R.id.imageView);
        textView=findViewById(R.id.textView);
        textView1=findViewById(R.id.title);

        Intent intent=getIntent();
        String country=intent.getStringExtra("name");
        if(country.equals("Bangladesh")){
            textView1.setText("Bangladesh details");
            imageView.setImageResource(R.drawable.bangladesh_picture);
            textView.setText(R.string.bangladesh_details);

        }

        if(country.equals("Pakistan")){
            textView1.setText("Pakistan details");
            imageView.setImageResource(R.drawable.pakistan_picture);
            textView.setText(R.string.pakistan_details);

        }

        if(country.equals("India")){
            textView1.setText("India details");
            imageView.setImageResource(R.drawable.indea_picture);
            textView.setText(R.string.india_details);

        }

    }

}