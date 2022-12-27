package com.wecan.acstico

import android.os.Bundle
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations


        webView.webViewClient = WebViewClient()

        // this will load the url of the website
        webView.loadUrl("https://anumi1999.github.io/")

        // this will enable the javascript settings, it can also allow xss vulnerabilities
        webView.settings.javaScriptEnabled = true
        webView.addJavascriptInterface(WebAppInterface(this), "Android");

        // if you want to enable zoom feature
        webView.settings.setSupportZoom(true)
        webView.setWebViewClient(WebViewClient())

    }
    override fun onBackPressed() {
        // if your webview can go back it will go back
        if (webView.canGoBack())
            webView.goBack()
        // if your webview cannot go back
        // it will exit the application
        else
            super.onBackPressed()
    }
}