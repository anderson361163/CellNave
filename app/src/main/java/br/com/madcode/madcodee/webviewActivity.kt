package br.com.madcode.madcodee

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ImageButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_webview.*


import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T



import android.app.Activity;

import android.net.Uri;

import android.webkit.WebSettings;



class webviewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webview)
        //criando tela inicial
        wvbWeb.loadUrl("https://br.cellep.com")
        //criando variavel que recebe webcliente
        wvbWeb.webViewClient = myWebViewClient()

        //botão home
        btnHome.setOnClickListener {
            wvbWeb.loadUrl("https://br.cellep.com")
        }

        //botao pesquisar
        btnPesquisar.setOnClickListener {

            wvbWeb.loadUrl("https://" + edtPesquisar.text.toString())
            //botao voltar

            btnVoltar.setOnClickListener {
                if (wvbWeb.canGoBack())
                    wvbWeb.goBack()
                else {
                    Toast.makeText(this, "Não há volta!", Toast.LENGTH_SHORT).show()
                }
            }

        }    //botao avançar
            btnAvancar.setOnClickListener {
            if (wvbWeb.canGoForward())
                wvbWeb.goForward()
            else {
                Toast.makeText(this, "Não há futuro!", Toast.LENGTH_SHORT).show()
            }
        }
    } //deixando webview aparente
    class myWebViewClient : WebViewClient(){
        override fun shouldOverrideUrlLoading(
            view: WebView?,
            request: WebResourceRequest?
        ): Boolean {
            return super.shouldOverrideUrlLoading(view, request)
        }
    }
}