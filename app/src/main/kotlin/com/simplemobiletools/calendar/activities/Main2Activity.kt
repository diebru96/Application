package com.simplemobiletools.calendar.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CompoundButton
import android.widget.Switch
import android.widget.Toast
import com.simplemobiletools.calendar.R
import com.simplemobiletools.calendar.debug.MusicActivity
import com.simplemobiletools.calendar.debug.Music_player
import com.simplemobiletools.calendar.debug.StreamActivity

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

            val s = findViewById<View>(R.id.switch1) as Switch
            s.setOnCheckedChangeListener { buttonView, isChecked ->
                if (isChecked) {
                    Toast.makeText(baseContext, "Toy activated", Toast.LENGTH_SHORT).show()
                }
                if (isChecked == false) {
                    Toast.makeText(baseContext, "Toy deactivated", Toast.LENGTH_SHORT).show()
                }
            }

    }

    fun openCalendar(v:View) {
        val intent = Intent(application, MainActivity::class.java)
        startActivity(intent)
    }

    fun openMusic(v:View) {
        val intent2 = Intent(application, MusicActivity::class.java)
        startActivity(intent2)
    }

    fun openMonitor(v:View) {
        val intent3 = Intent(application, StreamActivity::class.java)
        startActivity(intent3)
    }
    fun playMusic(v:View) {
        val intent4 = Intent(application, Music_player::class.java)
        startActivity(intent4)
    }



}
