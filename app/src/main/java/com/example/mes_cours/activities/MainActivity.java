package com.example.mes_cours.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.text.format.Formatter;
import android.widget.Toast;

import com.example.mes_cours.R;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import meow.bottomnavigation.MeowBottomNavigation;

public class MainActivity extends AppCompatActivity {
    // Initialize variable
    MeowBottomNavigation meowBottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get ip
        WifiManager wifiManager = (WifiManager) getApplicationContext().getSystemService(WIFI_SERVICE);
        String ipAddress = Formatter.formatIpAddress(wifiManager.getConnectionInfo().getIpAddress());
        Toast.makeText(getApplicationContext()
                , " " +ipAddress
                ,Toast.LENGTH_SHORT).show();

        // Assign variable
        meowBottomNavigation = findViewById(R.id.bottom_navigation);

        // Add menu item
        meowBottomNavigation.add(new MeowBottomNavigation.Model(1, R.drawable.ic_second));
        meowBottomNavigation.add(new MeowBottomNavigation.Model(2, R.drawable.ic_premiere));
        meowBottomNavigation.add(new MeowBottomNavigation.Model(3, R.drawable.ic_terminal));

        // Implement items
        meowBottomNavigation.setOnShowListener(new Function1<MeowBottomNavigation.Model, Unit>() {
            @Override
            public Unit invoke(MeowBottomNavigation.Model model) {
                // Initialize fragment
                Fragment fragment =  null;

                // Check condition
                switch (model.getId()){
                    case 1:
                        // when id is 1
                        // here second stuff
                        fragment = new com.example.mes_cours.fragments.SecondFragment();
                        break;
                    case 2 :
                        // when id is 2
                        // here Premiere stuff
                        fragment = new com.example.mes_cours.fragments.PremiereFragment();
                        break;
                    case 3 :
                        // when id is 3
                        // here Terminal stuff
                        fragment = new com.example.mes_cours.fragments.TerminalFragment();
                }
                // Load fragment
                loadFragment(fragment);
                return null;
            }
        });

        // Set premiere fragment initially selected
        meowBottomNavigation.show(2, true);

        meowBottomNavigation.setOnClickMenuListener(new Function1<MeowBottomNavigation.Model, Unit>() {
            @Override
            public Unit invoke(MeowBottomNavigation.Model model) {
                // display toast
                Toast.makeText(getApplicationContext()
                        , " " + model.getId()
                        ,Toast.LENGTH_SHORT).show();
                return null;
            }
        });
    }

    private void loadFragment(Fragment fragment) {
        // Replace fragment
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frame_layout, fragment)
                .commit();
    }
}