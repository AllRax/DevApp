package com.example.devapp;

import android.util.Log;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;
import androidx.navigation.ui.AppBarConfiguration;
import com.example.devapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private static final String tID = "LifecycleStages";
    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(tID, "onCreate() called");

        drawerLayout = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);

        // Set up the toggle button (hamburger icon)
        toggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Handle menu item clicks
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();

                if (id == R.id.nav_home) {
                    // Handle home click
                } else if (id == R.id.nav_settings) {
                    // Handle settings click
                } else if (id == R.id.nav_about) {
                    // Handle about click
                }

                drawerLayout.closeDrawers();
                return true;
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(tID, "onStart() called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tID, "onResume() called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(tID, "onPause() called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tID, "onStop() called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(tID, "onRestart() called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(tID, "onDestroy() called");
    }
}

