package com.example.teachingpoint.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.teachingpoint.R;

public class Tutorial extends Fragment {
    View view;
    WebView webView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
      view=  inflater.inflate(R.layout.tutorial_fragment,container,false);
        webView=view.findViewById(R.id.webViewId);
        WebSettings webSettings=webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.youtube.com/watch?v=ZYvbmVEwX14&list=PLgH5QX0i9K3p9xzYLFGdfYliIRBLVDRV5");

      return view;
    }
}
