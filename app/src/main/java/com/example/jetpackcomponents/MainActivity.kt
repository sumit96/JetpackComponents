package com.example.jetpackcomponents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

// It is called lifecycle owner
class MainActivity : AppCompatActivity() {

    lateinit var textView : TextView
    lateinit var viewModel : ViewModelObject
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Add observer to observe the the activity life cycle
        lifecycle.addObserver(ObserverSection())
        textView = findViewById(R.id.textView)
        // It provide the viewModel instance
        viewModel = ViewModelProvider(this).get(ViewModelObject :: class.java)
        setText()
        Log.d("MAINDATA", "Activity OnCreate")
    }


    fun setText()
    {
        // Get counter value from view model
        textView.text = viewModel.count.toString()
    }
    fun increment(v: View)
    {
        // Call increment function from view model
        viewModel.increment()
        setText()
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