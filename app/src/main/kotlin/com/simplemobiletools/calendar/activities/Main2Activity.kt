package com.simplemobiletools.calendar.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.simplemobiletools.calendar.R

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    fun openCalendar(v:View) {
        val intent = Intent(application, MainActivity::class.java)
        startActivity(intent)
    }
}
