package com.example.teachingpoint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;

public class SlashActivity extends AppCompatActivity {
    ProgressBar progressBar;
    int progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
        );
        setContentView(R.layout.activity_slash);
        progressBar=findViewById(R.id.progressBarId);

        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                doWork();
                doStart();
            }
        });
        thread.start();
    }
    public void doWork(){
        for(progress=20; progress<=100;progress=progress+20){
            try {
                Thread.sleep(1000);
                progressBar.setProgress(progress);
            }catch (Exception e){

            }

        }
    }
    public void doStart(){
        Intent intent=new Intent(SlashActivity.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}