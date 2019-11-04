package com.example.madlibscs515

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun sendMessage(view: View) {
        // Do something in response to button
        val e1 = findViewById<EditText>(R.id.editText9)
        val message1 = e1.text.toString()
        val e2 = findViewById<EditText>(R.id.editText2)
        val m2 = e2.text.toString()
        val e3 = findViewById<EditText>(R.id.editText3)
        val m3 = e3.text.toString()
        val e4 = findViewById<EditText>(R.id.editText4)
        val m4 = e4.text.toString()
        val e5 = findViewById<EditText>(R.id.editText5)
        val m5 = e5.text.toString()
        val e6 = findViewById<EditText>(R.id.editText6)
        val m6 = e6.text.toString()
        val e7 = findViewById<EditText>(R.id.editText7)
        val m7 = e7.text.toString()
        val e8 = findViewById<EditText>(R.id.editText8)
        val m8 = e8.text.toString()
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra("EXTRA_MESSAGE1", message1)
            putExtra("EXTRA_MESSAGE2", m2)
            putExtra("EXTRA_MESSAGE3", m3)
            putExtra("EXTRA_MESSAGE4", m4)
            putExtra("EXTRA_MESSAGE5", m5)
            putExtra("EXTRA_MESSAGE6", m6)
            putExtra("EXTRA_MESSAGE7", m7)
            putExtra("EXTRA_MESSAGE8", m8)

        }
        startActivity(intent)
    }
}
