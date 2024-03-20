package com.example.jetpackcomponents

import androidx.lifecycle.ViewModel

class ViewModelObject (val counter : Int) : ViewModel() {

    // Basic example of view Model with counter incremented value logic
    var count : Int = counter

    fun increment()
    {
        count++
    }

}