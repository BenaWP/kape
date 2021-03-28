package com.example.mes_cours.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.provider.Settings;
import android.text.format.Formatter;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.mes_cours.R;
import com.example.mes_cours.fragments.PremiereFragment;
import com.example.mes_cours.fragments.SecondFragment;
import com.example.mes_cours.fragments.TerminalFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.lang.reflect.Array;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import meow.bottomnavigation.MeowBottomNavigation;

public class MainActivity extends AppCompatActivity {
    // Initialize variable
    BottomNavigationView bottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get an unique android ID
        /*String android_id = Settings.Secure.getString(this.getContentResolver(),
                Settings.Secure.ANDROID_ID);
        Toast.makeText(getApplicationContext()
                , " " +android_id
                ,Toast.LENGTH_SHORT).show();*/

        //loading the default fragment
        loadFragment(new SecondFragment());

        //getting bottom navigation view
        bottomNavigation = findViewById(R.id.bottom_navigation);
        //and attaching the listener

        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_second:
                        loadFragment(new SecondFragment());
                        break;
                    case R.id.navigation_premiere:
                        loadFragment(new PremiereFragment());
                        break;
                    case R.id.navigation_terminal:
                        loadFragment(new TerminalFragment());
                        break;
                }
                return false;
            }
        });
    }

    private void loadFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit();
    }
}