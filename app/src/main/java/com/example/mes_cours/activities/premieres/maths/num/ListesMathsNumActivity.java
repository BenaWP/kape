package com.example.mes_cours.activities.premieres.maths.num;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.mes_cours.MyService;
import com.example.mes_cours.R;
import com.example.mes_cours.tools.ItemAdapter;
import com.example.mes_cours.tools.ItemBean;

import java.util.ArrayList;

public class ListesMathsNumActivity extends AppCompatActivity {

    Toolbar toolBar;
    ArrayList<ItemBean> Items;
    ArrayAdapter<ItemBean> adapter;
    Context ct;
    ListView lvItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_listes_maths_num);

        // -------------Tool bar
        // 1- text
        this.toolBar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(this.toolBar);
        // 2- get app name
        final PackageManager pm = getApplicationContext().getPackageManager();
        ApplicationInfo ai;
        try {
            ai = pm.getApplicationInfo( this.getPackageName(), 0);
        } catch (final PackageManager.NameNotFoundException e) {
            ai = null;
        }
        final String applicationName = (String) (ai != null ? pm.getApplicationLabel(ai) : "(unknown)");
        getSupportActionBar().setTitle(applicationName);
        this.toolBar.setTitleTextColor(ContextCompat.getColor(getApplicationContext(),R.color.white));
        //  3- Arrow
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        // -------------End Tool bar

        this.lvItem = (ListView) findViewById(R.id.lvItems);
        this.ct = getApplicationContext();
        this.Items = new ArrayList<>();
        addItems();
        this.adapter = new ItemAdapter(getApplicationContext(), R.layout.layout_ieam_listview, this.Items);
        this.lvItem.setAdapter((ListAdapter) this.adapter);
        this.lvItem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                MyService.title = ListesMathsNumActivity.this.Items.get(i).getItemname();
                MyService.postion = ListesMathsNumActivity.this.Items.get(i).getUrl();
                ListesMathsNumActivity.this.startActivity(new Intent(ListesMathsNumActivity.this, EachCoursContentActivity.class));
            }
        });
    }

    // arrow back click
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void addItems() {
        this.Items.add(new ItemBean(R.drawable.ic_logo_app, "Java Overview", "Java Tutorial", "1"));
        this.Items.add(new ItemBean(R.drawable.ic_logo_app, "Environment Setup - Environment Setup", "Java Tutorial", "2"));
        this.Items.add(new ItemBean(R.drawable.ic_logo_app, "Basic Syntax", "Java Tutorial", "3"));
        this.Items.add(new ItemBean(R.drawable.ic_logo_app, "Object and Classes", "Java Tutorial", "4"));
        this.Items.add(new ItemBean(R.drawable.ic_logo_app, "Basic Datatypes", "Java Tutorial", "5"));
        this.Items.add(new ItemBean(R.drawable.ic_logo_app, "Variable Types", "Java Tutorial", "6"));
        this.Items.add(new ItemBean(R.drawable.ic_logo_app, "Modifier Types", "Java Tutorial", "7"));
        this.Items.add(new ItemBean(R.drawable.ic_logo_app, "Basic Operators", "Java Tutorial", "8"));
        this.Items.add(new ItemBean(R.drawable.ic_logo_app, "Loop Control", "Java Tutorial", "9"));
        this.Items.add(new ItemBean(R.drawable.ic_logo_app, "Decision Making", "Java Tutorial", "10"));
        this.Items.add(new ItemBean(R.drawable.ic_logo_app, "Numbers Class", "Java Tutorial", "11"));
        this.Items.add(new ItemBean(R.drawable.ic_logo_app, "Character Class", "Java Tutorial", "12"));
        this.Items.add(new ItemBean(R.drawable.ic_logo_app, "Strings Class", "Java Tutorial", "13"));
        this.Items.add(new ItemBean(R.drawable.ic_logo_app, "Arrays", "Java Tutorial", "14"));
        this.Items.add(new ItemBean(R.drawable.ic_logo_app, "Date and Time", "Java Tutorial", "15"));
        this.Items.add(new ItemBean(R.drawable.ic_logo_app, "Regular Expressions", "Java Tutorial", "16"));
        this.Items.add(new ItemBean(R.drawable.ic_logo_app, "Methods", "Java Tutorial", "17"));
        this.Items.add(new ItemBean(R.drawable.ic_logo_app, "Files and I/O", "Java Tutorial", "18"));
        this.Items.add(new ItemBean(R.drawable.ic_logo_app, "Exceptions", "Java Tutorial", "19"));
        this.Items.add(new ItemBean(R.drawable.ic_logo_app, "Inner classes", "Java Tutorial", "20"));
        this.Items.add(new ItemBean(R.drawable.ic_logo_app, "Inheritance", "Java Tutorial", "21"));
        this.Items.add(new ItemBean(R.drawable.ic_logo_app, "Overriding", "Java Tutorial", "22"));
        this.Items.add(new ItemBean(R.drawable.ic_logo_app, "Polymorphism", "Java Tutorial", "23"));
        this.Items.add(new ItemBean(R.drawable.ic_logo_app, "Abstraction", "Java Tutorial", "24"));
        this.Items.add(new ItemBean(R.drawable.ic_logo_app, "Encapsulation", "Java Tutorial", "25"));
        this.Items.add(new ItemBean(R.drawable.ic_logo_app, "Interfaces", "Java Tutorial", "26"));
        this.Items.add(new ItemBean(R.drawable.ic_logo_app, "Packages", "Java Tutorial", "27"));
        this.Items.add(new ItemBean(R.drawable.ic_logo_app, "Data Structures", "Java Tutorial", "28"));
        this.Items.add(new ItemBean(R.drawable.ic_logo_app, "Collections Framework", "Java Tutorial", "29"));
        this.Items.add(new ItemBean(R.drawable.ic_logo_app, "Generics", "Java Tutorial", "30"));
        this.Items.add(new ItemBean(R.drawable.ic_logo_app, "Serialization", "Java Tutorial", "31"));
        this.Items.add(new ItemBean(R.drawable.ic_logo_app, "Networking", "Java Tutorial", "32"));
        this.Items.add(new ItemBean(R.drawable.ic_logo_app, "Sending Email", "Java Tutorial", "33"));
        this.Items.add(new ItemBean(R.drawable.ic_logo_app, "Multithreading", "Java Tutorial", "34"));
        this.Items.add(new ItemBean(R.drawable.ic_logo_app, "Applet Basics", "Java Tutorial", "35"));
        this.Items.add(new ItemBean(R.drawable.ic_logo_app, "Documentation Comments", "Java Tutorial", "36"));
    }
}