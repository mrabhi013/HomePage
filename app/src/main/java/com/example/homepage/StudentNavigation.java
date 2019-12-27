package com.example.homepage;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class StudentNavigation extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout mNavDrawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_nav_drawer);

        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mNavDrawer=findViewById(R.id.drawer_layout);
        NavigationView navigationView=findViewById(R.id.navigation_view);

        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(
                this,mNavDrawer,toolbar,
                R.string.navigation_drawer_open
                ,R.string.navigation_drawer_close
        );
        mNavDrawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public void onBackPressed() {
        if(mNavDrawer.isDrawerOpen(GravityCompat.START)){
            mNavDrawer.closeDrawer(GravityCompat.START);
        }
        super.onBackPressed();
    };

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.nav_profile:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container,new Profile_Fragment()).commit();
                break;

           case R.id.nav_job:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container,new Jobs_Fragment()).commit();
                break;

            case R.id.nav_inbox:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container,new Inbox_Fragment()).commit();
                break;
            case R.id.nav_upload:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container,new Upload_Fragment()).commit();
                break;

            case R.id.nav_help:
                Toast.makeText(this,"This is help Item",Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_feedback:
                Toast.makeText(this,"This is Feedback Item",Toast.LENGTH_SHORT).show();
                break;

        }

        mNavDrawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
