package com.example.moodactivity

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        // DECLARATIONS
        val getBtn = findViewById<Button>(R.id.getBtn)
        getBtn.visibility = Button.INVISIBLE
        getBtn.isEnabled = false
        val goBtn = findViewById<Button>(R.id.goBtn)
        val resetBtn = findViewById<Button>(R.id.resetBtn2)
        resetBtn.visibility = Button.INVISIBLE
        resetBtn.isEnabled = false
        val infoBtn = findViewById<Button>(R.id.infoBtn)
        val inputText = findViewById<EditText>(R.id.inputText)
        inputText.visibility = EditText.INVISIBLE
        val activityText = findViewById<TextView>(R.id.activityText)
        val promptText = findViewById<TextView>(R.id.prompText)
        promptText.visibility = TextView.INVISIBLE
        val titleText = findViewById<TextView>(R.id.titleText)

        // ARRAY OF MOOD
        val moods = arrayOf(
            "happy",
            "sad",
            "tired",
            "anxious",
            "angry",
            "relaxed",
            "excited",
            "bored",
            "stressed",
            "curious"
        )
        // ARRAY OF ACTIVITIES

        val activities = arrayOf(
            "Call or message a friend.",
            "Take a 20-minute walk outdoors.",
            "Do 10 minutes of stretching.",
            "Practice a breathing exercise.",
            "Go for a jog or workout.",
            "Read a book.",
            "Plan a new project.",
            "Solve a puzzle or play chess.",
            "Talk with a trusted friend.",
            "Watch an educational video."
        )

        // CODE LINES / EXECUTION
        // GO button takes away all unnecessary elements on the screen when clicked
        goBtn.setOnClickListener {
            titleText.visibility = TextView.INVISIBLE
            goBtn.visibility = Button.INVISIBLE
            goBtn.isEnabled = false
            getBtn.visibility = Button.VISIBLE
            getBtn.isEnabled = true
            inputText.visibility = EditText.VISIBLE
            promptText.visibility = TextView.VISIBLE
            activityText.text = "" // make the textView empty so that it bears the new activity
        }

        getBtn.setOnClickListener {
            val mood = inputText.text.toString()
            val index = moods.indexOf(mood) // variable that holds the index of the mood
            // selected by the user
            if (index != -1) {
              activityText.text = activities[index]
            }
            else {
                activityText.text = "Invalid mood" // in the case that the user enters an invalid mood
            }
            getBtn.visibility = Button.INVISIBLE // make it invisible after being clicked
            getBtn.isEnabled = false // make it unclickable
            resetBtn.visibility = Button.VISIBLE
            resetBtn.isEnabled = true
        }
        // RESET button takes away all contents of the previous activity and
        // the mood entered when clicked
        resetBtn.setOnClickListener {
            inputText.text.clear()
            activityText.text = ""
            resetBtn.visibility = Button.INVISIBLE
            resetBtn.isEnabled = false
            getBtn.visibility = Button.VISIBLE
            getBtn.isEnabled = true
        }
        // INFO button gives to the user detailed information about the app when clicked
        infoBtn.setOnClickListener {
            val intent = Intent(this, info::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}