package com.example.quizappas

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.core.content.ContextCompat

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val tvName: TextView = findViewById(R.id.tv_name)
        val tvScore: TextView = findViewById(R.id.tv_score)
        val btnFinish: Button = findViewById(R.id.btn_finish)

        val userName = intent.getStringExtra(Constants.USER_NAME)
        val score = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)
        val totalQuestion = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)

        tvName.text = userName
        tvScore.text = "Your Score is $score out of $totalQuestion"

        btnFinish.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }


    }

}