package com.example.retryassignment3;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class AutumnActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autumn);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        WebView myWebView =(WebView) findViewById(R.id.WebView4);
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.loadUrl("https://en.wikipedia.org/wiki/Autumn");
    }
}
