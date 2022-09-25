package com.example.cardapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class ResultActivity : AppCompatActivity() {

    val startActivityButton = findViewById<ImageButton>(R.id.imageButtonClose)
    val mainActivityButton = findViewById<ImageButton>(R.id.imageButtonPlayAgain)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        startActivityButton.setOnClickListener {
            val intent = Intent(/* packageContext = */ this, /* cls = */ StartActivity::class.java)
            startActivity(/* intent = */ intent)

            mainActivityButton.setOnClickListener {
                val intentPlayAgain =
                    Intent(/* packageContext = */ this, /* cls = */ MainActivity::class.java)
                startActivity(/* intent = */ intentPlayAgain)

            }

        }


    }

}

