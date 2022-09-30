package com.example.cardapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageButton

class ResultActivity : AppCompatActivity() {
    lateinit var startActivityButton: ImageButton


    //val startActivityButton = findViewById<ImageButton>(R.id.imageButtonClose)
    lateinit var mainActivityButton: ImageButton
    //lateinit var mainActivityButton = findViewById<ImageButton>(R.id.imageButtonPlayAgain)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)


        startActivityButton = findViewById<ImageButton>(R.id.imageButtonClose)
        startActivityButton.setOnClickListener {
            val intent =
                Intent(/* packageContext = */ this, /* cls = */ StartActivity::class.java)
            startActivity(/* intent = */ intent)

            mainActivityButton = findViewById<ImageButton>(R.id.imageButtonPlayAgain)
            mainActivityButton.setOnClickListener {

                Log.d("!!!", "Calisiyor")
                val intentPlayAgain =
                    Intent(/* packageContext = */ this, /* cls = */ MainActivity::class.java)
                startActivity(/* intent = */ intentPlayAgain)

            }

        }


    }

}

