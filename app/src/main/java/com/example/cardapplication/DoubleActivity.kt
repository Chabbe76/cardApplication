package com.example.cardapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class DoubleActivity : AppCompatActivity() {


    lateinit var iv_card1: ImageView
    lateinit var iv_card2: ImageView

    lateinit var tv_player1: TextView
    lateinit var tv_player2: TextView

    lateinit var tv_war: TextView

    lateinit var b_deal: Button
    lateinit var doubleExitButton: Button
    lateinit var random: Random

    var player1 = 0
    var player2 = 0

    var cardsArray = intArrayOf(
        R.drawable.hearts2,
        R.drawable.hearts3,
        R.drawable.hearts4,
        R.drawable.hearts5,
        R.drawable.hearts6,
        R.drawable.hearts7,
        R.drawable.hearts8,
        R.drawable.hearts9,
        R.drawable.hearts10,
        R.drawable.hearts12,
        R.drawable.hearts13,
        R.drawable.hearts14,
        R.drawable.hearts15
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_double)

        random = Random

        //init objects
        iv_card1 = findViewById(R.id.iv_card1)
        iv_card2 = findViewById(R.id.iv_card2)

        iv_card1.setImageResource(R.drawable.card_back)
        iv_card2.setImageResource(R.drawable.card_back)

        tv_player1 = findViewById(R.id.tv_player1)
        tv_player2 = findViewById(R.id.tv_player2)

        tv_war = findViewById(R.id.tv_war)
        tv_war.visibility = View.INVISIBLE

        b_deal = findViewById(R.id.b_deal)
        b_deal.setOnClickListener {
            //hide war label
            tv_war.visibility = View.INVISIBLE

            //generate cards
            val card1 = random.nextInt(cardsArray.size)
            val card2 = random.nextInt(cardsArray.size)

            //set images
            setCardImage(card1, iv_card1)
            setCardImage(card2, iv_card2)

            //compare teh cards
            if (card1 > card2) {
                player1++
                tv_player1.text = "Player 1: $player1"
            } else if (card1 < card2) {
                player2++
                tv_player2.text = "Player 2: $player2"
            } else {
                //show war label
                tv_war.visibility = View.VISIBLE
            }
        }


        doubleExitButton = findViewById<Button>(R.id.backMenuButton);
        doubleExitButton.setOnClickListener {
            val backIntentButton =
                Intent(/* packageContext = */ this, /* cls = */ StartActivity::class.java)

            startActivity(backIntentButton)
        }
    }

    private fun setCardImage(number: Int, image: ImageView) {
        image.setImageResource(cardsArray[number])
    }


}


