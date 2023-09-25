package com.example.blocnotasupc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import com.google.android.material.floatingactionbutton.FloatingActionButton


class Vista2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vista2)
        val btn2: ImageButton = findViewById(R.id.btnadd)
        btn2.setOnClickListener {
            val intent: Intent = Intent(this, vista3::class.java)
            startActivity(intent)
        }
        val btn: ImageView = findViewById(R.id.btnexit)
        btn.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val btn3: ImageView = findViewById(R.id.calendario)
        btn3.setOnClickListener {
            val intent: Intent = Intent(this, vista4::class.java)
            startActivity(intent)
        }
    }
}