package com.example.teachingpoint.Fragments;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import com.example.teachingpoint.R;

import java.util.HashMap;
import java.util.List;

public class CustomAdepter extends BaseExpandableListAdapter {
    Context context;
    List<String> listHeaderData;
    HashMap<String,List<String>> listChildData;

    public CustomAdepter(Context context, List<String> listHeaderData, HashMap<String, List<String>> listChildData) {
        this.context = context;
        this.listHeaderData = listHeaderData;
        this.listChildData = listChildData;
    }

    @Override
    public int getGroupCount() {
        return listHeaderData.size();
    }

    @Override
    public int getChildrenCount(int i) {
        return listChildData.get(listHeaderData.get(i)).size();
    }

    @Override
    public Object getGroup(int i) {
        return listHeaderData.get(i);
    }

    @Override
    public Object getChild(int i, int i1) {
        return listChildData.get(listHeaderData.get(i)).get(i1);
    }

    @Override
    public long getGroupId(int i) {
        return i;
    }

    @Override
    public long getChildId(int i, int i1) {
        return i1;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {
        String headerText= (String) getGroup(i);
        if(view==null){
            LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view=inflater.inflate(R.layout.header_layout,null);

        }
        TextView textView=view.findViewById(R.id.headerItemId);
        textView.setText(headerText);

        return view;
    }

    @Override
    public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
        String childText= (String) getChild(i,i1);
        if(view==null){
            LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view=inflater.inflate(R.layout.child_layout,null);

        }
        TextView textView1=view.findViewById(R.id.childViewId);
        textView1.setText(childText);

        return view;
    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return true;
    }
}
