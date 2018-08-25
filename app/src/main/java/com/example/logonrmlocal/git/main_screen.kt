package com.example.logonrmlocal.git

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main_screen.*

class main_screen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)

        tvGithub.setOnClickListener {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
        }

        btnCEP.setOnClickListener {
            val intent = Intent(this, CepActivity::class.java)
            startActivity(intent)
        }
    }
}
