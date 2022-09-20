package com.example.cardapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlin.random.Random
import android.widget.Button
import android.widget.ImageView
class MainActivity : AppCompatActivity() {
    lateinit var imageView: ImageView
    lateinit var button: Button
    val cardImages: IntArray = intArrayOf(
//Jag lade den i en array, skulle man kanske lägga den i en collection??? Hur kan jag initlasirz image i varje variabeln

        R.drawable.clubstwo ,
        R.drawable.clubsthree,
        R.drawable.clubsfour,
        R.drawable.clubsfive,
        R.drawable.clubssix,
        R.drawable.clubsseven,
        R.drawable.clubseight,
        R.drawable.clubsnine,
        R.drawable.clubsten,
        R.drawable.clubsjack,
        R.drawable.clubsqueen,
        R.drawable.clubsking,
        R.drawable.clubsace,
        R.drawable.diamondstwo,
        R.drawable.diamondsthree,
        R.drawable.diamondsfour,
        R.drawable.diamondsfive,
        R.drawable.diamondssix,
        R.drawable.diamondsseven,
        R.drawable.diamondseight,
        R.drawable.diamondsnine,
        R.drawable.diamondsten,
        R.drawable.diamondsjack,
        R.drawable.diamondsqueen,
        R.drawable.diamondsking,
        R.drawable.diamondsace,
        R.drawable.heartstwo,
        R.drawable.heartsthree,
        R.drawable.heartsfour,
        R.drawable.heartsfive,
        R.drawable.heartssix,
        R.drawable.heartsseven,
        R.drawable.heartseight,
        R.drawable.heartsnine,
        R.drawable.heartsten,
        R.drawable.heartsjack,
        R.drawable.heartsqueen,
        R.drawable.heartsking,
        R.drawable.heartsace,
        R.drawable.spadestwo,
        R.drawable.spadesthree,
        R.drawable.spadesfour,
        R.drawable.spadesfive,
        R.drawable.spadessix,
        R.drawable.spadesseven,
        R.drawable.spadeseight,
        R.drawable.spadesnine,
        R.drawable.spadesten,
        R.drawable.spadesjack,
        R.drawable.spadesqueen,
        R.drawable.spadesking,
        R.drawable.spadesace
    )




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageView = findViewById(R.id.imageView);
        button = findViewById(R.id.button);

        button.setOnClickListener {
            val random = Random
            imageView.setImageResource(cardImages[random.nextInt(cardImages.size)])



    }



}
}