package com.example.retryassignment3;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class SpringActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spring);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        WebView myWebView =(WebView) findViewById(R.id.WebView1);
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.loadUrl("https://en.wikipedia.org/wiki/Spring_(season)");
    }
}
