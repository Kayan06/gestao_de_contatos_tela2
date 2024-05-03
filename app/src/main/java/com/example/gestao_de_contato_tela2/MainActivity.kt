package com.example.gestao_de_contato_tela2

import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

      val AppCompatButton =  findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.Main_activity_Button)
      val containerscomponents = findViewById<View>(R.id.containerComponents)
      val Gabriel = findViewById<EditText>(R.id.Main_activity_Gabriel)
      val Julia = findViewById<EditText>(R.id.Main_activity_Julia)
      val Paula = findViewById<EditText>(R.id.Main_activity_Paula)
      val Fernanda = findViewById<EditText>(R.id.Main_activity_Fernanda)
      val Julio = findViewById<EditText>(R.id.Main_activity_Julio)
      val Enzo = findViewById<EditText>(R.id.Main_activity_Enzo)
      val Diego = findViewById<EditText>(R.id.Main_activity_Diego)
      val Janete = findViewById<EditText>(R.id.Main_activity_Janete)

    }
}