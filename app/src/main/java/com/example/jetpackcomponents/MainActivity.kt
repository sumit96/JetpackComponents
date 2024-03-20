package com.example.jetpackcomponents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

// It is called lifecycle owner
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Add observer to observe the the activity life cycle
        lifecycle.addObserver(ObserverSection())
        Log.d("MAINDATA", "Activity OnCreate")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MAINDATA", "Activity OnResume")

    }

    override fun onPause() {
        super.onPause()
        Log.d("MAINDATA", "Activity OnPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MAINDATA", "Activity OnStop")
    }
}