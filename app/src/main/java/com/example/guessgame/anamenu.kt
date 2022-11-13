package com.example.guessgame

import android.content.Intent
import android.os.Bundle
import android.provider.Browser
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class anamenu : AppCompatActivity() {
    lateinit var listview: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anamenu)
        listview = findViewById(R.id.list_view)

        var liste = ArrayList<String>()
        liste.add("Guess Game")
        liste.add("Match Game")

        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,liste)
        listview.adapter = adapter

        listview.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(this,"seçilen elaman ${liste.get(i)}", Toast.LENGTH_LONG).show()
            if (i == 0) {
                val guessGame = Intent(this, MainActivity:: class.java )
                startActivity(guessGame)
            }
            if (i == 1) {
                val matchGame = Intent(this, MatchGame:: class.java )
                startActivity(matchGame)
            }

        }
    }
}