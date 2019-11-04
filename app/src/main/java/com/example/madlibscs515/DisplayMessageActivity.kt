package com.example.madlibscs515

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.TextView

class DisplayMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        val message1 = intent.getStringExtra("EXTRA_MESSAGE1")
        val m2 = intent.getStringExtra("EXTRA_MESSAGE2")
        val m3 = intent.getStringExtra("EXTRA_MESSAGE3")
        val m4 = intent.getStringExtra("EXTRA_MESSAGE4")
        val m5 = intent.getStringExtra("EXTRA_MESSAGE5")
        val m6 = intent.getStringExtra("EXTRA_MESSAGE6")
        val m7 = intent.getStringExtra("EXTRA_MESSAGE7")
        val m8 = intent.getStringExtra("EXTRA_MESSAGE8")

        // Capture the layout's TextView and set the string as its text
        val textView1 = findViewById<TextView>(R.id.text1).apply {
            text = message1
        }
        val textView2 = findViewById<TextView>(R.id.text2).apply {
            text = m2
        }
        val textView3 = findViewById<TextView>(R.id.text3).apply {
            text = m3
        }
        val textView4 = findViewById<TextView>(R.id.text4).apply {
            text = m4
        }
        val textView5 = findViewById<TextView>(R.id.text5).apply {
            text = m5
        }
        val textView6 = findViewById<TextView>(R.id.text6).apply {
            text = m6
        }
        val textView7 = findViewById<TextView>(R.id.text7).apply {
            text = m7
        }
        val textView8 = findViewById<TextView>(R.id.text8).apply {
            text = m8
        }
    }
}
