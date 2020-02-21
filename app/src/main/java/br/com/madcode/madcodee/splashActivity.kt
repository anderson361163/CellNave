package br.com.madcode.madcodee

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class splashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val intentTelaSplash = Intent(this@splashActivity, webviewActivity::class.java)

        Handler().postDelayed({
            startActivity(intentTelaSplash)
            finish()
        },3000)
        }
    }
