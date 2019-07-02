package com.example.summonersbook

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showSettings(view: View) {
        val intent = Intent(this, DisplaySettings::class.java)
        startActivity(intent)
    }
}
