package com.example.teachingpoint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class SubjectTutorial extends AppCompatActivity {
    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_tutorial);
        videoView=findViewById(R.id.videoViewId);

        Intent intent=getIntent();
        String tutorial=intent.getStringExtra("name");
        if(tutorial.equals("chemistry")){
            videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.vandarban_visit);
            MediaController mediaController=new MediaController(this);
            mediaController.setAnchorView(videoView);
            videoView.setMediaController(mediaController);
        }
        if(tutorial.equals("physics")){
            videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.vandarban_visit);
            MediaController mediaController=new MediaController(this);
            mediaController.setAnchorView(videoView);
            videoView.setMediaController(mediaController);
        }
        if(tutorial.equals("math")){
            videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.vandarban_visit);
            MediaController mediaController=new MediaController(this);
            mediaController.setAnchorView(videoView);
            videoView.setMediaController(mediaController);
        }
    }
}