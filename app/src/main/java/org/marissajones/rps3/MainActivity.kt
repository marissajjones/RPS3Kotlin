package org.marissajones.rps3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun paperButton(view: View){
        val opponentChoice = Random.nextInt(2)
        when(opponentChoice){
            0 -> whatTheyChose.text = "They picked paper"
            1 -> whatTheyChose.text = "They picked rock"
            3 -> whatTheyChose.text = "They picked scissors"
        }
        whatWeChose.text = "We picked paper"
        when(opponentChoice){
            0 -> winLoseView.text = "It's a draw"
            1 -> winLoseView.text = "You won"
            2 -> winLoseView.text = "You lost"
        }
    }
    fun rockButton(view: View){
        val opponentChoice = Random.nextInt(2)
        when(opponentChoice){
            0 -> whatTheyChose.text = "They picked paper"
            1 -> whatTheyChose.text = "They picked rock"
            3 -> whatTheyChose.text = "They picked scissors"
        }
        whatWeChose.text = "We picked rock"
        when(opponentChoice){
            0 -> winLoseView.text = "You lost"
            1 -> winLoseView.text = "It's a draw"
            2 -> winLoseView.text = "You won"
        }
    }
    fun scissorsButton(view: View){
        val opponentChoice = Random.nextInt(2)
        when(opponentChoice){
            0 -> whatTheyChose.text = "They picked paper"
            1 -> whatTheyChose.text = "They picked rock"
            3 -> whatTheyChose.text = "They picked scissors"
        }
        whatWeChose.text = "We picked scissors"
        when(opponentChoice){
            0 -> winLoseView.text = "You won"
            1 -> winLoseView.text = "You lost"
            2 -> winLoseView.text = "It's a draw"
        }
    }
}
