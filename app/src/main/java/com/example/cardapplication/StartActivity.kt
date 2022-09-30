package com.example.cardapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class StartActivity : AppCompatActivity() {

    lateinit var startGameButton:Button
    //lateinit var imageViewStartButton: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_sida)

        //imageViewStartButton = findViewById(R.id.imageView);
        startGameButton = findViewById<Button>(R.id.buttonToStartGame);
        startGameButton.setOnClickListener {
            val startIntentButton = Intent(/* packageContext = */ this, /* cls = */ MainActivity::class.java)
            //startIntentButton.putExtra("name", "Namn på input")//Skicka namn vidare
            startActivity(startIntentButton)
        }

    }



}