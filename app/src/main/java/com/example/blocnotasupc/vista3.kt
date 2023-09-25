package com.example.blocnotasupc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.Date


class vista3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vista3)
        val textViewFecha = findViewById<TextView>(R.id.textViewFecha)
        val sdf = SimpleDateFormat("dd/MM/yyyy")
        val currentDate = sdf.format(Date())
        textViewFecha.text = currentDate
        val btn: Button = findViewById(R.id.btnback)
        btn.setOnClickListener {
            val intent: Intent = Intent(this, Vista2::class.java)
            startActivity(intent)
        }
    }
}