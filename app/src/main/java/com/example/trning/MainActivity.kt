package com.example.trning

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var tarningImage: ImageView
    val diceImages = arrayOf(R.drawable.one, R.drawable.two, R.drawable.three, R.drawable.four, R.drawable.five, R.drawable.six)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tarningImage = findViewById(R.id.imageView2)


        tarningImage.setOnClickListener {
            updateDiceImage()
        }
    }

    private fun updateDiceImage() {
        val currentValue = Random.nextInt(0, 6) // För att välja ett index från 0 till 5 för att hämta bilder från diceImages-arrayen.
        tarningImage.setImageResource(diceImages[currentValue])
    }
}