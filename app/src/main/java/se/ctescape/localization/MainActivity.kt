package se.ctescape.localization

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var tv : TextView
    val name = "David"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv = findViewById<TextView>(R.id.tvTitle)
    }

    fun onClickButton(v : View){
        Log.d("AIK","Button pressed")
        tv.text = getString(R.string.great, name)
    }
}