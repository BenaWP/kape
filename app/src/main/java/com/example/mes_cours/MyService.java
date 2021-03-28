package com.example.mes_cours;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class MyService extends Service {
    public static String admobid = "";
    public static String barner = "";
    public static String inter = "";
    public static String oldcode = "null";
    public static String postion = "";
    public static String title = "";
    public static String videocode = "";
    public static String videorew = "";
    public static String videotitle = "";
    Context ct;

    OutputStream outputStream;

    public void onStart(Intent intent, int i) {
    }

    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public void onCreate() {
        this.ct = getApplicationContext();
    }

    private void saveoldtxt() {
        try {
            this.outputStream = openFileOutput("code.txt", 0);
            this.outputStream.write(oldcode.getBytes());
            this.outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String readAsset(String str) {
        String str2 = "";
        try {
            FileInputStream openFileInput = openFileInput(str);
            if (openFileInput != null) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(openFileInput));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    str2 = str2 + readLine;
                }
            }
            openFileInput.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str2;
    }
}