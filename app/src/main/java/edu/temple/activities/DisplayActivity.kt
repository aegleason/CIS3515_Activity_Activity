package edu.temple.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        // TODO Step 3: Extract transferred value and use for lyricsDisplayView text size

        // intent.getFloatExtra(SIZE_KEY, )

        with (findViewById<TextView>(R.id.lyricsDisplayTextView)) {
            val newTextSize = intent.getIntExtra("fontSize")
            this.textSize = newTextSize
        }




    }
}