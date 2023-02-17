package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.rollButton)
        rollButton.setOnClickListener { this.rollDice() }
    }

    private fun rollDice() {
        // Create new dice object with 6 sides
        val dice = Dice(6)

        // Roll the dice
        val diceRoll: Int = dice.roll()

        // Find the image that represents the dice
        val diceImageRes = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        // Set Image based on the dice roll
        val diceImage: ImageView = findViewById(R.id.imageView)
        diceImage.setImageResource(diceImageRes)
        // Add image description for screen readers
        diceImage.contentDescription = diceRoll.toString()
    }
}

class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}

