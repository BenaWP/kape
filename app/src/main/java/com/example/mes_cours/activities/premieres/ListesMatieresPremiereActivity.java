package com.example.mes_cours.activities.premieres;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridView;

import com.example.mes_cours.R;
import com.example.mes_cours.adapters.ImageAdapter;
import com.example.mes_cours.ui.main.ListesMatieresPremiereFragment;

public class ListesMatieresPremiereActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listes_matieres_premiere_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, ListesMatieresPremiereFragment.newInstance())
                .commitNow();
        }

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        GridView gridview = (GridView) findViewById(R.id.listes_matieres_premiere_gridview);
        gridview.setAdapter(new ImageAdapter(this));
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

}