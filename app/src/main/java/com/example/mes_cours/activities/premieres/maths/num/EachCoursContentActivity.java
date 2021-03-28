package com.example.mes_cours.activities.premieres.maths.num;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;

import com.example.mes_cours.MyService;
import com.example.mes_cours.R;

public class EachCoursContentActivity extends AppCompatActivity {
    ActionBar actionBar;
    WebView mywebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /*this.actionBar = getSupportActionBar();
        this.actionBar.setTitle(MyService.title);
        this.actionBar.setDisplayHomeAsUpEnabled(true);*/

        setContentView(R.layout.activity_each_cours_content);

        /*this.mywebView = (WebView) findViewById(R.id.webView);
        this.mywebView.getSettings().setJavaScriptEnabled(true);
        WebView webView = this.mywebView;
        webView.loadUrl("file:///android_asset/premiere/num/" + MyService.postion + ".html");
        this.mywebView.getSettings().setBuiltInZoomControls(true);*/
    }
}