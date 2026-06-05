package com.example.moodactivity

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        // DECLARATIONS
        val getBtn = findViewById<Button>(R.id.getBtn)
        getBtn.visibility = Button.INVISIBLE
        val goBtn = findViewById<Button>(R.id.goBtn)
        val resetBtn = findViewById<Button>(R.id.resetBtn2)
        resetBtn.visibility = Button.INVISIBLE
        val infoBtn = findViewById<Button>(R.id.infoBtn)
        val inputText = findViewById<EditText>(R.id.inputText)
        inputText.visibility = EditText.INVISIBLE
        val activityText = findViewById<TextView>(R.id.activityText)
        val promptText = findViewById<TextView>(R.id.prompText)
        promptText.visibility = TextView.INVISIBLE
        val titleText = findViewById<TextView>(R.id.titleText)

        // ARRAY OF MOOD
        val moods = arrayOf(
            "Happy",
            "Sad",
            "Tired",
            "Anxious",
            "Angry",
            "Relaxed",
            "Excited",
            "Bored",
            "Stressed",
            "Curious"
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
            getBtn.visibility = Button.VISIBLE
            inputText.visibility = EditText.VISIBLE
            promptText.visibility = TextView.VISIBLE
            activityText.text = ""
        }

        getBtn.setOnClickListener {
            val mood = inputText.text.toString()
            val index = moods.indexOf(mood)
            if ()
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}