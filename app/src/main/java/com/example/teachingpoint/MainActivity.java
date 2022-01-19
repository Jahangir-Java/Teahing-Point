package com.example.teachingpoint;


import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.teachingpoint.Fragments.Abbreviation;
import com.example.teachingpoint.Fragments.CountryDetails;
import com.example.teachingpoint.Fragments.Home;
import com.example.teachingpoint.Fragments.SendMessage;
import com.example.teachingpoint.Fragments.Tutorial;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawerLayout=findViewById(R.id.drawer_layout);

        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        NavigationView navigationView=findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open_drawer,R.string.close_drawer);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        // by default open home page
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new Home()).commit();
        navigationView.setCheckedItem(R.id.home);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.home:
                Home home=new Home();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,home).addToBackStack(null).commit();
                break;

            case R.id.tutorial:
                Tutorial tutorial=new Tutorial();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,tutorial ).addToBackStack(null).commit();
                break;
            case R.id.abbreviation:
                Abbreviation abbreviation=new Abbreviation();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,abbreviation ).addToBackStack(null).commit();
                break;
            case R.id.countryDetails:
                CountryDetails details=new CountryDetails();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,details ).addToBackStack(null).commit();
                break;
            case R.id.message:
                SendMessage message=new SendMessage();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,message ).addToBackStack(null).commit();
                break;
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        getSupportFragmentManager().popBackStackImmediate();
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);

        }
        else{
            super.onBackPressed();
        }

    }
}