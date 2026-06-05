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

       

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}