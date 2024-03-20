package com.example.jetpackcomponents

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

// Add View Model Factory object to provide data to the view Model
class ViewModelFactoryObject(val counter : Int) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ViewModelObject(counter) as T

    }
}