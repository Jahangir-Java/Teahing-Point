package com.example.teachingpoint.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.teachingpoint.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Abbreviation extends Fragment {
    CustomAdepter adepter;
    List<String> listHeaderData;
    HashMap<String,List<String>> listChildData;
    ExpandableListView expandableListView;
    int lastExpandedPosition = -1;

    View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
      view=  inflater.inflate(R.layout.abbreviation_fragment,container,false);
        prepareListDate();
        expandableListView=view.findViewById(R.id.expendableListViewId);
        adepter=new CustomAdepter(getActivity(),listHeaderData,listChildData);
        expandableListView.setAdapter(adepter);

        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i1, long l) {
                String output=listChildData.get(listHeaderData.get(i)).get(i1);
                Toast.makeText(getActivity(),output,Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int i) {
                if(lastExpandedPosition!=-1 && lastExpandedPosition!=i){
                    expandableListView.collapseGroup(lastExpandedPosition);

                }
                lastExpandedPosition=i;
            }
        });



        return view;
    }
    public void prepareListDate(){
        String[] headerString=getResources().getStringArray(R.array.abbreviation_list_header);
        String[] childString=getResources().getStringArray(R.array.abbreviation_list_child);

        listHeaderData=new ArrayList<>();
        listChildData=new HashMap<>();

        for (int i=0; i<headerString.length; i++){
            listHeaderData.add(headerString[i]);

            List<String> child=new ArrayList<>();
            child.add(childString[i]);

            listChildData.put(listHeaderData.get(i),child);

        }
    }
}
