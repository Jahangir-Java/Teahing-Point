package com.example.teachingpoint.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.teachingpoint.AdmissionActivity;
import com.example.teachingpoint.R;
import com.example.teachingpoint.SubjectTutorial;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Home extends Fragment {
    Intent intent;
    ImageButton btn1,btn2,btn3;
    Button cbtn1,cbtn2,cbtn3;


    View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
      view=  inflater.inflate(R.layout.home_fragment,container,false);
      btn1=view.findViewById(R.id.physicsImgButtonId);
      btn2=view.findViewById(R.id.chemistryImgButtonId);
      btn3=view.findViewById(R.id.mathematicsImgButtonId);

      cbtn1=view.findViewById(R.id.phisixBtnId);
      cbtn2=view.findViewById(R.id.chemistryBtnId);
      cbtn3=view.findViewById(R.id.mathematicsBtnId);
      btn1.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              if(view.getId()==R.id.physicsImgButtonId){
                  intent=new Intent(getActivity(),SubjectTutorial.class);
                  intent.putExtra("name","chemistry");
                  startActivity(intent);
              }
          }
      });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId()==R.id.chemistryImgButtonId){
                    intent=new Intent(getActivity(),SubjectTutorial.class);
                    intent.putExtra("name","chemistry");
                    startActivity(intent);
                }

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId()==R.id.mathematicsImgButtonId){
                    intent=new Intent(getActivity(),SubjectTutorial.class);
                    intent.putExtra("name","chemistry");
                    startActivity(intent);
                }

            }
        });

        cbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId()==R.id.phisixBtnId){
                    intent=new Intent(getActivity(), AdmissionActivity.class);
                    startActivity(intent);
                }
            }
        });
        cbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId()==R.id.chemistryBtnId){
                    intent=new Intent(getActivity(), AdmissionActivity.class);
                    startActivity(intent);
                }
            }
        });
        cbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId()==R.id.mathematicsBtnId){
                    intent=new Intent(getActivity(), AdmissionActivity.class);
                    startActivity(intent);
                }
            }
        });

      return view;
    }


}
