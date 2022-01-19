package com.example.teachingpoint.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.teachingpoint.R;
import com.example.teachingpoint.SubDetailsActivity;

public class CountryDetails extends Fragment {
    private ListView listView;
    private String[] countryNames;
    private int[] flags={R.drawable.bd,R.drawable.india,R.drawable.srilanka,R.drawable.pakistan,R.drawable.bhutan,R.drawable.maldives,
            R.drawable.thailand,R.drawable.japan,R.drawable.canada,R.drawable.germany,R.drawable.italy,R.drawable.saudy,
            R.drawable.korea,R.drawable.usa,R.drawable.russia,R.drawable.france,R.drawable.turkey};

    View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
      view=  inflater.inflate(R.layout.country_details,container,false);
        setContentView(R.layout.country_details);

        listView=view.findViewById(R.id.listview);
        String [] countryNames=getResources().getStringArray(R.array.country_names);
        CountryDetailsAdepter adapter=new CountryDetailsAdepter(getActivity(),countryNames,flags);

        // ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.sample_view,R.id.textview,countryNames);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value=countryNames[position];
                if(value.equals("Bangladesh")){
                  Intent intent=new Intent(getActivity(), SubDetailsActivity.class);
                    intent.putExtra("name","Bangladesh");
                    startActivity(intent);
                }

                if(value.equals("Pakistan")){
                    Intent intent=new Intent(getActivity(), SubDetailsActivity.class);
                    intent.putExtra("name","Pakistan");
                    startActivity(intent);
                }

                if(value.equals("India")){
                    Intent intent=new Intent(getActivity(), SubDetailsActivity.class);
                    intent.putExtra("name","India");
                    startActivity(intent);
                }

                          }
        });


      return view;
    }

    private void setContentView(int country_details) {
    }



}
