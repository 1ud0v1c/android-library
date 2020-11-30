package com.ludovic.vimont.librarysample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.ludovic.vimont.preferencesholder.PreferencesHolder

class MainActivity : AppCompatActivity() {
    private val KEY_TEXT_TO_DISPLAY = "KEY_TEXT_TO_DISPLAY"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        PreferencesHolder.init(applicationContext)
        PreferencesHolder[KEY_TEXT_TO_DISPLAY] = "Incredible library !"

        val textView = findViewById<TextView>(R.id.text_view)
        textView.text = PreferencesHolder[KEY_TEXT_TO_DISPLAY, "Hello World!"]
    }
}