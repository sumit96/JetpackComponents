package com.example.jetpackcomponents

import androidx.lifecycle.ViewModel

class ViewModelObject : ViewModel() {

    // Basic example of view Model with counter incremented value logic
    var count : Int = 0

    fun increment()
    {
        count++
    }

}