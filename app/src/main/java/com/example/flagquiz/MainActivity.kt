package com.example.flagquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart : Button = findViewById(R.id.btnStart)
        val etName : EditText = findViewById(R.id.etName)

        btnStart.setOnClickListener {
            if (etName.text.isEmpty()) {
                Toast.makeText(this, "Please enter your name", Toast.LENGTH_LONG).show()
            } else {
                // going from THIS activity, to QuizQuestionsActivity which is a java file
                val intent = Intent(this,QuizQuestionsActivity::class.java )
                //pass data towards QuizQuestionActivity
                intent.putExtra(Constants.USER_NAME, etName.text.toString())
                //start the intent
                startActivity(intent)
                //to not be able to go back
                finish()
            }
        }
    }
}