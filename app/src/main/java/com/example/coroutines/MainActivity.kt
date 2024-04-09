package com.example.coroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.coroutines.*
import com.example.coroutines.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private val coroutineScope = CoroutineScope(Dispatchers.Main)
    private lateinit var binding: ActivityMainBinding
    private var count: Int = 1
    private var mainActivity = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                MainScope().launch {
                    createTextView()
                }
            }
        })
    }

    suspend fun createTextView() {
        var delayTime = (1..10).random() * 1000L
        // creates a new coroutine
        delay(delayTime)
        val textView = TextView(mainActivity)
        textView.text = "${binding.name.text} and the delay was ${delayTime} milliseconds"
        // add textview to LinearLayout
        binding.relativeLayout.addView(textView);
    }
}
