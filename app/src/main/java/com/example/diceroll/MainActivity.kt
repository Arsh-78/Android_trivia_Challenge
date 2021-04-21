package com.example.diceroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val numSides=0
        val dice =Dice( numSides= 6)

        val rollButton: Button = findViewById(R.id.roll_button)
        val numtextview: TextView = findViewById(R.id.num_textview)
        val diceImage: ImageView = findViewById(R.id.Dice_imageView)

        rollButton.setOnClickListener {

            val randNum = dice.roll()
            numtextview.text = randNum.toString()

            when(randNum) {
                1 -> diceImage.setImageResource(R.drawable.dice_1)
                2 -> diceImage.setImageResource(R.drawable.dice_2)
                3 -> diceImage.setImageResource(R.drawable.dice_3)
                4 -> diceImage.setImageResource(R.drawable.dice_4)
                5 -> diceImage.setImageResource(R.drawable.dice_5)
                6 -> diceImage.setImageResource(R.drawable.dice_6)
            }

        }

    }

}
class Dice(private val numSides: Int){
    fun roll(): Int {
        return (1..numSides).random()
    }
}