package com.example.mes_cours.activities.premieres.maths.num;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;

import com.example.mes_cours.MyService;
import com.example.mes_cours.R;

public class EachCoursContentActivity extends AppCompatActivity {
    Toolbar toolBar;
    WebView mywebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_each_cours_content);

        this.toolBar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(this.toolBar);
        getSupportActionBar().setTitle(MyService.title);
        this.toolBar.setTitleTextColor(ContextCompat.getColor(getApplicationContext(),R.color.white));
        //  Arrow
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        this.mywebView = (WebView) findViewById(R.id.webView);
        this.mywebView.getSettings().setJavaScriptEnabled(true);
        WebView webView = this.mywebView;
        webView.loadUrl("file:///android_asset/premiere/num/" + MyService.postion + ".html");
        this.mywebView.getSettings().setBuiltInZoomControls(true);
    }
}