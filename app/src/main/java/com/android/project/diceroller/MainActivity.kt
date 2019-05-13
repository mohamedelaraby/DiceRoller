package com.android.project.diceroller

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    //Class instances.
    private lateinit  var rollButton: Button
    private lateinit  var  diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupButton()
    }

    //Setup Roller button
    private fun setupButton() {

        rollButton = findViewById(R.id.roll_button)
        rollButton.text = getString(R.string.roll_Button)
        //Create a Toast

        //Generate random number
        rollButton.setOnClickListener {


            rollDice()
        }

    }

    //Generate Random number
    private fun rollDice() {
        //get random numbers.
        val randomInt = Random().nextInt(6) + 1

        //Find the Dice image by Id.
       diceImage = findViewById(R.id.dice_Image)

        //Setup the image view resources for dice images.
        val drawableResources = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResources)
    }
}
