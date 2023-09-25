package com.example.blocnotasupc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class vista4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vista4)
        val btn: ImageButton = findViewById(R.id.btnback2)
        btn.setOnClickListener {
            val intent: Intent = Intent(this, Vista2::class.java)
            startActivity(intent)
        }
    }
}