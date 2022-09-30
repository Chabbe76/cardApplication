package com.example.cardapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlin.random.Random
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var pointTextView: TextView
    lateinit var imageView: ImageView
    lateinit var button: Button
    val cards = mutableListOf<Card>()
    lateinit var resultViewButton: Button
    lateinit var closeButton: Button
    lateinit var higherButton: ImageView
    lateinit var lowerButton: ImageView
    lateinit var imageNewCard: ImageView
    var newCard: Card = Card("clubs two", 2, R.drawable.clubstwo)
    var randomCard: Card = Card("clubs two", 2, R.drawable.clubstwo)
    var points = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //var name = intent.getStringExtra("name")

        imageView = findViewById(R.id.imageView);
        button = findViewById(R.id.button);

        button.setOnClickListener {
            val random = Random
            randomCard = cards[random.nextInt(cards.size)]
            imageView.setImageResource(randomCard.image)

        }
        higherButton = findViewById(R.id.imageButtonHigher)
        higherButton.setOnClickListener { higher() }


        lowerButton = findViewById(R.id.imageButtonLower)
        lowerButton.setOnClickListener { lowerCard() }


        resultViewButton = findViewById<Button>(R.id.resultViewButton)
        resultViewButton.setOnClickListener {

            val resultButtonIntent =
                Intent(/* packageContext = */ this, /* cls = */ ResultActivity::class.java)
            startActivity(resultButtonIntent)
        }

        closeButton = findViewById<Button>(R.id.closeButton)
        closeButton.setOnClickListener {
            val closeIntentButton =
                Intent(/* packageContext = */ this, /* cls = */ StartActivity::class.java)
            startActivity(closeIntentButton)

        }
        createCards()

    }


    fun createCards() {

        //Jag lade den i en array, skulle man kanske lägga den i en collection???
        // Hur kan jag initlasirz image i varje variabeln

        cards.add(Card("clubs two", 2, R.drawable.clubstwo))
        cards.add(Card("clubs three", 3, R.drawable.clubsthree))
        cards.add(Card("clubs four", 4, R.drawable.clubsfour))
        cards.add(Card("clubs five", 5, R.drawable.clubsfive))
        cards.add(Card("clubs six", 6, R.drawable.clubssix))
        cards.add(Card("clubs seven", 7, R.drawable.clubsseven))
        cards.add(Card("clubs eight", 8, R.drawable.clubseight))
        cards.add(Card("clubs nine", 9, R.drawable.clubsnine))
        cards.add(Card("clubs ten", 10, R.drawable.clubsten))
        cards.add(Card("clubs jack", 11, R.drawable.clubsjack))
        cards.add(Card("clubs queen", 12, R.drawable.clubsqueen))
        cards.add(Card("clubs king", 13, R.drawable.clubsking))
        cards.add(Card("club ace", 14, R.drawable.clubsace))

        cards.add(Card("diamonds two", 2, R.drawable.diamondstwo))
        cards.add(Card("diamonds three", 3, R.drawable.diamondsthree))
        cards.add(Card("diamonds four", 4, R.drawable.diamondsfour))
        cards.add(Card("diamonds five", 5, R.drawable.diamondsfive))
        cards.add(Card("diamonds six", 6, R.drawable.diamondssix))
        cards.add(Card("diamonds seven", 7, R.drawable.diamondsseven))
        cards.add(Card("diamonds eight", 8, R.drawable.diamondseight))
        cards.add(Card("diamonds nine", 9, R.drawable.diamondsnine))
        cards.add(Card("diamonds ten", 10, R.drawable.diamondsten))
        cards.add(Card("diamonds jack", 11, R.drawable.diamondsjack))
        cards.add(Card("diamonds queen", 12, R.drawable.diamondsqueen))
        cards.add(Card("diamonds king", 13, R.drawable.diamondsking))
        cards.add(Card("diamonds ace", 14, R.drawable.diamondsace))


        cards.add(Card("hearts two", 2, R.drawable.heartstwo))
        cards.add(Card("hearts three", 3, R.drawable.heartsthree))
        cards.add(Card("hearts four", 4, R.drawable.heartsfour))
        cards.add(Card("hearts five", 5, R.drawable.heartsfive))
        cards.add(Card("hearts six", 6, R.drawable.heartssix))
        cards.add(Card("hearts seven", 7, R.drawable.heartsseven))
        cards.add(Card("hearts eight", 8, R.drawable.heartseight))
        cards.add(Card("hearts nine", 9, R.drawable.heartsnine))
        cards.add(Card("hearts ten", 10, R.drawable.heartsten))
        cards.add(Card("hearts jack", 11, R.drawable.heartsjack))
        cards.add(Card("hearts queen", 12, R.drawable.heartsqueen))
        cards.add(Card("hearts king", 13, R.drawable.heartsking))
        cards.add(Card("hearts ace", 14, R.drawable.heartsace))

        cards.add(Card("diamond two", 2, R.drawable.spadestwo))
        cards.add(Card("diamond three", 3, R.drawable.spadesthree))
        cards.add(Card("diamond four", 4, R.drawable.spadesfour))
        cards.add(Card("diamond five", 5, R.drawable.spadesfive))
        cards.add(Card("diamond six", 6, R.drawable.spadessix))
        cards.add(Card("diamond seven", 7, R.drawable.spadesseven))
        cards.add(Card("diamond eight", 8, R.drawable.spadeseight))
        cards.add(Card("diamond nine", 9, R.drawable.spadesnine))
        cards.add(Card("diamond ten", 10, R.drawable.spadesten))
        cards.add(Card("diamond jack", 11, R.drawable.spadesjack))
        cards.add(Card("diamond queen", 12, R.drawable.spadesqueen))
        cards.add(Card("diamond king", 13, R.drawable.spadesking))
        cards.add(Card("diamond ace", 14, R.drawable.spadesace))

        //lowerORhigher()

    }


    fun higher() {

        pointTextView = findViewById(R.id.pointTextView)
        newCard = cards[(0 until cards.size).random()]
        imageNewCard = findViewById(R.id.imageNewCard);
        imageNewCard.setImageResource(newCard.image)

        if (newCard.value > randomCard.value) {
            points++
            pointTextView.text = "POINTS: $points"

            Log.d("!!!", "Det är större")


        } else (Log.d("!!!", "Du är mindre förlorat"))

    }

    fun lowerCard() {

        newCard = cards[(0 until cards.size).random()]
        imageNewCard = findViewById(R.id.imageNewCard);
        imageNewCard.setImageResource(newCard.image)
        if (newCard.value < randomCard.value) {
            points++
            pointTextView.text = "POINTS: $points"

            Log.d("!!!", "Det är mindre")
        } else {
            Log.d("!!!", "Det är mindre har förlorat")
        }

    }


    /*fun playerHigherOrLower(card: Card) {

//Här ska jag använda val av spelaren högre eller lägre..
// Men hur ska man logisk skriva ner det.

// val chooseHigher =
setContentView(R.layout.activity_main)
imageView = findViewById(R.id.imageView);
button = findViewById(R.id.button);

button.setOnClickListener {
    val random = Random
    val randomCard = cards[random.nextInt(cards.size)]
    imageView.setImageResource(randomCard.image)
    //if (randomCard < player chooise

}*/
}

