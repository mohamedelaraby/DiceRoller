package com.android.project.diceroller

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    //Class instances.


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTextForButton()
    }

    //Setup Roller button
     private fun setTextForButton(){
        val rollButton = findViewById<Button>(R.id.roll_button)
        rollButton.text = getString(R.string.roll_Button)
        //Create a Toast

        //Generate random number
        rollButton.setOnClickListener{
//            val context: Context = this
//            val message = "Hello from dice roller"
//            val duration: Int = Toast.LENGTH_SHORT
//            Toast.makeText(context,message,duration).show()

            rollDice()
        }

    }

    //Generate Random number
    private fun rollDice(){
        //get random numbers.
        val randomInt = Random().nextInt(6) + 1
//find the textView by Id
        val rollText = findViewById<TextView>(R.id.result_text)

        //Set the text to the textView
        rollText.text = (randomInt.toString())

    }
}
